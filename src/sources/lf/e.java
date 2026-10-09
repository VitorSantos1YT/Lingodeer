package lf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Set;
import java.util.regex.Pattern;
import rt.o4;
import rt.r5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f39994c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39996b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f39995a = i11;
        this.f39996b = obj;
    }

    public static final /* synthetic */ e a() {
        if (qf.a.b(e.class)) {
            return null;
        }
        try {
            return f39994c;
        } catch (Throwable th2) {
            qf.a.a(e.class, th2);
            return null;
        }
    }

    public void finalize() throws Throwable {
        switch (this.f39995a) {
            case 0:
                if (!qf.a.b(this)) {
                    try {
                        if (!qf.a.b(this)) {
                            try {
                                x6.b bVarA = x6.b.a((Context) this.f39996b);
                                kotlin.jvm.internal.m.e(bVarA, "getInstance(applicationContext)");
                                bVarA.d(this);
                            } catch (Throwable th2) {
                                qf.a.a(this, th2);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        qf.a.a(this, th3);
                        return;
                    }
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    public e(Context context) {
        this.f39995a = 0;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.m.e(applicationContext, "context.applicationContext");
        this.f39996b = applicationContext;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lp.j jVar;
        lp.j jVar2;
        int i11 = this.f39995a;
        Object obj = this.f39996b;
        switch (i11) {
            case 0:
                if (!qf.a.b(this)) {
                    try {
                        se.m mVar = new se.m(context, (String) null);
                        StringBuilder sb2 = new StringBuilder("bf_");
                        sb2.append(intent != null ? intent.getStringExtra("event_name") : null);
                        String string = sb2.toString();
                        Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
                        Bundle bundle = new Bundle();
                        Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
                        if (setKeySet != null) {
                            for (String key : setKeySet) {
                                kotlin.jvm.internal.m.e(key, "key");
                                Pattern patternCompile = Pattern.compile("[^0-9a-zA-Z _-]");
                                kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                                String strReplaceAll = patternCompile.matcher(key).replaceAll("-");
                                kotlin.jvm.internal.m.e(strReplaceAll, "replaceAll(...)");
                                Pattern patternCompile2 = Pattern.compile("^[ -]*");
                                kotlin.jvm.internal.m.e(patternCompile2, "compile(...)");
                                String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(BuildConfig.VERSION_NAME);
                                kotlin.jvm.internal.m.e(strReplaceAll2, "replaceAll(...)");
                                Pattern patternCompile3 = Pattern.compile("[ -]*$");
                                kotlin.jvm.internal.m.e(patternCompile3, "compile(...)");
                                String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll(BuildConfig.VERSION_NAME);
                                kotlin.jvm.internal.m.e(strReplaceAll3, "replaceAll(...)");
                                bundle.putString(strReplaceAll3, (String) bundleExtra.get(key));
                            }
                        }
                        re.s sVar = re.s.f49201a;
                        if (re.i0.c()) {
                            mVar.d(string, bundle);
                        }
                    } catch (Throwable th2) {
                        qf.a.a(this, th2);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                ((b7.u) obj).f4026a.execute(new b2.c(3, this, context));
                break;
            case 2:
                if (!isInitialStickyBroadcast()) {
                    h7.f fVar = (h7.f) obj;
                    fVar.a(h7.c.b(context, intent, fVar.f31866i, fVar.f31865h));
                }
                break;
            case 3:
                ((ae.d) obj).l();
                break;
            case 4:
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(intent, "intent");
                mb.a aVar = (mb.a) obj;
                switch (aVar.f41106g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            fb.l lVarB = fb.l.b();
                            int i12 = mb.b.f41107a;
                            lVarB.getClass();
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        aVar.d(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        aVar.d(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        aVar.d(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        aVar.d(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            fb.l lVarB2 = fb.l.b();
                            int i13 = mb.c.f41108a;
                            intent.getAction();
                            lVarB2.getClass();
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        aVar.d(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.d(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            fb.l lVarB3 = fb.l.b();
                            int i14 = mb.h.f41114a;
                            intent.getAction();
                            lVarB3.getClass();
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        aVar.d(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.d(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
            case 5:
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(intent, "intent");
                if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                    re.s sVar2 = re.s.f49201a;
                    LoginButton loginButton = (LoginButton) ((bq.f) obj).f4946d;
                    loginButton.m();
                    loginButton.k();
                }
                break;
            case 6:
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(intent, "intent");
                ((CustomTabActivity) obj).finish();
                break;
            case 7:
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(intent, "intent");
                CustomTabMainActivity customTabMainActivity = (CustomTabMainActivity) obj;
                Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
                int i15 = CustomTabMainActivity.f7704c;
                intent2.setAction(IMCc.TGTMOKiYgWIov);
                intent2.putExtra("CustomTabMainActivity.extra_url", intent.getStringExtra("CustomTabMainActivity.extra_url"));
                intent2.addFlags(603979776);
                customTabMainActivity.startActivity(intent2);
                break;
            case 8:
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(intent, "intent");
                if ("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED".equals(intent.getAction())) {
                    re.f0 f0Var = (re.f0) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_PROFILE");
                    ProfilePictureView profilePictureView = (ProfilePictureView) ((bq.f) obj).f4946d;
                    profilePictureView.setProfileId(f0Var != null ? f0Var.f49148a : null);
                    profilePictureView.f(true);
                }
                break;
            default:
                o4 o4Var = (o4) obj;
                String action4 = intent != null ? intent.getAction() : null;
                if (action4 != null) {
                    int iHashCode3 = action4.hashCode();
                    if (iHashCode3 != -1166479412) {
                        if (iHashCode3 == -730355074 && action4.equals("com.lingodeer.course.listen_along.PLAY") && (jVar2 = o4Var.f50184b) != null) {
                            jVar2.p();
                        }
                    } else if (action4.equals("com.lingodeer.course.listen_along.PAUSE") && (jVar = o4Var.f50184b) != null) {
                        ((r5) jVar.f40203b).k();
                    }
                }
                break;
        }
    }
}
