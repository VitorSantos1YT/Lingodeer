package bt;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements fz.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5133a;

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f5133a) {
            case 0:
                j0.q CourseTestModelScreen = (j0.q) obj;
                ((Integer) obj2).getClass();
                ((Boolean) obj3).getClass();
                l1.n nVar = (l1.n) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen, "$this$CourseTestModelScreen");
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 1025) != 1024)) {
                    sVar.W();
                }
                break;
            case 1:
                j0.q CourseTestModelScreen2 = (j0.q) obj;
                ((Integer) obj2).getClass();
                ((Boolean) obj3).getClass();
                l1.n nVar2 = (l1.n) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen2, "$this$CourseTestModelScreen");
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 1025) != 1024)) {
                    sVar2.W();
                }
                break;
            case 2:
                j0.q CourseTestModelScreen3 = (j0.q) obj;
                ((Integer) obj2).getClass();
                ((Boolean) obj3).getClass();
                l1.n nVar3 = (l1.n) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen3, "$this$CourseTestModelScreen");
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 1025) != 1024)) {
                    sVar3.W();
                }
                break;
            case 3:
                j0.q CourseTestModelScreen4 = (j0.q) obj;
                ((Integer) obj2).getClass();
                ((Boolean) obj3).getClass();
                l1.n nVar4 = (l1.n) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen4, "$this$CourseTestModelScreen");
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 1025) != 1024)) {
                    sVar4.W();
                }
                break;
            case 4:
                j0.q CourseTestModelScreen5 = (j0.q) obj;
                ((Integer) obj2).getClass();
                ((Boolean) obj3).getClass();
                l1.n nVar5 = (l1.n) obj4;
                int iIntValue5 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen5, "$this$CourseTestModelScreen");
                l1.s sVar5 = (l1.s) nVar5;
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 1025) != 1024)) {
                    sVar5.W();
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j11 = ((j3.x0) obj5).f35823a;
                String string = ((CharSequence) obj4).subSequence(j3.x0.f(j11), j3.x0.e(j11)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return qy.b0.f48488a;
    }
}
