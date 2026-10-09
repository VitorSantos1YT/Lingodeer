package tf;

import android.content.Context;
import android.content.Intent;
import com.facebook.FacebookException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public re.m f52143a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f52145c;

    public b0(d0 d0Var, String str) {
        this.f52145c = d0Var;
        this.f52144b = str;
    }

    @Override // j.a
    public final Intent a(Context context, Object obj) {
        ArrayList arrayListH0;
        String strW;
        Collection permissions = (Collection) obj;
        kotlin.jvm.internal.m.f(permissions, "permissions");
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m.e(string, "randomUUID().toString()");
        lz.g gVar = new lz.g(43, 128, 1);
        jz.d dVar = jz.e.f37397a;
        int iN = hz.b.N(gVar);
        Iterable cVar = new lz.c('a', 'z');
        lz.c cVar2 = new lz.c('A', 'Z');
        if (cVar instanceof Collection) {
            arrayListH0 = ry.m.H0((Collection) cVar, cVar2);
        } else {
            ArrayList arrayList = new ArrayList();
            ry.m.d0(arrayList, cVar);
            ry.m.d0(arrayList, cVar2);
            arrayListH0 = arrayList;
        }
        ArrayList arrayListG0 = ry.m.G0('~', ry.m.G0('_', ry.m.G0('.', ry.m.G0('-', ry.m.H0(arrayListH0, new lz.c('0', '9'))))));
        ArrayList arrayList2 = new ArrayList(iN);
        for (int i11 = 0; i11 < iN; i11++) {
            jz.d dVar2 = jz.e.f37397a;
            Character ch2 = (Character) ry.m.I0(arrayListG0);
            ch2.getClass();
            arrayList2.add(ch2);
        }
        String codeVerifier = ry.m.y0(arrayList2, BuildConfig.VERSION_NAME, null, null, null, 62);
        kotlin.jvm.internal.m.f(codeVerifier, "codeVerifier");
        if (!((string.length() == 0 ? false : !(oz.q.H0(string, ' ', 0, 6) >= 0)) && ns.o.I(codeVerifier))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        HashSet hashSet = new HashSet(permissions);
        hashSet.add("openid");
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        kotlin.jvm.internal.m.e(setUnmodifiableSet, "unmodifiableSet(permissions)");
        a aVar = a.S256;
        try {
            strW = ns.o.w(codeVerifier, aVar);
        } catch (FacebookException unused) {
            aVar = a.PLAIN;
            strW = codeVerifier;
        }
        a aVar2 = aVar;
        d0 d0Var = this.f52145c;
        s sVar = d0Var.f52157a;
        Set setF1 = ry.m.f1(setUnmodifiableSet);
        e eVar = d0Var.f52158b;
        String str = d0Var.f52160d;
        String strB = re.s.b();
        String string2 = UUID.randomUUID().toString();
        kotlin.jvm.internal.m.e(string2, "randomUUID().toString()");
        t tVar = new t(sVar, setF1, eVar, str, strB, string2, d0Var.f52163g, string, codeVerifier, strW, aVar2);
        Date date = re.b.N;
        tVar.f52219f = ns.o.F();
        tVar.L = d0Var.f52161e;
        tVar.M = d0Var.f52162f;
        tVar.O = false;
        tVar.P = d0Var.f52164h;
        String str2 = this.f52144b;
        if (str2 != null) {
            tVar.f52218e = str2;
        }
        d0.d(context, tVar);
        Intent intentA = d0.a(tVar);
        if (re.s.a().getPackageManager().resolveActivity(intentA, 0) != null) {
            return intentA;
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        d0.b(context, u.ERROR, null, facebookException, false, tVar);
        throw facebookException;
    }

    @Override // j.a
    public final Object c(Intent intent, int i11) {
        this.f52145c.e(i11, intent, null);
        int iA = lf.i.Login.a();
        re.m mVar = this.f52143a;
        if (mVar != null) {
            ((lf.j) mVar).a(iA, i11, intent);
        }
        return new re.l(iA, i11, intent);
    }
}
