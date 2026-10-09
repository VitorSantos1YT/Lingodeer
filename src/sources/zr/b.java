package zr;

import aj.uZCn.evRpcb;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.stkouyu.util.CommandUtil;
import com.tbruyelle.rxpermissions3.BuildConfig;
import i0.pKy.shrCcjmOhAmRC;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import rz.e0;
import tp.f0;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ViewModel {
    public final Set H;
    public final Set K;
    public final List L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr.k f59288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dv.l f59289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f59290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f59291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f59292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Set f59293f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i1 f59294t;

    public static CourseCharacterGroup a() {
        return new CourseCharacterGroup(-1L, 0, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME);
    }

    public static String b(String str) {
        if (str.length() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        String string = oz.q.i1(lowerCase).toString();
        Map mapY = ry.x.Y(new qy.l((char) 257, 'a'), new qy.l((char) 225, 'a'), new qy.l((char) 462, 'a'), new qy.l((char) 224, 'a'), new qy.l((char) 275, 'e'), new qy.l((char) 233, 'e'), new qy.l((char) 283, 'e'), new qy.l((char) 232, 'e'), new qy.l((char) 299, 'i'), new qy.l((char) 237, 'i'), new qy.l((char) 464, 'i'), new qy.l((char) 236, 'i'), new qy.l((char) 333, 'o'), new qy.l((char) 243, 'o'), new qy.l((char) 466, 'o'), new qy.l((char) 242, 'o'), new qy.l((char) 363, 'u'), new qy.l((char) 250, 'u'), new qy.l((char) 468, 'u'), new qy.l((char) 249, 'u'), new qy.l((char) 470, 'v'), new qy.l((char) 472, 'v'), new qy.l((char) 474, 'v'), new qy.l((char) 476, 'v'), new qy.l((char) 252, 'v'), new qy.l((char) 258, 'a'), new qy.l((char) 259, 'a'), new qy.l((char) 202, 'e'), new qy.l((char) 234, 'e'), new qy.l((char) 301, 'i'), new qy.l((char) 335, 'o'), new qy.l((char) 365, 'u'));
        StringBuilder sb2 = new StringBuilder(string.length());
        for (int i11 = 0; i11 < string.length(); i11++) {
            char cCharAt = string.charAt(i11);
            if (!Character.isDigit(cCharAt)) {
                if (mapY.containsKey(Character.valueOf(cCharAt))) {
                    sb2.append(mapY.get(Character.valueOf(cCharAt)));
                } else if (cCharAt != ':' && cCharAt != ' ' && cCharAt != '-' && cCharAt != '\t') {
                    sb2.append(cCharAt);
                }
            }
        }
        String string2 = sb2.toString();
        kotlin.jvm.internal.m.e(string2, "toString(...)");
        return oz.x.q0(string2, "u:", "v");
    }

    public static List c(String str) {
        if (oz.q.K0(str)) {
            return ry.r.f50854a;
        }
        List listX0 = oz.q.X0(str, new char[]{'/', ';', ',', ' '}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listX0) {
            if (!oz.q.K0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public b(yr.k kVar, dv.l lVar) {
        this.f59288a = kVar;
        this.f59289b = lVar;
        i1 i1VarC = x0.c(t.f59324a);
        this.f59290c = i1VarC;
        this.f59291d = new r0(i1VarC);
        this.f59292e = ry.r.f50854a;
        this.f59293f = ry.t.f50856a;
        this.f59294t = x0.c(BuildConfig.VERSION_NAME);
        vy.d dVar = null;
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new xg.b(this, dVar, 13), 3);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new f0(this, dVar, 15), 3);
        this.H = ry.l.m0(new String[]{"zh", "ch", CommandUtil.COMMAND_SH});
        this.K = ry.l.m0(new Character[]{'b', 'p', 'm', 'f', 'd', 't', 'n', 'l', 'g', 'k', 'h', 'j', 'q', 'x', 'r', 'z', 'c', 's', 'y', 'w'});
        this.L = ry.m.S0(ry.m.j0(ns.o.L("iong", "uang", "iang", "uai", "uan", "ang", "eng", "ong", "iao", "ian", "ing", "ui", "iu", "ie", "ia", "ua", "uo", "ue", "ai", "ei", "ao", "ou", "an", "en", evRpcb.bANgjDRtZOmYj, "un", "vn", "er", "a", "o", "e", "i", "u", shrCcjmOhAmRC.lcVc, "n", "ng")), new ua.e(10));
    }
}
