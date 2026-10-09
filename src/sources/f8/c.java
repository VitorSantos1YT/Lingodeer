package f8;

import androidx.recyclerview.widget.e;
import x7.s;
import x7.x;
import x7.y;
import x7.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f26987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f26988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, y yVar, y yVar2) {
        super(yVar);
        this.f26988c = eVar;
        this.f26987b = yVar2;
    }

    @Override // x7.s, x7.y
    public final x i(long j11) {
        x xVarI = this.f26987b.i(j11);
        z zVar = xVarI.f55956a;
        long j12 = zVar.f55959a;
        long j13 = zVar.f55960b;
        long j14 = this.f26988c.f2443b;
        z zVar2 = new z(j12, j13 + j14);
        z zVar3 = xVarI.f55957b;
        return new x(zVar2, new z(zVar3.f55959a, zVar3.f55960b + j14));
    }
}
