package p20;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.glance.appwidget.protobuf.z;
import b7.f0;
import ce.g0;
import com.facebook.FacebookException;
import com.lingo.course.ui.CourseReviewListActivity;
import com.lingodeer.data.model.INTENTS;
import d7.g;
import f.h0;
import fc.f;
import ie.m;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import lf.h;
import m00.a0;
import m00.i;
import m00.l;
import m7.j;
import m7.k;
import m7.n;
import m7.t;
import oz.x;
import re.e;
import t7.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements yw.c, g0, f, z, p, m, l.b, k, qe.c, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46291a;

    public /* synthetic */ c(int i11) {
        this.f46291a = i11;
    }

    public static final void a(boolean z11) {
        if (!z11) {
            throw new FacebookException("Validation failed");
        }
    }

    public static final boolean b(a0 a0Var) {
        a0 a0Var2 = n00.e.f43069f;
        l lVarS = a0Var.f40674a;
        int iM = l.m(lVarS, n00.c.f43061a);
        if (iM == -1) {
            iM = l.m(a0Var.f40674a, n00.c.f43062b);
        }
        if (iM != -1) {
            lVarS = l.s(lVarS, iM + 1, 0, 2);
        } else if (a0Var.g() != null && lVarS.e() == 2) {
            lVarS = l.f40723d;
        }
        return !x.k0(lVarS.v(), ".class", true);
    }

    public static h0 g(int i11, int i12) {
        return new h0(i11, i12, 0, f.g0.f26146b);
    }

    public static MediaCodec l(oi.c cVar) throws IOException {
        String str = ((n) cVar.f44925a).f40984a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static a0 m(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        l lVar = n00.c.f43061a;
        i iVar = new i();
        iVar.Y(str);
        return n00.c.d(iVar, false);
    }

    public static a0 n(File file) {
        String str = a0.f40673b;
        String string = file.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return m(string);
    }

    public static Intent p(Context context, int i11, boolean z11) {
        Intent intent = new Intent(context, (Class<?>) CourseReviewListActivity.class);
        intent.putExtra(INTENTS.EXTRA_INT, i11);
        intent.putExtra(INTENTS.EXTRA_BOOLEAN, z11);
        return intent;
    }

    public static Intent q(Context context, int i11) {
        Intent intent = new Intent(context, (Class<?>) CourseReviewListActivity.class);
        intent.putExtra(INTENTS.EXTRA_INT, i11);
        intent.putExtra("extra_load_note", true);
        return intent;
    }

    @Override // re.e
    public String c() {
        return "ig_refresh_token";
    }

    @Override // fc.f
    public boolean d() {
        return true;
    }

    @Override // t7.p
    public Object e(Uri uri, g gVar) {
        return Long.valueOf(f0.N(new BufferedReader(new InputStreamReader(gVar)).readLine()));
    }

    @Override // re.e
    public String f() {
        return "refresh_access_token";
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // m7.k
    public m7.l h(oi.c cVar) throws Throwable {
        MediaCodec mediaCodecL = null;
        try {
            mediaCodecL = l(cVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) cVar.f44928d;
            mediaCodecL.configure((MediaFormat) cVar.f44926b, surface, (MediaCrypto) cVar.f44929e, (surface == null && ((n) cVar.f44925a).f40991h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecL.start();
            Trace.endSection();
            return new t(mediaCodecL, (j) cVar.f44930f);
        } catch (IOException e8) {
            e = e8;
            if (mediaCodecL != null) {
                mediaCodecL.release();
            }
            throw e;
        } catch (RuntimeException e10) {
            e = e10;
            if (mediaCodecL != null) {
                mediaCodecL.release();
            }
            throw e;
        }
    }

    @Override // ce.g0
    public void i(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // ce.g0
    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    public pl.d o() {
        pl.d dVar;
        pl.d dVar2 = pl.d.f46952c;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this) {
            dVar = pl.d.f46952c;
            if (dVar == null) {
                dVar = new pl.d();
                pl.d.f46952c = dVar;
            }
        }
        return dVar;
    }

    public synchronized void r(int i11, h hVar) {
        HashMap map = lf.j.f40040c;
        if (map.containsKey(Integer.valueOf(i11))) {
            return;
        }
        map.put(Integer.valueOf(i11), hVar);
    }

    public String toString() {
        switch (this.f46291a) {
            case 2:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    public c() {
        this.f46291a = 9;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override // fc.f
    public void shutdown() {
    }

    @Override // yw.c
    public Object apply(Object obj) {
        return obj;
    }

    @Override // qe.c
    public void j(Object obj) {
    }
}
