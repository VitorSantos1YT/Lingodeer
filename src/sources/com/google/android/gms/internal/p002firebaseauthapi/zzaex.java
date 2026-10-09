package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthMultiFactorException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaj;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.internal.zzbi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaex<ResultT, CallbackT> implements zzaeo<ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaeq f9889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f9890b;

    public zzaex(zzaeq zzaeqVar, TaskCompletionSource taskCompletionSource) {
        this.f9889a = zzaeqVar;
        this.f9890b = taskCompletionSource;
    }

    public final void a(Object obj, Status status) {
        FirebaseException firebaseAuthUserCollisionException;
        TaskCompletionSource taskCompletionSource = this.f9890b;
        Preconditions.h(taskCompletionSource, "completion source cannot be null");
        if (status == null) {
            taskCompletionSource.setResult(obj);
            return;
        }
        zzaeq zzaeqVar = this.f9889a;
        if (zzaeqVar.f9879n == null) {
            if (zzaeqVar.m == null) {
                taskCompletionSource.setException(zzadz.a(status));
                return;
            }
            SparseArray sparseArray = zzadz.f9847a;
            int i11 = status.f8706a;
            if (i11 == 17012 || i11 == 17007 || i11 == 17025) {
                Pair pair = (Pair) zzadz.f9847a.get(i11);
                firebaseAuthUserCollisionException = new FirebaseAuthUserCollisionException(zzadz.b(i11), zzadz.c(pair != null ? (String) pair.second : "An internal error has occurred.", status));
            } else {
                firebaseAuthUserCollisionException = zzadz.a(status);
            }
            taskCompletionSource.setException(firebaseAuthUserCollisionException);
            return;
        }
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzaeqVar.f9869c);
        zzaaa zzaaaVar = zzaeqVar.f9879n;
        FirebaseUser firebaseUser = ("reauthenticateWithCredential".equals(zzaeqVar.zza()) || "reauthenticateWithCredentialWithData".equals(zzaeqVar.zza())) ? zzaeqVar.f9870d : null;
        SparseArray sparseArray2 = zzadz.f9847a;
        firebaseAuth.getClass();
        zzaaaVar.getClass();
        Pair pair2 = (Pair) zzadz.f9847a.get(17078);
        String str = (String) pair2.first;
        String str2 = (String) pair2.second;
        Parcelable.Creator<zzaj> creator = zzaj.CREATOR;
        List list = zzaaaVar.f9713b;
        ArrayList arrayListB = zzbi.b(list);
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj2 = arrayListB.get(i13);
            i13++;
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) obj2;
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        ArrayList arrayListB2 = zzbi.b(list);
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayListB2.size();
        while (i12 < size2) {
            Object obj3 = arrayListB2.get(i12);
            i12++;
            MultiFactorInfo multiFactorInfo2 = (MultiFactorInfo) obj3;
            if (multiFactorInfo2 instanceof TotpMultiFactorInfo) {
                arrayList2.add((TotpMultiFactorInfo) multiFactorInfo2);
            }
        }
        zzao zzaoVarD1 = zzao.D1(zzbi.b(list), zzaaaVar.f9712a);
        FirebaseApp firebaseApp = firebaseAuth.f17878a;
        firebaseApp.b();
        new zzaj(arrayList, zzaoVarD1, firebaseApp.f17715b, zzaaaVar.f9714c, (zzad) firebaseUser, arrayList2);
        taskCompletionSource.setException(new FirebaseAuthMultiFactorException(str, str2));
    }
}
