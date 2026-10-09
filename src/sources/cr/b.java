package cr;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import androidx.lifecycle.LifecycleOwnerKt;
import b0.a1;
import bq.r;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.me.MeAccountSettingsActivity;
import com.lingo.splash.SplashIndexActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import fr.o0;
import java.io.File;
import qy.b0;
import qy.o;
import rz.e0;
import sz.xej.iFLeRCXvYCGdPW;
import tf.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeAccountSettingsActivity f22429b;

    public /* synthetic */ b(MeAccountSettingsActivity meAccountSettingsActivity, int i11) {
        this.f22428a = i11;
        this.f22429b = meAccountSettingsActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        Task taskC;
        Object objL;
        Object objL2;
        int i11 = this.f22428a;
        FirebaseAuth firebaseAuth = null;
        b0 b0Var = b0.f48488a;
        MeAccountSettingsActivity meAccountSettingsActivity = this.f22429b;
        switch (i11) {
            case 0:
                int i12 = MeAccountSettingsActivity.R;
                return File.createTempFile("IMG_", ".jpg", meAccountSettingsActivity.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
            case 1:
                int i13 = MeAccountSettingsActivity.R;
                if (!((o0) meAccountSettingsActivity.l()).b().equals("fb")) {
                    if (((o0) meAccountSettingsActivity.l()).b().equals("gg")) {
                        try {
                            bq.g gVar = meAccountSettingsActivity.f22214t;
                            if (gVar != null) {
                                try {
                                    GoogleSignInClient googleSignInClient = gVar.f4949c;
                                    if (googleSignInClient != null && (taskC = googleSignInClient.c()) != null) {
                                        taskC.addOnCompleteListener(new app.rive.runtime.kotlin.core.a(gVar, 13));
                                    }
                                } catch (Exception e8) {
                                    e8.printStackTrace();
                                }
                            }
                        } catch (Throwable th2) {
                            com.bumptech.glide.e.l(th2);
                        }
                    }
                    break;
                } else {
                    try {
                        d0.f52154i.c().c();
                    } catch (Throwable th3) {
                        com.bumptech.glide.e.l(th3);
                    }
                    break;
                }
                try {
                    FirebaseAuth.getInstance().h();
                    break;
                } catch (Throwable th4) {
                    com.bumptech.glide.e.l(th4);
                }
                try {
                    int i14 = nl.d.f43846a;
                    try {
                        firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.f("USER-INFO"));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    if (firebaseAuth != null) {
                        firebaseAuth.h();
                    }
                    break;
                } catch (Throwable th5) {
                    com.bumptech.glide.e.l(th5);
                }
                Intent intent = new Intent(meAccountSettingsActivity, (Class<?>) SplashIndexActivity.class);
                intent.setFlags(335577088);
                meAccountSettingsActivity.startActivity(intent);
                return b0Var;
            case 2:
                int i15 = MeAccountSettingsActivity.R;
                ff.h.C(ff.h.y(meAccountSettingsActivity, R.string.error));
                return b0Var;
            case 3:
                int i16 = MeAccountSettingsActivity.R;
                return FileProvider.d(meAccountSettingsActivity, defpackage.e.m(meAccountSettingsActivity.getPackageName(), ".fileprovider"), (File) meAccountSettingsActivity.M.getValue());
            case 4:
                int i17 = MeAccountSettingsActivity.R;
                meAccountSettingsActivity.finish();
                return b0Var;
            case 5:
                int i18 = MeAccountSettingsActivity.R;
                int[] iArr = r.f4959a;
                bq.m.C(meAccountSettingsActivity, iFLeRCXvYCGdPW.efRVMLJTKzDze);
                return b0Var;
            case 6:
                int i19 = MeAccountSettingsActivity.R;
                if (((o0) meAccountSettingsActivity.l()).f27733a.isUnloginUser()) {
                    Intent intent2 = new Intent(meAccountSettingsActivity, (Class<?>) LoginActivity.class);
                    intent2.putExtra(INTENTS.EXTRA_INT, 9);
                    meAccountSettingsActivity.startActivity(intent2);
                } else {
                    lc.d dVar = meAccountSettingsActivity.H;
                    if (dVar == null || !dVar.isShowing()) {
                        lc.d dVar2 = meAccountSettingsActivity.H;
                        if (dVar2 == null) {
                            lc.d dVar3 = new lc.d(meAccountSettingsActivity);
                            lc.d.g(dVar3, Integer.valueOf(R.string.progress_sync), null, 2);
                            hz.b.t(dVar3, Integer.valueOf(R.layout.dialog_wait), null, false, 62);
                            dVar3.a();
                            dVar3.show();
                            meAccountSettingsActivity.H = dVar3;
                        } else {
                            dVar2.show();
                        }
                        e0.B(LifecycleOwnerKt.getLifecycleScope(meAccountSettingsActivity), null, null, new a1(meAccountSettingsActivity, null, 17), 3);
                    }
                }
                return b0Var;
            case 7:
                int i21 = MeAccountSettingsActivity.R;
                try {
                    i.c cVar = meAccountSettingsActivity.O;
                    Uri uri = (Uri) meAccountSettingsActivity.N.getValue();
                    kotlin.jvm.internal.m.e(uri, "<get-uri>(...)");
                    cVar.a(uri);
                    objL = b0Var;
                } catch (Throwable th6) {
                    objL = com.bumptech.glide.e.l(th6);
                }
                Throwable thA = o.a(objL);
                if (thA != null) {
                    thA.printStackTrace();
                }
                return b0Var;
            default:
                int i22 = MeAccountSettingsActivity.R;
                try {
                    meAccountSettingsActivity.P.a(new String[]{"image/*"});
                    objL2 = b0Var;
                } catch (Throwable th7) {
                    objL2 = com.bumptech.glide.e.l(th7);
                }
                Throwable thA2 = o.a(objL2);
                if (thA2 != null) {
                    thA2.printStackTrace();
                }
                return b0Var;
        }
    }
}
