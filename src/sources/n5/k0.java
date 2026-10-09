package n5;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f43306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(n0 n0Var, int i11) {
        super(0);
        this.f43305a = i11;
        this.f43306b = n0Var;
    }

    @Override // fz.a
    public final Object invoke() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        switch (this.f43305a) {
            case 0:
                n0 n0Var = this.f43306b;
                File file = new File(n0Var.f43332b.getAbsolutePath() + n0Var.f43335e);
                n0.f(n0Var, file);
                return file;
            case 1:
                System.loadLibrary("datastore_shared_counter");
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new k0(this.f43306b, 0).invoke(), 939524096);
                    try {
                        int fd2 = parcelFileDescriptorOpen.getFd();
                        NativeSharedCounter nativeSharedCounter = t0.f43387b;
                        if (nativeSharedCounter.nativeTruncateFile(fd2) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                        if (jNativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        t0 t0Var = new t0(jNativeCreateSharedCounter);
                        parcelFileDescriptorOpen.close();
                        return t0Var;
                    } catch (Throwable th2) {
                        th = th2;
                        if (parcelFileDescriptorOpen != null) {
                            parcelFileDescriptorOpen.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptorOpen = null;
                }
                break;
            default:
                n0 n0Var2 = this.f43306b;
                File file2 = new File(n0Var2.f43332b.getAbsolutePath() + n0Var2.f43334d);
                n0.f(n0Var2, file2);
                return file2;
        }
    }
}
