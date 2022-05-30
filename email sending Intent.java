
//intent to open email sending app
String addresses[]={"rehanmahat999@gmail.com","rsmahat3@gmail.com","samirmahat29@gmail.com"};
Toast.makeText(getActivity(),"opening gmail app",Toast.LENGTH_SHORT).show();
Intent intent = new Intent(Intent.ACTION_SEND);
intent.setType("*/*");
intent.putExtra(Intent.EXTRA_EMAIL, addresses);
intent.putExtra(Intent.EXTRA_SUBJECT, "My life my Rules");
intent.putExtra(Intent.EXTRA_STREAM, urltext);
if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
	startActivity(intent);
      }