package m00;

import bw.ORXQ.ADSb;
import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f40756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f40758c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RandomAccessFile f40759d;

    public w(RandomAccessFile randomAccessFile) {
        this.f40759d = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f40758c;
        reentrantLock.lock();
        try {
            if (this.f40756a) {
                reentrantLock.unlock();
                return;
            }
            this.f40756a = true;
            if (this.f40757b != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f40759d.close();
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f40758c;
        reentrantLock.lock();
        try {
            if (this.f40756a) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f40759d.length();
            }
            return length;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final n a(long j11) {
        ReentrantLock reentrantLock = this.f40758c;
        reentrantLock.lock();
        try {
            if (this.f40756a) {
                throw new IllegalStateException(ADSb.xiDXYcyl);
            }
            this.f40757b++;
            reentrantLock.unlock();
            return new n(this, j11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
