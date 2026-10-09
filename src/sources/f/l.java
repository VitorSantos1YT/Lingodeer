package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f26160h;

    public l(n nVar) {
        this.f26160h = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // i.i
    public final void b(int i11, j.a contract, Object obj) {
        Bundle bundleExtra;
        int i12;
        kotlin.jvm.internal.m.f(contract, "contract");
        n nVar = this.f26160h;
        hd.b bVarB = contract.b(nVar, obj);
        if (bVarB != null) {
            new Handler(Looper.getMainLooper()).post(new b7.j(this, i11, 1, bVarB));
            return;
        }
        Intent intentA = contract.a(nVar, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            kotlin.jvm.internal.m.c(extras);
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(nVar.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                if (TextUtils.isEmpty(stringArrayExtra[i13])) {
                    throw new IllegalArgumentException(ep.a.k(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i13], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i13));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i14 = 0;
                for (int i15 = 0; i15 < stringArrayExtra.length; i15++) {
                    if (!hashSet.contains(Integer.valueOf(i15))) {
                        strArr[i14] = stringArrayExtra[i15];
                        i14++;
                    }
                }
            }
            if (nVar instanceof n4.a) {
                ((n4.a) nVar).validateRequestPermissionsRequestCode(i11);
            }
            nVar.requestPermissions(stringArrayExtra, i11);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            nVar.startActivityForResult(intentA, i11, bundle);
            return;
        }
        i.k kVar = (i.k) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            kotlin.jvm.internal.m.c(kVar);
            i12 = i11;
            try {
                nVar.startIntentSenderForResult(kVar.f33886a, i12, kVar.f33887b, kVar.f33888c, kVar.f33889d, 0, bundle);
            } catch (IntentSender.SendIntentException e8) {
                e = e8;
                new Handler(Looper.getMainLooper()).post(new b7.j(this, i12, 2, e));
            }
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
            i12 = i11;
        }
    }
}
