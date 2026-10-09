package mw;

import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f42782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42784c;

    public SocketAddress a() {
        if (c()) {
            return (SocketAddress) ((lw.v) this.f42782a.get(this.f42783b)).f40480a.get(this.f42784c);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public boolean b() {
        if (c()) {
            lw.v vVar = (lw.v) this.f42782a.get(this.f42783b);
            int i11 = this.f42784c + 1;
            this.f42784c = i11;
            if (i11 >= vVar.f40480a.size()) {
                int i12 = this.f42783b + 1;
                this.f42783b = i12;
                this.f42784c = 0;
                if (i12 < this.f42782a.size()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.f42783b < this.f42782a.size();
    }

    public void d() {
        this.f42783b = 0;
        this.f42784c = 0;
    }

    public boolean e(SocketAddress socketAddress) {
        for (int i11 = 0; i11 < this.f42782a.size(); i11++) {
            int iIndexOf = ((lw.v) this.f42782a.get(i11)).f40480a.indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f42783b = i11;
                this.f42784c = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
