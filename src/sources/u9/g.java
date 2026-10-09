package u9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52874d;

    public g(int i11, int i12, long j11, long j12) {
        this.f52871a = i11;
        this.f52872b = i12;
        this.f52873c = j11;
        this.f52874d = j12;
    }

    public static g a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return gVar;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f52871a);
            dataOutputStream.writeInt(this.f52872b);
            dataOutputStream.writeLong(this.f52873c);
            dataOutputStream.writeLong(this.f52874d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f52872b == gVar.f52872b && this.f52873c == gVar.f52873c && this.f52871a == gVar.f52871a && this.f52874d == gVar.f52874d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f52872b), Long.valueOf(this.f52873c), Integer.valueOf(this.f52871a), Long.valueOf(this.f52874d));
    }
}
