package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1651a;

    public /* synthetic */ e1(int i11) {
        this.f1651a = i11;
    }

    @Override // j.a
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f1651a) {
            case 0:
                i.k kVar = (i.k) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = kVar.f33887b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = kVar.f33886a;
                        kotlin.jvm.internal.m.f(intentSender, "intentSender");
                        kVar = new i.k(intentSender, null, kVar.f33888c, kVar.f33889d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kVar);
                if (k1.L(2)) {
                    intent.toString();
                }
                return intent;
            case 1:
                String[] input = (String[]) obj;
                kotlin.jvm.internal.m.f(input, "input");
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
                kotlin.jvm.internal.m.e(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
                return type;
            case 2:
                String[] input2 = (String[]) obj;
                kotlin.jvm.internal.m.f(input2, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input2);
                kotlin.jvm.internal.m.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            case 3:
                String input3 = (String) obj;
                kotlin.jvm.internal.m.f(input3, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input3});
                kotlin.jvm.internal.m.e(intentPutExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra2;
            case 4:
                Intent input4 = (Intent) obj;
                kotlin.jvm.internal.m.f(input4, "input");
                return input4;
            case 5:
                i.k input5 = (i.k) obj;
                kotlin.jvm.internal.m.f(input5, "input");
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input5);
                kotlin.jvm.internal.m.e(intentPutExtra3, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return intentPutExtra3;
            case 6:
                Uri input6 = (Uri) obj;
                kotlin.jvm.internal.m.f(input6, "input");
                Intent intentPutExtra4 = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input6);
                kotlin.jvm.internal.m.e(intentPutExtra4, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
                return intentPutExtra4;
            case 7:
                Intent input7 = (Intent) obj;
                kotlin.jvm.internal.m.f(input7, "input");
                return input7;
            default:
                Intent input8 = (Intent) obj;
                kotlin.jvm.internal.m.f(input8, "input");
                return input8;
        }
    }

    @Override // j.a
    public hd.b b(Context context, Object obj) {
        switch (this.f1651a) {
            case 1:
                kotlin.jvm.internal.m.f((String[]) obj, "input");
                return null;
            case 2:
                String[] input = (String[]) obj;
                kotlin.jvm.internal.m.f(input, "input");
                if (input.length == 0) {
                    return new hd.b(ry.s.f50855a, 21);
                }
                for (String str : input) {
                    if (o4.c.a(context, str) != 0) {
                        return null;
                    }
                }
                int iW = ry.x.W(input.length);
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new hd.b(linkedHashMap, 21);
            case 3:
                String input2 = (String) obj;
                kotlin.jvm.internal.m.f(input2, "input");
                if (o4.c.a(context, input2) == 0) {
                    return new hd.b(Boolean.TRUE, 21);
                }
                return null;
            case 4:
            case 5:
            default:
                return super.b(context, obj);
            case 6:
                kotlin.jvm.internal.m.f((Uri) obj, "input");
                return null;
        }
    }

    @Override // j.a
    public final Object c(Intent intent, int i11) {
        switch (this.f1651a) {
            case 0:
                return new i.a(intent, i11);
            case 1:
                if (i11 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 2:
                if (i11 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i12 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i12 == 0));
                        }
                        ArrayList arrayListT = ry.l.T(stringArrayExtra);
                        Iterator it = arrayListT.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(ry.n.W(arrayListT, 10), ry.n.W(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new qy.l(it.next(), it2.next()));
                        }
                        return ry.x.g0(arrayList2);
                    }
                }
                return ry.s.f50855a;
            case 3:
                if (intent == null || i11 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z11 = false;
                if (intArrayExtra2 != null) {
                    for (int i13 : intArrayExtra2) {
                        if (i13 == 0) {
                            z11 = true;
                        }
                    }
                }
                return Boolean.valueOf(z11);
            case 4:
                return new i.a(intent, i11);
            case 5:
                return new i.a(intent, i11);
            case 6:
                return Boolean.valueOf(i11 == -1);
            case 7:
                Pair pairCreate = Pair.create(Integer.valueOf(i11), intent);
                kotlin.jvm.internal.m.e(pairCreate, "create(resultCode, intent)");
                return pairCreate;
            default:
                Pair pairCreate2 = Pair.create(Integer.valueOf(i11), intent);
                kotlin.jvm.internal.m.e(pairCreate2, "create(resultCode, intent)");
                return pairCreate2;
        }
    }
}
