package app.rive.runtime.kotlin.core;

import a5.k;
import a5.s;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import b0.a1;
import b5.g;
import b7.f0;
import bp.b5;
import bp.r2;
import bp.z2;
import cf.x;
import com.android.volley.VolleyError;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.api.Service;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.FirebaseAppCheck;
import com.google.firebase.appcheck.internal.DefaultAppCheckToken;
import com.google.firebase.appcheck.internal.DefaultAppCheckTokenResult;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import com.google.firebase.appcheck.internal.DefaultTokenRefresher;
import com.google.firebase.appcheck.internal.TokenRefreshManager;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.base.ConfirmLevelActivity;
import com.lingo.lingoskill.ui.base.LoginCheckLocateAgeActivity;
import com.lingo.lingoskill.ui.base.LoginCheckParentInfoActivity;
import com.lingo.lingoskill.ui.base.LoginPromptActivity;
import com.lingo.lingoskill.ui.base.PicTestIndexActivity;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingo.lingoskill.ui.learn.DebugTestActivity;
import com.lingo.main.ui.MainComposeActivity;
import com.lingo.splash.SplashIndexActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import f10.e;
import f3.i;
import fr.o0;
import gp.w;
import hh.p0;
import i.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import p9.n;
import pd.j;
import r4.d;
import rz.e0;
import tw.c;
import x7.f;
import x7.r;
import z4.s0;
import z4.s1;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements j, n, b, BaseQuickAdapter.OnItemClickListener, OnCompleteListener, u, f, SynchronizationGuard.CriticalSection, s, MaterialShapeDrawable.OnCornerSizeChangeListener, SuccessContinuation, OnFailureListener, Deferred.DeferredHandler, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2823b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f2822a = i11;
        this.f2823b = obj;
    }

    @Override // x7.f
    public long a(long j11) {
        r rVar = (r) this.f2823b;
        return f0.h((j11 * ((long) rVar.f55920e)) / 1000000, 0L, rVar.f55925j - 1);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object b() {
        switch (this.f2822a) {
            case 17:
                return ((ClientHealthMetricsStore) this.f2823b).c();
            case 18:
                return Integer.valueOf(((EventStore) this.f2823b).t());
            case 19:
                ((Uploader) this.f2823b).f8140i.a();
                return null;
            default:
                WorkInitializer workInitializer = (WorkInitializer) this.f2823b;
                Iterator it = workInitializer.f8151b.X().iterator();
                while (it.hasNext()) {
                    workInitializer.f8152c.a((TransportContext) it.next(), 1);
                }
                return null;
        }
    }

    @Override // p9.n
    public void c(Preference preference, Object obj) {
        bj.b bVar = (bj.b) this.f2823b;
        m.f(preference, "preference");
        String str = preference.N;
        bVar.requireActivity().setResult(-1);
        if (preference instanceof ListPreference) {
            ListPreference listPreference = (ListPreference) preference;
            int iE = listPreference.E(obj.toString());
            listPreference.H(iE >= 0 ? listPreference.f2311v0[iE] : null);
            if (m.a(str, bVar.getString(R.string.flash_card_display_key))) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                x.n().flashCardDisplayIn = iE;
                x.n().updateEntry("flashCardDisplayIn");
            } else if (m.a(str, bVar.getString(R.string.flash_card_audio_model_key))) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                x.n().flashCardIsPlayModel = iE;
                x.n().updateEntry("flashCardIsPlayModel");
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable.OnCornerSizeChangeListener
    public void d(float f5) {
        MaterialButton materialButton = (MaterialButton) this.f2823b;
        int i11 = (int) (f5 * 0.11f);
        if (materialButton.f14052c0 != i11) {
            materialButton.f14052c0 = i11;
            materialButton.j();
            materialButton.invalidate();
        }
    }

    @Override // z4.u
    public v1 e(View view, v1 v1Var) {
        androidx.core.view.insets.a aVar = (androidx.core.view.insets.a) this.f2823b;
        ArrayList arrayList = aVar.f1416b;
        s1 s1Var = v1Var.f58905a;
        d dVarB = d.b(s1Var.g(519), s1Var.g(64));
        d dVarB2 = d.b(s1Var.h(519), s1Var.h(64));
        if (!dVarB.equals(aVar.f1417c) || !dVarB2.equals(aVar.f1418d)) {
            aVar.f1417c = dVarB;
            aVar.f1418d = dVarB2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((c5.a) arrayList.get(size)).f6600a;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    throw p0.e(size2, arrayList2);
                }
            }
        }
        return v1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.Object, qy.h] */
    @Override // i.b
    public void f(Object obj) {
        String stringExtra;
        LanguageItem languageItemV;
        int i11 = this.f2822a;
        int i12 = 5;
        LanguageItem languageItem = 0;
        languageItem = 0;
        Object obj2 = this.f2823b;
        switch (i11) {
            case 3:
                ConfirmLevelActivity confirmLevelActivity = (ConfirmLevelActivity) obj2;
                int i13 = ConfirmLevelActivity.H;
                m.f((i.a) obj, "it");
                Intent intent = new Intent(confirmLevelActivity, (Class<?>) MainComposeActivity.class);
                intent.setFlags(268468224);
                confirmLevelActivity.startActivity(intent);
                break;
            case 4:
                LoginCheckLocateAgeActivity loginCheckLocateAgeActivity = (LoginCheckLocateAgeActivity) obj2;
                i.a it = (i.a) obj;
                int i14 = LoginCheckLocateAgeActivity.L;
                m.f(it, "it");
                int i15 = it.f33864a;
                if (i15 == 3005) {
                    loginCheckLocateAgeActivity.setResult(INTENTS.RESULT_SIGN_UP_SUCCESS);
                    loginCheckLocateAgeActivity.finish();
                } else if (i15 == 3012) {
                    loginCheckLocateAgeActivity.setResult(3012, loginCheckLocateAgeActivity.getIntent());
                }
                break;
            case 5:
                LoginCheckParentInfoActivity loginCheckParentInfoActivity = (LoginCheckParentInfoActivity) obj2;
                i.a it2 = (i.a) obj;
                int i16 = LoginCheckParentInfoActivity.L;
                m.f(it2, "it");
                if (it2.f33864a == 3005) {
                    loginCheckParentInfoActivity.setResult(INTENTS.RESULT_SIGN_UP_SUCCESS);
                    loginCheckParentInfoActivity.finish();
                }
                break;
            case 6:
                r2 r2Var = (r2) obj2;
                m.f((i.a) obj, "it");
                e0.B(LifecycleOwnerKt.getLifecycleScope(r2Var), null, null, new a1(r2Var, languageItem, i12), 3);
                break;
            case 7:
                z2 z2Var = (z2) obj2;
                i.a it3 = (i.a) obj;
                m.f(it3, "it");
                int i17 = it3.f33864a;
                if (i17 == 3006) {
                    Intent intent2 = it3.f33865b;
                    if (intent2 != null && (stringExtra = intent2.getStringExtra(INTENTS.EXTRA_STRING)) != null) {
                        int[] iArr = bq.r.f4959a;
                        Context contextRequireContext = z2Var.requireContext();
                        m.e(contextRequireContext, "requireContext(...)");
                        languageItemV = bq.m.v(contextRequireContext, stringExtra);
                    }
                    if (languageItem == 0) {
                        languageItem = languageItemV;
                        z2Var.startActivity(new Intent(z2Var.f36398d, (Class<?>) SplashIndexActivity.class));
                    } else {
                        int[] iArr2 = bq.r.f4959a;
                        if (bq.m.r(languageItem.getKeyLanguage()).length() <= 0) {
                            languageItem = languageItemV;
                            z2Var.startActivity(new Intent(z2Var.f36398d, (Class<?>) SplashIndexActivity.class));
                        } else {
                            languageItem = languageItemV;
                            int i18 = SwitchLanguageActivity.M;
                            l.m mVar = z2Var.f36398d;
                            m.c(mVar);
                            z2Var.startActivity(c.p(mVar, languageItem, (8 & 4) != 0, OYAvlbfUyD.xZnwOYMncSkzgRT));
                        }
                    }
                } else if (i17 == 3005) {
                    z2Var.startActivity(new Intent(z2Var.f36398d, (Class<?>) SplashIndexActivity.class));
                }
                break;
            case 8:
                LoginPromptActivity loginPromptActivity = (LoginPromptActivity) obj2;
                int i19 = LoginPromptActivity.Q;
                m.f((i.a) obj, "it");
                try {
                    if (!((o0) loginPromptActivity.l()).f27733a.isUnloginUser()) {
                        loginPromptActivity.setResult(INTENTS.RESLUT_LOGIN_SUCCESS);
                        loginPromptActivity.finish();
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
                break;
            case 9:
            default:
                CourseTestIndexActivity courseTestIndexActivity = (CourseTestIndexActivity) obj2;
                int i21 = CourseTestIndexActivity.N;
                m.f((i.a) obj, "it");
                e0.B(LifecycleOwnerKt.getLifecycleScope(courseTestIndexActivity), null, null, new a1(courseTestIndexActivity, languageItem, 15), 3);
                break;
            case 10:
                m.f((i.a) obj, "it");
                p0.w(25, com.google.android.material.datepicker.d.e(3, com.google.android.material.datepicker.d.e(2, com.google.android.material.datepicker.d.e(1, com.google.android.material.datepicker.d.e(5, e.b())))));
                w wVar = (w) ((b5) obj2).T.getValue();
                ju.d dVar = new ju.d(25);
                wVar.getClass();
                wVar.d(dVar);
                break;
        }
    }

    @Override // pd.j
    public void g(VolleyError volleyError) {
        CDNAssetLoader.loadContents$lambda$0((CDNAssetLoader) this.f2823b, volleyError);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void h(Provider provider) {
        switch (this.f2822a) {
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((CrashlyticsNativeComponentDeferredProxy) this.f2823b).f18217b.set((CrashlyticsNativeComponent) provider.get());
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((FirebaseRemoteConfigInterop) provider.get()).a((CrashlyticsRemoteConfigListener) this.f2823b);
                break;
            default:
                ((AndroidAppCheckTokenProvider) this.f2823b).f19002b.set((InteropAppCheckTokenProvider) provider.get());
                break;
        }
    }

    public boolean i(hd.d dVar, int i11, Bundle bundle) {
        z4.e iVar;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.f2823b;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 25 && (i11 & 1) != 0) {
            try {
                ((g) dVar.f32187b).n();
                Parcelable parcelable = (Parcelable) ((g) dVar.f32187b).y();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        g gVar = (g) dVar.f32187b;
        ClipData clipData = new ClipData(gVar.getDescription(), new ClipData.Item(gVar.e()));
        if (i12 >= 31) {
            iVar = new i(clipData, 2);
        } else {
            z4.f fVar = new z4.f();
            fVar.f58828b = clipData;
            fVar.f58829c = 2;
            iVar = fVar;
        }
        iVar.b(gVar.o());
        iVar.setExtras(bundle);
        return s0.m(appCompatEditText, iVar.build()) == null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i11 = this.f2822a;
        boolean z11 = true;
        Object obj = this.f2823b;
        switch (i11) {
            case 11:
                UpdateLessonActivity updateLessonActivity = (UpdateLessonActivity) obj;
                int i12 = UpdateLessonActivity.W;
                m.f(task, "task");
                if (!task.isSuccessful()) {
                    task.getException();
                } else {
                    String str = (String) task.getResult();
                    if (str != null) {
                        int[] iArr = bq.r.f4959a;
                        bq.m.a(updateLessonActivity, str);
                        Toast.makeText(updateLessonActivity, R.string.success, 1).show();
                    }
                }
                break;
            default:
                bq.g gVar = (bq.g) obj;
                m.f(task, "it");
                try {
                    GoogleSignInClient googleSignInClient = gVar.f4949c;
                    if (googleSignInClient != null) {
                        zabq zabqVar = googleSignInClient.f8684i;
                        Context context = googleSignInClient.f8676a;
                        if (googleSignInClient.d() != 3) {
                            z11 = false;
                        }
                        PendingResultUtil.a(zbm.c(zabqVar, context, z11));
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        long j11;
        DefaultTokenRefresher defaultTokenRefresher = (DefaultTokenRefresher) this.f2823b;
        defaultTokenRefresher.a();
        if (defaultTokenRefresher.f17824e == -1) {
            j11 = 30;
        } else {
            j11 = defaultTokenRefresher.f17824e * 2 < 960 ? defaultTokenRefresher.f17824e * 2 : 960L;
        }
        defaultTokenRefresher.f17824e = j11;
        defaultTokenRefresher.f17823d = defaultTokenRefresher.f17822c.schedule(new b2.a(defaultTokenRefresher, 8), defaultTokenRefresher.f17824e, TimeUnit.SECONDS);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        PicTestIndexActivity picTestIndexActivity = (PicTestIndexActivity) this.f2823b;
        Object obj = picTestIndexActivity.Q.get(i11);
        m.e(obj, "get(...)");
        Lesson lesson = (Lesson) obj;
        Lesson.loadFullObject(lesson);
        StringBuilder sb2 = new StringBuilder();
        e00.i iVarA = l.a(lesson.getWdWordList());
        while (iVarA.hasNext()) {
            sb2.append("0 " + ((Word) iVarA.next()).getWordId() + " 1#");
        }
        String string = sb2.toString();
        m.e(string, "toString(...)");
        Intent intent = new Intent(picTestIndexActivity, (Class<?>) DebugTestActivity.class);
        intent.putExtra(INTENTS.EXTRA_STRING, string);
        picTestIndexActivity.startActivity(intent);
    }

    @Override // a5.s
    public boolean perform(View view, k kVar) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.f2823b;
        int i11 = BottomSheetDragHandleView.L;
        return bottomSheetDragHandleView.c();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f2822a) {
            case 27:
                return (Task) ((Callable) this.f2823b).call();
            default:
                ((Runnable) this.f2823b).run();
                return Tasks.forResult(null);
        }
    }

    public /* synthetic */ a(tf.f0 f0Var, xq.c cVar) {
        this.f2822a = 12;
        this.f2823b = cVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        DefaultAppCheckToken defaultAppCheckTokenC;
        DefaultFirebaseAppCheck defaultFirebaseAppCheck = (DefaultFirebaseAppCheck) this.f2823b;
        AppCheckToken appCheckToken = (AppCheckToken) obj;
        defaultFirebaseAppCheck.f17814i.execute(new com.google.firebase.appcheck.internal.a(defaultFirebaseAppCheck, appCheckToken, 0));
        defaultFirebaseAppCheck.f17818n = appCheckToken;
        TokenRefreshManager tokenRefreshManager = defaultFirebaseAppCheck.f17811f;
        tokenRefreshManager.getClass();
        if (appCheckToken instanceof DefaultAppCheckToken) {
            defaultAppCheckTokenC = (DefaultAppCheckToken) appCheckToken;
        } else {
            defaultAppCheckTokenC = DefaultAppCheckToken.c(appCheckToken.b());
        }
        tokenRefreshManager.f17839e = defaultAppCheckTokenC.f17802b + ((long) (defaultAppCheckTokenC.f17803c * 0.5d)) + 300000;
        if (tokenRefreshManager.f17839e > defaultAppCheckTokenC.a()) {
            tokenRefreshManager.f17839e = defaultAppCheckTokenC.a() - 60000;
        }
        if (tokenRefreshManager.a()) {
            DefaultTokenRefresher defaultTokenRefresher = tokenRefreshManager.f17835a;
            long j11 = tokenRefreshManager.f17839e;
            tokenRefreshManager.f17836b.getClass();
            defaultTokenRefresher.b(j11 - System.currentTimeMillis());
        }
        ArrayList arrayList = defaultFirebaseAppCheck.f17809d;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList.get(i12);
            i12++;
            ((FirebaseAppCheck.AppCheckListener) obj2).a();
        }
        DefaultAppCheckTokenResult defaultAppCheckTokenResultC = DefaultAppCheckTokenResult.c(appCheckToken);
        ArrayList arrayList2 = defaultFirebaseAppCheck.f17808c;
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            ((AppCheckTokenListener) obj3).a(defaultAppCheckTokenResultC);
        }
        return Tasks.forResult(appCheckToken);
    }
}
