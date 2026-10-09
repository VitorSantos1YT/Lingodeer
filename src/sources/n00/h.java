package n00;

import java.io.IOException;
import kotlin.jvm.internal.y;
import m00.d0;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43089a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f43090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f43091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f43092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f43093e;

    public /* synthetic */ h(y yVar, d0 d0Var, y yVar2, y yVar3) {
        this.f43090b = yVar;
        this.f43091c = d0Var;
        this.f43092d = yVar2;
        this.f43093e = yVar3;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i11 = this.f43089a;
        int iIntValue = ((Integer) obj).intValue();
        Long l9 = (Long) obj2;
        switch (i11) {
            case 0:
                long jLongValue = l9.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    d0 d0Var = this.f43091c;
                    byte b3 = d0Var.readByte();
                    boolean z11 = (b3 & 1) == 1;
                    boolean z12 = (b3 & 2) == 2;
                    boolean z13 = (b3 & 4) == 4;
                    long j11 = z11 ? 5L : 1L;
                    if (z12) {
                        j11 += 4;
                    }
                    if (z13) {
                        j11 += 4;
                    }
                    if (jLongValue < j11) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z11) {
                        this.f43090b.f38361a = Integer.valueOf(d0Var.d());
                    }
                    if (z12) {
                        this.f43092d.f38361a = Integer.valueOf(d0Var.d());
                    }
                    if (z13) {
                        this.f43093e.f38361a = Integer.valueOf(d0Var.d());
                    }
                }
                return b0.f48488a;
            default:
                long jLongValue2 = l9.longValue();
                if (iIntValue == 1) {
                    y yVar = this.f43090b;
                    if (yVar.f38361a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    d0 d0Var2 = this.f43091c;
                    yVar.f38361a = Long.valueOf(d0Var2.e());
                    this.f43092d.f38361a = Long.valueOf(d0Var2.e());
                    this.f43093e.f38361a = Long.valueOf(d0Var2.e());
                }
                return b0.f48488a;
        }
    }

    public /* synthetic */ h(d0 d0Var, y yVar, y yVar2, y yVar3) {
        this.f43091c = d0Var;
        this.f43090b = yVar;
        this.f43092d = yVar2;
        this.f43093e = yVar3;
    }
}
