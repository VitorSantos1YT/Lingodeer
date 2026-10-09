package n00;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends m00.e {
    public final Socket m;

    public f(Socket socket) {
        this.m = socket;
    }

    @Override // m00.e
    public final void j() {
        Socket socket = this.m;
        try {
            socket.close();
        } catch (AssertionError e8) {
            if (!j.a(e8)) {
                throw e8;
            }
            j.f43101a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e8);
        } catch (Exception e10) {
            j.f43101a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
