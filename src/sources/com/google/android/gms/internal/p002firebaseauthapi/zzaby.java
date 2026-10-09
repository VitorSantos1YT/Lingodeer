package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzbi;
import com.google.firebase.auth.internal.zzch;
import com.google.firebase.auth.internal.zzj;
import com.google.firebase.auth.internal.zzz;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaby extends zzafa {
    public static zzad i(FirebaseApp firebaseApp, zzagw zzagwVar) {
        Preconditions.g(firebaseApp);
        Preconditions.g(zzagwVar);
        ArrayList arrayList = new ArrayList();
        zzz zzzVar = new zzz();
        Preconditions.d("firebase");
        String str = zzagwVar.f9942a;
        Preconditions.d(str);
        zzzVar.f18035a = str;
        zzzVar.f18036b = "firebase";
        zzzVar.f18039e = zzagwVar.f9943b;
        zzzVar.f18037c = zzagwVar.f9945d;
        Uri uri = !TextUtils.isEmpty(zzagwVar.f9946e) ? Uri.parse(zzagwVar.f9946e) : null;
        if (uri != null) {
            zzzVar.f18038d = uri.toString();
        }
        zzzVar.f18041t = zzagwVar.f9944c;
        zzzVar.H = null;
        zzzVar.f18040f = zzagwVar.f9948g;
        arrayList.add(zzzVar);
        List list = zzagwVar.f9947f.f9981a;
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzahj zzahjVar = (zzahj) list.get(i11);
                zzz zzzVar2 = new zzz();
                Preconditions.g(zzahjVar);
                zzzVar2.f18035a = zzahjVar.f9969a;
                String str2 = zzahjVar.f9972d;
                Preconditions.d(str2);
                zzzVar2.f18036b = str2;
                zzzVar2.f18037c = zzahjVar.f9970b;
                String str3 = zzahjVar.f9971c;
                Uri uri2 = !TextUtils.isEmpty(str3) ? Uri.parse(str3) : null;
                if (uri2 != null) {
                    zzzVar2.f18038d = uri2.toString();
                }
                zzzVar2.f18039e = zzahjVar.f9975g;
                zzzVar2.f18040f = zzahjVar.f9974f;
                zzzVar2.f18041t = false;
                zzzVar2.H = zzahjVar.f9973e;
                arrayList.add(zzzVar2);
            }
        }
        zzad zzadVar = new zzad(firebaseApp, arrayList);
        zzadVar.K = new zzaf(zzagwVar.f9950i, zzagwVar.f9949h);
        zzadVar.L = zzagwVar.f9951j;
        zzadVar.M = zzagwVar.f9952k;
        zzadVar.N1(zzbi.b(zzagwVar.f9953l));
        zzadVar.L1(zzagwVar.m);
        return zzadVar;
    }

    public final Task b(FirebaseApp firebaseApp, AuthCredential authCredential, String str, zzj zzjVar) {
        zzadc zzadcVar = new zzadc(authCredential, str);
        zzadcVar.d(firebaseApp);
        zzadcVar.f9871e = zzjVar;
        return a(zzadcVar);
    }

    public final Task c(FirebaseApp firebaseApp, EmailAuthCredential emailAuthCredential, String str, zzj zzjVar) {
        zzadh zzadhVar = new zzadh(emailAuthCredential, str);
        zzadhVar.d(firebaseApp);
        zzadhVar.f9871e = zzjVar;
        return a(zzadhVar);
    }

    public final Task d(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzch zzchVar) {
        Preconditions.g(firebaseApp);
        Preconditions.g(authCredential);
        Preconditions.g(firebaseUser);
        Preconditions.g(zzchVar);
        List listZzg = firebaseUser.zzg();
        if (listZzg != null && listZzg.contains(authCredential.D1())) {
            return Tasks.forException(zzadz.a(new Status(17015, null, null, null)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (TextUtils.isEmpty(emailAuthCredential.f17874c)) {
                zzack zzackVar = new zzack(emailAuthCredential, str);
                zzackVar.f9869c = firebaseApp;
                zzackVar.f9870d = firebaseUser;
                zzackVar.f9871e = zzchVar;
                zzackVar.f9872f = zzchVar;
                return a(zzackVar);
            }
            zzacp zzacpVar = new zzacp(emailAuthCredential);
            zzacpVar.f9869c = firebaseApp;
            zzacpVar.f9870d = firebaseUser;
            zzacpVar.f9871e = zzchVar;
            zzacpVar.f9872f = zzchVar;
            return a(zzacpVar);
        }
        if (!(authCredential instanceof PhoneAuthCredential)) {
            zzacn zzacnVar = new zzacn(authCredential);
            zzacnVar.f9869c = firebaseApp;
            zzacnVar.f9870d = firebaseUser;
            zzacnVar.f9871e = zzchVar;
            zzacnVar.f9872f = zzchVar;
            return a(zzacnVar);
        }
        zzafj.f9901a.clear();
        zzacm zzacmVar = new zzacm((PhoneAuthCredential) authCredential);
        zzacmVar.f9869c = firebaseApp;
        zzacmVar.f9870d = firebaseUser;
        zzacmVar.f9871e = zzchVar;
        zzacmVar.f9872f = zzchVar;
        return a(zzacmVar);
    }

    public final Task e(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzch zzchVar) {
        zzacj zzacjVar = new zzacj(str);
        zzacjVar.d(firebaseApp);
        zzacjVar.e(firebaseUser);
        zzacjVar.f(zzchVar);
        zzacjVar.f9872f = zzchVar;
        return a(zzacjVar);
    }

    public final Task f(FirebaseApp firebaseApp, PhoneAuthCredential phoneAuthCredential, zzj zzjVar) {
        zzafj.f9901a.clear();
        zzadg zzadgVar = new zzadg(phoneAuthCredential);
        zzadgVar.d(firebaseApp);
        zzadgVar.f9871e = zzjVar;
        return a(zzadgVar);
    }

    public final Task g(FirebaseApp firebaseApp, String str, String str2, zzj zzjVar) {
        zzadf zzadfVar = new zzadf(str, str2);
        zzadfVar.d(firebaseApp);
        zzadfVar.f9871e = zzjVar;
        return a(zzadfVar);
    }

    public final Task h(String str) {
        return a(new zzacl(str));
    }

    public final Task j(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, String str, zzch zzchVar) {
        zzact zzactVar = new zzact(emailAuthCredential, str);
        zzactVar.d(firebaseApp);
        zzactVar.e(firebaseUser);
        zzactVar.f(zzchVar);
        zzactVar.f9872f = zzchVar;
        return a(zzactVar);
    }

    public final Task k(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, zzch zzchVar) {
        zzafj.f9901a.clear();
        zzacx zzacxVar = new zzacx(phoneAuthCredential);
        zzacxVar.d(firebaseApp);
        zzacxVar.e(firebaseUser);
        zzacxVar.f(zzchVar);
        zzacxVar.f9872f = zzchVar;
        return a(zzacxVar);
    }

    public final Task l(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, String str3, String str4, zzch zzchVar) {
        zzacv zzacvVar = new zzacv(str, str2, str3, str4);
        zzacvVar.d(firebaseApp);
        zzacvVar.e(firebaseUser);
        zzacvVar.f(zzchVar);
        zzacvVar.f9872f = zzchVar;
        return a(zzacvVar);
    }

    public final Task m(FirebaseApp firebaseApp, String str, String str2, String str3, String str4, zzj zzjVar) {
        zzade zzadeVar = new zzade(str, str2, str3, str4);
        zzadeVar.d(firebaseApp);
        zzadeVar.f9871e = zzjVar;
        return a(zzadeVar);
    }

    public final Task n(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzch zzchVar) {
        zzacr zzacrVar = new zzacr(authCredential, str);
        zzacrVar.d(firebaseApp);
        zzacrVar.e(firebaseUser);
        zzacrVar.f(zzchVar);
        zzacrVar.f9872f = zzchVar;
        return a(zzacrVar);
    }
}
