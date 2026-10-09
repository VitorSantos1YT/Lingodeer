package e9;

import f7.y0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f25425e;

    public w(int i11) {
        this.f25422b = i11;
        byte[] bArr = new byte[131];
        this.f25425e = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i11, int i12) {
        if (this.f25421a) {
            int i13 = i12 - i11;
            byte[] bArr2 = (byte[]) this.f25425e;
            int length = bArr2.length;
            int i14 = this.f25424d;
            if (length < i14 + i13) {
                this.f25425e = Arrays.copyOf(bArr2, (i14 + i13) * 2);
            }
            System.arraycopy(bArr, i11, (byte[]) this.f25425e, this.f25424d, i13);
            this.f25424d += i13;
        }
    }

    public boolean b(int i11) {
        if (!this.f25421a) {
            return false;
        }
        this.f25424d -= i11;
        this.f25421a = false;
        this.f25423c = true;
        return true;
    }

    public void c(int i11) {
        this.f25421a |= i11 > 0;
        this.f25422b += i11;
    }

    public void d() {
        this.f25421a = false;
        this.f25423c = false;
    }

    public void e(int i11) {
        b7.a.j(!this.f25421a);
        boolean z11 = i11 == this.f25422b;
        this.f25421a = z11;
        if (z11) {
            this.f25424d = 3;
            this.f25423c = false;
        }
    }

    public w(y0 y0Var) {
        this.f25425e = y0Var;
    }
}
