package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.type.bACG.scNRoQgKSYX;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f7553c;

    public l0(h hVar, boolean z11) {
        this.f7553c = hVar;
        this.f7552b = z11;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f7551a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f7552b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f7551a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter) {
        l0 l0Var;
        try {
            try {
                if (this.f7551a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    l0Var = this;
                    context.registerReceiver(l0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f7552b ? 4 : 2);
                } else {
                    l0Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                l0Var.f7551a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.f7551a) {
            int i11 = zzc.f12272a;
        } else {
            context.unregisterReceiver(this);
            this.f7551a = false;
        }
    }

    public final void d(Bundle bundle, j jVar, int i11, zzil zzilVar, long j11, boolean z11) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            h hVar = this.f7553c;
            if (byteArray != null) {
                ((ob.c) hVar.f7511d).y(zzhx.p(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzeu.a()), j11, z11);
            } else {
                ((ob.c) hVar.f7511d).y(h0.b(zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i11, jVar, null, zzilVar), j11, z11);
            }
        } catch (Throwable unused) {
            int i12 = zzc.f12272a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f9 A[Catch: all -> 0x021c, TryCatch #0 {all -> 0x021c, blocks: (B:84:0x01c5, B:86:0x01f9, B:88:0x0218, B:87:0x01fe), top: B:94:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01fe A[Catch: all -> 0x021c, TryCatch #0 {all -> 0x021c, blocks: (B:84:0x01c5, B:86:0x01f9, B:88:0x0218, B:87:0x01fe), top: B:94:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x021f  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzil zzilVar;
        int i11;
        j jVarE;
        long j11;
        ob.c cVar;
        zzis zzisVar;
        int iIntValue;
        int i12;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    zzilVar = zzil.ALTERNATIVE_BILLING_ACTION;
                } else {
                    zzilVar = zzil.BROADCAST_ACTION_UNSPECIFIED;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                zzilVar = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
            } else {
                zzilVar = zzil.BROADCAST_ACTION_UNSPECIFIED;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            zzilVar = zzil.PURCHASES_UPDATED_ACTION;
        } else {
            zzilVar = zzil.BROADCAST_ACTION_UNSPECIFIED;
        }
        zzil zzilVar2 = zzilVar;
        zzil zzilVar3 = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        if (zzilVar2.equals(zzilVar3) || zzilVar2.equals(zzil.ALTERNATIVE_BILLING_ACTION)) {
            i11 = 2;
        } else {
            if (zzilVar2.equals(zzil.PURCHASES_UPDATED_ACTION)) {
                i12 = 32;
            } else {
                i12 = 1;
            }
            i11 = i12;
        }
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        h hVar = this.f7553c;
        if (extras == null) {
            int i13 = zzc.f12272a;
            ob.c cVar2 = (ob.c) hVar.f7511d;
            zzie zzieVar = zzie.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            j jVar = j0.f7529h;
            cVar2.w(h0.b(zzieVar, i11, jVar, null, zzilVar2));
            r rVar = (r) hVar.f7510c;
            if (rVar != null) {
                rVar.d(jVar, null);
                return;
            }
            return;
        }
        if (i11 == 2) {
            int i14 = zzc.f12272a;
            i iVarA = j.a();
            iVarA.f7515a = zzc.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                iIntValue = 0;
            } else {
                Object obj = extras2.get(DytezVyM.CmbyMUvDDXgtzO);
                if (obj == null) {
                    zzc.h("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName());
                }
                iIntValue = 0;
            }
            iVarA.f7516b = iIntValue;
            iVarA.f7517c = zzc.f("BillingBroadcastManager", intent.getExtras());
            jVarE = iVarA.a();
        } else {
            jVarE = zzc.e(intent, "BillingBroadcastManager");
        }
        long j12 = extras.getLong("billingClientTransactionId", 0L);
        boolean z11 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (zzilVar2.equals(zzil.PURCHASES_UPDATED_ACTION) || zzilVar2.equals(zzilVar3)) {
            j jVar2 = jVarE;
            ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            ArrayList arrayList2 = new ArrayList();
            String str = scNRoQgKSYX.sfTJnrRLLtHRmT;
            if (stringArrayList == null || stringArrayList2 == null) {
                j11 = 0;
                Purchase purchaseI = zzc.i(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                if (purchaseI == null) {
                    zzc.h(str, "Couldn't find single purchase data as well.");
                } else {
                    arrayList2.add(purchaseI);
                }
                if (jVar2.f7519a == 0) {
                    cVar = (ob.c) hVar.f7511d;
                    zzib zzibVarC = h0.c(i11, zzilVar2);
                    try {
                        zzhz zzhzVar = (zzhz) zzibVarC.h();
                        zzja zzjaVar = (zzja) zzibVarC.p().h();
                        zzjaVar.h();
                        zzjf.p((zzjf) zzjaVar.f12378b, z11);
                        zzhzVar.h();
                        zzib.r((zzib) zzhzVar.f12378b, (zzjf) zzjaVar.f());
                        zzib zzibVar = (zzib) zzhzVar.f();
                        if (j12 == j11) {
                            zzisVar = (zzis) cVar.f44799b;
                        } else {
                            zziq zziqVar = (zziq) ((zzis) cVar.f44799b).h();
                            zziqVar.h();
                            zzis.t((zzis) zziqVar.f12378b, j12);
                            zzisVar = (zzis) zziqVar.f();
                        }
                        cVar.D(zzibVar, zzisVar);
                    } catch (Throwable unused) {
                        int i15 = zzc.f12272a;
                    }
                } else {
                    d(extras, jVar2, i11, zzilVar2, j12, z11);
                }
                ((r) hVar.f7510c).d(jVar2, arrayList);
                return;
            }
            j11 = 0;
            zzc.h(str, "Found purchase list of " + stringArrayList.size() + " items");
            for (int i16 = 0; i16 < stringArrayList.size() && i16 < stringArrayList2.size(); i16++) {
                Purchase purchaseI2 = zzc.i(stringArrayList.get(i16), stringArrayList2.get(i16));
                if (purchaseI2 != null) {
                    arrayList2.add(purchaseI2);
                }
            }
            arrayList = arrayList2;
            if (jVar2.f7519a == 0) {
                cVar = (ob.c) hVar.f7511d;
                zzib zzibVarC2 = h0.c(i11, zzilVar2);
                zzhz zzhzVar2 = (zzhz) zzibVarC2.h();
                zzja zzjaVar2 = (zzja) zzibVarC2.p().h();
                zzjaVar2.h();
                zzjf.p((zzjf) zzjaVar2.f12378b, z11);
                zzhzVar2.h();
                zzib.r((zzib) zzhzVar2.f12378b, (zzjf) zzjaVar2.f());
                zzib zzibVar2 = (zzib) zzhzVar2.f();
                if (j12 == j11) {
                    zzisVar = (zzis) cVar.f44799b;
                } else {
                    zziq zziqVar2 = (zziq) ((zzis) cVar.f44799b).h();
                    zziqVar2.h();
                    zzis.t((zzis) zziqVar2.f12378b, j12);
                    zzisVar = (zzis) zziqVar2.f();
                }
                cVar.D(zzibVar2, zzisVar);
            } else {
                d(extras, jVar2, i11, zzilVar2, j12, z11);
            }
            ((r) hVar.f7510c).d(jVar2, arrayList);
            return;
        }
        if (zzilVar2.equals(zzil.ALTERNATIVE_BILLING_ACTION)) {
            if (jVarE.f7519a != 0) {
                j jVar3 = jVarE;
                d(extras, jVar3, i11, zzilVar2, j12, z11);
                ((r) hVar.f7510c).d(jVar3, zzbt.n());
            } else {
                hVar.getClass();
                ob.c cVar3 = (ob.c) hVar.f7511d;
                zzie zzieVar2 = zzie.MISSING_USER_CHOICE_BILLING_LISTENER;
                j jVar4 = j0.f7529h;
                cVar3.y(h0.b(zzieVar2, i11, jVar4, null, zzilVar2), j12, z11);
                ((r) hVar.f7510c).d(jVar4, zzbt.n());
            }
        }
    }
}
