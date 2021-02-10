class TestSurfaceView extends SurfaceView implements SurfaceHolder.Callback, Runnable{

    float x = -10000, y = -10000, r = 0;

    public TestSurfaceView(Context context) {
        super(context);
        getHolder().addCallback(this);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        new Thread(this).start();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY();
        r = 0;
        return super.onTouchEvent(event);
    }

    @Override
    public void run() {
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        while (true){
          Canvas canvas =  getHolder().lockCanvas();
          if (canvas != null){
              canvas.drawColor(Color.BLUE);
              canvas.drawCircle(x, y, r, paint);
              getHolder().unlockCanvasAndPost(canvas);
          }
          r += 5;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
