package m00;

import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f40701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f40706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f40707g;

    public e0() {
        this.f40701a = new byte[OSSConstants.DEFAULT_BUFFER_SIZE];
        this.f40705e = true;
        this.f40704d = false;
    }

    public final e0 a() {
        e0 e0Var = this.f40706f;
        if (e0Var == this) {
            e0Var = null;
        }
        e0 e0Var2 = this.f40707g;
        kotlin.jvm.internal.m.c(e0Var2);
        e0Var2.f40706f = this.f40706f;
        e0 e0Var3 = this.f40706f;
        kotlin.jvm.internal.m.c(e0Var3);
        e0Var3.f40707g = this.f40707g;
        this.f40706f = null;
        this.f40707g = null;
        return e0Var;
    }

    public final void b(e0 segment) {
        kotlin.jvm.internal.m.f(segment, "segment");
        segment.f40707g = this;
        segment.f40706f = this.f40706f;
        e0 e0Var = this.f40706f;
        kotlin.jvm.internal.m.c(e0Var);
        e0Var.f40707g = segment;
        this.f40706f = segment;
    }

    public final e0 c() {
        this.f40704d = true;
        return new e0(this.f40701a, this.f40702b, this.f40703c, true, false);
    }

    public final void d(e0 sink, int i11) {
        kotlin.jvm.internal.m.f(sink, "sink");
        byte[] bArr = sink.f40701a;
        if (!sink.f40705e) {
            throw new IllegalStateException("only owner can write");
        }
        int i12 = sink.f40703c;
        int i13 = i12 + i11;
        if (i13 > 8192) {
            if (sink.f40704d) {
                throw new IllegalArgumentException();
            }
            int i14 = sink.f40702b;
            if (i13 - i14 > 8192) {
                throw new IllegalArgumentException();
            }
            ry.l.F(0, i14, i12, bArr, bArr);
            sink.f40703c -= sink.f40702b;
            sink.f40702b = 0;
        }
        int i15 = sink.f40703c;
        int i16 = this.f40702b;
        ry.l.F(i15, i16, i16 + i11, this.f40701a, bArr);
        sink.f40703c += i11;
        this.f40702b += i11;
    }

    public e0(byte[] data, int i11, int i12, boolean z11, boolean z12) {
        kotlin.jvm.internal.m.f(data, "data");
        this.f40701a = data;
        this.f40702b = i11;
        this.f40703c = i12;
        this.f40704d = z11;
        this.f40705e = z12;
    }
}
