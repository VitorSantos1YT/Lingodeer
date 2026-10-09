package com.google.firebase.sessions;

import android.os.Build;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import dt.Xk.wuoM;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AutoSessionEventEncoder implements Configurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoSessionEventEncoder f20816a = new AutoSessionEventEncoder();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AndroidApplicationInfoEncoder implements ObjectEncoder<AndroidApplicationInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AndroidApplicationInfoEncoder f20817a = new AndroidApplicationInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20818b = FieldDescriptor.a("packageName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20819c = FieldDescriptor.a("versionName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f20820d = FieldDescriptor.a("appBuildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20821e = FieldDescriptor.a(wuoM.XthTWyFePfEsej);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f20822f = FieldDescriptor.a("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f20823g = FieldDescriptor.a("appProcessDetails");

        private AndroidApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f20818b, androidApplicationInfo.f20808a);
            objectEncoderContext.g(f20819c, androidApplicationInfo.f20809b);
            objectEncoderContext.g(f20820d, androidApplicationInfo.f20810c);
            objectEncoderContext.g(f20821e, Build.MANUFACTURER);
            objectEncoderContext.g(f20822f, androidApplicationInfo.f20811d);
            objectEncoderContext.g(f20823g, androidApplicationInfo.f20812e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ApplicationInfoEncoder implements ObjectEncoder<ApplicationInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApplicationInfoEncoder f20824a = new ApplicationInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20825b = FieldDescriptor.a("appId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20826c = FieldDescriptor.a("deviceModel");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f20827d = FieldDescriptor.a("sessionSdkVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20828e = FieldDescriptor.a("osVersion");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f20829f = FieldDescriptor.a("logEnvironment");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f20830g = FieldDescriptor.a("androidAppInfo");

        private ApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ApplicationInfo applicationInfo = (ApplicationInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f20825b, applicationInfo.f20813a);
            objectEncoderContext.g(f20826c, Build.MODEL);
            objectEncoderContext.g(f20827d, "3.0.6");
            objectEncoderContext.g(f20828e, Build.VERSION.RELEASE);
            objectEncoderContext.g(f20829f, applicationInfo.f20814b);
            objectEncoderContext.g(f20830g, applicationInfo.f20815c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DataCollectionStatusEncoder implements ObjectEncoder<DataCollectionStatus> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DataCollectionStatusEncoder f20831a = new DataCollectionStatusEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20832b = FieldDescriptor.a("performance");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20833c = FieldDescriptor.a("crashlytics");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f20834d = FieldDescriptor.a("sessionSamplingRate");

        private DataCollectionStatusEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f20832b, dataCollectionStatus.f20880a);
            objectEncoderContext.g(f20833c, dataCollectionStatus.f20881b);
            objectEncoderContext.d(f20834d, dataCollectionStatus.f20882c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ProcessDetailsEncoder implements ObjectEncoder<ProcessDetails> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProcessDetailsEncoder f20835a = new ProcessDetailsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20836b = FieldDescriptor.a("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20837c = FieldDescriptor.a(OCBJEWZHh.NpxAIdvDZibD);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f20838d = FieldDescriptor.a("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20839e = FieldDescriptor.a("defaultProcess");

        private ProcessDetailsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ProcessDetails processDetails = (ProcessDetails) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f20836b, processDetails.f20923a);
            objectEncoderContext.c(f20837c, processDetails.f20924b);
            objectEncoderContext.c(f20838d, processDetails.f20925c);
            objectEncoderContext.a(f20839e, processDetails.f20926d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SessionEventEncoder implements ObjectEncoder<SessionEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SessionEventEncoder f20840a = new SessionEventEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20841b = FieldDescriptor.a("eventType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20842c = FieldDescriptor.a("sessionData");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f20843d = FieldDescriptor.a("applicationInfo");

        private SessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            SessionEvent sessionEvent = (SessionEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f20841b, sessionEvent.f20940a);
            objectEncoderContext.g(f20842c, sessionEvent.f20941b);
            objectEncoderContext.g(f20843d, sessionEvent.f20942c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SessionInfoEncoder implements ObjectEncoder<SessionInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SessionInfoEncoder f20844a = new SessionInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20845b = FieldDescriptor.a("sessionId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20846c = FieldDescriptor.a("firstSessionId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f20847d = FieldDescriptor.a("sessionIndex");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20848e = FieldDescriptor.a("eventTimestampUs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f20849f = FieldDescriptor.a("dataCollectionStatus");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f20850g = FieldDescriptor.a("firebaseInstallationId");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f20851h = FieldDescriptor.a("firebaseAuthenticationToken");

        private SessionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            SessionInfo sessionInfo = (SessionInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f20845b, sessionInfo.f20971a);
            objectEncoderContext.g(f20846c, sessionInfo.f20972b);
            objectEncoderContext.c(f20847d, sessionInfo.f20973c);
            objectEncoderContext.b(f20848e, sessionInfo.f20974d);
            objectEncoderContext.g(f20849f, sessionInfo.f20975e);
            objectEncoderContext.g(f20850g, sessionInfo.f20976f);
            objectEncoderContext.g(f20851h, sessionInfo.f20977g);
        }
    }

    private AutoSessionEventEncoder() {
    }
}
