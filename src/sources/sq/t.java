package sq;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.p0;
import bq.z;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.p5;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends a {
    public pq.b O;
    public final cm.a P;

    public t() {
        super(s.f51750a, BuildConfig.VERSION_NAME);
        this.P = new cm.a();
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        Parcelable parcelable = requireArguments().getParcelable(INTENTS.EXTRA_OBJECT);
        kotlin.jvm.internal.m.c(parcelable);
        pq.b bVar = (pq.b) parcelable;
        this.O = bVar;
        String str = bVar.f46987b;
        kotlin.jvm.internal.m.e(str, "getLessonName(...)");
        p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View viewRequireView = requireView();
        kotlin.jvm.internal.m.e(viewRequireView, "requireView(...)");
        ve.i.H(str, (l.m) p0VarRequireActivity, viewRequireView);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        z.b(((p5) aVar).f33099b, new s0.a(this, 6));
    }

    @Override // sq.a
    public final HashMap x(pq.b lesson) {
        cm.a aVar;
        kotlin.jvm.internal.m.f(lesson, "lesson");
        HashMap map = new HashMap();
        String str = lesson.f46990e;
        kotlin.jvm.internal.m.e(str, "getInitialPool(...)");
        String[] strArr = (String[]) oz.q.W0(str, new String[]{","}, 0, 6).toArray(new String[0]);
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            aVar = this.P;
            if (i11 >= length) {
                break;
            }
            String str2 = strArr[i11];
            qy.q qVar = fv.b.f28186a;
            String strA = aVar.a(str2);
            kotlin.jvm.internal.m.e(strA, "getCharName(...)");
            String strA2 = fv.b.a(strA, null, null);
            String strA3 = aVar.a(str2);
            kotlin.jvm.internal.m.e(strA3, "getCharName(...)");
            map.put(strA2, fv.b.e(strA3));
            i11++;
        }
        String str3 = lesson.f46989d;
        kotlin.jvm.internal.m.e(str3, "getFinalPool(...)");
        for (String str4 : (String[]) oz.q.W0(str3, new String[]{","}, 0, 6).toArray(new String[0])) {
            qy.q qVar2 = fv.b.f28186a;
            String strA4 = aVar.a(str4);
            kotlin.jvm.internal.m.e(strA4, "getCharName(...)");
            String strA5 = fv.b.a(strA4, null, null);
            String strA6 = aVar.a(str4);
            kotlin.jvm.internal.m.e(strA6, "getCharName(...)");
            map.put(strA5, fv.b.e(strA6));
        }
        String str5 = lesson.f46991f;
        kotlin.jvm.internal.m.e(str5, "getStudyPool(...)");
        for (String str6 : (String[]) oz.q.W0(str5, new String[]{","}, 0, 6).toArray(new String[0])) {
            qy.q qVar3 = fv.b.f28186a;
            String strA7 = aVar.a(str6);
            kotlin.jvm.internal.m.e(strA7, "getCharName(...)");
            String strA8 = fv.b.a(strA7, null, null);
            String strA9 = aVar.a(str6);
            kotlin.jvm.internal.m.e(strA9, "getCharName(...)");
            map.put(strA8, fv.b.e(strA9));
        }
        return map;
    }
}
