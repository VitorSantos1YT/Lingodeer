package j4;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.SparseArray;
import android.widget.EditText;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.x3;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.y;
import rz.e0;
import tp.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements s20.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f35910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f35911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f35912e;

    public int a(long j11) {
        int i11 = this.f35908a + 1;
        long[] jArr = (long[]) this.f35910c;
        int length = jArr.length;
        if (i11 > length) {
            int i12 = length * 2;
            long[] jArr2 = new long[i12];
            int[] iArr = new int[i12];
            ry.l.J(jArr, jArr2, 0, 0, jArr.length);
            ry.l.L(0, 0, (int[]) this.f35911d, iArr, 14);
            this.f35910c = jArr2;
            this.f35911d = iArr;
        }
        int i13 = this.f35908a;
        this.f35908a = i13 + 1;
        int length2 = ((int[]) this.f35912e).length;
        if (this.f35909b >= length2) {
            int i14 = length2 * 2;
            int[] iArr2 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                iArr2[i15] = i16;
                i15 = i16;
            }
            ry.l.L(0, 0, (int[]) this.f35912e, iArr2, 14);
            this.f35912e = iArr2;
        }
        int i17 = this.f35909b;
        int[] iArr3 = (int[]) this.f35912e;
        this.f35909b = iArr3[i17];
        long[] jArr3 = (long[]) this.f35910c;
        jArr3[i13] = j11;
        ((int[]) this.f35911d)[i13] = i17;
        iArr3[i17] = i13;
        while (i13 > 0) {
            int i18 = ((i13 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.m.i(jArr3[i18], j11) <= 0) {
                break;
            }
            d(i18, i13);
            i13 = i18;
        }
        return i17;
    }

    public void b(Context context, XmlResourceParser xmlResourceParser) {
        p pVar = new p();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            String attributeName = xmlResourceParser.getAttributeName(i11);
            String attributeValue = xmlResourceParser.getAttributeValue(i11);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                pVar.k(context, xmlResourceParser);
                ((SparseArray) this.f35912e).put(identifier, pVar);
                return;
            }
        }
    }

    @Override // s20.f
    public void c(File file) {
        EditText editText;
        kotlin.jvm.internal.m.f(file, "file");
        file.getPath();
        g1.k kVar = (g1.k) this.f35910c;
        x3 x3Var = (x3) kVar.f28529b;
        l.m mVar = (l.m) kVar.f28530c;
        String str = (String) this.f35911d;
        String name = file.getName();
        kotlin.jvm.internal.m.e(name, "getName(...)");
        int i11 = this.f35908a;
        int i12 = this.f35909b;
        String str2 = (String) this.f35912e;
        y yVar = new y();
        yVar.f38361a = BuildConfig.VERSION_NAME;
        List listW0 = oz.q.W0(str, new String[]{":"}, 0, 6);
        String str3 = (String) listW0.get(0);
        String str4 = (String) listW0.get(1);
        String str5 = (String) listW0.get(2);
        if (kotlin.jvm.internal.m.a(str3, "1") && kotlin.jvm.internal.m.a(str5, "13") && (editText = (EditText) x3Var.f33577j.findViewById(R.id.edit_content)) != null) {
            yVar.f38361a = "--(" + ((Object) editText.getText()) + ")";
        }
        String str6 = Build.MODEL;
        String str7 = Build.VERSION.RELEASE;
        int[] iArr = bq.r.f4959a;
        String strH = bq.m.h(((Env) kVar.f28531d).locateLanguage);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        e0.B(LifecycleOwnerKt.getLifecycleScope(mVar), null, null, new ls.e(str4, str3, str5, kVar, name, yVar, ep.a.k(b7.e0.q(str6, ";", str7, ";", strH), ";", kotlin.jvm.internal.m.a(cf.x.n().accountType, "unlogin_user") ? "unlogin user" : cf.x.n().uid), str2, i11, i12, (vy.d) null), 3);
        e0.B(LifecycleOwnerKt.getLifecycleScope(mVar), null, null, new f0(file, (vy.d) null, 5), 3);
        kVar.b();
        ve.i.B(x3Var.f33568a);
        Toast.makeText(mVar, mVar.getString(R.string.thanks_for_your_report), 0).show();
    }

    public void d(int i11, int i12) {
        long[] jArr = (long[]) this.f35910c;
        int[] iArr = (int[]) this.f35911d;
        int[] iArr2 = (int[]) this.f35912e;
        long j11 = jArr[i11];
        jArr[i11] = jArr[i12];
        jArr[i12] = j11;
        int i13 = iArr[i11];
        int i14 = iArr[i12];
        iArr[i11] = i14;
        iArr[i12] = i13;
        iArr2[i14] = i11;
        iArr2[i13] = i12;
    }

    @Override // s20.f
    public void onError(Throwable e8) {
        kotlin.jvm.internal.m.f(e8, "e");
    }

    @Override // s20.f
    public void onStart() {
    }
}
