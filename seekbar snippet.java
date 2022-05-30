// seekbar code
//Declare Seekbaar
private Seekbar seekbar;

seekbar = findViewById(R.id.seekbar);



seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
                        Timer t = new Timer();
                        if(fromUser){
                            mediaPlayer.seekTo(i);

                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });