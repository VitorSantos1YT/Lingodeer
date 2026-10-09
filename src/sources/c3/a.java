package c3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.text.Editable;
import android.view.contentcapture.ContentCaptureSession;
import ce.v;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.api.Service;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.FirebaseException;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.AppCheckTokenResponse;
import com.google.firebase.appcheck.internal.DefaultAppCheckToken;
import com.google.firebase.appcheck.internal.DefaultAppCheckTokenResult;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import com.google.firebase.appcheck.internal.util.Clock;
import com.google.firebase.appcheck.internal.util.TokenParser;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.database.DatabaseRegistrar;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import pe.g;
import x7.m;
import x7.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p, g, TransportScheduleCallback, ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter, LibraryVersionComponent.VersionExtractor, Continuation, SuccessContinuation, ComponentRegistrarProcessor, Deferred.DeferredHandler, OnFailureListener, Transformer, ComponentFactory, ImmutableSortedMap.Builder.KeyTranslator, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6516a;

    public /* synthetic */ a(int i11) {
        this.f6516a = i11;
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source k(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession l(Object obj) {
        return (ContentCaptureSession) obj;
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        DataTransportCrashlyticsReportSender.f18887c.getClass();
        return CrashlyticsReportJsonTransform.f18864a.b((CrashlyticsReport) obj).getBytes(Charset.forName(Constants.ENCODING));
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize b(CornerSize cornerSize) {
        int i11 = MaskableFrameLayout.L;
        return cornerSize instanceof AbsoluteCornerSize ? new ClampedCornerSize(((AbsoluteCornerSize) cornerSize).f15190a) : cornerSize;
    }

    @Override // x7.p
    public m[] c() {
        return new m[]{new c8.c()};
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object d(ComponentContainer componentContainer) {
        switch (this.f6516a) {
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return DatabaseRegistrar.lambda$getComponents$0(componentContainer);
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int e(Editable editable) {
        int[][] iArr = TextInputLayout.f1;
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String f(Context context) {
        switch (this.f6516a) {
            case 15:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : BuildConfig.VERSION_NAME;
            case 16:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : BuildConfig.VERSION_NAME;
            case 17:
                int i11 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return (i11 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? BuildConfig.VERSION_NAME : "embedded";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : BuildConfig.VERSION_NAME;
        }
    }

    @Override // pe.g
    public Object get() {
        return v.a();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(DefaultAppCheckTokenResult.c((AppCheckToken) task.getResult()));
        }
        Exception exception = task.getException();
        return Tasks.forResult(new DefaultAppCheckTokenResult("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new FirebaseException(exception.getMessage() != null ? exception.getMessage() : "Unknown error generating App Check token", task.getException())));
    }

    public /* synthetic */ a(DefaultFirebaseAppCheck defaultFirebaseAppCheck) {
        this.f6516a = 19;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        long jD;
        switch (this.f6516a) {
            case 20:
                AppCheckTokenResponse appCheckTokenResponse = (AppCheckTokenResponse) obj;
                Preconditions.g(appCheckTokenResponse);
                try {
                    jD = (long) (Double.parseDouble(appCheckTokenResponse.f17800b.replace("s", BuildConfig.VERSION_NAME)) * 1000.0d);
                } catch (NumberFormatException unused) {
                    Map mapA = TokenParser.a(appCheckTokenResponse.f17799a);
                    jD = 1000 * (DefaultAppCheckToken.d("exp", mapA) - DefaultAppCheckToken.d("iat", mapA));
                }
                long j11 = jD;
                String str = appCheckTokenResponse.f17799a;
                new Clock.DefaultClock();
                return Tasks.forResult(new DefaultAppCheckToken(str, j11, System.currentTimeMillis()));
            default:
                return Tasks.forResult(null);
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void h(Provider provider) {
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    public void i(Exception exc) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
    }
}
