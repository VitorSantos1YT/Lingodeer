package b2;

import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.RenderNode;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.tbruyelle.rxpermissions3.BuildConfig;
import g2.s;
import g3.n;
import g3.t;
import g3.u;
import g3.x;
import hh.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import mt.b6;
import n3.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(i iVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        u uVar;
        t tVar;
        fz.c cVar;
        int size = longSparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            long jKeyAt = longSparseArray.keyAt(i11);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (uVar = (u) iVar.d().b((int) jKeyAt)) != null && (tVar = uVar.f28703a) != null) {
                Object objG = tVar.f28699d.f28691a.g(n.f28677l);
                if (objG == null) {
                    objG = null;
                }
                g3.a aVar = (g3.a) objG;
                if (aVar != null && (cVar = (fz.c) aVar.f28635b) != null) {
                }
            }
        }
    }

    public static h7.h b(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z11) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return h7.h.f31871d;
        }
        h7.g gVar = new h7.g();
        boolean z12 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
        gVar.f31868a = true;
        gVar.f31869b = z12;
        gVar.f31870c = z11;
        return gVar.a();
    }

    public static int c(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        int i11 = SystemJobService.f2804e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static void d(i iVar, long[] jArr, Consumer consumer) {
        t tVar;
        String strA;
        for (long j11 : jArr) {
            u uVar = (u) iVar.d().b((int) j11);
            if (uVar != null && (tVar = uVar.f28703a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(iVar.f3865a.getAutofillId(), tVar.f28702g);
                Object objG = tVar.f28699d.f28691a.g(x.B);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strA = x3.a.a(list, "\n", null, 62)) != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new j3.h(strA)));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static void e(AudioTrack audioTrack, g7.j jVar) {
        LogSessionId logSessionIdA = jVar.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdA);
    }

    public static void f(oi.c cVar, g7.j jVar) {
        LogSessionId logSessionIdA = jVar.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ((MediaFormat) cVar.f44926b).setString("log-session-id", logSessionIdA.getStringId());
    }

    public static void g(RenderNode renderNode, s sVar) {
        renderNode.setRenderEffect(sVar != null ? sVar.a() : null);
    }

    public static void h(View view, s sVar) {
        view.setRenderEffect(sVar != null ? sVar.a() : null);
    }

    public static final String i(r rVar, Context context) {
        ArrayList arrayList = rVar.f43172a;
        v3.e eVarA = com.bumptech.glide.e.a(context);
        int i11 = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i11 == 0) {
            return x3.a.a(arrayList, null, new b6(eVarA), 31);
        }
        if (arrayList.size() > 0) {
            throw p0.e(0, arrayList);
        }
        float fK = hz.b.k(i11 + 400.0f, 1.0f, 1000.0f);
        return (!arrayList.isEmpty() ? "," : BuildConfig.VERSION_NAME) + "'wght' " + fK;
    }
}
