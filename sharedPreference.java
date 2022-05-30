SharedPreferences sp = getSharedPreferences("MyPref",MODE_PRIVATE);
        String editval = sp.getString("name","No Value");
        textView.setText(editval);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = editText.getText().toString();
                SharedPreferences sp= getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor ed= sp.edit();
                ed.putString("name ",val);
                ed.apply();
                textView.setText(val);
            }
        });