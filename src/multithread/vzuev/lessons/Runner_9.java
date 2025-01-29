package multithread.vzuev.lessons;

import java.util.concurrent.TimeUnit;

public class Runner_9 {

    private static final String REQ_WAS_SENT = "\nRequest was sent";
    private static final int DURATION_OF_SECONDS_DELIVERING_RESPONSE = 1;
    private static final String RESP_WAS_RECEIVED = "Response was received";
    private static final String MSG_SERVER_WAS_STOPPED = "\nServer stopped";
    private static final String THREAD_WAS_INTERRUPTED = "\nServer was interrupted";

    public static void main(String[] args) throws InterruptedException {
        final Thread communicatingThread = new Thread(() -> {

            while (true) {
                try {
                    doRequest();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().isInterrupted());
                    System.out.println(THREAD_WAS_INTERRUPTED);
                }
            }
        });

        communicatingThread.start();

        final Thread checkAndStopServerThread = new Thread(() -> {
            if (isServerShouldBeStopped()) {
                communicatingThread.interrupt();
                stopServer();
            }
        });

        TimeUnit.SECONDS.sleep(5);
        checkAndStopServerThread.start();

    }

    private static void doRequest() throws InterruptedException {
        System.out.println(REQ_WAS_SENT);
        TimeUnit.SECONDS.sleep(DURATION_OF_SECONDS_DELIVERING_RESPONSE);
        System.out.println(RESP_WAS_RECEIVED);
    }

    private static boolean isServerShouldBeStopped() {
        return true;
    }

    private static void stopServer() {
        System.out.println(MSG_SERVER_WAS_STOPPED);
    }
}