package s7;

import f7.e1;
import java.util.Objects;
import y6.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1[] f51470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s[] f51471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f51472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f51473e;

    public w(e1[] e1VarArr, s[] sVarArr, v0 v0Var, Object obj) {
        b7.a.d(e1VarArr.length == sVarArr.length);
        this.f51470b = e1VarArr;
        this.f51471c = (s[]) sVarArr.clone();
        this.f51472d = v0Var;
        this.f51473e = obj;
        this.f51469a = e1VarArr.length;
    }

    public final boolean a(w wVar, int i11) {
        return wVar != null && Objects.equals(this.f51470b[i11], wVar.f51470b[i11]) && Objects.equals(this.f51471c[i11], wVar.f51471c[i11]);
    }

    public final boolean b(int i11) {
        return this.f51470b[i11] != null;
    }
}
