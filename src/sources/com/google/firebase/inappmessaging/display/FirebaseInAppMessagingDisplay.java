package com.google.firebase.inappmessaging.display;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import ce.o;
import com.adjust.sdk.Constants;
import com.bumptech.glide.n;
import com.bumptech.glide.p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.display.internal.BindingWrapperFactory;
import com.google.firebase.inappmessaging.display.internal.FiamAnimator;
import com.google.firebase.inappmessaging.display.internal.FiamImageLoader;
import com.google.firebase.inappmessaging.display.internal.FiamImageLoader.FiamImageRequestCreator;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import com.google.firebase.inappmessaging.display.internal.FirebaseInAppMessagingDisplayImpl;
import com.google.firebase.inappmessaging.display.internal.GlideErrorListener;
import com.google.firebase.inappmessaging.display.internal.InAppMessageLayoutConfig;
import com.google.firebase.inappmessaging.display.internal.RenewableTimer;
import com.google.firebase.inappmessaging.display.internal.bindingwrappers.BindingWrapper;
import com.google.firebase.inappmessaging.display.internal.injection.components.DaggerInAppMessageComponent;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterConfigModule;
import com.google.firebase.inappmessaging.display.internal.injection.modules.InflaterModule;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.BannerMessage;
import com.google.firebase.inappmessaging.model.CardMessage;
import com.google.firebase.inappmessaging.model.ImageData;
import com.google.firebase.inappmessaging.model.ImageOnlyMessage;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.model.ModalMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import me.b;
import oy.a;
import pe.f;
import zd.h;
import zd.j;
import zd.k;
import zd.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInAppMessagingDisplay extends FirebaseInAppMessagingDisplayImpl {
    public final Application H;
    public final FiamAnimator K;
    public InAppMessage L;
    public FirebaseInAppMessagingDisplayCallbacks M;
    public String N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseInAppMessaging f19719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f19720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FiamImageLoader f19721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenewableTimer f19722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RenewableTimer f19723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FiamWindowManager f19724f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BindingWrapperFactory f19725t;

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19741a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f19741a = iArr;
            try {
                iArr[MessageType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19741a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19741a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19741a[MessageType.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FirebaseInAppMessagingDisplay(FirebaseInAppMessaging firebaseInAppMessaging, Map map, FiamImageLoader fiamImageLoader, RenewableTimer renewableTimer, RenewableTimer renewableTimer2, FiamWindowManager fiamWindowManager, Application application, BindingWrapperFactory bindingWrapperFactory, FiamAnimator fiamAnimator) {
        this.f19719a = firebaseInAppMessaging;
        this.f19720b = map;
        this.f19721c = fiamImageLoader;
        this.f19722d = renewableTimer;
        this.f19723e = renewableTimer2;
        this.f19724f = fiamWindowManager;
        this.H = application;
        this.f19725t = bindingWrapperFactory;
        this.K = fiamAnimator;
    }

    public final void a(Activity activity) {
        BindingWrapper bindingWrapper = this.f19724f.f19769a;
        if (bindingWrapper == null ? false : bindingWrapper.e().isShown()) {
            FiamImageLoader fiamImageLoader = this.f19721c;
            Class<?> cls = activity.getClass();
            fiamImageLoader.getClass();
            String simpleName = cls.getSimpleName();
            synchronized (simpleName) {
                try {
                    if (fiamImageLoader.f19763b.containsKey(simpleName)) {
                        for (b bVar : (Set) fiamImageLoader.f19763b.get(simpleName)) {
                            if (bVar != null) {
                                fiamImageLoader.f19762a.j(bVar);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            FiamWindowManager fiamWindowManager = this.f19724f;
            BindingWrapper bindingWrapper2 = fiamWindowManager.f19769a;
            if (bindingWrapper2 != null ? bindingWrapper2.e().isShown() : false) {
                ((WindowManager) activity.getSystemService("window")).removeViewImmediate(fiamWindowManager.f19769a.e());
                fiamWindowManager.f19769a = null;
            }
            RenewableTimer renewableTimer = this.f19722d;
            CountDownTimer countDownTimer = renewableTimer.f19786a;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                renewableTimer.f19786a = null;
            }
            RenewableTimer renewableTimer2 = this.f19723e;
            CountDownTimer countDownTimer2 = renewableTimer2.f19786a;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                renewableTimer2.f19786a = null;
            }
        }
    }

    public final void b(final Activity activity) {
        final BindingWrapper bindingWrapperC;
        InAppMessage inAppMessage = this.L;
        if (inAppMessage != null) {
            this.f19719a.getClass();
            if (inAppMessage.f20321a.equals(MessageType.UNSUPPORTED)) {
                return;
            }
            InAppMessageLayoutConfig inAppMessageLayoutConfig = (InAppMessageLayoutConfig) ((a) this.f19720b.get(InflaterConfigModule.a(this.L.f20321a, this.H.getResources().getConfiguration().orientation))).get();
            int i11 = AnonymousClass5.f19741a[this.L.f20321a.ordinal()];
            int i12 = 0;
            BindingWrapperFactory bindingWrapperFactory = this.f19725t;
            if (i11 == 1) {
                InAppMessage inAppMessage2 = this.L;
                bindingWrapperFactory.getClass();
                DaggerInAppMessageComponent.Builder builder = new DaggerInAppMessageComponent.Builder(i12);
                builder.f19872a = new InflaterModule(inAppMessage2, inAppMessageLayoutConfig, bindingWrapperFactory.f19756a);
                bindingWrapperC = builder.a().c();
            } else if (i11 == 2) {
                InAppMessage inAppMessage3 = this.L;
                bindingWrapperFactory.getClass();
                DaggerInAppMessageComponent.Builder builder2 = new DaggerInAppMessageComponent.Builder(i12);
                builder2.f19872a = new InflaterModule(inAppMessage3, inAppMessageLayoutConfig, bindingWrapperFactory.f19756a);
                bindingWrapperC = builder2.a().d();
            } else if (i11 == 3) {
                InAppMessage inAppMessage4 = this.L;
                bindingWrapperFactory.getClass();
                DaggerInAppMessageComponent.Builder builder3 = new DaggerInAppMessageComponent.Builder(i12);
                builder3.f19872a = new InflaterModule(inAppMessage4, inAppMessageLayoutConfig, bindingWrapperFactory.f19756a);
                bindingWrapperC = builder3.a().a();
            } else {
                if (i11 != 4) {
                    return;
                }
                InAppMessage inAppMessage5 = this.L;
                bindingWrapperFactory.getClass();
                DaggerInAppMessageComponent.Builder builder4 = new DaggerInAppMessageComponent.Builder(i12);
                builder4.f19872a = new InflaterModule(inAppMessage5, inAppMessageLayoutConfig, bindingWrapperFactory.f19756a);
                bindingWrapperC = builder4.a().b();
            }
            activity.findViewById(android.R.id.content).post(new Runnable() { // from class: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay.1
                @Override // java.lang.Runnable
                public final void run() {
                    ImageData imageDataA;
                    final FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = FirebaseInAppMessagingDisplay.this;
                    if (firebaseInAppMessagingDisplay.L == null) {
                        return;
                    }
                    final Activity activity2 = activity;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay2 = FirebaseInAppMessagingDisplay.this;
                            FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks = firebaseInAppMessagingDisplay2.M;
                            if (firebaseInAppMessagingDisplayCallbacks != null) {
                                firebaseInAppMessagingDisplayCallbacks.c(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.CLICK);
                            }
                            firebaseInAppMessagingDisplay2.a(activity2);
                            firebaseInAppMessagingDisplay2.L = null;
                            firebaseInAppMessagingDisplay2.M = null;
                        }
                    };
                    HashMap map = new HashMap();
                    InAppMessage inAppMessage6 = firebaseInAppMessagingDisplay.L;
                    ArrayList arrayList = new ArrayList();
                    int i13 = AnonymousClass5.f19741a[inAppMessage6.f20321a.ordinal()];
                    if (i13 == 1) {
                        arrayList.add(((BannerMessage) inAppMessage6).f20287g);
                    } else if (i13 == 2) {
                        arrayList.add(((ModalMessage) inAppMessage6).f20327g);
                    } else if (i13 == 3) {
                        arrayList.add(((ImageOnlyMessage) inAppMessage6).f20318e);
                    } else if (i13 != 4) {
                        Action.Builder builder5 = new Action.Builder();
                        arrayList.add(new Action(builder5.f20275a, builder5.f20276b));
                    } else {
                        CardMessage cardMessage = (CardMessage) inAppMessage6;
                        arrayList.add(cardMessage.f20304g);
                        arrayList.add(cardMessage.f20305h);
                    }
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        final Action action = (Action) obj;
                        map.put(action, (action == null || TextUtils.isEmpty(action.f20273a)) ? onClickListener : new View.OnClickListener() { // from class: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay.3
                            /* JADX WARN: Code duplicated, block: B:22:0x0088  */
                            /* JADX WARN: Code duplicated, block: B:24:0x009d  */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Intent intent;
                                ResolveInfo resolveInfoResolveActivity;
                                String scheme;
                                FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay2 = FirebaseInAppMessagingDisplay.this;
                                FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks = firebaseInAppMessagingDisplay2.M;
                                Action action2 = action;
                                if (firebaseInAppMessagingDisplayCallbacks != null) {
                                    firebaseInAppMessagingDisplayCallbacks.a(action2);
                                }
                                Uri uri = Uri.parse(action2.f20273a);
                                Activity activity3 = activity2;
                                if (uri == null || (scheme = uri.getScheme()) == null || (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase(Constants.SCHEME))) {
                                    intent = new Intent("android.intent.action.VIEW", uri);
                                    resolveInfoResolveActivity = activity3.getPackageManager().resolveActivity(intent, 0);
                                    intent.addFlags(1073741824);
                                    intent.addFlags(268435456);
                                    if (resolveInfoResolveActivity != null) {
                                        activity3.startActivity(intent);
                                    }
                                } else {
                                    Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                                    intent2.setPackage("com.android.chrome");
                                    List<ResolveInfo> listQueryIntentServices = activity3.getPackageManager().queryIntentServices(intent2, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        intent = new Intent("android.intent.action.VIEW", uri);
                                        resolveInfoResolveActivity = activity3.getPackageManager().resolveActivity(intent, 0);
                                        intent.addFlags(1073741824);
                                        intent.addFlags(268435456);
                                        if (resolveInfoResolveActivity != null) {
                                            activity3.startActivity(intent);
                                        }
                                    } else {
                                        Intent intent3 = new Intent("android.intent.action.VIEW");
                                        if (!intent3.hasExtra("android.support.customtabs.extra.SESSION")) {
                                            Bundle bundle = new Bundle();
                                            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                                            intent3.putExtras(bundle);
                                        }
                                        intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                        intent3.putExtras(new Bundle());
                                        intent3.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                                        intent3.addFlags(1073741824);
                                        intent3.addFlags(268435456);
                                        intent3.setData(uri);
                                        activity3.startActivity(intent3, null);
                                    }
                                }
                                firebaseInAppMessagingDisplay2.a(activity3);
                                firebaseInAppMessagingDisplay2.L = null;
                                firebaseInAppMessagingDisplay2.M = null;
                            }
                        });
                    }
                    final BindingWrapper bindingWrapper = bindingWrapperC;
                    final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerF = bindingWrapper.f(map, onClickListener);
                    if (onGlobalLayoutListenerF != null) {
                        bindingWrapper.d().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerF);
                    }
                    InAppMessage inAppMessage7 = firebaseInAppMessagingDisplay.L;
                    if (inAppMessage7.f20321a == MessageType.CARD) {
                        CardMessage cardMessage2 = (CardMessage) inAppMessage7;
                        imageDataA = cardMessage2.f20306i;
                        ImageData imageData = cardMessage2.f20307j;
                        if (firebaseInAppMessagingDisplay.H.getResources().getConfiguration().orientation != 1 ? !(imageData == null || TextUtils.isEmpty(imageData.f20315a)) : !(imageDataA != null && !TextUtils.isEmpty(imageDataA.f20315a))) {
                            imageDataA = imageData;
                        }
                    } else {
                        imageDataA = inAppMessage7.a();
                    }
                    FiamImageLoader.Callback callback = new FiamImageLoader.Callback() { // from class: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay.4
                        @Override // com.google.firebase.inappmessaging.display.internal.FiamImageLoader.Callback
                        public final void j() {
                            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = onGlobalLayoutListenerF;
                            if (onGlobalLayoutListener != null) {
                                bindingWrapper.d().getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
                            }
                            FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay2 = FirebaseInAppMessagingDisplay.this;
                            RenewableTimer renewableTimer = firebaseInAppMessagingDisplay2.f19722d;
                            CountDownTimer countDownTimer = renewableTimer.f19786a;
                            if (countDownTimer != null) {
                                countDownTimer.cancel();
                                renewableTimer.f19786a = null;
                            }
                            RenewableTimer renewableTimer2 = firebaseInAppMessagingDisplay2.f19723e;
                            CountDownTimer countDownTimer2 = renewableTimer2.f19786a;
                            if (countDownTimer2 != null) {
                                countDownTimer2.cancel();
                                renewableTimer2.f19786a = null;
                            }
                            firebaseInAppMessagingDisplay2.L = null;
                            firebaseInAppMessagingDisplay2.M = null;
                        }

                        @Override // com.google.firebase.inappmessaging.display.internal.FiamImageLoader.Callback
                        public final void k() {
                            BindingWrapper bindingWrapper2 = bindingWrapper;
                            if (!bindingWrapper2.a().f19782i.booleanValue()) {
                                bindingWrapper2.e().setOnTouchListener(new View.OnTouchListener() { // from class: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay.4.1
                                    @Override // android.view.View.OnTouchListener
                                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay2 = FirebaseInAppMessagingDisplay.this;
                                        if (motionEvent.getAction() != 4) {
                                            return false;
                                        }
                                        FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks = firebaseInAppMessagingDisplay2.M;
                                        if (firebaseInAppMessagingDisplayCallbacks != null) {
                                            firebaseInAppMessagingDisplayCallbacks.c(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.UNKNOWN_DISMISS_TYPE);
                                        }
                                        firebaseInAppMessagingDisplay2.a(activity2);
                                        firebaseInAppMessagingDisplay2.L = null;
                                        firebaseInAppMessagingDisplay2.M = null;
                                        return true;
                                    }
                                });
                            }
                            FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay2 = FirebaseInAppMessagingDisplay.this;
                            firebaseInAppMessagingDisplay2.f19722d.a(5000L, new RenewableTimer.Callback() { // from class: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay.4.2
                                @Override // com.google.firebase.inappmessaging.display.internal.RenewableTimer.Callback
                                public final void a() {
                                    FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks;
                                    FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay3 = FirebaseInAppMessagingDisplay.this;
                                    InAppMessage inAppMessage8 = firebaseInAppMessagingDisplay3.L;
                                    if (inAppMessage8 == null || (firebaseInAppMessagingDisplayCallbacks = firebaseInAppMessagingDisplay3.M) == null) {
                                        return;
                                    }
                                    String str = inAppMessage8.f20322b.f20298a;
                                    firebaseInAppMessagingDisplayCallbacks.d();
                                }
                            });
                            if (bindingWrapper2.a().f19784k.booleanValue()) {
                                firebaseInAppMessagingDisplay2.f19723e.a(20000L, new RenewableTimer.Callback() { // from class: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay.4.3
                                    @Override // com.google.firebase.inappmessaging.display.internal.RenewableTimer.Callback
                                    public final void a() {
                                        FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks;
                                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay3 = FirebaseInAppMessagingDisplay.this;
                                        if (firebaseInAppMessagingDisplay3.L != null && (firebaseInAppMessagingDisplayCallbacks = firebaseInAppMessagingDisplay3.M) != null) {
                                            firebaseInAppMessagingDisplayCallbacks.c(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.AUTO);
                                        }
                                        firebaseInAppMessagingDisplay3.a(activity2);
                                        firebaseInAppMessagingDisplay3.L = null;
                                        firebaseInAppMessagingDisplay3.M = null;
                                    }
                                });
                            }
                            activity2.runOnUiThread(new Runnable() { // from class: com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay.4.4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                    FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay3 = FirebaseInAppMessagingDisplay.this;
                                    FiamWindowManager fiamWindowManager = firebaseInAppMessagingDisplay3.f19724f;
                                    BindingWrapper bindingWrapper3 = bindingWrapper;
                                    fiamWindowManager.b(bindingWrapper3, activity2);
                                    if (bindingWrapper3.a().f19783j.booleanValue()) {
                                        FiamAnimator fiamAnimator = firebaseInAppMessagingDisplay3.K;
                                        Application application = firebaseInAppMessagingDisplay3.H;
                                        ViewGroup viewGroupE = bindingWrapper3.e();
                                        FiamAnimator.Position position = FiamAnimator.Position.TOP;
                                        fiamAnimator.getClass();
                                        FiamAnimator.a(application, viewGroupE, position);
                                    }
                                }
                            });
                        }
                    };
                    if (imageDataA == null || TextUtils.isEmpty(imageDataA.f20315a)) {
                        callback.k();
                        return;
                    }
                    FiamImageLoader fiamImageLoader = firebaseInAppMessagingDisplay.f19721c;
                    String str = imageDataA.f20315a;
                    fiamImageLoader.getClass();
                    j jVar = new j();
                    k kVar = new k("image/*");
                    HashMap map2 = new HashMap(jVar.f59170a.size());
                    for (Map.Entry entry : jVar.f59170a.entrySet()) {
                        map2.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
                    }
                    jVar.f59170a = map2;
                    List arrayList2 = (List) jVar.f59170a.get("Accept");
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        jVar.f59170a.put("Accept", arrayList2);
                    }
                    arrayList2.add(kVar);
                    h hVar = new h(str, new l(jVar.f59170a));
                    p pVar = fiamImageLoader.f19762a;
                    pVar.getClass();
                    n nVarZ = new n(pVar.f7693a, pVar, Drawable.class, pVar.f7694b).z(hVar);
                    td.b bVar = td.b.PREFER_ARGB_8888;
                    nVarZ.getClass();
                    f.b(bVar);
                    n nVar = (n) nVarZ.n(o.f6876f, bVar).n(ge.j.f29169a, bVar);
                    FiamImageLoader.FiamImageRequestCreator fiamImageRequestCreator = fiamImageLoader.new FiamImageRequestCreator(nVar);
                    nVar.t(new GlideErrorListener(firebaseInAppMessagingDisplay.L, firebaseInAppMessagingDisplay.M));
                    fiamImageRequestCreator.f19766b = activity2.getClass().getSimpleName();
                    fiamImageRequestCreator.a();
                    nVar.k();
                    ImageView imageViewD = bindingWrapper.d();
                    Objects.toString(callback);
                    callback.f19764d = imageViewD;
                    nVar.y(callback, nVar);
                    fiamImageRequestCreator.f19765a = callback;
                    fiamImageRequestCreator.a();
                }
            });
        }
    }

    @Override // com.google.firebase.inappmessaging.display.internal.FirebaseInAppMessagingDisplayImpl, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String str = this.N;
        FirebaseInAppMessaging firebaseInAppMessaging = this.f19719a;
        if (str != null && str.equals(activity.getLocalClassName())) {
            activity.getLocalClassName();
            firebaseInAppMessaging.f19704d = null;
            a(activity);
            this.N = null;
        }
        DeveloperListenerManager developerListenerManager = firebaseInAppMessaging.f19702b;
        developerListenerManager.f19971b.clear();
        developerListenerManager.f19974e.clear();
        developerListenerManager.f19973d.clear();
        developerListenerManager.f19972c.clear();
        activity.getClass();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.FirebaseInAppMessagingDisplayImpl, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        String str = this.N;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            activity.getLocalClassName();
            this.f19719a.f19704d = new e(2, this, activity);
            this.N = activity.getLocalClassName();
        }
        if (this.L != null) {
            b(activity);
        }
    }
}
