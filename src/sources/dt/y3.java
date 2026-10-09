package dt;

import android.content.Intent;
import android.net.Uri;
import com.lingodeer.data.model.CourseAudioMode;
import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseVisibilityMode;
import com.yalantis.ucrop.UCrop;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y3 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f24404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24405c;

    public /* synthetic */ y3(fz.c cVar, l1.b1 b1Var, int i11) {
        this.f24403a = i11;
        this.f24404b = cVar;
        this.f24405c = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        Intent intent;
        CourseQuestionPreference courseQuestionPreferenceCopy$default;
        switch (this.f24403a) {
            case 0:
                qy.l wordDataPair = (qy.l) obj;
                kotlin.jvm.internal.m.f(wordDataPair, "wordDataPair");
                this.f24404b.invoke(wordDataPair.f48495a);
                this.f24405c.setValue(wordDataPair);
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                this.f24405c.setValue(Boolean.valueOf(iIntValue == 4));
                if (iIntValue == 1 || iIntValue == 4) {
                    this.f24404b.invoke(z4.Idle);
                }
                return qy.b0.f48488a;
            case 2:
                ht.o it = (ht.o) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f24404b.invoke(it);
                this.f24405c.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f24404b.invoke(((Integer) obj).intValue() == 1 ? kr.j.MOST_LIKE : kr.j.RECENT);
                this.f24405c.setValue(Boolean.FALSE);
                break;
            case 4:
                o3.w value = (o3.w) obj;
                kotlin.jvm.internal.m.f(value, "value");
                j3.h hVar = value.f44704a;
                String strG1 = oz.q.g1(200, hVar.f35700b);
                if (!strG1.equals(hVar.f35700b)) {
                    int length = strG1.length();
                    value = o3.w.b(value, strG1, j3.t.b(length, length), 4);
                }
                this.f24405c.setValue(value);
                this.f24404b.invoke(strG1);
                break;
            case 5:
                Integer num = (Integer) obj;
                num.getClass();
                this.f24405c.setValue(Boolean.FALSE);
                this.f24404b.invoke(num);
                break;
            case 6:
                ht.o it2 = (ht.o) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                this.f24404b.invoke(it2);
                this.f24405c.setValue(Boolean.FALSE);
                break;
            case 7:
                j3.u0 u0Var = (j3.u0) obj;
                this.f24405c.setValue(u0Var);
                this.f24404b.invoke(u0Var);
                break;
            case 8:
                o3.w value2 = (o3.w) obj;
                kotlin.jvm.internal.m.f(value2, "value");
                this.f24405c.setValue(value2);
                this.f24404b.invoke(value2.f44704a.f35700b);
                break;
            case 9:
                i.a result = (i.a) obj;
                kotlin.jvm.internal.m.f(result, "result");
                if (result.f33864a == -1 && (intent = result.f33865b) != null) {
                    Uri output = UCrop.getOutput(intent);
                    if (output == null) {
                        output = (Uri) this.f24405c.getValue();
                    }
                    if (output != null) {
                        this.f24404b.invoke(output);
                    }
                }
                return qy.b0.f48488a;
            case 10:
                String newNickName = (String) obj;
                kotlin.jvm.internal.m.f(newNickName, "newNickName");
                this.f24404b.invoke(newNickName);
                l1.b1 b1Var = this.f24405c;
                b1Var.setValue(xu.f.a((xu.f) b1Var.getValue(), false, false, false, false, false, false, 62));
                break;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f24404b.invoke(bool);
                l1.b1 b1Var2 = this.f24405c;
                b1Var2.setValue(xu.f.a((xu.f) b1Var2.getValue(), false, false, false, false, false, false, 55));
                break;
            case 12:
                Integer num2 = (Integer) obj;
                num2.getClass();
                this.f24404b.invoke(num2);
                this.f24405c.setValue(Boolean.FALSE);
                break;
            case 13:
                Integer num3 = (Integer) obj;
                num3.getClass();
                this.f24404b.invoke(num3);
                this.f24405c.setValue(Boolean.FALSE);
                break;
            case 14:
                Integer num4 = (Integer) obj;
                num4.getClass();
                this.f24404b.invoke(num4);
                this.f24405c.setValue(Boolean.FALSE);
                break;
            case 15:
                Integer num5 = (Integer) obj;
                num5.getClass();
                this.f24404b.invoke(num5);
                this.f24405c.setValue(Boolean.FALSE);
                break;
            case 16:
                int iIntValue2 = ((Integer) obj).intValue();
                l1.b1 b1Var3 = this.f24405c;
                CourseQuestionPreference courseQuestionPreference = (CourseQuestionPreference) b1Var3.getValue();
                if (courseQuestionPreference != null) {
                    CourseQuestionPreference courseQuestionPreferenceCopy$default2 = CourseQuestionPreference.copy$default(courseQuestionPreference, 0, null, iIntValue2 == 0 ? CourseAudioMode.AUTO_PLAY : CourseAudioMode.TAP_TO_PLAY, null, null, false, 0L, 123, null);
                    if (courseQuestionPreferenceCopy$default2 != null) {
                        b1Var3.setValue(courseQuestionPreferenceCopy$default2);
                        this.f24404b.invoke(courseQuestionPreferenceCopy$default2);
                    }
                }
                return qy.b0.f48488a;
            case 17:
                int iIntValue3 = ((Integer) obj).intValue();
                l1.b1 b1Var4 = this.f24405c;
                CourseQuestionPreference courseQuestionPreference2 = (CourseQuestionPreference) b1Var4.getValue();
                if (courseQuestionPreference2 != null) {
                    CourseQuestionPreference courseQuestionPreferenceCopy$default3 = CourseQuestionPreference.copy$default(courseQuestionPreference2, 0, null, null, iIntValue3 == 0 ? CourseVisibilityMode.ALWAYS_VISIBLE : CourseVisibilityMode.TAP_TO_REVEAL, null, false, 0L, 119, null);
                    if (courseQuestionPreferenceCopy$default3 != null) {
                        b1Var4.setValue(courseQuestionPreferenceCopy$default3);
                        this.f24404b.invoke(courseQuestionPreferenceCopy$default3);
                    }
                }
                return qy.b0.f48488a;
            case 18:
                int iIntValue4 = ((Integer) obj).intValue();
                l1.b1 b1Var5 = this.f24405c;
                CourseQuestionPreference courseQuestionPreference3 = (CourseQuestionPreference) b1Var5.getValue();
                if (courseQuestionPreference3 != null) {
                    CourseQuestionPreference courseQuestionPreferenceCopy$default4 = CourseQuestionPreference.copy$default(courseQuestionPreference3, 0, null, null, null, iIntValue4 == 0 ? CourseVisibilityMode.ALWAYS_VISIBLE : CourseVisibilityMode.TAP_TO_REVEAL, false, 0L, 111, null);
                    if (courseQuestionPreferenceCopy$default4 != null) {
                        b1Var5.setValue(courseQuestionPreferenceCopy$default4);
                        this.f24404b.invoke(courseQuestionPreferenceCopy$default4);
                    }
                }
                return qy.b0.f48488a;
            case 19:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l1.b1 b1Var6 = this.f24405c;
                CourseQuestionPreference courseQuestionPreference4 = (CourseQuestionPreference) b1Var6.getValue();
                if (courseQuestionPreference4 != null && (courseQuestionPreferenceCopy$default = CourseQuestionPreference.copy$default(courseQuestionPreference4, 0, null, null, null, null, zBooleanValue, 0L, 95, null)) != null) {
                    b1Var6.setValue(courseQuestionPreferenceCopy$default);
                    this.f24404b.invoke(courseQuestionPreferenceCopy$default);
                }
                return qy.b0.f48488a;
            default:
                ht.o courseTestParams = (ht.o) obj;
                kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                this.f24404b.invoke(courseTestParams);
                this.f24405c.setValue(Boolean.FALSE);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ y3(l1.b1 b1Var, fz.c cVar, int i11) {
        this.f24403a = i11;
        this.f24405c = b1Var;
        this.f24404b = cVar;
    }
}
