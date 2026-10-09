package hd;

import a0.b2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import b0.u;
import b7.e0;
import b7.f0;
import cf.x;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.OSSResult;
import com.alibaba.sdk.android.oss.model.PutObjectResult;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.api.Service;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.ui.base.PicTestIndexActivity;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import ec.g;
import f0.n1;
import f7.i1;
import fi.k;
import fr.j3;
import gr.s;
import h9.k0;
import hh.c0;
import hh.h0;
import hh.j0;
import hj.i4;
import hj.j4;
import hj.r3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import jp.i;
import jp.p0;
import jp.z;
import kotlin.jvm.internal.m;
import nv.p;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import qx.o;
import r.q2;
import ry.l;
import td.h;
import th.e;
import th.j;
import xx.f;
import y6.d0;
import z3.y;
import zd.q;
import zd.r;
import zd.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements r, tx.c, h, com.bumptech.glide.b, y, g, g0.b, OSSCompletedCallback, k0, th.c, q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32184b;

    public /* synthetic */ b(b2 b2Var) {
        this.f32183a = 6;
        this.f32184b = (zzbt) b2Var.f27b;
    }

    public static String l(String str, a aVar, boolean z11) {
        String str2 = z11 ? ".temp" + aVar.extension : aVar.extension;
        String strReplaceAll = str.replaceAll("\\W+", BuildConfig.VERSION_NAME);
        int length = 242 - str2.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b3 : bArrDigest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b3)));
                }
                strReplaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return ep.a.g("lottie_cache_", strReplaceAll, str2);
    }

    @Override // th.c, th.b
    public void a() {
        z zVar = (z) this.f32184b;
        e eVar = zVar.O;
        if (eVar == null) {
            m.n("exoAudioPlayer");
            throw null;
        }
        i1 i1Var = eVar.f52415b;
        m.c(i1Var);
        i1Var.l0(5, 0L);
        e eVar2 = zVar.O;
        if (eVar2 == null) {
            m.n("exoAudioPlayer");
            throw null;
        }
        i1 i1Var2 = eVar2.f52415b;
        m.c(i1Var2);
        i1Var2.r(false);
        e eVar3 = zVar.O;
        if (eVar3 == null) {
            m.n("exoAudioPlayer");
            throw null;
        }
        eVar3.g();
        ta.a aVar = zVar.f36400f;
        m.c(aVar);
        ((r3) aVar).f33215d.setImageResource(R.drawable.ic_audiolesson_ctrl_play);
        ta.a aVar2 = zVar.f36400f;
        m.c(aVar2);
        Drawable background = ((ImageView) ((r3) aVar2).f33214c.f32408d).getBackground();
        m.e(background, "getBackground(...)");
        if (background instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) background;
            animationDrawable.selectDrawable(0);
            animationDrawable.stop();
        }
        f fVar = zVar.P;
        if (fVar != null) {
            ux.b.a(fVar);
        }
        yx.d dVarM = new yx.a(new hh.c(zVar, 4), 0).M(ky.e.f38937b);
        o oVarA = px.b.a();
        xx.d dVar = new xx.d(jp.h.f36478e, new nf.f(2));
        try {
            dVarM.K(new yx.b(dVar, oVarA));
            j.a(dVar, zVar.f36401t);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0200  */
    @Override // tx.c
    public void accept(Object obj) {
        long j11;
        hi.a aVarU;
        List listK;
        Collection collectionT;
        int i11 = this.f32183a;
        int i12 = 1;
        Object obj2 = this.f32184b;
        switch (i11) {
            case 4:
                PicTestIndexActivity picTestIndexActivity = (PicTestIndexActivity) obj2;
                com.bumptech.glide.c.c(picTestIndexActivity).b();
                String string = picTestIndexActivity.getString(R.string.success);
                m.e(string, "getString(...)");
                ff.h.C(string);
                break;
            case 12:
                Long it = (Long) obj;
                m.f(it, "it");
                ((k) obj2).f27316e.o();
                break;
            case 17:
                Long it2 = (Long) obj;
                m.f(it2, "it");
                c0 c0Var = (c0) obj2;
                ta.a aVar = c0Var.f36400f;
                m.c(aVar);
                ((i4) aVar).f32704b.setEnabled(true);
                if (c0Var.T.get()) {
                    c0.y(c0Var);
                }
                break;
            case 18:
                Long it3 = (Long) obj;
                m.f(it3, "it");
                j0 j0Var = (j0) obj2;
                ta.a aVar2 = j0Var.f36400f;
                m.c(aVar2);
                LinearLayout linearLayout = ((j4) aVar2).f32774k;
                ta.a aVar3 = j0Var.f36400f;
                m.c(aVar3);
                View childAt = linearLayout.getChildAt(((j4) aVar3).f32774k.getChildCount() - 1);
                int height = childAt.getHeight() + ((int) childAt.getY());
                ta.a aVar4 = j0Var.f36400f;
                m.c(aVar4);
                float height2 = height - ((j4) aVar4).f32775l.getHeight();
                Context contextRequireContext = j0Var.requireContext();
                m.e(contextRequireContext, "requireContext(...)");
                int iZ = (int) (j3.Z(162, contextRequireContext) + height2);
                ta.a aVar5 = j0Var.f36400f;
                m.c(aVar5);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((j4) aVar5).f32775l.getScrollY(), iZ);
                valueAnimatorOfInt.addUpdateListener(new h0(j0Var, i12));
                ta.a aVar6 = j0Var.f36400f;
                m.c(aVar6);
                if (((j4) aVar6).f32775l.getScrollY() != 0 || iZ > 0) {
                    ta.a aVar7 = j0Var.f36400f;
                    m.c(aVar7);
                    if (((j4) aVar7).f32775l.getScrollY() == iZ) {
                        j11 = 0;
                    } else {
                        j11 = 200;
                    }
                } else {
                    j11 = 0;
                }
                valueAnimatorOfInt.setDuration(j11);
                valueAnimatorOfInt.start();
                break;
            case 20:
                List list = (List) obj;
                m.c(list);
                ((s) obj2).invoke(list);
                break;
            case 22:
                Long it4 = (Long) obj;
                m.f(it4, "it");
                ta.a aVar8 = ((i) obj2).f47886f;
                m.c(aVar8);
                ((hj.a) aVar8).f32322e.performClick();
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Long it5 = (Long) obj;
                m.f(it5, "it");
                p0 p0Var = (p0) obj2;
                l.m mVar = p0Var.f36398d;
                if (mVar != null && !mVar.isDestroyed()) {
                    ta.a aVar9 = p0Var.f36400f;
                    m.c(aVar9);
                    mp.a aVar10 = (mp.a) p0Var.N;
                    if (aVar10 != null && (aVarU = aVar10.u()) != null) {
                        String strC = aVarU.c();
                        Matcher matcher = e0.u(0, ";", "compile(...)", strC, "input").matcher(strC);
                        if (matcher.find()) {
                            ArrayList arrayList = new ArrayList(10);
                            int iC = 0;
                            do {
                                iC = p.c(matcher, strC, iC, arrayList);
                            } while (matcher.find());
                            p.B(iC, strC, arrayList);
                            listK = arrayList;
                        } else {
                            listK = ns.o.K(strC.toString());
                        }
                        if (listK.isEmpty()) {
                            collectionT = ry.r.f50854a;
                        } else {
                            ListIterator listIterator = listK.listIterator(listK.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    collectionT = ry.r.f50854a;
                                } else if (((String) listIterator.previous()).length() != 0) {
                                    collectionT = e0.t(listIterator, 1, listK);
                                }
                            }
                        }
                        String[] strArr = (String[]) collectionT.toArray(new String[0]);
                        if (strArr.length == 3) {
                            if (aVarU.i() == 1 && l.D(new String[]{"5", "13", "1"}, strArr[2]) && !p0Var.Q) {
                                p0Var.K();
                            } else if (aVarU.i() == 0 && l.D(new String[]{"9"}, strArr[2]) && !p0Var.Q) {
                                p0Var.K();
                            } else {
                                Integer[] numArr = p0Var.f36536l0;
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                if (l.D(numArr, Integer.valueOf(x.n().keyLanguage))) {
                                    p0Var.K();
                                }
                            }
                        }
                        p0Var.V();
                        break;
                    }
                }
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                Long it6 = (Long) obj;
                m.f(it6, "it");
                oo.g gVar = (oo.g) obj2;
                if (!gVar.f45667l) {
                    gVar.d();
                    gVar.e();
                    break;
                }
                break;
            default:
                bq.p pVar = (bq.p) obj;
                BaseViewHolder baseViewHolder = (BaseViewHolder) obj2;
                int i13 = pVar == null ? -1 : kp.i.f38399a[pVar.ordinal()];
                if (i13 == 1) {
                    baseViewHolder.setImageResource(R.id.iv_bg, R.drawable.point_lesson_index_new_speak);
                    baseViewHolder.setImageResource(R.id.iv_start, R.drawable.ic_lesson_index_tips_start);
                    baseViewHolder.itemView.setEnabled(true);
                } else if (i13 == 2) {
                    baseViewHolder.setImageResource(R.id.iv_bg, R.drawable.point_lesson_index_new_speak);
                    baseViewHolder.setImageResource(R.id.iv_start, R.drawable.ic_lesson_index_tips_redo);
                    baseViewHolder.itemView.setEnabled(true);
                } else {
                    baseViewHolder.setImageResource(R.id.iv_bg, R.drawable.point_lesson_index_new_close);
                    baseViewHolder.setImageResource(R.id.iv_start, R.drawable.ic_lesson_index_lesson_start_grey_auto_mirrored);
                    baseViewHolder.itemView.setEnabled(false);
                }
                break;
        }
    }

    @Override // z3.y
    public long b(v3.k kVar, long j11, v3.m mVar, long j12) {
        long j13 = ((v3.j) ((fz.a) this.f32184b).invoke()).f53492a;
        return (((long) jh.h.a(kVar.f53494a + ((int) (j13 >> 32)), (int) (j12 >> 32), (int) (j11 >> 32), mVar == v3.m.Ltr)) << 32) | (((long) jh.h.a(kVar.f53495b + ((int) (j13 & 4294967295L)), (int) (j12 & 4294967295L), (int) (j11 & 4294967295L), true)) & 4294967295L);
    }

    @Override // com.bumptech.glide.b
    public le.g build() {
        le.g gVar = (le.g) this.f32184b;
        return gVar != null ? gVar : new le.g();
    }

    @Override // ec.g
    public void c(int i11) {
    }

    @Override // g0.b
    public Object d(n1 n1Var, Float f5, Float f11, fz.c cVar, g0.f fVar) {
        Object objA = g0.k.a(n1Var, f5.floatValue(), b0.e.b(CropImageView.DEFAULT_ASPECT_RATIO, f11.floatValue(), 28), (b0.x) this.f32184b, cVar, fVar);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : (g0.a) objA;
    }

    public void e(k7.c cVar) {
    }

    @Override // td.h
    public void f(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l9 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f32184b)) {
            ((ByteBuffer) this.f32184b).position(0);
            messageDigest.update(((ByteBuffer) this.f32184b).putLong(l9.longValue()).array());
        }
    }

    @Override // ec.g
    public void g(ec.a aVar, Bitmap bitmap, Map map) {
        ((com.android.billingclient.api.c0) this.f32184b).g(aVar, bitmap, map, z6.c.e(bitmap));
    }

    @Override // ec.g
    public ec.b h(ec.a aVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public String i(y6.p pVar) {
        String displayName;
        String str = pVar.f57282d;
        String str2 = pVar.f57280b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = BuildConfig.VERSION_NAME;
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = f0.f3975a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = BuildConfig.VERSION_NAME;
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strT = t(displayName, j(pVar));
        if (!TextUtils.isEmpty(strT)) {
            return strT;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = BuildConfig.VERSION_NAME;
        }
        return str2;
    }

    public String j(y6.p pVar) {
        Resources resources = (Resources) this.f32184b;
        int i11 = pVar.f57284f;
        int i12 = pVar.f57284f;
        String string = (i11 & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : BuildConfig.VERSION_NAME;
        if ((i12 & 4) != 0) {
            string = t(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i12 & 8) != 0) {
            string = t(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i12 & 1088) != 0 ? t(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public File m(String str) {
        File file = new File(w(), l(str, a.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(w(), l(str, a.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(w(), l(str, a.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public e7.a n() {
        return null;
    }

    public DrmSession$DrmSessionException o() {
        return (DrmSession$DrmSessionException) this.f32184b;
    }

    @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
    public void onFailure(OSSRequest oSSRequest, ClientException clientException, ServiceException serviceException) {
        String strN;
        if (clientException != null) {
            strN = ep.a.e("客户端错误: ", clientException.getMessage());
        } else {
            strN = serviceException != null ? defpackage.e.n("服务端错误: ", serviceException.getErrorCode(), " - ", serviceException.getMessage()) : "未知上传错误";
        }
        rz.m mVar = (rz.m) this.f32184b;
        Exception exc = clientException;
        if (clientException == null) {
            exc = serviceException;
        }
        mVar.resumeWith(new gv.b(strN, exc));
    }

    @Override // zd.r
    public q p(w wVar) {
        return new ae.c((Context) this.f32184b, 1);
    }

    public UUID q() {
        return y6.f.f57188a;
    }

    public int r() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public String s(y6.p pVar) {
        String strI;
        String string;
        Resources resources = (Resources) this.f32184b;
        String str = pVar.f57291n;
        int i11 = pVar.f57288j;
        int i12 = pVar.F;
        int i13 = pVar.f57299v;
        int i14 = pVar.f57298u;
        String str2 = pVar.f57289k;
        int i15 = d0.i(str);
        if (i15 == -1) {
            if (d0.j(str2) != null) {
                i15 = 2;
            } else if (d0.c(str2) != null) {
                i15 = 1;
            } else if (i14 != -1 || i13 != -1) {
                i15 = 2;
            } else if (i12 == -1 && pVar.G == -1) {
                i15 = -1;
            } else {
                i15 = 1;
            }
        }
        String string2 = BuildConfig.VERSION_NAME;
        if (i15 == 2) {
            String strJ = j(pVar);
            String string3 = (i14 == -1 || i13 == -1) ? BuildConfig.VERSION_NAME : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i14), Integer.valueOf(i13));
            if (i11 != -1) {
                string2 = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i11 / 1000000.0f));
            }
            strI = t(strJ, string3, string2);
        } else if (i15 == 1) {
            String strI2 = i(pVar);
            if (i12 == -1 || i12 < 1) {
                string = BuildConfig.VERSION_NAME;
            } else if (i12 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i12 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i12 == 6 || i12 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i12 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            if (i11 != -1) {
                string2 = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i11 / 1000000.0f));
            }
            strI = t(strI2, string, string2);
        } else {
            strI = i(pVar);
        }
        if (!strI.isEmpty()) {
            return strI;
        }
        String str3 = pVar.f57282d;
        return (str3 == null || str3.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str3);
    }

    public String t(String... strArr) {
        String string = BuildConfig.VERSION_NAME;
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f32184b).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public void u() {
        long j11;
        i7.g gVar = (i7.g) this.f32184b;
        synchronized (u7.b.f52815b) {
            try {
                j11 = u7.b.f52816c ? u7.b.f52817d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        gVar.L = j11;
        gVar.w(true);
    }

    public File w() {
        File file = new File(((gb.m) this.f32184b).f28948a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public void x(k7.c cVar) {
    }

    public boolean y(String str) {
        return false;
    }

    public File z(String str, InputStream inputStream, a aVar) throws IOException {
        File file = new File(w(), l(str, aVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i11 = inputStream.read(bArr);
                    if (i11 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i11);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStream.close();
            throw th3;
        }
    }

    public static void k(la.b bVar) {
        bVar.k("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.k("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.k("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.k("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        bVar.k("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.k("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        bVar.k("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.k("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.k("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.k(OYAvlbfUyD.lNBNjs);
        bVar.k("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.k("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.k("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.k("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.k("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    public static ef.o v(la.b bVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new ca.i(1, 1, "work_spec_id", "TEXT", null, true));
        map.put("prerequisite_id", new ca.i(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new ca.j(Arrays.asList("work_spec_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
        hashSet.add(new ca.j(Arrays.asList("prerequisite_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
        HashSet hashSet2 = new HashSet(2);
        boolean z11 = false;
        hashSet2.add(new ca.k("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new ca.k("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        ca.l lVar = new ca.l("Dependency", map, hashSet, hashSet2);
        ca.l lVarA = ca.l.a(bVar, "Dependency");
        if (!lVar.equals(lVarA)) {
            return new ef.o(3, ep.a.d("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", lVar, "\n Found:\n", lVarA), z11);
        }
        HashMap map2 = new HashMap(32);
        map2.put("id", new ca.i(1, 1, "id", "TEXT", null, true));
        map2.put("state", new ca.i(0, 1, "state", "INTEGER", null, true));
        map2.put("worker_class_name", new ca.i(0, 1, "worker_class_name", "TEXT", null, true));
        map2.put("input_merger_class_name", new ca.i(0, 1, "input_merger_class_name", "TEXT", null, true));
        map2.put("input", new ca.i(0, 1, "input", "BLOB", null, true));
        map2.put("output", new ca.i(0, 1, "output", "BLOB", null, true));
        map2.put("initial_delay", new ca.i(0, 1, "initial_delay", "INTEGER", null, true));
        map2.put("interval_duration", new ca.i(0, 1, "interval_duration", "INTEGER", null, true));
        map2.put("flex_duration", new ca.i(0, 1, "flex_duration", "INTEGER", null, true));
        map2.put("run_attempt_count", new ca.i(0, 1, "run_attempt_count", "INTEGER", null, true));
        map2.put("backoff_policy", new ca.i(0, 1, "backoff_policy", "INTEGER", null, true));
        map2.put("backoff_delay_duration", new ca.i(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        map2.put("last_enqueue_time", new ca.i(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        map2.put("minimum_retention_duration", new ca.i(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        map2.put("schedule_requested_at", new ca.i(0, 1, "schedule_requested_at", "INTEGER", null, true));
        map2.put("run_in_foreground", new ca.i(0, 1, "run_in_foreground", "INTEGER", null, true));
        map2.put("out_of_quota_policy", new ca.i(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        map2.put("period_count", new ca.i(0, 1, "period_count", "INTEGER", "0", true));
        map2.put("generation", new ca.i(0, 1, "generation", "INTEGER", "0", true));
        map2.put("next_schedule_time_override", new ca.i(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        map2.put("next_schedule_time_override_generation", new ca.i(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        map2.put("stop_reason", new ca.i(0, 1, "stop_reason", "INTEGER", "-256", true));
        map2.put("trace_tag", new ca.i(0, 1, "trace_tag", "TEXT", null, false));
        map2.put("required_network_type", new ca.i(0, 1, "required_network_type", "INTEGER", null, true));
        map2.put("required_network_request", new ca.i(0, 1, "required_network_request", "BLOB", "x''", true));
        map2.put("requires_charging", new ca.i(0, 1, "requires_charging", "INTEGER", null, true));
        map2.put("requires_device_idle", new ca.i(0, 1, "requires_device_idle", "INTEGER", null, true));
        map2.put("requires_battery_not_low", new ca.i(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        map2.put("requires_storage_not_low", new ca.i(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        map2.put("trigger_content_update_delay", new ca.i(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        map2.put("trigger_max_content_delay", new ca.i(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        map2.put("content_uri_triggers", new ca.i(0, 1, "content_uri_triggers", "BLOB", null, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new ca.k("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new ca.k("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        ca.l lVar2 = new ca.l("WorkSpec", map2, hashSet3, hashSet4);
        ca.l lVarA2 = ca.l.a(bVar, "WorkSpec");
        if (!lVar2.equals(lVarA2)) {
            return new ef.o(3, ep.a.d("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", lVar2, "\n Found:\n", lVarA2), z11);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new ca.i(1, 1, scNRoQgKSYX.vYjpYBbTseP, "TEXT", null, true));
        map3.put("work_spec_id", new ca.i(2, 1, "work_spec_id", "TEXT", null, true));
        boolean z12 = true;
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new ca.j(Arrays.asList("work_spec_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new ca.k("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        ca.l lVar3 = new ca.l("WorkTag", map3, hashSet5, hashSet6);
        ca.l lVarA3 = ca.l.a(bVar, "WorkTag");
        if (!lVar3.equals(lVarA3)) {
            return new ef.o(3, ep.a.d("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", lVar3, "\n Found:\n", lVarA3), z11);
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new ca.i(1, 1, "work_spec_id", "TEXT", null, true));
        map4.put("generation", new ca.i(2, 1, "generation", "INTEGER", "0", true));
        map4.put("system_id", new ca.i(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new ca.j(Arrays.asList("work_spec_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
        ca.l lVar4 = new ca.l("SystemIdInfo", map4, hashSet7, new HashSet(0));
        ca.l lVarA4 = ca.l.a(bVar, "SystemIdInfo");
        if (!lVar4.equals(lVarA4)) {
            return new ef.o(3, ep.a.d("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", lVar4, "\n Found:\n", lVarA4), z11);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new ca.i(1, 1, "name", "TEXT", null, true));
        map5.put("work_spec_id", new ca.i(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new ca.j(Arrays.asList("work_spec_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new ca.k("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        ca.l lVar5 = new ca.l("WorkName", map5, hashSet8, hashSet9);
        ca.l lVarA5 = ca.l.a(bVar, "WorkName");
        if (!lVar5.equals(lVarA5)) {
            return new ef.o(3, ep.a.d("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", lVar5, "\n Found:\n", lVarA5), z11);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new ca.i(1, 1, "work_spec_id", "TEXT", null, true));
        map6.put("progress", new ca.i(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new ca.j(Arrays.asList("work_spec_id"), Arrays.asList("id"), "WorkSpec", "CASCADE", "CASCADE"));
        ca.l lVar6 = new ca.l("WorkProgress", map6, hashSet10, new HashSet(0));
        ca.l lVarA6 = ca.l.a(bVar, "WorkProgress");
        if (!lVar6.equals(lVarA6)) {
            return new ef.o(3, ep.a.d("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", lVar6, "\n Found:\n", lVarA6), z11);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new ca.i(1, 1, "key", "TEXT", null, true));
        map7.put("long_value", new ca.i(0, 1, "long_value", "INTEGER", null, false));
        ca.l lVar7 = new ca.l("Preference", map7, new HashSet(0), new HashSet(0));
        ca.l lVarA7 = ca.l.a(bVar, "Preference");
        if (lVar7.equals(lVarA7)) {
            return new ef.o(3, null, z12);
        }
        return new ef.o(3, ep.a.d("Preference(androidx.work.impl.model.Preference).\n Expected:\n", lVar7, "\n Found:\n", lVarA7), z11);
    }

    @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
    public void onSuccess(OSSRequest oSSRequest, OSSResult oSSResult) {
        PutObjectResult putObjectResult = (PutObjectResult) oSSResult;
        rz.m mVar = (rz.m) this.f32184b;
        if (putObjectResult == null) {
            mVar.resumeWith(new gv.b("上传成功但结果为空", null));
            return;
        }
        String eTag = putObjectResult.getETag();
        m.e(eTag, IMCc.GayNxMGtf);
        String requestId = putObjectResult.getRequestId();
        m.e(requestId, "getRequestId(...)");
        mVar.resumeWith(new gv.c(eTag, requestId));
    }

    public /* synthetic */ b(Object obj, int i11) {
        this.f32183a = i11;
        this.f32184b = obj;
    }

    public b(Resources resources) {
        this.f32183a = 16;
        resources.getClass();
        this.f32184b = resources;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029 A[PHI: r10
      0x0029: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0019, B:10:0x0022, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    public b(int[] iArr, float[] fArr, float[][] fArr2) {
        int i11;
        this.f32183a = 2;
        int i12 = 1;
        int length = fArr.length - 1;
        u[][] uVarArr = new u[length][];
        int i13 = 1;
        int i14 = 1;
        int i15 = 0;
        while (i15 < length) {
            int i16 = iArr[i15];
            int i17 = 3;
            if (i16 == 0) {
                i11 = i17;
            } else if (i16 == i12) {
                i13 = i12;
                i11 = i13;
            } else {
                if (i16 != 2) {
                    if (i16 != 3) {
                        i17 = 4;
                        if (i16 != 4) {
                            i17 = 5;
                            if (i16 != 5) {
                                i11 = i14;
                            } else {
                                i11 = i17;
                            }
                        } else {
                            i11 = i17;
                        }
                    } else {
                        if (i13 != i12) {
                            i13 = i12;
                        }
                        i11 = i13;
                    }
                }
                i13 = 2;
                i11 = i13;
            }
            float[] fArr3 = fArr2[i15];
            int i18 = i15 + 1;
            float[] fArr4 = fArr2[i18];
            float f5 = fArr[i15];
            float f11 = fArr[i18];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            u[] uVarArr2 = new u[length2];
            int i19 = 0;
            while (i19 < length2) {
                int i21 = i19 * 2;
                int i22 = i19;
                int i23 = i21 + 1;
                uVarArr2[i22] = new u(i11, f5, f11, fArr3[i21], fArr3[i23], fArr4[i21], fArr4[i23]);
                i19 = i22 + 1;
            }
            uVarArr[i15] = uVarArr2;
            i15 = i18;
            i14 = i11;
            i12 = 1;
        }
        this.f32184b = uVarArr;
    }

    public b(int i11) {
        this.f32183a = i11;
        switch (i11) {
            case 8:
                this.f32184b = null;
                break;
            default:
                this.f32184b = ByteBuffer.allocate(8);
                break;
        }
    }
}
