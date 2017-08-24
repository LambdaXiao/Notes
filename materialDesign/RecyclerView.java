<android.support.v7.widget.RecyclerView
        android:id="@+id/recycle_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:scrollbars="vertical"
        app:layout_behavior="@string/appbar_scrolling_view_behavior"
        android:paddingTop="5dp"
        >

    </android.support.v7.widget.RecyclerView>


mRecyclerView = (RecyclerView)view.findViewById(R.id.recycle_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new NewsAdapter(getActivity().getApplicationContext());
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnScrollListener(mOnScrollListener);

	mAdapter.setOnItemClickListener(new MyAdapter.OnRecyclerViewItemClickListener() {  
   	 @Override  
    	public void onItemClick(View view, DataModel data) {  
        	//DO your fucking bussiness here!  
    		}  
	});  

添加默认分割线：高度为2px，颜色为灰色
mRecyclerView.addItemDecoration(new RecycleViewDivider(mContext, LinearLayoutManager.VERTICAL));
添加自定义分割线：可自定义分割线drawable
mRecyclerView.addItemDecoration(new RecycleViewDivider(
    mContext, LinearLayoutManager.VERTICAL, R.drawable.divider_mileage));
添加自定义分割线：可自定义分割线高度和颜色
mRecyclerView.addItemDecoration(new RecycleViewDivider(
    mContext, LinearLayoutManager.VERTICAL, 10, getResources().getColor(R.color.divide_gray_color)));



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements View.OnClickListener{
    private  String[]  datas;
    public MyAdapter(String[] datas) {
        this.datas = datas;
    }
    private OnRecyclerViewItemClickListener mOnItemClickListener = null;
    
    //define interface
    public static interface OnRecyclerViewItemClickListener {
        void onItemClick(View view , String data);
    }
    
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup,  int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        ViewHolder vh = new ViewHolder(view);
        //将创建的View注册点击事件
        view.setOnClickListener(this);
        return vh;
    }
    
    @Override
    public void onBindViewHolder(ViewHolder viewHolder,  int position) {
        viewHolder.mTextView.setText(datas[position]);
        //将数据保存在itemView的Tag中，以便点击时进行获取
        viewHolder.itemView.setTag(datas[position]);
    }
 
    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            //注意这里使用getTag方法获取数据
            mOnItemClickListener.onItemClick(v,(String)v.getTag());
        }
    }
 
    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }
 
    
    //获取数据的数量
    @Override
    public int getItemCount() {
        return datas.length;
    }
    //自定义的ViewHolder，持有每个Item的的所有界面元素
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(View view){
        super(view);
            mTextView = (TextView) view.findViewById(R.id.text);
        }
    }
}
