package ma;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f41100e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f41102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f41103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f41104d;

    public a(String str, File file, boolean z11) {
        Lock lock;
        this.f41101a = z11;
        this.f41102b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f41100e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f41103c = lock;
    }

    public final void a(boolean z11) {
        this.f41103c.lock();
        if (z11) {
            File file = this.f41102b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f41104d = channel;
            } catch (IOException unused) {
                this.f41104d = null;
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f41104d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f41103c.unlock();
    }
}
