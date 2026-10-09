package zu;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends xy.i implements fz.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f59517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ String f59518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f59519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ a f59520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f59521e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, vy.d dVar) {
        super(5, dVar);
        this.f59521e = qVar;
    }

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        p pVar = new p(this.f59521e, (vy.d) obj5);
        pVar.f59517a = zBooleanValue;
        pVar.f59518b = (String) obj2;
        pVar.f59519c = zBooleanValue2;
        pVar.f59520d = (a) obj4;
        return pVar.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objL;
        String str2;
        boolean z11 = this.f59517a;
        String str3 = this.f59518b;
        boolean z12 = this.f59519c;
        a aVar = this.f59520d;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        vt.n0 n0Var = this.f59521e.f59530a;
        int i11 = ((fr.o0) n0Var).f27733a.locateLanguage;
        if (ry.l.D(new Integer[]{0, 9, 1}, Integer.valueOf(i11))) {
            str = "yyyy年M月d日";
        } else {
            str = ry.l.D(new Integer[]{6}, Integer.valueOf(i11)) ? "d. MMM yyy" : "MMM d, yyyy";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        try {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd");
            String joinedDate = ((fr.o0) n0Var).f27733a.joinedDate;
            kotlin.jvm.internal.m.e(joinedDate, "joinedDate");
            Date date = simpleDateFormat2.parse(joinedDate);
            if (date != null) {
                String str4 = simpleDateFormat.format(date);
                kotlin.jvm.internal.m.e(str4, "format(...)");
                objL = str4.toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.m.e(objL, "toUpperCase(...)");
            } else {
                objL = BuildConfig.VERSION_NAME;
            }
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        String str5 = qy.o.a(objL) == null ? (String) objL : BuildConfig.VERSION_NAME;
        boolean z13 = !((fr.o0) n0Var).f27733a.isUnloginUser();
        String strW = ((fr.o0) n0Var).w();
        String strQ = ((fr.o0) n0Var).q();
        String strG = ((fr.o0) n0Var).g();
        String str6 = ((fr.o0) n0Var).f27733a.userPicName;
        String str7 = str6 == null ? BuildConfig.VERSION_NAME : str6;
        String strB = ((fr.o0) n0Var).b();
        if (strB.equals("gg")) {
            str2 = "Google";
        } else {
            str2 = strB.equals("fb") ? "Facebook" : "Email";
        }
        return new l(z13, strW, strQ, strG, str7, str2, str5, str3, z11, z12, aVar);
    }
}
