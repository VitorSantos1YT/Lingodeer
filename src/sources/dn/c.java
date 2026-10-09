package dn;

import android.content.Context;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm.c f23500a;

    public c(xm.c tableData) {
        m.f(tableData, "tableData");
        this.f23500a = tableData;
    }

    @Override // dn.d
    public final int a() {
        return this.f23500a.f56114b.size() + 1;
    }

    @Override // dn.d
    public final Object b(int i11) {
        String str = (String) ry.m.t0(i11 - 1, this.f23500a.f56113a);
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    @Override // dn.d
    public final Object c(int i11) {
        String str = (String) ry.m.t0(i11 - 1, this.f23500a.f56114b);
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    @Override // dn.d
    public final Object d(int i11, int i12) {
        List list = (List) ry.m.t0(i11 - 1, this.f23500a.f56115c);
        KOCharZhuyin kOCharZhuyin = list != null ? (KOCharZhuyin) ry.m.t0(i12 - 1, list) : null;
        m.c(kOCharZhuyin);
        return kOCharZhuyin;
    }

    @Override // dn.d
    public final String e(Context context) {
        m.f(context, "context");
        return h.y(context, R.string.all);
    }

    @Override // dn.d
    public final int f() {
        return this.f23500a.f56113a.size() + 1;
    }
}
