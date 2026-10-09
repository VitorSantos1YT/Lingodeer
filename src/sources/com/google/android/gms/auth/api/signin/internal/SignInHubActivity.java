package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.lingodeer.data.model.AchievementLevelType;
import java.lang.reflect.Modifier;
import java.util.Set;
import v6.b;
import v6.c;
import v6.d;
import v6.f;
import v6.g;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f8520f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8521a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SignInConfiguration f8522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Intent f8525e;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
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
    public final void j() {
        b supportLoaderManager = getSupportLoaderManager();
        zbv zbvVar = new zbv(this);
        g gVar = (g) supportLoaderManager;
        ?? r9 = gVar.f53580a;
        f fVar = gVar.f53581b;
        boolean z11 = fVar.f53579b;
        u0 u0Var = fVar.f53578a;
        if (z11) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        c cVar = (c) u0Var.d(0);
        if (cVar == 0) {
            try {
                fVar.f53579b = true;
                Set set = GoogleApiClient.f8694a;
                synchronized (set) {
                }
                zbc zbcVar = new zbc(this, set);
                if (zbc.class.isMemberClass() && !Modifier.isStatic(zbc.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + zbcVar);
                }
                c cVar2 = new c(zbcVar);
                u0Var.g(0, cVar2);
                fVar.f53579b = false;
                d dVar = new d(cVar2.f53572a, zbvVar);
                cVar2.observe(r9, dVar);
                d dVar2 = cVar2.f53574c;
                if (dVar2 != null) {
                    cVar2.removeObserver(dVar2);
                }
                cVar2.f53573b = r9;
                cVar2.f53574c = dVar;
            } catch (Throwable th2) {
                fVar.f53579b = false;
                throw th2;
            }
        } else {
            d dVar3 = new d(cVar.f53572a, zbvVar);
            cVar.observe(r9, dVar3);
            d dVar4 = cVar.f53574c;
            if (dVar4 != null) {
                cVar.removeObserver(dVar4);
            }
            cVar.f53573b = r9;
            cVar.f53574c = dVar3;
        }
        f8520f = false;
    }

    public final void k(int i11) {
        Status status = new Status(i11, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f8520f = false;
    }

    @Override // androidx.fragment.app.p0, f.n, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f8521a) {
            return;
        }
        setResult(0);
        if (i11 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f8512b) != null) {
                zbn zbnVarA = zbn.a(this);
                GoogleSignInOptions googleSignInOptions = this.f8522b.f8519b;
                synchronized (zbnVarA) {
                    zbnVarA.f8549a.c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f8523c = true;
                this.f8524d = i12;
                this.f8525e = intent;
                j();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                k(intExtra);
                return;
            }
        }
        k(8);
    }

    @Override // androidx.fragment.app.p0, f.n, n4.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            k(AchievementLevelType.XP_LV_8);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            k(AchievementLevelType.XP_LV_8);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            "Unknown action: ".concat(String.valueOf(intent.getAction()));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.f8522b = signInConfiguration;
        if (bundle != null) {
            boolean z11 = bundle.getBoolean("signingInGoogleApiClients");
            this.f8523c = z11;
            if (z11) {
                this.f8524d = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 == null) {
                    setResult(0);
                    finish();
                    return;
                } else {
                    this.f8525e = intent2;
                    j();
                    return;
                }
            }
            return;
        }
        if (f8520f) {
            setResult(0);
            k(12502);
            return;
        }
        f8520f = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f8522b);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f8521a = true;
            k(17);
        }
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f8520f = false;
    }

    @Override // f.n, n4.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f8523c);
        if (this.f8523c) {
            bundle.putInt("signInResultCode", this.f8524d);
            bundle.putParcelable("signInResultData", this.f8525e);
        }
    }
}
