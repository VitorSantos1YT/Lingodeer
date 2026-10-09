package lf;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40042a;

    public /* synthetic */ j0(int i11) {
        this.f40042a = i11;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String filename) {
        switch (this.f40042a) {
            case 0:
                kotlin.jvm.internal.m.e(filename, "filename");
                return !oz.x.s0(filename, "buffer", false);
            case 1:
                kotlin.jvm.internal.m.e(filename, "filename");
                return oz.x.s0(filename, "buffer", false);
            case 2:
                return Pattern.matches("cpu[0-9]+", filename);
            case 3:
                Charset charset = CrashlyticsReportPersistence.f18871e;
                return filename.startsWith("event");
            case 4:
                Charset charset2 = CrashlyticsReportPersistence.f18871e;
                return filename.startsWith("event") && !filename.endsWith("_");
            case 5:
                kotlin.jvm.internal.m.e(filename, "name");
                Pattern patternCompile = Pattern.compile(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3)));
                kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                return patternCompile.matcher(filename).matches();
            case 6:
                kotlin.jvm.internal.m.e(filename, "name");
                Pattern patternCompile2 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1)));
                kotlin.jvm.internal.m.e(patternCompile2, "compile(...)");
                return patternCompile2.matcher(filename).matches();
            case 7:
                kotlin.jvm.internal.m.e(filename, "name");
                Pattern patternCompile3 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1)));
                kotlin.jvm.internal.m.e(patternCompile3, "compile(...)");
                return patternCompile3.matcher(filename).matches();
            default:
                kotlin.jvm.internal.m.e(filename, "name");
                Pattern patternCompile4 = Pattern.compile(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1)));
                kotlin.jvm.internal.m.e(patternCompile4, "compile(...)");
                return patternCompile4.matcher(filename).matches();
        }
    }
}
