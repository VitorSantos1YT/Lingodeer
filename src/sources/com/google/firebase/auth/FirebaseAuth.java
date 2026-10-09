package com.google.firebase.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import bw.ORXQ.ADSb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzaby;
import com.google.android.gms.internal.p002firebaseauthapi.zzadw;
import com.google.android.gms.internal.p002firebaseauthapi.zzadz;
import com.google.android.gms.internal.p002firebaseauthapi.zzahd;
import com.google.android.gms.internal.p002firebaseauthapi.zzaij;
import com.google.android.gms.internal.p002firebaseauthapi.zzzx;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzbg;
import com.google.firebase.auth.internal.zzbm;
import com.google.firebase.auth.internal.zzbv;
import com.google.firebase.auth.internal.zzce;
import com.google.firebase.auth.internal.zzcg;
import com.google.firebase.auth.internal.zzcj;
import com.google.firebase.database.android.e;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAuth implements InternalAuthProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f17878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f17879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f17880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f17881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzaby f17882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FirebaseUser f17883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f17884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f17885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zzbv f17887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RecaptchaAction f17888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RecaptchaAction f17889l;
    public final RecaptchaAction m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zzce f17890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final zzcj f17891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Provider f17892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public zzcg f17893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Executor f17894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Executor f17895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Executor f17896t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface AuthStateListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface IdTokenListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class zza implements com.google.firebase.auth.internal.zzaw, com.google.firebase.auth.internal.zzj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FirebaseAuth f17897a;

        public zza(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.f17897a = firebaseAuth;
        }

        @Override // com.google.firebase.auth.internal.zzaw
        public final void a(Status status) {
            int i11 = status.f8706a;
            if (i11 == 17011 || i11 == 17021 || i11 == 17005 || i11 == 17091) {
                this.f17897a.h();
            }
        }

        @Override // com.google.firebase.auth.internal.zzj
        public final void b(zzahd zzahdVar, FirebaseUser firebaseUser) {
            Preconditions.g(zzahdVar);
            Preconditions.g(firebaseUser);
            firebaseUser.J1(zzahdVar);
            FirebaseAuth firebaseAuth = this.f17897a;
            firebaseAuth.getClass();
            FirebaseAuth.i(firebaseAuth, firebaseUser, zzahdVar, true, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class zzb implements com.google.firebase.auth.internal.zzj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FirebaseAuth f17898a;

        public zzb(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.f17898a = firebaseAuth;
        }

        @Override // com.google.firebase.auth.internal.zzj
        public final void b(zzahd zzahdVar, FirebaseUser firebaseUser) {
            Preconditions.g(zzahdVar);
            Preconditions.g(firebaseUser);
            firebaseUser.J1(zzahdVar);
            FirebaseAuth firebaseAuth = this.f17898a;
            firebaseAuth.getClass();
            FirebaseAuth.i(firebaseAuth, firebaseUser, zzahdVar, true, false);
        }
    }

    public FirebaseAuth(FirebaseApp firebaseApp, Provider provider, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        zzaby zzabyVar = new zzaby();
        zzabyVar.f9897a = new zzadw(firebaseApp, scheduledExecutorService);
        zzabyVar.f9898b = executor;
        firebaseApp.b();
        Context context = firebaseApp.f17714a;
        String strG = firebaseApp.g();
        zzce zzceVar = new zzce();
        Preconditions.g(context);
        Preconditions.d(strG);
        zzceVar.f18003b = strG;
        Context applicationContext = context.getApplicationContext();
        zzceVar.f18002a = applicationContext;
        zzceVar.f18004c = applicationContext.getSharedPreferences("com.google.firebase.auth.api.Store." + strG, 0);
        zzceVar.f18005d = new Logger("StorageHelpers", new String[0]);
        zzcj zzcjVar = zzcj.f18010b;
        com.google.firebase.auth.internal.zza zzaVar = com.google.firebase.auth.internal.zza.f17932a;
        this.f17879b = new CopyOnWriteArrayList();
        this.f17880c = new CopyOnWriteArrayList();
        this.f17881d = new CopyOnWriteArrayList();
        this.f17884g = new Object();
        this.f17885h = new Object();
        this.f17888k = RecaptchaAction.custom("getOobCode");
        this.f17889l = RecaptchaAction.custom("signInWithPassword");
        this.m = RecaptchaAction.custom("signUpPassword");
        RecaptchaAction.custom("sendVerificationCode");
        RecaptchaAction.custom("mfaSmsEnrollment");
        RecaptchaAction.custom("mfaSmsSignIn");
        this.f17878a = firebaseApp;
        this.f17882e = zzabyVar;
        this.f17890n = zzceVar;
        new com.google.firebase.auth.internal.zzae();
        Preconditions.g(zzcjVar);
        this.f17891o = zzcjVar;
        Preconditions.g(zzaVar);
        this.f17892p = provider;
        this.f17894r = executor;
        this.f17895s = executor2;
        this.f17896t = executor3;
        n();
    }

    public static FirebaseAuth getInstance() {
        zzad zzadVar = (zzad) FirebaseApp.e().c(zzad.class);
        Preconditions.g(zzadVar);
        return zzadVar.c();
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public void a(e eVar) {
        zzcg zzcgVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17881d;
        copyOnWriteArrayList.add(eVar);
        synchronized (this) {
            if (this.f17893q == null) {
                FirebaseApp firebaseApp = this.f17878a;
                Preconditions.g(firebaseApp);
                this.f17893q = new zzcg(firebaseApp);
            }
            zzcgVar = this.f17893q;
        }
        zzcgVar.a(copyOnWriteArrayList.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.auth.internal.zzch, com.google.firebase.auth.zzz] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public Task b(boolean z11) {
        FirebaseUser firebaseUser = this.f17883f;
        if (firebaseUser == null) {
            return Tasks.forException(zzadz.a(new Status(17495, null, null, null)));
        }
        zzahd zzahdVarM1 = firebaseUser.M1();
        if (zzahdVarM1.zzg() && !z11) {
            return Tasks.forResult(zzbg.a(zzahdVarM1.f9959b));
        }
        return this.f17882e.e(this.f17878a, firebaseUser, zzahdVarM1.f9958a, new zzz(this));
    }

    public FirebaseUser c() {
        return this.f17883f;
    }

    public String d() {
        FirebaseUser firebaseUser = this.f17883f;
        if (firebaseUser == null) {
            return null;
        }
        return firebaseUser.G1();
    }

    public void e(String str) {
        Preconditions.d(str);
        synchronized (this.f17885h) {
            this.f17886i = str;
        }
    }

    public Task f(com.google.firebase.auth.zzc zzcVar) {
        ActionCodeUrl actionCodeUrl;
        AuthCredential authCredentialE1 = zzcVar.E1();
        if (!(authCredentialE1 instanceof EmailAuthCredential)) {
            boolean z11 = authCredentialE1 instanceof PhoneAuthCredential;
            FirebaseApp firebaseApp = this.f17878a;
            zzaby zzabyVar = this.f17882e;
            return z11 ? zzabyVar.f(firebaseApp, (PhoneAuthCredential) authCredentialE1, new zzb(this)) : zzabyVar.b(firebaseApp, authCredentialE1, this.f17886i, new zzb(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialE1;
        String str = emailAuthCredential.f17874c;
        if (TextUtils.isEmpty(str)) {
            String str2 = emailAuthCredential.f17872a;
            String str3 = emailAuthCredential.f17873b;
            Preconditions.g(str3);
            String str4 = this.f17886i;
            return new zzab(this, str2, false, null, str3, str4).a(this, str4, this.f17889l);
        }
        Preconditions.d(str);
        int i11 = ActionCodeUrl.f17869c;
        Preconditions.d(str);
        try {
            actionCodeUrl = new ActionCodeUrl(str);
        } catch (IllegalArgumentException unused) {
            actionCodeUrl = null;
        }
        if (actionCodeUrl == null || TextUtils.equals(this.f17886i, actionCodeUrl.f17871b)) {
            return new zzaa(this, false, null, emailAuthCredential).a(this, this.f17886i, this.f17888k);
        }
        return Tasks.forException(zzadz.a(new Status(17072, null, null, null)));
    }

    public Task g(String str) {
        Preconditions.d(str);
        return this.f17882e.g(this.f17878a, str, this.f17886i, new zzb(this));
    }

    public void h() {
        m();
        zzcg zzcgVar = this.f17893q;
        if (zzcgVar != null) {
            com.google.firebase.auth.internal.zzas zzasVar = zzcgVar.f18008b;
            zzasVar.f17961d.removeCallbacks(zzasVar.f17962e);
        }
    }

    public final synchronized zzbv j() {
        return this.f17887j;
    }

    public void k() {
        this.f17896t.execute(new zzw(this));
    }

    public void l() {
        this.f17896t.execute(new zzx(this, new InternalTokenResult(null)));
    }

    public void m() {
        zzce zzceVar = this.f17890n;
        Preconditions.g(zzceVar);
        SharedPreferences sharedPreferences = zzceVar.f18004c;
        FirebaseUser firebaseUser = this.f17883f;
        if (firebaseUser != null) {
            sharedPreferences.edit().remove(a.e("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser.G1())).apply();
            this.f17883f = null;
        }
        sharedPreferences.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        l();
        k();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzch] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzch] */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.firebase.auth.FirebaseAuth$zza, com.google.firebase.auth.internal.zzch] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void n() {
        com.google.firebase.auth.internal.zzad zzadVarA;
        ActionCodeUrl actionCodeUrl;
        zzahd zzahdVarD1;
        zzce zzceVar = this.f17890n;
        String strC = zzceVar.c("com.google.firebase.auth.FIREBASE_USER");
        Logger logger = zzceVar.f18005d;
        if (TextUtils.isEmpty(strC)) {
            zzadVarA = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(strC);
                if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                    zzadVarA = zzceVar.a(jSONObject);
                } else {
                    zzadVarA = null;
                }
            } catch (Exception unused) {
                logger.b("Failed to restore user data from persistent storage.", new Object[0]);
            }
        }
        this.f17883f = zzadVarA;
        if (zzadVarA != null) {
            String strC2 = zzceVar.c("com.google.firebase.auth.GET_TOKEN_RESPONSE." + zzadVarA.f17934b.f18035a);
            if (strC2 != null) {
                try {
                    zzahdVarD1 = zzahd.D1(strC2);
                } catch (zzzx unused2) {
                    logger.b("Failed to restore token data from persistent storage.", new Object[0]);
                    zzahdVarD1 = null;
                }
            } else {
                zzahdVarD1 = null;
            }
            if (zzahdVarD1 != null) {
                i(this, this.f17883f, zzahdVarD1, false, false);
            }
        }
        this.f17891o.f18011a.getClass();
        FirebaseApp firebaseApp = this.f17878a;
        firebaseApp.b();
        SharedPreferences sharedPreferences = firebaseApp.f17714a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        String string = sharedPreferences.getString("firebaseAppName", BuildConfig.VERSION_NAME);
        firebaseApp.b();
        if (firebaseApp.f17715b.equals(string)) {
            if (!sharedPreferences.contains("verifyAssertionRequest")) {
                if (!sharedPreferences.contains("recaptchaToken")) {
                    if (sharedPreferences.contains("statusCode")) {
                        Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", BuildConfig.VERSION_NAME), null, null);
                        sharedPreferences.getLong("timestamp", 0L);
                        zzbm.b(sharedPreferences);
                        Tasks.forException(zzadz.a(status));
                        return;
                    }
                    return;
                }
                String string2 = sharedPreferences.getString("recaptchaToken", BuildConfig.VERSION_NAME);
                String string3 = sharedPreferences.getString("operation", BuildConfig.VERSION_NAME);
                sharedPreferences.getLong("timestamp", 0L);
                string3.getClass();
                if (string3.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                    Tasks.forResult(string2);
                }
                zzbm.b(sharedPreferences);
                return;
            }
            String string4 = sharedPreferences.getString("verifyAssertionRequest", BuildConfig.VERSION_NAME);
            Parcelable.Creator<zzaij> creator = zzaij.CREATOR;
            byte[] bArrDecode = string4 == null ? null : Base64.decode(string4, 10);
            Preconditions.g(creator);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
            parcelObtain.setDataPosition(0);
            zzaij zzaijVarCreateFromParcel = creator.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            zzaij zzaijVar = zzaijVarCreateFromParcel;
            String string5 = sharedPreferences.getString("operation", BuildConfig.VERSION_NAME);
            String string6 = sharedPreferences.getString("tenantId", null);
            String string7 = sharedPreferences.getString("firebaseUserUid", BuildConfig.VERSION_NAME);
            sharedPreferences.getLong("timestamp", 0L);
            if (string6 != null) {
                e(string6);
                zzaijVar.P = string6;
            }
            string5.getClass();
            switch (string5) {
                case "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE":
                    if (c().G1().equals(string7)) {
                        FirebaseUser firebaseUserC = c();
                        com.google.firebase.auth.zzc zzcVarF1 = com.google.firebase.auth.zzc.F1(zzaijVar);
                        Preconditions.g(firebaseUserC);
                        AuthCredential authCredentialE1 = zzcVarF1.E1();
                        if (authCredentialE1 instanceof EmailAuthCredential) {
                            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialE1;
                            if (!"password".equals(!TextUtils.isEmpty(emailAuthCredential.f17873b) ? "password" : "emailLink")) {
                                String str = emailAuthCredential.f17874c;
                                Preconditions.d(str);
                                int i11 = ActionCodeUrl.f17869c;
                                Preconditions.d(str);
                                try {
                                    actionCodeUrl = new ActionCodeUrl(str);
                                } catch (IllegalArgumentException unused3) {
                                    actionCodeUrl = null;
                                }
                                if (actionCodeUrl == null || TextUtils.equals(this.f17886i, actionCodeUrl.f17871b)) {
                                    new zzaa(this, true, firebaseUserC, emailAuthCredential).a(this, this.f17886i, this.f17888k);
                                } else {
                                    Tasks.forException(zzadz.a(new Status(17072, null, null, null)));
                                }
                            } else {
                                String str2 = emailAuthCredential.f17872a;
                                String str3 = emailAuthCredential.f17873b;
                                Preconditions.d(str3);
                                String strF1 = firebaseUserC.F1();
                                new zzab(this, str2, true, firebaseUserC, str3, strF1).a(this, strF1, this.f17889l);
                            }
                        } else if (!(authCredentialE1 instanceof PhoneAuthCredential)) {
                            this.f17882e.n(this.f17878a, firebaseUserC, authCredentialE1, firebaseUserC.F1(), new zza(this));
                        } else {
                            this.f17882e.k(firebaseApp, firebaseUserC, (PhoneAuthCredential) authCredentialE1, new zza(this));
                        }
                        break;
                    }
                    break;
                case "com.google.firebase.auth.internal.NONGMSCORE_LINK":
                    if (c().G1().equals(string7)) {
                        FirebaseUser firebaseUserC2 = c();
                        com.google.firebase.auth.zzc zzcVarF2 = com.google.firebase.auth.zzc.F1(zzaijVar);
                        Preconditions.g(firebaseUserC2);
                        this.f17882e.d(this.f17878a, firebaseUserC2, zzcVarF2.E1(), null, new zza(this));
                        break;
                    }
                    break;
                case "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN":
                    f(com.google.firebase.auth.zzc.F1(zzaijVar));
                    break;
            }
            zzbm.b(sharedPreferences);
        }
    }

    public boolean o() {
        return c() != null;
    }

    public static void i(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzahd zzahdVar, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        FirebaseUser firebaseUser2;
        boolean z15;
        boolean z16;
        boolean z17;
        String string;
        Preconditions.g(firebaseUser);
        Preconditions.g(zzahdVar);
        boolean z18 = firebaseAuth.f17883f != null && firebaseUser.G1().equals(firebaseAuth.f17883f.G1());
        if (z18 || !z12) {
            FirebaseUser firebaseUser3 = firebaseAuth.f17883f;
            if (firebaseUser3 == null) {
                z14 = true;
                z13 = true;
            } else {
                z13 = (z18 && firebaseUser3.M1().f9959b.equals(zzahdVar.f9959b)) ? false : true;
                z14 = !z18;
            }
            if (firebaseAuth.f17883f == null || !firebaseUser.G1().equals(firebaseAuth.d())) {
                firebaseUser2 = firebaseUser;
                firebaseAuth.f17883f = firebaseUser2;
            } else {
                firebaseAuth.f17883f.I1(firebaseUser.E1());
                if (!firebaseUser.H1()) {
                    firebaseAuth.f17883f.K1();
                }
                ArrayList arrayListA = firebaseUser.D1().a();
                List listO1 = firebaseUser.O1();
                firebaseAuth.f17883f.N1(arrayListA);
                firebaseAuth.f17883f.L1(listO1);
                firebaseUser2 = firebaseUser;
            }
            if (z11) {
                zzce zzceVar = firebaseAuth.f17890n;
                FirebaseUser firebaseUser4 = firebaseAuth.f17883f;
                zzceVar.getClass();
                Preconditions.g(firebaseUser4);
                Logger logger = zzceVar.f18005d;
                JSONObject jSONObject = new JSONObject();
                if (firebaseUser4 instanceof com.google.firebase.auth.internal.zzad) {
                    com.google.firebase.auth.internal.zzad zzadVar = (com.google.firebase.auth.internal.zzad) firebaseUser4;
                    try {
                        jSONObject.put("cachedTokenState", zzadVar.f17933a.E1());
                        String str = ADSb.QeuTOCmCZ;
                        FirebaseApp firebaseAppF = FirebaseApp.f(zzadVar.f17935c);
                        firebaseAppF.b();
                        jSONObject.put(str, firebaseAppF.f17715b);
                        jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                        if (zzadVar.f17937e != null) {
                            JSONArray jSONArray = new JSONArray();
                            ArrayList arrayList = zzadVar.f17937e;
                            int size = arrayList.size();
                            z17 = true;
                            if (arrayList.size() > 30) {
                                logger.b("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(arrayList.size()));
                                size = 30;
                            }
                            int i11 = 0;
                            boolean z19 = false;
                            while (true) {
                                if (i11 >= size) {
                                    z15 = z14;
                                    break;
                                }
                                com.google.firebase.auth.internal.zzz zzzVar = (com.google.firebase.auth.internal.zzz) arrayList.get(i11);
                                z15 = z14;
                                if (zzzVar.f18036b.equals("firebase")) {
                                    z19 = true;
                                }
                                if (i11 == size - 1 && !z19) {
                                    break;
                                }
                                jSONArray.put(zzzVar.E1());
                                i11++;
                                z14 = z15;
                            }
                            if (!z19) {
                                for (int i12 = size - 1; i12 < arrayList.size() && i12 >= 0; i12++) {
                                    com.google.firebase.auth.internal.zzz zzzVar2 = (com.google.firebase.auth.internal.zzz) arrayList.get(i12);
                                    if (zzzVar2.f18036b.equals("firebase")) {
                                        jSONArray.put(zzzVar2.E1());
                                        z19 = true;
                                        break;
                                    } else {
                                        if (i12 == arrayList.size() - 1) {
                                            jSONArray.put(zzzVar2.E1());
                                        }
                                    }
                                }
                                if (!z19) {
                                    logger.b("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(arrayList.size()), Integer.valueOf(size));
                                    if (arrayList.size() < 5) {
                                        StringBuilder sb2 = new StringBuilder("Provider user info list:\n");
                                        int size2 = arrayList.size();
                                        int i13 = 0;
                                        while (i13 < size2) {
                                            Object obj = arrayList.get(i13);
                                            i13++;
                                            sb2.append("Provider - " + ((com.google.firebase.auth.internal.zzz) obj).f18036b + "\n");
                                        }
                                        logger.b(sb2.toString(), new Object[0]);
                                    }
                                }
                            }
                            jSONObject.put("userInfos", jSONArray);
                        } else {
                            z15 = z14;
                            z17 = true;
                        }
                        jSONObject.put("anonymous", zzadVar.H1());
                        jSONObject.put("version", "2");
                        com.google.firebase.auth.internal.zzaf zzafVar = zzadVar.K;
                        if (zzafVar != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("lastSignInTimestamp", zzafVar.f17940a);
                                jSONObject2.put("creationTimestamp", zzafVar.f17941b);
                            } catch (JSONException unused) {
                            }
                            jSONObject.put("userMetadata", jSONObject2);
                        }
                        ArrayList arrayListA2 = new com.google.firebase.auth.internal.zzah(zzadVar).a();
                        if (!arrayListA2.isEmpty()) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i14 = 0; i14 < arrayListA2.size(); i14++) {
                                jSONArray2.put(((MultiFactorInfo) arrayListA2.get(i14)).E1());
                            }
                            jSONObject.put("userMultiFactorInfo", jSONArray2);
                        }
                        List list = zzadVar.O;
                        if (list != null && !list.isEmpty()) {
                            JSONArray jSONArray3 = new JSONArray();
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                zzao zzaoVar = (zzao) list.get(i15);
                                Parcelable.Creator<zzao> creator = zzao.CREATOR;
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("credentialId", zzaoVar.f18066a);
                                jSONObject3.put("name", zzaoVar.f18067b);
                                jSONObject3.put("displayName", zzaoVar.f18068c);
                                jSONArray3.put(jSONObject3);
                            }
                            jSONObject.put("passkeyInfo", jSONArray3);
                        }
                        string = jSONObject.toString();
                    } catch (Exception e8) {
                        Log.wtf(logger.f9046a, logger.b("Failed to turn object into JSON", new Object[0]), e8);
                        throw new zzzx(e8);
                    }
                } else {
                    z15 = z14;
                    z17 = true;
                    string = null;
                }
                z16 = false;
                if (!TextUtils.isEmpty(string)) {
                    zzceVar.b("com.google.firebase.auth.FIREBASE_USER", string);
                }
            } else {
                z15 = z14;
                z16 = false;
                z17 = true;
            }
            if (z13) {
                FirebaseUser firebaseUser5 = firebaseAuth.f17883f;
                if (firebaseUser5 != null) {
                    firebaseUser5.J1(zzahdVar);
                }
                FirebaseUser firebaseUser6 = firebaseAuth.f17883f;
                if (firebaseUser6 != null) {
                    firebaseUser6.G1();
                }
                firebaseAuth.f17896t.execute(new zzx(firebaseAuth, new InternalTokenResult(firebaseUser6 != null ? firebaseUser6.zzd() : null)));
            }
            if (z15) {
                FirebaseUser firebaseUser7 = firebaseAuth.f17883f;
                if (firebaseUser7 != null) {
                    firebaseUser7.G1();
                }
                firebaseAuth.f17896t.execute(new zzw(firebaseAuth));
            }
            if (z11) {
                zzce zzceVar2 = firebaseAuth.f17890n;
                zzceVar2.getClass();
                zzceVar2.b(a.e("com.google.firebase.auth.GET_TOKEN_RESPONSE.", firebaseUser2.G1()), zzahdVar.E1());
            }
            FirebaseUser firebaseUser8 = firebaseAuth.f17883f;
            if (firebaseUser8 != null) {
                if (firebaseAuth.f17893q == null) {
                    FirebaseApp firebaseApp = firebaseAuth.f17878a;
                    Preconditions.g(firebaseApp);
                    firebaseAuth.f17893q = new zzcg(firebaseApp);
                }
                zzcg zzcgVar = firebaseAuth.f17893q;
                zzahd zzahdVarM1 = firebaseUser8.M1();
                zzcgVar.getClass();
                if (zzahdVarM1 == null) {
                    return;
                }
                Long l9 = zzahdVarM1.f9960c;
                long jLongValue = l9 == null ? 0L : l9.longValue();
                if (jLongValue <= 0) {
                    jLongValue = 3600;
                }
                long jLongValue2 = (jLongValue * 1000) + zzahdVarM1.f9962e.longValue();
                com.google.firebase.auth.internal.zzas zzasVar = zzcgVar.f18008b;
                zzasVar.f17959b = jLongValue2;
                zzasVar.f17960c = -1L;
                if (zzcgVar.f18007a > 0 && !zzcgVar.f18009c) {
                    z16 = z17;
                }
                if (z16) {
                    zzcgVar.f18008b.a();
                }
            }
        }
    }

    public static FirebaseAuth getInstance(FirebaseApp firebaseApp) {
        zzad zzadVarD = zzad.d(firebaseApp);
        Preconditions.g(zzadVarD);
        return zzadVarD.c();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class zzc extends zzb implements com.google.firebase.auth.internal.zzaw, com.google.firebase.auth.internal.zzj {
        @Override // com.google.firebase.auth.internal.zzaw
        public final void a(Status status) {
        }
    }
}
