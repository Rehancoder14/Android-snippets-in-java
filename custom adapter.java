// using custom adapter
mycustomAdapter ad = new mycustomAdapter(MainActivity.this,R.layout.mycustomlayout,arr);
        listview.setAdapter(ad);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"You clicked on this "+i,Toast.LENGTH_SHORT).show();
            }
        });

// write in layout.xml
// making custom Adapter in android studio
 private String arr[];
    public mycustomAdapter(@NonNull Context context, int resource,@NonNull String arr[]) {
        super(context, resource, arr);
        this.arr = arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.mycustomlayout,parent,false);
        TextView t = convertView.findViewById(R.id.textView);
        t.setText(getItem(position));
        return convertView;

    }