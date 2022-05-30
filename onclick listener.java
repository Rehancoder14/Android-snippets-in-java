//Anonymously
// Get button using its ID:
Button btn = findViewById(R.id.my_btn);

// Set OnCLickListener() using anonymous class:
btn.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v){
        // Functionality for the button...
        Toast.makeText(MainActivity.this,"Playing Song",Toast.LENGTH_SHORT);
    }
});



//Declaratively
// Declaring a class that implements OnClickListener interface:
class MyFunctionality implements View.OnClickListener(){
    @Override
    public void onClick(View v){
        // Functionality for the button...
    }
}
// Get button using its ID:
Button btn = findViewById(R.id.my_btn);

// Set OnCLickListener() using declared class:
btn.setOnClickListener(new MyFunctionality());