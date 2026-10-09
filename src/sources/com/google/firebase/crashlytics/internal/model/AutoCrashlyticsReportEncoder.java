package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import dt.Xk.wuoM;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AutoCrashlyticsReportEncoder implements Configurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoCrashlyticsReportEncoder f18449a = new AutoCrashlyticsReportEncoder();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder f18450a = new CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18451b = FieldDescriptor.a("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18452c = FieldDescriptor.a("libraryName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18453d = FieldDescriptor.a("buildId");

        private CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18451b, buildIdMappingForArch.b());
            objectEncoderContext.g(f18452c, buildIdMappingForArch.d());
            objectEncoderContext.g(f18453d, buildIdMappingForArch.c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportApplicationExitInfoEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportApplicationExitInfoEncoder f18454a = new CrashlyticsReportApplicationExitInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18455b = FieldDescriptor.a("pid");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18456c = FieldDescriptor.a("processName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18457d = FieldDescriptor.a("reasonCode");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18458e = FieldDescriptor.a("importance");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18459f = FieldDescriptor.a("pss");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f18460g = FieldDescriptor.a("rss");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f18461h = FieldDescriptor.a("timestamp");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f18462i = FieldDescriptor.a("traceFile");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f18463j = FieldDescriptor.a("buildIdMappingForArch");

        private CrashlyticsReportApplicationExitInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.c(f18455b, applicationExitInfo.d());
            objectEncoderContext.g(f18456c, applicationExitInfo.e());
            objectEncoderContext.c(f18457d, applicationExitInfo.g());
            objectEncoderContext.c(f18458e, applicationExitInfo.c());
            objectEncoderContext.b(f18459f, applicationExitInfo.f());
            objectEncoderContext.b(f18460g, applicationExitInfo.h());
            objectEncoderContext.b(f18461h, applicationExitInfo.i());
            objectEncoderContext.g(f18462i, applicationExitInfo.j());
            objectEncoderContext.g(f18463j, applicationExitInfo.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportCustomAttributeEncoder implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportCustomAttributeEncoder f18464a = new CrashlyticsReportCustomAttributeEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18465b = FieldDescriptor.a("key");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18466c = FieldDescriptor.a("value");

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18465b, customAttribute.b());
            objectEncoderContext.g(f18466c, customAttribute.c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportEncoder implements ObjectEncoder<CrashlyticsReport> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportEncoder f18467a = new CrashlyticsReportEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18468b = FieldDescriptor.a("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18469c = FieldDescriptor.a("gmpAppId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18470d = FieldDescriptor.a("platform");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18471e = FieldDescriptor.a("installationUuid");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18472f = FieldDescriptor.a("firebaseInstallationId");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f18473g = FieldDescriptor.a("firebaseAuthenticationToken");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f18474h = FieldDescriptor.a("appQualitySessionId");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f18475i = FieldDescriptor.a("buildVersion");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f18476j = FieldDescriptor.a("displayVersion");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final FieldDescriptor f18477k = FieldDescriptor.a("session");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f18478l = FieldDescriptor.a("ndkPayload");
        public static final FieldDescriptor m = FieldDescriptor.a("appExitInfo");

        private CrashlyticsReportEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18468b, crashlyticsReport.l());
            objectEncoderContext.g(f18469c, crashlyticsReport.h());
            objectEncoderContext.c(f18470d, crashlyticsReport.k());
            objectEncoderContext.g(f18471e, crashlyticsReport.i());
            objectEncoderContext.g(f18472f, crashlyticsReport.g());
            objectEncoderContext.g(f18473g, crashlyticsReport.f());
            objectEncoderContext.g(f18474h, crashlyticsReport.c());
            objectEncoderContext.g(f18475i, crashlyticsReport.d());
            objectEncoderContext.g(f18476j, crashlyticsReport.e());
            objectEncoderContext.g(f18477k, crashlyticsReport.m());
            objectEncoderContext.g(f18478l, crashlyticsReport.j());
            objectEncoderContext.g(m, crashlyticsReport.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportFilesPayloadEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportFilesPayloadEncoder f18479a = new CrashlyticsReportFilesPayloadEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18480b = FieldDescriptor.a("files");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18481c = FieldDescriptor.a("orgId");

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18480b, filesPayload.b());
            objectEncoderContext.g(f18481c, filesPayload.c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportFilesPayloadFileEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportFilesPayloadFileEncoder f18482a = new CrashlyticsReportFilesPayloadFileEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18483b = FieldDescriptor.a("filename");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18484c = FieldDescriptor.a("contents");

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18483b, file.c());
            objectEncoderContext.g(f18484c, file.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionApplicationEncoder f18485a = new CrashlyticsReportSessionApplicationEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18486b = FieldDescriptor.a("identifier");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18487c = FieldDescriptor.a("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18488d = FieldDescriptor.a("displayVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18489e = FieldDescriptor.a("organization");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18490f = FieldDescriptor.a("installationUuid");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f18491g = FieldDescriptor.a("developmentPlatform");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f18492h = FieldDescriptor.a("developmentPlatformVersion");

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18486b, application.e());
            objectEncoderContext.g(f18487c, application.h());
            objectEncoderContext.g(f18488d, application.d());
            objectEncoderContext.g(f18489e, application.g());
            objectEncoderContext.g(f18490f, application.f());
            objectEncoderContext.g(f18491g, application.b());
            objectEncoderContext.g(f18492h, application.c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionApplicationOrganizationEncoder f18493a = new CrashlyticsReportSessionApplicationOrganizationEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18494b = FieldDescriptor.a("clsId");

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((CrashlyticsReport.Session.Application.Organization) obj).getClass();
            ((ObjectEncoderContext) obj2).g(f18494b, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Device> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionDeviceEncoder f18495a = new CrashlyticsReportSessionDeviceEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18496b = FieldDescriptor.a("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18497c = FieldDescriptor.a("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18498d = FieldDescriptor.a("cores");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18499e = FieldDescriptor.a("ram");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18500f = FieldDescriptor.a("diskSpace");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f18501g = FieldDescriptor.a("simulator");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f18502h = FieldDescriptor.a("state");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f18503i = FieldDescriptor.a("manufacturer");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f18504j = FieldDescriptor.a("modelClass");

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.c(f18496b, device.b());
            objectEncoderContext.g(f18497c, device.f());
            objectEncoderContext.c(f18498d, device.c());
            objectEncoderContext.b(f18499e, device.h());
            objectEncoderContext.b(f18500f, device.d());
            objectEncoderContext.a(f18501g, device.j());
            objectEncoderContext.c(f18502h, device.i());
            objectEncoderContext.g(f18503i, device.e());
            objectEncoderContext.g(f18504j, device.g());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEncoder implements ObjectEncoder<CrashlyticsReport.Session> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEncoder f18505a = new CrashlyticsReportSessionEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18506b = FieldDescriptor.a("generator");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18507c = FieldDescriptor.a("identifier");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18508d = FieldDescriptor.a("appQualitySessionId");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18509e = FieldDescriptor.a(wuoM.mkF);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18510f = FieldDescriptor.a("endedAt");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f18511g = FieldDescriptor.a("crashed");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f18512h = FieldDescriptor.a("app");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f18513i = FieldDescriptor.a("user");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f18514j = FieldDescriptor.a("os");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final FieldDescriptor f18515k = FieldDescriptor.a("device");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f18516l = FieldDescriptor.a("events");
        public static final FieldDescriptor m = FieldDescriptor.a("generatorType");

        private CrashlyticsReportSessionEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18506b, session.g());
            objectEncoderContext.g(f18507c, session.i().getBytes(CrashlyticsReport.f18863a));
            objectEncoderContext.g(f18508d, session.c());
            objectEncoderContext.b(f18509e, session.k());
            objectEncoderContext.g(f18510f, session.e());
            objectEncoderContext.a(f18511g, session.m());
            objectEncoderContext.g(f18512h, session.b());
            objectEncoderContext.g(f18513i, session.l());
            objectEncoderContext.g(f18514j, session.j());
            objectEncoderContext.g(f18515k, session.d());
            objectEncoderContext.g(f18516l, session.f());
            objectEncoderContext.c(m, session.h());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationEncoder f18517a = new CrashlyticsReportSessionEventApplicationEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18518b = FieldDescriptor.a("execution");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18519c = FieldDescriptor.a("customAttributes");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18520d = FieldDescriptor.a("internalKeys");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18521e = FieldDescriptor.a("background");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18522f = FieldDescriptor.a("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f18523g = FieldDescriptor.a("appProcessDetails");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f18524h = FieldDescriptor.a("uiOrientation");

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18518b, application.f());
            objectEncoderContext.g(f18519c, application.e());
            objectEncoderContext.g(f18520d, application.g());
            objectEncoderContext.g(f18521e, application.c());
            objectEncoderContext.g(f18522f, application.d());
            objectEncoderContext.g(f18523g, application.b());
            objectEncoderContext.c(f18524h, application.h());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder f18525a = new CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18526b = FieldDescriptor.a("baseAddress");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18527c = FieldDescriptor.a("size");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18528d = FieldDescriptor.a("name");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18529e = FieldDescriptor.a("uuid");

        private CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f18526b, binaryImage.b());
            objectEncoderContext.b(f18527c, binaryImage.d());
            objectEncoderContext.g(f18528d, binaryImage.c());
            String strE = binaryImage.e();
            objectEncoderContext.g(f18529e, strE != null ? strE.getBytes(CrashlyticsReport.f18863a) : null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionEncoder f18530a = new CrashlyticsReportSessionEventApplicationExecutionEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18531b = FieldDescriptor.a("threads");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18532c = FieldDescriptor.a("exception");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18533d = FieldDescriptor.a("appExitInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18534e = FieldDescriptor.a("signal");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18535f = FieldDescriptor.a("binaries");

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18531b, execution.f());
            objectEncoderContext.g(f18532c, execution.d());
            objectEncoderContext.g(f18533d, execution.b());
            objectEncoderContext.g(f18534e, execution.e());
            objectEncoderContext.g(f18535f, execution.c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder f18536a = new CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18537b = FieldDescriptor.a("type");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18538c = FieldDescriptor.a("reason");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18539d = FieldDescriptor.a("frames");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18540e = FieldDescriptor.a("causedBy");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18541f = FieldDescriptor.a("overflowCount");

        private CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Exception exception = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18537b, exception.f());
            objectEncoderContext.g(f18538c, exception.e());
            objectEncoderContext.g(f18539d, exception.c());
            objectEncoderContext.g(f18540e, exception.b());
            objectEncoderContext.c(f18541f, exception.d());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder f18542a = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18543b = FieldDescriptor.a("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18544c = FieldDescriptor.a("code");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18545d = FieldDescriptor.a("address");

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18543b, signal.d());
            objectEncoderContext.g(f18544c, signal.c());
            objectEncoderContext.b(f18545d, signal.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder f18546a = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18547b = FieldDescriptor.a("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18548c = FieldDescriptor.a("importance");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18549d = FieldDescriptor.a("frames");

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18547b, thread.d());
            objectEncoderContext.c(f18548c, thread.c());
            objectEncoderContext.g(f18549d, thread.b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder f18550a = new CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18551b = FieldDescriptor.a("pc");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18552c = FieldDescriptor.a("symbol");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18553d = FieldDescriptor.a("file");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18554e = FieldDescriptor.a("offset");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18555f = FieldDescriptor.a("importance");

        private CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f18551b, frame.e());
            objectEncoderContext.g(f18552c, frame.f());
            objectEncoderContext.g(f18553d, frame.b());
            objectEncoderContext.b(f18554e, frame.d());
            objectEncoderContext.c(f18555f, frame.c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventApplicationProcessDetailsEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.ProcessDetails> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationProcessDetailsEncoder f18556a = new CrashlyticsReportSessionEventApplicationProcessDetailsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18557b = FieldDescriptor.a("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18558c = FieldDescriptor.a("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18559d = FieldDescriptor.a("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18560e = FieldDescriptor.a("defaultProcess");

        private CrashlyticsReportSessionEventApplicationProcessDetailsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18557b, processDetails.d());
            objectEncoderContext.c(f18558c, processDetails.c());
            objectEncoderContext.c(f18559d, processDetails.b());
            objectEncoderContext.a(f18560e, processDetails.e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventDeviceEncoder f18561a = new CrashlyticsReportSessionEventDeviceEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18562b = FieldDescriptor.a("batteryLevel");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18563c = FieldDescriptor.a("batteryVelocity");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18564d = FieldDescriptor.a("proximityOn");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18565e = FieldDescriptor.a("orientation");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18566f = FieldDescriptor.a("ramUsed");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f18567g = FieldDescriptor.a("diskUsed");

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18562b, device.b());
            objectEncoderContext.c(f18563c, device.c());
            objectEncoderContext.a(f18564d, device.g());
            objectEncoderContext.c(f18565e, device.e());
            objectEncoderContext.b(f18566f, device.f());
            objectEncoderContext.b(f18567g, device.d());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventEncoder f18568a = new CrashlyticsReportSessionEventEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18569b = FieldDescriptor.a("timestamp");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18570c = FieldDescriptor.a("type");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18571d = FieldDescriptor.a("app");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18572e = FieldDescriptor.a("device");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f18573f = FieldDescriptor.a("log");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f18574g = FieldDescriptor.a("rollouts");

        private CrashlyticsReportSessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f18569b, event.f());
            objectEncoderContext.g(f18570c, event.g());
            objectEncoderContext.g(f18571d, event.b());
            objectEncoderContext.g(f18572e, event.c());
            objectEncoderContext.g(f18573f, event.d());
            objectEncoderContext.g(f18574g, event.e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventLogEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventLogEncoder f18575a = new CrashlyticsReportSessionEventLogEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18576b = FieldDescriptor.a("content");

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).g(f18576b, ((CrashlyticsReport.Session.Event.Log) obj).b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventRolloutAssignmentEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutAssignmentEncoder f18577a = new CrashlyticsReportSessionEventRolloutAssignmentEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18578b = FieldDescriptor.a("rolloutVariant");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18579c = FieldDescriptor.a("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18580d = FieldDescriptor.a("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18581e = FieldDescriptor.a("templateVersion");

        private CrashlyticsReportSessionEventRolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18578b, rolloutAssignment.d());
            objectEncoderContext.g(f18579c, rolloutAssignment.b());
            objectEncoderContext.g(f18580d, rolloutAssignment.c());
            objectEncoderContext.b(f18581e, rolloutAssignment.e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder f18582a = new CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18583b = FieldDescriptor.a("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18584c = FieldDescriptor.a("variantId");

        private CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.g(f18583b, rolloutVariant.b());
            objectEncoderContext.g(f18584c, rolloutVariant.c());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionEventRolloutsStateEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutsState> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutsStateEncoder f18585a = new CrashlyticsReportSessionEventRolloutsStateEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18586b = FieldDescriptor.a("assignments");

        private CrashlyticsReportSessionEventRolloutsStateEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).g(f18586b, ((CrashlyticsReport.Session.Event.RolloutsState) obj).b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionOperatingSystemEncoder implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionOperatingSystemEncoder f18587a = new CrashlyticsReportSessionOperatingSystemEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18588b = FieldDescriptor.a("platform");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f18589c = FieldDescriptor.a("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f18590d = FieldDescriptor.a("buildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f18591e = FieldDescriptor.a("jailbroken");

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.c(f18588b, operatingSystem.c());
            objectEncoderContext.g(f18589c, operatingSystem.d());
            objectEncoderContext.g(f18590d, operatingSystem.b());
            objectEncoderContext.a(f18591e, operatingSystem.e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CrashlyticsReportSessionUserEncoder implements ObjectEncoder<CrashlyticsReport.Session.User> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionUserEncoder f18592a = new CrashlyticsReportSessionUserEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f18593b = FieldDescriptor.a("identifier");

        private CrashlyticsReportSessionUserEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).g(f18593b, ((CrashlyticsReport.Session.User) obj).b());
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    public final void a(EncoderConfig encoderConfig) {
        CrashlyticsReportEncoder crashlyticsReportEncoder = CrashlyticsReportEncoder.f18467a;
        JsonDataEncoderBuilder jsonDataEncoderBuilder = (JsonDataEncoderBuilder) encoderConfig;
        jsonDataEncoderBuilder.b(CrashlyticsReport.class, crashlyticsReportEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport.class, crashlyticsReportEncoder);
        CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = CrashlyticsReportSessionEncoder.f18505a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.class, crashlyticsReportSessionEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session.class, crashlyticsReportSessionEncoder);
        CrashlyticsReportSessionApplicationEncoder crashlyticsReportSessionApplicationEncoder = CrashlyticsReportSessionApplicationEncoder.f18485a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Application.class, crashlyticsReportSessionApplicationEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Application.class, crashlyticsReportSessionApplicationEncoder);
        CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = CrashlyticsReportSessionApplicationOrganizationEncoder.f18493a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Application.Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Application_Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder = CrashlyticsReportSessionUserEncoder.f18592a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.User.class, crashlyticsReportSessionUserEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_User.class, crashlyticsReportSessionUserEncoder);
        CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = CrashlyticsReportSessionOperatingSystemEncoder.f18587a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder = CrashlyticsReportSessionDeviceEncoder.f18495a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Device.class, crashlyticsReportSessionDeviceEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Device.class, crashlyticsReportSessionDeviceEncoder);
        CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = CrashlyticsReportSessionEventEncoder.f18568a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.class, crashlyticsReportSessionEventEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event.class, crashlyticsReportSessionEventEncoder);
        CrashlyticsReportSessionEventApplicationEncoder crashlyticsReportSessionEventApplicationEncoder = CrashlyticsReportSessionEventApplicationEncoder.f18517a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.class, crashlyticsReportSessionEventApplicationEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application.class, crashlyticsReportSessionEventApplicationEncoder);
        CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = CrashlyticsReportSessionEventApplicationExecutionEncoder.f18530a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.f18546a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.f18550a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder crashlyticsReportSessionEventApplicationExecutionExceptionEncoder = CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.f18536a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        CrashlyticsReportApplicationExitInfoEncoder crashlyticsReportApplicationExitInfoEncoder = CrashlyticsReportApplicationExitInfoEncoder.f18454a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder = CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.f18450a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.f18542a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder = CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.f18525a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        CrashlyticsReportCustomAttributeEncoder crashlyticsReportCustomAttributeEncoder = CrashlyticsReportCustomAttributeEncoder.f18464a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        CrashlyticsReportSessionEventApplicationProcessDetailsEncoder crashlyticsReportSessionEventApplicationProcessDetailsEncoder = CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.f18556a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        CrashlyticsReportSessionEventDeviceEncoder crashlyticsReportSessionEventDeviceEncoder = CrashlyticsReportSessionEventDeviceEncoder.f18561a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Device.class, crashlyticsReportSessionEventDeviceEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Device.class, crashlyticsReportSessionEventDeviceEncoder);
        CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = CrashlyticsReportSessionEventLogEncoder.f18575a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Log.class, crashlyticsReportSessionEventLogEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Log.class, crashlyticsReportSessionEventLogEncoder);
        CrashlyticsReportSessionEventRolloutsStateEncoder crashlyticsReportSessionEventRolloutsStateEncoder = CrashlyticsReportSessionEventRolloutsStateEncoder.f18585a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentEncoder crashlyticsReportSessionEventRolloutAssignmentEncoder = CrashlyticsReportSessionEventRolloutAssignmentEncoder.f18577a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder = CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.f18582a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = CrashlyticsReportFilesPayloadEncoder.f18479a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = CrashlyticsReportFilesPayloadFileEncoder.f18482a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.FilesPayload.File.class, crashlyticsReportFilesPayloadFileEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_FilesPayload_File.class, crashlyticsReportFilesPayloadFileEncoder);
    }
}
