package dt;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.RecordingStatus;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y4 {
    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0148  */
    /* JADX WARN: Code duplicated, block: B:107:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x015f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0176  */
    /* JADX WARN: Code duplicated, block: B:115:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x018d  */
    /* JADX WARN: Code duplicated, block: B:119:0x019e  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:134:0x0273  */
    /* JADX WARN: Code duplicated, block: B:135:0x0275  */
    /* JADX WARN: Code duplicated, block: B:138:0x0280 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x029b  */
    /* JADX WARN: Code duplicated, block: B:144:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:148:0x0331 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x034d  */
    /* JADX WARN: Code duplicated, block: B:154:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:158:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:159:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:168:0x0411  */
    /* JADX WARN: Code duplicated, block: B:170:0x0415  */
    /* JADX WARN: Code duplicated, block: B:173:0x0447  */
    /* JADX WARN: Code duplicated, block: B:174:0x0449  */
    /* JADX WARN: Code duplicated, block: B:177:0x0454 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x045c  */
    /* JADX WARN: Code duplicated, block: B:183:0x049f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:189:0x04c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:193:0x050f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0513  */
    /* JADX WARN: Code duplicated, block: B:197:0x0528  */
    /* JADX WARN: Code duplicated, block: B:200:0x0539  */
    /* JADX WARN: Code duplicated, block: B:204:0x054b  */
    /* JADX WARN: Code duplicated, block: B:205:0x054d  */
    /* JADX WARN: Code duplicated, block: B:208:0x0555  */
    /* JADX WARN: Code duplicated, block: B:211:0x055a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0571  */
    /* JADX WARN: Code duplicated, block: B:216:0x0573  */
    /* JADX WARN: Code duplicated, block: B:219:0x05d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x05da  */
    /* JADX WARN: Code duplicated, block: B:225:0x060e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x0635  */
    /* JADX WARN: Code duplicated, block: B:249:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:252:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:254:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:257:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:260:0x070e  */
    /* JADX WARN: Code duplicated, block: B:261:0x0710  */
    /* JADX WARN: Code duplicated, block: B:267:0x071e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0779  */
    /* JADX WARN: Code duplicated, block: B:271:0x077d  */
    /* JADX WARN: Code duplicated, block: B:276:0x0798  */
    /* JADX WARN: Code duplicated, block: B:280:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:283:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:285:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:288:0x0807  */
    /* JADX WARN: Code duplicated, block: B:291:0x0821  */
    /* JADX WARN: Code duplicated, block: B:292:0x0823  */
    /* JADX WARN: Code duplicated, block: B:296:0x082d  */
    /* JADX WARN: Code duplicated, block: B:299:0x087e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0886  */
    /* JADX WARN: Code duplicated, block: B:306:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:312:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:315:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    public static final void a(final Uri uri, final z1.r rVar, RecordingStatus recordingStatus, boolean z11, long j11, Object obj, fz.c cVar, l1.n nVar, final int i11, final int i12) {
        int i13;
        final RecordingStatus recordingStatus2;
        int i14;
        boolean z12;
        int i15;
        int i16;
        int i17;
        int i18;
        final Object obj2;
        int i19;
        int i21;
        fz.c cVar2;
        int i22;
        boolean z13;
        final boolean z14;
        l1.s sVar;
        final fz.c cVar3;
        final long j12;
        l1.x1 x1VarT;
        RecordingStatus recordingStatus3;
        boolean z15;
        long j13;
        Object obj3;
        l1.g gVar;
        fz.c cVar4;
        Context context;
        Object objQ;
        rz.b0 b0Var;
        Object objQ2;
        ExoPlayer exoPlayer;
        boolean zF;
        Object objQ3;
        l1.b1 b1Var;
        boolean zF2;
        Object objQ4;
        l1.b1 b1Var2;
        boolean zF3;
        Object objQ5;
        l1.b1 b1Var3;
        boolean zF4;
        Object objQ6;
        l1.b1 b1Var4;
        Object objQ7;
        h5 h5Var;
        boolean zF5;
        int i23;
        Object objQ8;
        l1.b1 b1Var5;
        boolean zF6;
        Object objQ9;
        l1.b1 b1Var6;
        float f5;
        boolean zA;
        final l1.b1 b1VarH;
        final l1.b1 b1VarH2;
        final l1.b1 b1VarH3;
        final l1.b1 b1VarH4;
        int i24;
        boolean z16;
        boolean z17;
        Object objQ10;
        l1.b1 b1Var7;
        l1.b1 b1Var8;
        ExoPlayer exoPlayer2;
        int i25;
        l1.b1 b1Var9;
        l1.s sVar2;
        l1.b1 b1Var10;
        int i26;
        boolean z18;
        boolean zH;
        Object objQ11;
        final ExoPlayer exoPlayer3;
        boolean z19;
        h5 h5Var2;
        l1.b1 b1Var11;
        rz.b0 b0Var2;
        int i27;
        boolean z20;
        boolean z21;
        boolean zF7;
        Object objQ12;
        boolean z22;
        l1.b1 b1Var12;
        l1.b1 b1Var13;
        h5 h5Var3;
        boolean z23;
        boolean z24;
        boolean z25;
        Object objQ13;
        long j14;
        fz.c cVar5;
        LifecycleOwner lifecycleOwner;
        boolean zH2;
        Object objQ14;
        boolean zH3;
        Object objQ15;
        int iHashCode;
        y2.i iVar;
        final h5 h5Var4;
        y2.h hVar;
        y2.h hVar2;
        boolean z26;
        boolean z27;
        Object objQ16;
        l1.g gVar2;
        final fz.c cVar6;
        boolean z28;
        final rz.b0 b0Var3;
        boolean zH4;
        Object objQ17;
        l1.b1 b1Var14;
        ExoPlayer exoPlayer4;
        boolean z29;
        l1.s sVar3;
        boolean z30;
        z1.o oVar;
        float f11;
        float f12;
        Object objQ18;
        boolean z31;
        boolean z32;
        Object objQ19;
        l1.g gVar3;
        final l1.b1 b1Var15;
        final l1.b1 b1Var16;
        int iHashCode2;
        final ExoPlayer exoPlayer5;
        float f13;
        Object objQ20;
        boolean z33;
        boolean z34;
        Object objQ21;
        int iHashCode3;
        Object objQ22;
        kotlin.jvm.internal.m.f(uri, "uri");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(-448734427);
        if ((i11 & 6) == 0) {
            i13 = (sVar4.h(uri) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar4.f(rVar) ? 32 : 16;
        }
        int i28 = i12 & 4;
        if (i28 == 0) {
            if ((i11 & 384) == 0) {
                recordingStatus2 = recordingStatus;
                i13 |= sVar4.h(recordingStatus2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    z12 = z11;
                    if (sVar4.g(z12)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        if (sVar4.e(j11)) {
                            i17 = 16384;
                        } else {
                            i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 32;
                    if (i18 != 0) {
                        i13 |= 196608;
                        obj2 = obj;
                    } else {
                        obj2 = obj;
                        if ((i11 & 196608) == 0) {
                            if (sVar4.h(obj2)) {
                                i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            } else {
                                i19 = 65536;
                            }
                            i13 |= i19;
                        }
                    }
                    i21 = i12 & 64;
                    if (i21 != 0) {
                        i13 |= 1572864;
                        cVar2 = cVar;
                    } else {
                        cVar2 = cVar;
                        if ((i11 & 1572864) == 0) {
                            if (sVar4.h(cVar2)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i13 |= i22;
                        }
                    }
                    if ((i13 & 599187) != 599186) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (sVar4.T(i13 & 1, z13)) {
                        if (i28 != 0) {
                            recordingStatus3 = null;
                        } else {
                            recordingStatus3 = recordingStatus2;
                        }
                        if (i14 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i16 != 0) {
                            j13 = 0;
                        } else {
                            j13 = j11;
                        }
                        if (i18 != 0) {
                            obj3 = qy.b0.f48488a;
                        } else {
                            obj3 = obj2;
                        }
                        gVar = l1.m.f39353a;
                        if (i21 != 0) {
                            objQ22 = sVar4.Q();
                            if (objQ22 == gVar) {
                                objQ22 = new d0.y1(29);
                                sVar4.o0(objQ22);
                            }
                            cVar4 = (fz.c) objQ22;
                        } else {
                            cVar4 = cVar2;
                        }
                        context = (Context) sVar4.j(AndroidCompositionLocals_androidKt.f1200b);
                        objQ = sVar4.Q();
                        if (objQ == gVar) {
                            objQ = l1.t.q(sVar4);
                            sVar4.o0(objQ);
                        }
                        b0Var = (rz.b0) objQ;
                        objQ2 = sVar4.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new f7.n(context).a();
                            sVar4.o0(objQ2);
                        }
                        exoPlayer = (ExoPlayer) objQ2;
                        kotlin.jvm.internal.m.c(exoPlayer);
                        zF = sVar4.f(obj3);
                        objQ3 = sVar4.Q();
                        if (zF || objQ3 == gVar) {
                            objQ3 = l1.t.B(Boolean.FALSE);
                            sVar4.o0(objQ3);
                        }
                        b1Var = (l1.b1) objQ3;
                        zF2 = sVar4.f(obj3);
                        objQ4 = sVar4.Q();
                        if (zF2 || objQ4 == gVar) {
                            objQ4 = l1.t.B(Boolean.FALSE);
                            sVar4.o0(objQ4);
                        }
                        b1Var2 = (l1.b1) objQ4;
                        zF3 = sVar4.f(obj3);
                        objQ5 = sVar4.Q();
                        if (zF3 || objQ5 == gVar) {
                            objQ5 = l1.t.B(Boolean.FALSE);
                            sVar4.o0(objQ5);
                        }
                        b1Var3 = (l1.b1) objQ5;
                        zF4 = sVar4.f(obj3);
                        objQ6 = sVar4.Q();
                        if (zF4 || objQ6 == gVar) {
                            objQ6 = l1.t.B(Boolean.FALSE);
                            sVar4.o0(objQ6);
                        }
                        b1Var4 = (l1.b1) objQ6;
                        objQ7 = sVar4.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new h5();
                            sVar4.o0(objQ7);
                        }
                        h5Var = (h5) objQ7;
                        zF5 = sVar4.f(obj3);
                        i23 = i13;
                        objQ8 = sVar4.Q();
                        if (zF5 || objQ8 == gVar) {
                            objQ8 = l1.t.B(Long.valueOf(j13));
                            sVar4.o0(objQ8);
                        }
                        b1Var5 = (l1.b1) objQ8;
                        zF6 = sVar4.f(obj3);
                        objQ9 = sVar4.Q();
                        if (zF6 || objQ9 == gVar) {
                            objQ9 = l1.t.B(Boolean.FALSE);
                            sVar4.o0(objQ9);
                        }
                        b1Var6 = (l1.b1) objQ9;
                        if (((Boolean) b1Var6.getValue()).booleanValue()) {
                            f5 = 1.0f;
                        } else {
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        }
                        l1.b3 b3VarB = b0.h.b(f5, null, "VideoAlphaAnimation", sVar4, 3072, 22);
                        zA = kotlin.jvm.internal.m.a(recordingStatus3, RecordingStatus.Recording.INSTANCE);
                        RecordingStatus recordingStatus4 = recordingStatus3;
                        b1VarH = l1.t.H(Boolean.valueOf(z15), sVar4);
                        b1VarH2 = l1.t.H(Boolean.valueOf(zA), sVar4);
                        b1VarH3 = l1.t.H(Boolean.valueOf(((Boolean) b1Var4.getValue()).booleanValue()), sVar4);
                        b1VarH4 = l1.t.H(cVar4, sVar4);
                        boolean zH5 = sVar4.h(h5Var) | sVar4.h(uri) | sVar4.h(exoPlayer) | sVar4.f(b1Var6) | sVar4.f(b1Var) | sVar4.f(b1Var3) | sVar4.f(b1Var4) | sVar4.f(b1Var2);
                        i24 = i23 & 3670016;
                        if (i24 == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = zH5 | z16;
                        objQ10 = sVar4.Q();
                        if (!z17 || objQ10 == gVar) {
                            b1Var7 = b1Var2;
                            b1Var8 = b1Var3;
                            exoPlayer2 = exoPlayer;
                            i25 = i24;
                            b1Var9 = b1Var6;
                            sVar2 = sVar4;
                            b1Var10 = b1Var4;
                            objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                            sVar2.o0(objQ10);
                        } else {
                            b1Var7 = b1Var2;
                            b1Var8 = b1Var3;
                            exoPlayer2 = exoPlayer;
                            i25 = i24;
                            b1Var9 = b1Var6;
                            sVar2 = sVar4;
                            b1Var10 = b1Var4;
                        }
                        l1.t.g(uri, obj3, (fz.e) objQ10, sVar2);
                        Boolean boolValueOf = Boolean.valueOf(z15);
                        i26 = i23 & 7168;
                        if (i26 == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zH = z18 | sVar2.h(h5Var) | sVar2.f(b1Var10) | sVar2.h(exoPlayer2) | sVar2.f(b1Var) | sVar2.f(b1Var8) | sVar2.f(b1Var9) | sVar2.g(zA) | sVar2.f(b1Var7) | sVar2.h(b0Var) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.f(b1VarH4);
                        objQ11 = sVar2.Q();
                        exoPlayer3 = exoPlayer2;
                        if (!zH || objQ11 == gVar) {
                            l1.b1 b1Var17 = b1Var9;
                            z19 = zA;
                            objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var17, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                            h5Var2 = h5Var;
                            b1Var11 = b1Var17;
                            b0Var2 = b0Var;
                            sVar2.o0(objQ11);
                        } else {
                            b1Var11 = b1Var9;
                            b0Var2 = b0Var;
                            z19 = zA;
                            h5Var2 = h5Var;
                        }
                        l1.t.f((fz.e) objQ11, boolValueOf, sVar2);
                        Boolean boolValueOf2 = Boolean.valueOf(z19);
                        boolean zG = sVar2.g(z19) | sVar2.h(h5Var2) | sVar2.h(exoPlayer3);
                        i27 = i25;
                        if (i27 == 1048576) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        boolean zF8 = zG | z20 | sVar2.f(b1Var8);
                        if (i26 == 2048) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        zF7 = zF8 | z21 | sVar2.f(b1Var10);
                        objQ12 = sVar2.Q();
                        if (!zF7 || objQ12 == gVar) {
                            boolean z35 = z19;
                            l1.b1 b1Var18 = b1Var8;
                            l1.b1 b1Var19 = b1Var10;
                            h5 h5Var5 = h5Var2;
                            boolean z36 = z15;
                            objQ12 = new v4(z35, exoPlayer3, cVar4, z36, h5Var5, b1Var18, b1Var19, null);
                            z22 = z35;
                            z15 = z36;
                            b1Var12 = b1Var18;
                            b1Var13 = b1Var19;
                            h5Var3 = h5Var5;
                            sVar2.o0(objQ12);
                        } else {
                            z22 = z19;
                            h5Var3 = h5Var2;
                            b1Var13 = b1Var10;
                            b1Var12 = b1Var8;
                        }
                        l1.t.f((fz.e) objQ12, boolValueOf2, sVar2);
                        Long lValueOf = Long.valueOf(j13);
                        if ((i23 & 57344) == 16384) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        boolean zF9 = z23 | sVar2.f(b1Var5) | sVar2.h(h5Var3) | sVar2.f(b1Var) | sVar2.h(r23) | sVar2.f(b1Var7) | sVar2.f(b1Var12) | sVar2.f(b1Var13);
                        if (i27 == 1048576) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zF9 | z24;
                        objQ13 = sVar2.Q();
                        if (!z25 || objQ13 == gVar) {
                            fz.c cVar7 = cVar4;
                            long j15 = j13;
                            objQ13 = new w4(j15, r23, cVar7, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                            j14 = j15;
                            cVar5 = cVar7;
                            sVar2.o0(objQ13);
                        } else {
                            cVar5 = cVar4;
                            j14 = j13;
                        }
                        l1.t.f((fz.e) objQ13, lValueOf, sVar2);
                        lifecycleOwner = (LifecycleOwner) sVar2.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        zH2 = sVar2.h(r23) | sVar2.h(lifecycleOwner);
                        objQ14 = sVar2.Q();
                        if (zH2 || objQ14 == gVar) {
                            objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                            sVar2.o0(objQ14);
                        }
                        l1.t.d(lifecycleOwner, r23, (fz.c) objQ14, sVar2);
                        zH3 = sVar2.h(h5Var3) | sVar2.h(r23);
                        objQ15 = sVar2.Q();
                        if (zH3 || objQ15 == gVar) {
                            objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                            sVar2.o0(objQ15);
                        }
                        l1.t.c(r23, (fz.c) objQ15, sVar2);
                        z1.r rVarA = d2.h.a(rVar, ((Number) b3VarB.getValue()).floatValue());
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        iHashCode = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL = sVar2.l();
                        z1.r rVarC = z1.a.c(sVar2, rVarA);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar2.h0();
                        h5Var4 = h5Var3;
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        hVar = y2.j.f56917f;
                        l1.t.J(hVar, q0VarD, sVar2);
                        y2.h hVar3 = y2.j.f56916e;
                        l1.t.J(hVar3, q1VarL, sVar2);
                        y2.h hVar4 = y2.j.f56918g;
                        if (sVar2.S) {
                            hVar2 = hVar;
                        } else {
                            hVar2 = hVar;
                            if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                            }
                            y2.h hVar5 = y2.j.f56915d;
                            l1.t.J(hVar5, rVarC, sVar2);
                            boolean zF10 = sVar2.f(b1Var);
                            if (i27 == 1048576) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = zF10 | z26;
                            objQ16 = sVar2.Q();
                            if (z27) {
                                gVar2 = gVar;
                            } else {
                                gVar2 = gVar;
                                if (objQ16 == gVar2) {
                                }
                                fz.c cVar8 = (fz.c) objQ16;
                                boolean zF11 = sVar2.f(b1Var11);
                                cVar6 = cVar5;
                                if (i26 == 2048) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                boolean zG2 = zF11 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                                b0Var3 = b0Var2;
                                zH4 = zG2 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                                objQ17 = sVar2.Q();
                                if (!zH4 || objQ17 == gVar2) {
                                    final l1.b1 b1Var20 = b1Var12;
                                    final l1.b1 b1Var21 = b1Var7;
                                    final l1.b1 b1Var22 = b1Var13;
                                    final boolean z37 = z22;
                                    final boolean z38 = z15;
                                    final l1.b1 b1Var23 = b1Var11;
                                    objQ17 = new fz.a() { // from class: dt.q4
                                        @Override // fz.a
                                        public final Object invoke() {
                                            b1Var23.setValue(Boolean.TRUE);
                                            y4.d(z38, z37, h5Var4, b0Var3, b1Var20, b1Var22, b1Var21, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    z15 = z38;
                                    b1Var14 = b1Var22;
                                    exoPlayer4 = exoPlayer3;
                                    z29 = z37;
                                    sVar2.o0(objQ17);
                                } else {
                                    b1Var14 = b1Var13;
                                    z29 = z22;
                                    exoPlayer4 = exoPlayer3;
                                }
                                e(exoPlayer4, cVar8, (fz.a) objQ17, sVar2, 0);
                                if (z29 && ((!z15 && !((Boolean) b1Var7.getValue()).booleanValue()) || ((Boolean) b1Var.getValue()).booleanValue() || ((Boolean) b1Var14.getValue()).booleanValue())) {
                                    sVar2.d0(1449135068);
                                    z1.o oVar2 = z1.o.f58481a;
                                    float f14 = 4;
                                    float f15 = 24;
                                    z1.r rVarA2 = j0.r.f35391a.a(j0.e2.g(j0.c.C(d0.n.h(j0.e2.e(oVar2, 1.0f), g2.x.c(((h1.s1) sVar2.j(h1.v1.f31180a)).f31034q, 0.3f), g2.f0.f28556b), CropImageView.DEFAULT_ASPECT_RATIO, f14, 1), f15), z1.c.K);
                                    j0.a2 a2VarA = j0.z1.a(j0.i.f35304b, z1.c.L, sVar2, 6);
                                    int iHashCode4 = Long.hashCode(sVar2.T);
                                    l1.q1 q1VarL2 = sVar2.l();
                                    z1.r rVarC2 = z1.a.c(sVar2, rVarA2);
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar);
                                    } else {
                                        sVar2.r0();
                                    }
                                    y2.h hVar6 = hVar2;
                                    l1.t.J(hVar6, a2VarA, sVar2);
                                    l1.t.J(hVar3, q1VarL2, sVar2);
                                    if (sVar2.S) {
                                        oVar = oVar2;
                                    } else {
                                        oVar = oVar2;
                                        if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                                        }
                                        l1.t.J(hVar5, rVarC2, sVar2);
                                        if (1.0f <= 0.0d) {
                                            k0.a.a("invalid weight; must be greater than zero");
                                        }
                                        if (1.0f > Float.MAX_VALUE) {
                                            f12 = Float.MAX_VALUE;
                                            f11 = Float.MAX_VALUE;
                                        } else {
                                            f11 = Float.MAX_VALUE;
                                            f12 = 1.0f;
                                        }
                                        j0.i1 i1Var = new j0.i1(f12, true);
                                        objQ18 = sVar2.Q();
                                        if (objQ18 == gVar2) {
                                            objQ18 = com.google.android.material.datepicker.d.f(sVar2);
                                        }
                                        h0.i iVar2 = (h0.i) objQ18;
                                        boolean zH6 = sVar2.h(exoPlayer4) | sVar2.f(b1Var14) | sVar2.f(b1Var7);
                                        if (i27 == 1048576) {
                                            z31 = true;
                                        } else {
                                            z31 = false;
                                        }
                                        z32 = zH6 | z31;
                                        objQ19 = sVar2.Q();
                                        if (z32 || objQ19 == gVar2) {
                                            final int i29 = 0;
                                            final ExoPlayer exoPlayer6 = exoPlayer4;
                                            final l1.b1 b1Var24 = b1Var14;
                                            final l1.b1 b1Var25 = b1Var7;
                                            objQ19 = new fz.a() { // from class: dt.r4
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    switch (i29) {
                                                        case 0:
                                                            y6.j0 j0Var = exoPlayer6;
                                                            b0.h2 h2Var = (b0.h2) j0Var;
                                                            h2Var.l0(5, 0L);
                                                            h2Var.c(new y6.e0(0.6f, h2Var.b().f57186b));
                                                            j0Var.r(true);
                                                            b1Var24.setValue(Boolean.FALSE);
                                                            y4.c(b1Var25, true);
                                                            cVar6.invoke(z4.SlowPlaying);
                                                            break;
                                                        default:
                                                            y6.j0 j0Var2 = exoPlayer6;
                                                            b0.h2 h2Var2 = (b0.h2) j0Var2;
                                                            h2Var2.l0(5, 0L);
                                                            h2Var2.c(new y6.e0(1.0f, h2Var2.b().f57186b));
                                                            j0Var2.r(true);
                                                            b1Var24.setValue(Boolean.FALSE);
                                                            y4.c(b1Var25, true);
                                                            cVar6.invoke(z4.NormalPlaying);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar2.o0(objQ19);
                                        }
                                        gVar3 = gVar2;
                                        z1.r rVarC3 = j0.c.C(j0.e2.c(d0.n.n(i1Var, iVar2, null, false, null, (fz.a) objQ19, 28), 1.0f), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                        z1.j jVar = z1.c.f58467e;
                                        w2.q0 q0VarD2 = j0.o.d(jVar, false);
                                        b1Var15 = b1Var14;
                                        b1Var16 = b1Var7;
                                        iHashCode2 = Long.hashCode(sVar2.T);
                                        l1.q1 q1VarL3 = sVar2.l();
                                        z1.r rVarC4 = z1.a.c(sVar2, rVarC3);
                                        sVar2.h0();
                                        if (sVar2.S) {
                                            sVar2.k(iVar);
                                        } else {
                                            sVar2.r0();
                                        }
                                        l1.t.J(hVar6, q0VarD2, sVar2);
                                        l1.t.J(hVar3, q1VarL3, sVar2);
                                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                            defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                                        }
                                        l1.t.J(hVar5, rVarC4, sVar2);
                                        z1.o oVar3 = oVar;
                                        exoPlayer5 = exoPlayer4;
                                        sVar3 = sVar2;
                                        d0.n.c(se.k.y(R.drawable.ic_video_ctrl_play_slow, sVar2, 0), null, j0.e2.n(oVar3, f15), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 432, 120);
                                        sVar3.p(true);
                                        if (1.0f <= 0.0d) {
                                            k0.a.a("invalid weight; must be greater than zero");
                                        }
                                        if (1.0f > f11) {
                                            f13 = f11;
                                        } else {
                                            f13 = 1.0f;
                                        }
                                        j0.i1 i1Var2 = new j0.i1(f13, true);
                                        objQ20 = sVar3.Q();
                                        if (objQ20 == gVar3) {
                                            objQ20 = com.google.android.material.datepicker.d.f(sVar3);
                                        }
                                        h0.i iVar3 = (h0.i) objQ20;
                                        boolean zH7 = sVar3.h(exoPlayer5) | sVar3.f(b1Var15) | sVar3.f(b1Var16);
                                        if (i27 == 1048576) {
                                            z33 = true;
                                        } else {
                                            z33 = false;
                                        }
                                        z34 = zH7 | z33;
                                        objQ21 = sVar3.Q();
                                        if (z34 || objQ21 == gVar3) {
                                            final int i30 = 1;
                                            objQ21 = new fz.a() { // from class: dt.r4
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    switch (i30) {
                                                        case 0:
                                                            y6.j0 j0Var = exoPlayer5;
                                                            b0.h2 h2Var = (b0.h2) j0Var;
                                                            h2Var.l0(5, 0L);
                                                            h2Var.c(new y6.e0(0.6f, h2Var.b().f57186b));
                                                            j0Var.r(true);
                                                            b1Var15.setValue(Boolean.FALSE);
                                                            y4.c(b1Var16, true);
                                                            cVar6.invoke(z4.SlowPlaying);
                                                            break;
                                                        default:
                                                            y6.j0 j0Var2 = exoPlayer5;
                                                            b0.h2 h2Var2 = (b0.h2) j0Var2;
                                                            h2Var2.l0(5, 0L);
                                                            h2Var2.c(new y6.e0(1.0f, h2Var2.b().f57186b));
                                                            j0Var2.r(true);
                                                            b1Var15.setValue(Boolean.FALSE);
                                                            y4.c(b1Var16, true);
                                                            cVar6.invoke(z4.NormalPlaying);
                                                            break;
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            };
                                            sVar3.o0(objQ21);
                                        }
                                        z1.r rVarC5 = j0.c.C(j0.e2.c(d0.n.n(i1Var2, iVar3, null, false, null, (fz.a) objQ21, 28), 1.0f), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                        w2.q0 q0VarD3 = j0.o.d(jVar, false);
                                        iHashCode3 = Long.hashCode(sVar3.T);
                                        l1.q1 q1VarL4 = sVar3.l();
                                        z1.r rVarC6 = z1.a.c(sVar3, rVarC5);
                                        sVar3.h0();
                                        if (sVar3.S) {
                                            sVar3.k(iVar);
                                        } else {
                                            sVar3.r0();
                                        }
                                        l1.t.J(hVar6, q0VarD3, sVar3);
                                        l1.t.J(hVar3, q1VarL4, sVar3);
                                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                                            defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
                                        }
                                        l1.t.J(hVar5, rVarC6, sVar3);
                                        d0.n.c(se.k.y(R.drawable.ic_video_ctrl_play_normal, sVar3, 0), null, j0.e2.n(oVar3, f15), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 432, 120);
                                        z30 = true;
                                        com.google.android.material.datepicker.d.B(sVar3, true, true, false);
                                    }
                                    defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar4);
                                    l1.t.J(hVar5, rVarC2, sVar2);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f12 = Float.MAX_VALUE;
                                        f11 = Float.MAX_VALUE;
                                    } else {
                                        f11 = Float.MAX_VALUE;
                                        f12 = 1.0f;
                                    }
                                    j0.i1 i1Var3 = new j0.i1(f12, true);
                                    objQ18 = sVar2.Q();
                                    if (objQ18 == gVar2) {
                                        objQ18 = com.google.android.material.datepicker.d.f(sVar2);
                                    }
                                    h0.i iVar4 = (h0.i) objQ18;
                                    boolean zH8 = sVar2.h(exoPlayer4) | sVar2.f(b1Var14) | sVar2.f(b1Var7);
                                    if (i27 == 1048576) {
                                        z31 = true;
                                    } else {
                                        z31 = false;
                                    }
                                    z32 = zH8 | z31;
                                    objQ19 = sVar2.Q();
                                    if (z32) {
                                        final int i210 = 0;
                                        final ExoPlayer exoPlayer7 = exoPlayer4;
                                        final l1.b1 b1Var26 = b1Var14;
                                        final l1.b1 b1Var27 = b1Var7;
                                        objQ19 = new fz.a() { // from class: dt.r4
                                            @Override // fz.a
                                            public final Object invoke() {
                                                switch (i210) {
                                                    case 0:
                                                        y6.j0 j0Var = exoPlayer7;
                                                        b0.h2 h2Var = (b0.h2) j0Var;
                                                        h2Var.l0(5, 0L);
                                                        h2Var.c(new y6.e0(0.6f, h2Var.b().f57186b));
                                                        j0Var.r(true);
                                                        b1Var26.setValue(Boolean.FALSE);
                                                        y4.c(b1Var27, true);
                                                        cVar6.invoke(z4.SlowPlaying);
                                                        break;
                                                    default:
                                                        y6.j0 j0Var2 = exoPlayer7;
                                                        b0.h2 h2Var2 = (b0.h2) j0Var2;
                                                        h2Var2.l0(5, 0L);
                                                        h2Var2.c(new y6.e0(1.0f, h2Var2.b().f57186b));
                                                        j0Var2.r(true);
                                                        b1Var26.setValue(Boolean.FALSE);
                                                        y4.c(b1Var27, true);
                                                        cVar6.invoke(z4.NormalPlaying);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar2.o0(objQ19);
                                    } else {
                                        final int i211 = 0;
                                        final ExoPlayer exoPlayer8 = exoPlayer4;
                                        final l1.b1 b1Var28 = b1Var14;
                                        final l1.b1 b1Var29 = b1Var7;
                                        objQ19 = new fz.a() { // from class: dt.r4
                                            @Override // fz.a
                                            public final Object invoke() {
                                                switch (i211) {
                                                    case 0:
                                                        y6.j0 j0Var = exoPlayer8;
                                                        b0.h2 h2Var = (b0.h2) j0Var;
                                                        h2Var.l0(5, 0L);
                                                        h2Var.c(new y6.e0(0.6f, h2Var.b().f57186b));
                                                        j0Var.r(true);
                                                        b1Var28.setValue(Boolean.FALSE);
                                                        y4.c(b1Var29, true);
                                                        cVar6.invoke(z4.SlowPlaying);
                                                        break;
                                                    default:
                                                        y6.j0 j0Var2 = exoPlayer8;
                                                        b0.h2 h2Var2 = (b0.h2) j0Var2;
                                                        h2Var2.l0(5, 0L);
                                                        h2Var2.c(new y6.e0(1.0f, h2Var2.b().f57186b));
                                                        j0Var2.r(true);
                                                        b1Var28.setValue(Boolean.FALSE);
                                                        y4.c(b1Var29, true);
                                                        cVar6.invoke(z4.NormalPlaying);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar2.o0(objQ19);
                                    }
                                    gVar3 = gVar2;
                                    z1.r rVarC7 = j0.c.C(j0.e2.c(d0.n.n(i1Var3, iVar4, null, false, null, (fz.a) objQ19, 28), 1.0f), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    z1.j jVar2 = z1.c.f58467e;
                                    w2.q0 q0VarD4 = j0.o.d(jVar2, false);
                                    b1Var15 = b1Var14;
                                    b1Var16 = b1Var7;
                                    iHashCode2 = Long.hashCode(sVar2.T);
                                    l1.q1 q1VarL5 = sVar2.l();
                                    z1.r rVarC8 = z1.a.c(sVar2, rVarC7);
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar);
                                    } else {
                                        sVar2.r0();
                                    }
                                    l1.t.J(hVar6, q0VarD4, sVar2);
                                    l1.t.J(hVar3, q1VarL5, sVar2);
                                    if (sVar2.S) {
                                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                                    } else {
                                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                                    }
                                    l1.t.J(hVar5, rVarC8, sVar2);
                                    z1.o oVar4 = oVar;
                                    exoPlayer5 = exoPlayer4;
                                    sVar3 = sVar2;
                                    d0.n.c(se.k.y(R.drawable.ic_video_ctrl_play_slow, sVar2, 0), null, j0.e2.n(oVar4, f15), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 432, 120);
                                    sVar3.p(true);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > f11) {
                                        f13 = f11;
                                    } else {
                                        f13 = 1.0f;
                                    }
                                    j0.i1 i1Var4 = new j0.i1(f13, true);
                                    objQ20 = sVar3.Q();
                                    if (objQ20 == gVar3) {
                                        objQ20 = com.google.android.material.datepicker.d.f(sVar3);
                                    }
                                    h0.i iVar5 = (h0.i) objQ20;
                                    boolean zH9 = sVar3.h(exoPlayer5) | sVar3.f(b1Var15) | sVar3.f(b1Var16);
                                    if (i27 == 1048576) {
                                        z33 = true;
                                    } else {
                                        z33 = false;
                                    }
                                    z34 = zH9 | z33;
                                    objQ21 = sVar3.Q();
                                    if (z34) {
                                        final int i31 = 1;
                                        objQ21 = new fz.a() { // from class: dt.r4
                                            @Override // fz.a
                                            public final Object invoke() {
                                                switch (i31) {
                                                    case 0:
                                                        y6.j0 j0Var = exoPlayer5;
                                                        b0.h2 h2Var = (b0.h2) j0Var;
                                                        h2Var.l0(5, 0L);
                                                        h2Var.c(new y6.e0(0.6f, h2Var.b().f57186b));
                                                        j0Var.r(true);
                                                        b1Var15.setValue(Boolean.FALSE);
                                                        y4.c(b1Var16, true);
                                                        cVar6.invoke(z4.SlowPlaying);
                                                        break;
                                                    default:
                                                        y6.j0 j0Var2 = exoPlayer5;
                                                        b0.h2 h2Var2 = (b0.h2) j0Var2;
                                                        h2Var2.l0(5, 0L);
                                                        h2Var2.c(new y6.e0(1.0f, h2Var2.b().f57186b));
                                                        j0Var2.r(true);
                                                        b1Var15.setValue(Boolean.FALSE);
                                                        y4.c(b1Var16, true);
                                                        cVar6.invoke(z4.NormalPlaying);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ21);
                                    } else {
                                        final int i32 = 1;
                                        objQ21 = new fz.a() { // from class: dt.r4
                                            @Override // fz.a
                                            public final Object invoke() {
                                                switch (i32) {
                                                    case 0:
                                                        y6.j0 j0Var = exoPlayer5;
                                                        b0.h2 h2Var = (b0.h2) j0Var;
                                                        h2Var.l0(5, 0L);
                                                        h2Var.c(new y6.e0(0.6f, h2Var.b().f57186b));
                                                        j0Var.r(true);
                                                        b1Var15.setValue(Boolean.FALSE);
                                                        y4.c(b1Var16, true);
                                                        cVar6.invoke(z4.SlowPlaying);
                                                        break;
                                                    default:
                                                        y6.j0 j0Var2 = exoPlayer5;
                                                        b0.h2 h2Var2 = (b0.h2) j0Var2;
                                                        h2Var2.l0(5, 0L);
                                                        h2Var2.c(new y6.e0(1.0f, h2Var2.b().f57186b));
                                                        j0Var2.r(true);
                                                        b1Var15.setValue(Boolean.FALSE);
                                                        y4.c(b1Var16, true);
                                                        cVar6.invoke(z4.NormalPlaying);
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar3.o0(objQ21);
                                    }
                                    z1.r rVarC9 = j0.c.C(j0.e2.c(d0.n.n(i1Var4, iVar5, null, false, null, (fz.a) objQ21, 28), 1.0f), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    w2.q0 q0VarD5 = j0.o.d(jVar2, false);
                                    iHashCode3 = Long.hashCode(sVar3.T);
                                    l1.q1 q1VarL6 = sVar3.l();
                                    z1.r rVarC10 = z1.a.c(sVar3, rVarC9);
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(hVar6, q0VarD5, sVar3);
                                    l1.t.J(hVar3, q1VarL6, sVar3);
                                    if (sVar3.S) {
                                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
                                    } else {
                                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
                                    }
                                    l1.t.J(hVar5, rVarC10, sVar3);
                                    d0.n.c(se.k.y(R.drawable.ic_video_ctrl_play_normal, sVar3, 0), null, j0.e2.n(oVar4, f15), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 432, 120);
                                    z30 = true;
                                    com.google.android.material.datepicker.d.B(sVar3, true, true, false);
                                } else {
                                    cVar6 = cVar6;
                                    sVar3 = sVar2;
                                    z30 = true;
                                    sVar3.d0(1439380887);
                                    sVar3.p(false);
                                }
                                sVar3.p(z30);
                                sVar = sVar3;
                                obj2 = obj3;
                                z14 = z15;
                                cVar3 = cVar6;
                                j12 = j14;
                                recordingStatus2 = recordingStatus4;
                            }
                            objQ16 = new y3(cVar5, b1Var, 1);
                            sVar2.o0(objQ16);
                            fz.c cVar9 = (fz.c) objQ16;
                            boolean zF12 = sVar2.f(b1Var11);
                            cVar6 = cVar5;
                            if (i26 == 2048) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            boolean zG3 = zF12 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                            b0Var3 = b0Var2;
                            zH4 = zG3 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                            objQ17 = sVar2.Q();
                            if (zH4) {
                                final l1.b1 b1Var210 = b1Var12;
                                final l1.b1 b1Var211 = b1Var7;
                                final l1.b1 b1Var212 = b1Var13;
                                final boolean z39 = z22;
                                final boolean z310 = z15;
                                final l1.b1 b1Var213 = b1Var11;
                                objQ17 = new fz.a() { // from class: dt.q4
                                    @Override // fz.a
                                    public final Object invoke() {
                                        b1Var213.setValue(Boolean.TRUE);
                                        y4.d(z310, z39, h5Var4, b0Var3, b1Var210, b1Var212, b1Var211, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                        return qy.b0.f48488a;
                                    }
                                };
                                z15 = z310;
                                b1Var14 = b1Var212;
                                exoPlayer4 = exoPlayer3;
                                z29 = z39;
                                sVar2.o0(objQ17);
                            } else {
                                final l1.b1 b1Var214 = b1Var12;
                                final l1.b1 b1Var215 = b1Var7;
                                final l1.b1 b1Var216 = b1Var13;
                                final boolean z311 = z22;
                                final boolean z312 = z15;
                                final l1.b1 b1Var217 = b1Var11;
                                objQ17 = new fz.a() { // from class: dt.q4
                                    @Override // fz.a
                                    public final Object invoke() {
                                        b1Var217.setValue(Boolean.TRUE);
                                        y4.d(z312, z311, h5Var4, b0Var3, b1Var214, b1Var216, b1Var215, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                        return qy.b0.f48488a;
                                    }
                                };
                                z15 = z312;
                                b1Var14 = b1Var216;
                                exoPlayer4 = exoPlayer3;
                                z29 = z311;
                                sVar2.o0(objQ17);
                            }
                            e(exoPlayer4, cVar9, (fz.a) objQ17, sVar2, 0);
                            if (z29) {
                                cVar6 = cVar6;
                                sVar3 = sVar2;
                                z30 = true;
                                sVar3.d0(1439380887);
                                sVar3.p(false);
                            } else {
                                cVar6 = cVar6;
                                sVar3 = sVar2;
                                z30 = true;
                                sVar3.d0(1439380887);
                                sVar3.p(false);
                            }
                            sVar3.p(z30);
                            sVar = sVar3;
                            obj2 = obj3;
                            z14 = z15;
                            cVar3 = cVar6;
                            j12 = j14;
                            recordingStatus2 = recordingStatus4;
                        }
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
                        y2.h hVar7 = y2.j.f56915d;
                        l1.t.J(hVar7, rVarC, sVar2);
                        boolean zF13 = sVar2.f(b1Var);
                        if (i27 == 1048576) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = zF13 | z26;
                        objQ16 = sVar2.Q();
                        if (z27) {
                            gVar2 = gVar;
                            if (objQ16 == gVar2) {
                            }
                            fz.c cVar10 = (fz.c) objQ16;
                            boolean zF14 = sVar2.f(b1Var11);
                            cVar6 = cVar5;
                            if (i26 == 2048) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            boolean zG4 = zF14 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                            b0Var3 = b0Var2;
                            zH4 = zG4 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                            objQ17 = sVar2.Q();
                            if (zH4) {
                                final l1.b1 b1Var218 = b1Var12;
                                final l1.b1 b1Var219 = b1Var7;
                                final l1.b1 b1Var2110 = b1Var13;
                                final boolean z313 = z22;
                                final boolean z314 = z15;
                                final l1.b1 b1Var2111 = b1Var11;
                                objQ17 = new fz.a() { // from class: dt.q4
                                    @Override // fz.a
                                    public final Object invoke() {
                                        b1Var2111.setValue(Boolean.TRUE);
                                        y4.d(z314, z313, h5Var4, b0Var3, b1Var218, b1Var2110, b1Var219, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                        return qy.b0.f48488a;
                                    }
                                };
                                z15 = z314;
                                b1Var14 = b1Var2110;
                                exoPlayer4 = exoPlayer3;
                                z29 = z313;
                                sVar2.o0(objQ17);
                            } else {
                                final l1.b1 b1Var2112 = b1Var12;
                                final l1.b1 b1Var2113 = b1Var7;
                                final l1.b1 b1Var2114 = b1Var13;
                                final boolean z315 = z22;
                                final boolean z316 = z15;
                                final l1.b1 b1Var2115 = b1Var11;
                                objQ17 = new fz.a() { // from class: dt.q4
                                    @Override // fz.a
                                    public final Object invoke() {
                                        b1Var2115.setValue(Boolean.TRUE);
                                        y4.d(z316, z315, h5Var4, b0Var3, b1Var2112, b1Var2114, b1Var2113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                        return qy.b0.f48488a;
                                    }
                                };
                                z15 = z316;
                                b1Var14 = b1Var2114;
                                exoPlayer4 = exoPlayer3;
                                z29 = z315;
                                sVar2.o0(objQ17);
                            }
                            e(exoPlayer4, cVar10, (fz.a) objQ17, sVar2, 0);
                            if (z29) {
                                cVar6 = cVar6;
                                sVar3 = sVar2;
                                z30 = true;
                                sVar3.d0(1439380887);
                                sVar3.p(false);
                            } else {
                                cVar6 = cVar6;
                                sVar3 = sVar2;
                                z30 = true;
                                sVar3.d0(1439380887);
                                sVar3.p(false);
                            }
                            sVar3.p(z30);
                            sVar = sVar3;
                            obj2 = obj3;
                            z14 = z15;
                            cVar3 = cVar6;
                            j12 = j14;
                            recordingStatus2 = recordingStatus4;
                        } else {
                            gVar2 = gVar;
                        }
                        objQ16 = new y3(cVar5, b1Var, 1);
                        sVar2.o0(objQ16);
                        fz.c cVar11 = (fz.c) objQ16;
                        boolean zF15 = sVar2.f(b1Var11);
                        cVar6 = cVar5;
                        if (i26 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean zG5 = zF15 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                        b0Var3 = b0Var2;
                        zH4 = zG5 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                        objQ17 = sVar2.Q();
                        if (zH4) {
                            final l1.b1 b1Var2116 = b1Var12;
                            final l1.b1 b1Var2117 = b1Var7;
                            final l1.b1 b1Var2118 = b1Var13;
                            final boolean z317 = z22;
                            final boolean z318 = z15;
                            final l1.b1 b1Var2119 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var2119.setValue(Boolean.TRUE);
                                    y4.d(z318, z317, h5Var4, b0Var3, b1Var2116, b1Var2118, b1Var2117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z318;
                            b1Var14 = b1Var2118;
                            exoPlayer4 = exoPlayer3;
                            z29 = z317;
                            sVar2.o0(objQ17);
                        } else {
                            final l1.b1 b1Var21110 = b1Var12;
                            final l1.b1 b1Var21111 = b1Var7;
                            final l1.b1 b1Var21112 = b1Var13;
                            final boolean z319 = z22;
                            final boolean z3110 = z15;
                            final l1.b1 b1Var21113 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var21113.setValue(Boolean.TRUE);
                                    y4.d(z3110, z319, h5Var4, b0Var3, b1Var21110, b1Var21112, b1Var21111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z3110;
                            b1Var14 = b1Var21112;
                            exoPlayer4 = exoPlayer3;
                            z29 = z319;
                            sVar2.o0(objQ17);
                        }
                        e(exoPlayer4, cVar11, (fz.a) objQ17, sVar2, 0);
                        if (z29) {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        } else {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        }
                        sVar3.p(z30);
                        sVar = sVar3;
                        obj2 = obj3;
                        z14 = z15;
                        cVar3 = cVar6;
                        j12 = j14;
                        recordingStatus2 = recordingStatus4;
                    } else {
                        sVar4.W();
                        z14 = z12;
                        sVar = sVar4;
                        cVar3 = cVar2;
                        j12 = j11;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.s4
                            @Override // fz.e
                            public final Object invoke(Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                y4.a(uri, rVar, recordingStatus2, z14, j12, obj2, cVar3, (l1.n) obj4, l1.t.M(i11 | 1), i12);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= 196608;
                    obj2 = obj;
                } else {
                    obj2 = obj;
                    if ((i11 & 196608) == 0) {
                        if (sVar4.h(obj2)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                    cVar2 = cVar;
                } else {
                    cVar2 = cVar;
                    if ((i11 & 1572864) == 0) {
                        if (sVar4.h(cVar2)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i13 |= i22;
                    }
                }
                if ((i13 & 599187) != 599186) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar4.T(i13 & 1, z13)) {
                    if (i28 != 0) {
                        recordingStatus3 = null;
                    } else {
                        recordingStatus3 = recordingStatus2;
                    }
                    if (i14 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i16 != 0) {
                        j13 = 0;
                    } else {
                        j13 = j11;
                    }
                    if (i18 != 0) {
                        obj3 = qy.b0.f48488a;
                    } else {
                        obj3 = obj2;
                    }
                    gVar = l1.m.f39353a;
                    if (i21 != 0) {
                        objQ22 = sVar4.Q();
                        if (objQ22 == gVar) {
                            objQ22 = new d0.y1(29);
                            sVar4.o0(objQ22);
                        }
                        cVar4 = (fz.c) objQ22;
                    } else {
                        cVar4 = cVar2;
                    }
                    context = (Context) sVar4.j(AndroidCompositionLocals_androidKt.f1200b);
                    objQ = sVar4.Q();
                    if (objQ == gVar) {
                        objQ = l1.t.q(sVar4);
                        sVar4.o0(objQ);
                    }
                    b0Var = (rz.b0) objQ;
                    objQ2 = sVar4.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new f7.n(context).a();
                        sVar4.o0(objQ2);
                    }
                    exoPlayer = (ExoPlayer) objQ2;
                    kotlin.jvm.internal.m.c(exoPlayer);
                    zF = sVar4.f(obj3);
                    objQ3 = sVar4.Q();
                    if (zF) {
                        objQ3 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ3);
                    } else {
                        objQ3 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ3);
                    }
                    b1Var = (l1.b1) objQ3;
                    zF2 = sVar4.f(obj3);
                    objQ4 = sVar4.Q();
                    if (zF2) {
                        objQ4 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ4);
                    } else {
                        objQ4 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ4);
                    }
                    b1Var2 = (l1.b1) objQ4;
                    zF3 = sVar4.f(obj3);
                    objQ5 = sVar4.Q();
                    if (zF3) {
                        objQ5 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ5);
                    } else {
                        objQ5 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ5);
                    }
                    b1Var3 = (l1.b1) objQ5;
                    zF4 = sVar4.f(obj3);
                    objQ6 = sVar4.Q();
                    if (zF4) {
                        objQ6 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ6);
                    } else {
                        objQ6 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ6);
                    }
                    b1Var4 = (l1.b1) objQ6;
                    objQ7 = sVar4.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new h5();
                        sVar4.o0(objQ7);
                    }
                    h5Var = (h5) objQ7;
                    zF5 = sVar4.f(obj3);
                    i23 = i13;
                    objQ8 = sVar4.Q();
                    if (zF5) {
                        objQ8 = l1.t.B(Long.valueOf(j13));
                        sVar4.o0(objQ8);
                    } else {
                        objQ8 = l1.t.B(Long.valueOf(j13));
                        sVar4.o0(objQ8);
                    }
                    b1Var5 = (l1.b1) objQ8;
                    zF6 = sVar4.f(obj3);
                    objQ9 = sVar4.Q();
                    if (zF6) {
                        objQ9 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ9);
                    } else {
                        objQ9 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ9);
                    }
                    b1Var6 = (l1.b1) objQ9;
                    if (((Boolean) b1Var6.getValue()).booleanValue()) {
                        f5 = 1.0f;
                    } else {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    l1.b3 b3VarB2 = b0.h.b(f5, null, "VideoAlphaAnimation", sVar4, 3072, 22);
                    zA = kotlin.jvm.internal.m.a(recordingStatus3, RecordingStatus.Recording.INSTANCE);
                    RecordingStatus recordingStatus5 = recordingStatus3;
                    b1VarH = l1.t.H(Boolean.valueOf(z15), sVar4);
                    b1VarH2 = l1.t.H(Boolean.valueOf(zA), sVar4);
                    b1VarH3 = l1.t.H(Boolean.valueOf(((Boolean) b1Var4.getValue()).booleanValue()), sVar4);
                    b1VarH4 = l1.t.H(cVar4, sVar4);
                    boolean zH10 = sVar4.h(h5Var) | sVar4.h(uri) | sVar4.h(exoPlayer) | sVar4.f(b1Var6) | sVar4.f(b1Var) | sVar4.f(b1Var3) | sVar4.f(b1Var4) | sVar4.f(b1Var2);
                    i24 = i23 & 3670016;
                    if (i24 == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zH10 | z16;
                    objQ10 = sVar4.Q();
                    if (z17) {
                        b1Var7 = b1Var2;
                        b1Var8 = b1Var3;
                        exoPlayer2 = exoPlayer;
                        i25 = i24;
                        b1Var9 = b1Var6;
                        sVar2 = sVar4;
                        b1Var10 = b1Var4;
                        objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                        sVar2.o0(objQ10);
                    } else {
                        b1Var7 = b1Var2;
                        b1Var8 = b1Var3;
                        exoPlayer2 = exoPlayer;
                        i25 = i24;
                        b1Var9 = b1Var6;
                        sVar2 = sVar4;
                        b1Var10 = b1Var4;
                        objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                        sVar2.o0(objQ10);
                    }
                    l1.t.g(uri, obj3, (fz.e) objQ10, sVar2);
                    Boolean boolValueOf3 = Boolean.valueOf(z15);
                    i26 = i23 & 7168;
                    if (i26 == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zH = z18 | sVar2.h(h5Var) | sVar2.f(b1Var10) | sVar2.h(exoPlayer2) | sVar2.f(b1Var) | sVar2.f(b1Var8) | sVar2.f(b1Var9) | sVar2.g(zA) | sVar2.f(b1Var7) | sVar2.h(b0Var) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.f(b1VarH4);
                    objQ11 = sVar2.Q();
                    exoPlayer3 = exoPlayer2;
                    if (zH) {
                        l1.b1 b1Var110 = b1Var9;
                        z19 = zA;
                        objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var110, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                        h5Var2 = h5Var;
                        b1Var11 = b1Var110;
                        b0Var2 = b0Var;
                        sVar2.o0(objQ11);
                    } else {
                        l1.b1 b1Var111 = b1Var9;
                        z19 = zA;
                        objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var111, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                        h5Var2 = h5Var;
                        b1Var11 = b1Var111;
                        b0Var2 = b0Var;
                        sVar2.o0(objQ11);
                    }
                    l1.t.f((fz.e) objQ11, boolValueOf3, sVar2);
                    Boolean boolValueOf4 = Boolean.valueOf(z19);
                    boolean zG6 = sVar2.g(z19) | sVar2.h(h5Var2) | sVar2.h(exoPlayer3);
                    i27 = i25;
                    if (i27 == 1048576) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    boolean zF16 = zG6 | z20 | sVar2.f(b1Var8);
                    if (i26 == 2048) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    zF7 = zF16 | z21 | sVar2.f(b1Var10);
                    objQ12 = sVar2.Q();
                    if (zF7) {
                        boolean z320 = z19;
                        l1.b1 b1Var112 = b1Var8;
                        l1.b1 b1Var113 = b1Var10;
                        h5 h5Var6 = h5Var2;
                        boolean z321 = z15;
                        objQ12 = new v4(z320, exoPlayer3, cVar4, z321, h5Var6, b1Var112, b1Var113, null);
                        z22 = z320;
                        z15 = z321;
                        b1Var12 = b1Var112;
                        b1Var13 = b1Var113;
                        h5Var3 = h5Var6;
                        sVar2.o0(objQ12);
                    } else {
                        boolean z322 = z19;
                        l1.b1 b1Var114 = b1Var8;
                        l1.b1 b1Var115 = b1Var10;
                        h5 h5Var7 = h5Var2;
                        boolean z323 = z15;
                        objQ12 = new v4(z322, exoPlayer3, cVar4, z323, h5Var7, b1Var114, b1Var115, null);
                        z22 = z322;
                        z15 = z323;
                        b1Var12 = b1Var114;
                        b1Var13 = b1Var115;
                        h5Var3 = h5Var7;
                        sVar2.o0(objQ12);
                    }
                    l1.t.f((fz.e) objQ12, boolValueOf4, sVar2);
                    Long lValueOf2 = Long.valueOf(j13);
                    if ((i23 & 57344) == 16384) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    boolean zF17 = z23 | sVar2.f(b1Var5) | sVar2.h(h5Var3) | sVar2.f(b1Var) | sVar2.h(r23) | sVar2.f(b1Var7) | sVar2.f(b1Var12) | sVar2.f(b1Var13);
                    if (i27 == 1048576) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zF17 | z24;
                    objQ13 = sVar2.Q();
                    if (z25) {
                        fz.c cVar12 = cVar4;
                        long j16 = j13;
                        objQ13 = new w4(j16, r23, cVar12, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                        j14 = j16;
                        cVar5 = cVar12;
                        sVar2.o0(objQ13);
                    } else {
                        fz.c cVar13 = cVar4;
                        long j17 = j13;
                        objQ13 = new w4(j17, r23, cVar13, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                        j14 = j17;
                        cVar5 = cVar13;
                        sVar2.o0(objQ13);
                    }
                    l1.t.f((fz.e) objQ13, lValueOf2, sVar2);
                    lifecycleOwner = (LifecycleOwner) sVar2.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    zH2 = sVar2.h(r23) | sVar2.h(lifecycleOwner);
                    objQ14 = sVar2.Q();
                    if (zH2) {
                        objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                        sVar2.o0(objQ14);
                    } else {
                        objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                        sVar2.o0(objQ14);
                    }
                    l1.t.d(lifecycleOwner, r23, (fz.c) objQ14, sVar2);
                    zH3 = sVar2.h(h5Var3) | sVar2.h(r23);
                    objQ15 = sVar2.Q();
                    if (zH3) {
                        objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                        sVar2.o0(objQ15);
                    } else {
                        objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                        sVar2.o0(objQ15);
                    }
                    l1.t.c(r23, (fz.c) objQ15, sVar2);
                    z1.r rVarA3 = d2.h.a(rVar, ((Number) b3VarB2.getValue()).floatValue());
                    w2.q0 q0VarD6 = j0.o.d(z1.c.f58463a, false);
                    iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL7 = sVar2.l();
                    z1.r rVarC11 = z1.a.c(sVar2, rVarA3);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    h5Var4 = h5Var3;
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD6, sVar2);
                    y2.h hVar8 = y2.j.f56916e;
                    l1.t.J(hVar8, q1VarL7, sVar2);
                    y2.h hVar9 = y2.j.f56918g;
                    if (sVar2.S) {
                        hVar2 = hVar;
                        if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        }
                        y2.h hVar10 = y2.j.f56915d;
                        l1.t.J(hVar10, rVarC11, sVar2);
                        boolean zF18 = sVar2.f(b1Var);
                        if (i27 == 1048576) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = zF18 | z26;
                        objQ16 = sVar2.Q();
                        if (z27) {
                            gVar2 = gVar;
                            if (objQ16 == gVar2) {
                            }
                            fz.c cVar14 = (fz.c) objQ16;
                            boolean zF19 = sVar2.f(b1Var11);
                            cVar6 = cVar5;
                            if (i26 == 2048) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            boolean zG7 = zF19 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                            b0Var3 = b0Var2;
                            zH4 = zG7 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                            objQ17 = sVar2.Q();
                            if (zH4) {
                                final l1.b1 b1Var21114 = b1Var12;
                                final l1.b1 b1Var21115 = b1Var7;
                                final l1.b1 b1Var21116 = b1Var13;
                                final boolean z3111 = z22;
                                final boolean z3112 = z15;
                                final l1.b1 b1Var21117 = b1Var11;
                                objQ17 = new fz.a() { // from class: dt.q4
                                    @Override // fz.a
                                    public final Object invoke() {
                                        b1Var21117.setValue(Boolean.TRUE);
                                        y4.d(z3112, z3111, h5Var4, b0Var3, b1Var21114, b1Var21116, b1Var21115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                        return qy.b0.f48488a;
                                    }
                                };
                                z15 = z3112;
                                b1Var14 = b1Var21116;
                                exoPlayer4 = exoPlayer3;
                                z29 = z3111;
                                sVar2.o0(objQ17);
                            } else {
                                final l1.b1 b1Var21118 = b1Var12;
                                final l1.b1 b1Var21119 = b1Var7;
                                final l1.b1 b1Var211110 = b1Var13;
                                final boolean z3113 = z22;
                                final boolean z3114 = z15;
                                final l1.b1 b1Var211111 = b1Var11;
                                objQ17 = new fz.a() { // from class: dt.q4
                                    @Override // fz.a
                                    public final Object invoke() {
                                        b1Var211111.setValue(Boolean.TRUE);
                                        y4.d(z3114, z3113, h5Var4, b0Var3, b1Var21118, b1Var211110, b1Var21119, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                        return qy.b0.f48488a;
                                    }
                                };
                                z15 = z3114;
                                b1Var14 = b1Var211110;
                                exoPlayer4 = exoPlayer3;
                                z29 = z3113;
                                sVar2.o0(objQ17);
                            }
                            e(exoPlayer4, cVar14, (fz.a) objQ17, sVar2, 0);
                            if (z29) {
                                cVar6 = cVar6;
                                sVar3 = sVar2;
                                z30 = true;
                                sVar3.d0(1439380887);
                                sVar3.p(false);
                            } else {
                                cVar6 = cVar6;
                                sVar3 = sVar2;
                                z30 = true;
                                sVar3.d0(1439380887);
                                sVar3.p(false);
                            }
                            sVar3.p(z30);
                            sVar = sVar3;
                            obj2 = obj3;
                            z14 = z15;
                            cVar3 = cVar6;
                            j12 = j14;
                            recordingStatus2 = recordingStatus5;
                        } else {
                            gVar2 = gVar;
                        }
                        objQ16 = new y3(cVar5, b1Var, 1);
                        sVar2.o0(objQ16);
                        fz.c cVar15 = (fz.c) objQ16;
                        boolean zF110 = sVar2.f(b1Var11);
                        cVar6 = cVar5;
                        if (i26 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean zG8 = zF110 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                        b0Var3 = b0Var2;
                        zH4 = zG8 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                        objQ17 = sVar2.Q();
                        if (zH4) {
                            final l1.b1 b1Var211112 = b1Var12;
                            final l1.b1 b1Var211113 = b1Var7;
                            final l1.b1 b1Var211114 = b1Var13;
                            final boolean z3115 = z22;
                            final boolean z3116 = z15;
                            final l1.b1 b1Var211115 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var211115.setValue(Boolean.TRUE);
                                    y4.d(z3116, z3115, h5Var4, b0Var3, b1Var211112, b1Var211114, b1Var211113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z3116;
                            b1Var14 = b1Var211114;
                            exoPlayer4 = exoPlayer3;
                            z29 = z3115;
                            sVar2.o0(objQ17);
                        } else {
                            final l1.b1 b1Var211116 = b1Var12;
                            final l1.b1 b1Var211117 = b1Var7;
                            final l1.b1 b1Var211118 = b1Var13;
                            final boolean z3117 = z22;
                            final boolean z3118 = z15;
                            final l1.b1 b1Var211119 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var211119.setValue(Boolean.TRUE);
                                    y4.d(z3118, z3117, h5Var4, b0Var3, b1Var211116, b1Var211118, b1Var211117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z3118;
                            b1Var14 = b1Var211118;
                            exoPlayer4 = exoPlayer3;
                            z29 = z3117;
                            sVar2.o0(objQ17);
                        }
                        e(exoPlayer4, cVar15, (fz.a) objQ17, sVar2, 0);
                        if (z29) {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        } else {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        }
                        sVar3.p(z30);
                        sVar = sVar3;
                        obj2 = obj3;
                        z14 = z15;
                        cVar3 = cVar6;
                        j12 = j14;
                        recordingStatus2 = recordingStatus5;
                    } else {
                        hVar2 = hVar;
                    }
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar9);
                    y2.h hVar11 = y2.j.f56915d;
                    l1.t.J(hVar11, rVarC11, sVar2);
                    boolean zF111 = sVar2.f(b1Var);
                    if (i27 == 1048576) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zF111 | z26;
                    objQ16 = sVar2.Q();
                    if (z27) {
                        gVar2 = gVar;
                        if (objQ16 == gVar2) {
                        }
                        fz.c cVar16 = (fz.c) objQ16;
                        boolean zF112 = sVar2.f(b1Var11);
                        cVar6 = cVar5;
                        if (i26 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean zG9 = zF112 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                        b0Var3 = b0Var2;
                        zH4 = zG9 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                        objQ17 = sVar2.Q();
                        if (zH4) {
                            final l1.b1 b1Var2111110 = b1Var12;
                            final l1.b1 b1Var2111111 = b1Var7;
                            final l1.b1 b1Var2111112 = b1Var13;
                            final boolean z3119 = z22;
                            final boolean z31110 = z15;
                            final l1.b1 b1Var2111113 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var2111113.setValue(Boolean.TRUE);
                                    y4.d(z31110, z3119, h5Var4, b0Var3, b1Var2111110, b1Var2111112, b1Var2111111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z31110;
                            b1Var14 = b1Var2111112;
                            exoPlayer4 = exoPlayer3;
                            z29 = z3119;
                            sVar2.o0(objQ17);
                        } else {
                            final l1.b1 b1Var2111114 = b1Var12;
                            final l1.b1 b1Var2111115 = b1Var7;
                            final l1.b1 b1Var2111116 = b1Var13;
                            final boolean z31111 = z22;
                            final boolean z31112 = z15;
                            final l1.b1 b1Var2111117 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var2111117.setValue(Boolean.TRUE);
                                    y4.d(z31112, z31111, h5Var4, b0Var3, b1Var2111114, b1Var2111116, b1Var2111115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z31112;
                            b1Var14 = b1Var2111116;
                            exoPlayer4 = exoPlayer3;
                            z29 = z31111;
                            sVar2.o0(objQ17);
                        }
                        e(exoPlayer4, cVar16, (fz.a) objQ17, sVar2, 0);
                        if (z29) {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        } else {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        }
                        sVar3.p(z30);
                        sVar = sVar3;
                        obj2 = obj3;
                        z14 = z15;
                        cVar3 = cVar6;
                        j12 = j14;
                        recordingStatus2 = recordingStatus5;
                    } else {
                        gVar2 = gVar;
                    }
                    objQ16 = new y3(cVar5, b1Var, 1);
                    sVar2.o0(objQ16);
                    fz.c cVar17 = (fz.c) objQ16;
                    boolean zF113 = sVar2.f(b1Var11);
                    cVar6 = cVar5;
                    if (i26 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean zG10 = zF113 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                    b0Var3 = b0Var2;
                    zH4 = zG10 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                    objQ17 = sVar2.Q();
                    if (zH4) {
                        final l1.b1 b1Var2111118 = b1Var12;
                        final l1.b1 b1Var2111119 = b1Var7;
                        final l1.b1 b1Var21111110 = b1Var13;
                        final boolean z31113 = z22;
                        final boolean z31114 = z15;
                        final l1.b1 b1Var21111111 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var21111111.setValue(Boolean.TRUE);
                                y4.d(z31114, z31113, h5Var4, b0Var3, b1Var2111118, b1Var21111110, b1Var2111119, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z31114;
                        b1Var14 = b1Var21111110;
                        exoPlayer4 = exoPlayer3;
                        z29 = z31113;
                        sVar2.o0(objQ17);
                    } else {
                        final l1.b1 b1Var21111112 = b1Var12;
                        final l1.b1 b1Var21111113 = b1Var7;
                        final l1.b1 b1Var21111114 = b1Var13;
                        final boolean z31115 = z22;
                        final boolean z31116 = z15;
                        final l1.b1 b1Var21111115 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var21111115.setValue(Boolean.TRUE);
                                y4.d(z31116, z31115, h5Var4, b0Var3, b1Var21111112, b1Var21111114, b1Var21111113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z31116;
                        b1Var14 = b1Var21111114;
                        exoPlayer4 = exoPlayer3;
                        z29 = z31115;
                        sVar2.o0(objQ17);
                    }
                    e(exoPlayer4, cVar17, (fz.a) objQ17, sVar2, 0);
                    if (z29) {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    } else {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    }
                    sVar3.p(z30);
                    sVar = sVar3;
                    obj2 = obj3;
                    z14 = z15;
                    cVar3 = cVar6;
                    j12 = j14;
                    recordingStatus2 = recordingStatus5;
                } else {
                    sVar4.W();
                    z14 = z12;
                    sVar = sVar4;
                    cVar3 = cVar2;
                    j12 = j11;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.s4
                        @Override // fz.e
                        public final Object invoke(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            y4.a(uri, rVar, recordingStatus2, z14, j12, obj2, cVar3, (l1.n) obj4, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 3072;
            z12 = z11;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    if (sVar4.e(j11)) {
                        i17 = 16384;
                    } else {
                        i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= 196608;
                    obj2 = obj;
                } else {
                    obj2 = obj;
                    if ((i11 & 196608) == 0) {
                        if (sVar4.h(obj2)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                    cVar2 = cVar;
                } else {
                    cVar2 = cVar;
                    if ((i11 & 1572864) == 0) {
                        if (sVar4.h(cVar2)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i13 |= i22;
                    }
                }
                if ((i13 & 599187) != 599186) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar4.T(i13 & 1, z13)) {
                    if (i28 != 0) {
                        recordingStatus3 = null;
                    } else {
                        recordingStatus3 = recordingStatus2;
                    }
                    if (i14 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i16 != 0) {
                        j13 = 0;
                    } else {
                        j13 = j11;
                    }
                    if (i18 != 0) {
                        obj3 = qy.b0.f48488a;
                    } else {
                        obj3 = obj2;
                    }
                    gVar = l1.m.f39353a;
                    if (i21 != 0) {
                        objQ22 = sVar4.Q();
                        if (objQ22 == gVar) {
                            objQ22 = new d0.y1(29);
                            sVar4.o0(objQ22);
                        }
                        cVar4 = (fz.c) objQ22;
                    } else {
                        cVar4 = cVar2;
                    }
                    context = (Context) sVar4.j(AndroidCompositionLocals_androidKt.f1200b);
                    objQ = sVar4.Q();
                    if (objQ == gVar) {
                        objQ = l1.t.q(sVar4);
                        sVar4.o0(objQ);
                    }
                    b0Var = (rz.b0) objQ;
                    objQ2 = sVar4.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new f7.n(context).a();
                        sVar4.o0(objQ2);
                    }
                    exoPlayer = (ExoPlayer) objQ2;
                    kotlin.jvm.internal.m.c(exoPlayer);
                    zF = sVar4.f(obj3);
                    objQ3 = sVar4.Q();
                    if (zF) {
                        objQ3 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ3);
                    } else {
                        objQ3 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ3);
                    }
                    b1Var = (l1.b1) objQ3;
                    zF2 = sVar4.f(obj3);
                    objQ4 = sVar4.Q();
                    if (zF2) {
                        objQ4 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ4);
                    } else {
                        objQ4 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ4);
                    }
                    b1Var2 = (l1.b1) objQ4;
                    zF3 = sVar4.f(obj3);
                    objQ5 = sVar4.Q();
                    if (zF3) {
                        objQ5 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ5);
                    } else {
                        objQ5 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ5);
                    }
                    b1Var3 = (l1.b1) objQ5;
                    zF4 = sVar4.f(obj3);
                    objQ6 = sVar4.Q();
                    if (zF4) {
                        objQ6 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ6);
                    } else {
                        objQ6 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ6);
                    }
                    b1Var4 = (l1.b1) objQ6;
                    objQ7 = sVar4.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new h5();
                        sVar4.o0(objQ7);
                    }
                    h5Var = (h5) objQ7;
                    zF5 = sVar4.f(obj3);
                    i23 = i13;
                    objQ8 = sVar4.Q();
                    if (zF5) {
                        objQ8 = l1.t.B(Long.valueOf(j13));
                        sVar4.o0(objQ8);
                    } else {
                        objQ8 = l1.t.B(Long.valueOf(j13));
                        sVar4.o0(objQ8);
                    }
                    b1Var5 = (l1.b1) objQ8;
                    zF6 = sVar4.f(obj3);
                    objQ9 = sVar4.Q();
                    if (zF6) {
                        objQ9 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ9);
                    } else {
                        objQ9 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ9);
                    }
                    b1Var6 = (l1.b1) objQ9;
                    if (((Boolean) b1Var6.getValue()).booleanValue()) {
                        f5 = 1.0f;
                    } else {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    l1.b3 b3VarB3 = b0.h.b(f5, null, "VideoAlphaAnimation", sVar4, 3072, 22);
                    zA = kotlin.jvm.internal.m.a(recordingStatus3, RecordingStatus.Recording.INSTANCE);
                    RecordingStatus recordingStatus6 = recordingStatus3;
                    b1VarH = l1.t.H(Boolean.valueOf(z15), sVar4);
                    b1VarH2 = l1.t.H(Boolean.valueOf(zA), sVar4);
                    b1VarH3 = l1.t.H(Boolean.valueOf(((Boolean) b1Var4.getValue()).booleanValue()), sVar4);
                    b1VarH4 = l1.t.H(cVar4, sVar4);
                    boolean zH11 = sVar4.h(h5Var) | sVar4.h(uri) | sVar4.h(exoPlayer) | sVar4.f(b1Var6) | sVar4.f(b1Var) | sVar4.f(b1Var3) | sVar4.f(b1Var4) | sVar4.f(b1Var2);
                    i24 = i23 & 3670016;
                    if (i24 == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zH11 | z16;
                    objQ10 = sVar4.Q();
                    if (z17) {
                        b1Var7 = b1Var2;
                        b1Var8 = b1Var3;
                        exoPlayer2 = exoPlayer;
                        i25 = i24;
                        b1Var9 = b1Var6;
                        sVar2 = sVar4;
                        b1Var10 = b1Var4;
                        objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                        sVar2.o0(objQ10);
                    } else {
                        b1Var7 = b1Var2;
                        b1Var8 = b1Var3;
                        exoPlayer2 = exoPlayer;
                        i25 = i24;
                        b1Var9 = b1Var6;
                        sVar2 = sVar4;
                        b1Var10 = b1Var4;
                        objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                        sVar2.o0(objQ10);
                    }
                    l1.t.g(uri, obj3, (fz.e) objQ10, sVar2);
                    Boolean boolValueOf5 = Boolean.valueOf(z15);
                    i26 = i23 & 7168;
                    if (i26 == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zH = z18 | sVar2.h(h5Var) | sVar2.f(b1Var10) | sVar2.h(exoPlayer2) | sVar2.f(b1Var) | sVar2.f(b1Var8) | sVar2.f(b1Var9) | sVar2.g(zA) | sVar2.f(b1Var7) | sVar2.h(b0Var) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.f(b1VarH4);
                    objQ11 = sVar2.Q();
                    exoPlayer3 = exoPlayer2;
                    if (zH) {
                        l1.b1 b1Var116 = b1Var9;
                        z19 = zA;
                        objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var116, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                        h5Var2 = h5Var;
                        b1Var11 = b1Var116;
                        b0Var2 = b0Var;
                        sVar2.o0(objQ11);
                    } else {
                        l1.b1 b1Var117 = b1Var9;
                        z19 = zA;
                        objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var117, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                        h5Var2 = h5Var;
                        b1Var11 = b1Var117;
                        b0Var2 = b0Var;
                        sVar2.o0(objQ11);
                    }
                    l1.t.f((fz.e) objQ11, boolValueOf5, sVar2);
                    Boolean boolValueOf6 = Boolean.valueOf(z19);
                    boolean zG11 = sVar2.g(z19) | sVar2.h(h5Var2) | sVar2.h(exoPlayer3);
                    i27 = i25;
                    if (i27 == 1048576) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    boolean zF114 = zG11 | z20 | sVar2.f(b1Var8);
                    if (i26 == 2048) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    zF7 = zF114 | z21 | sVar2.f(b1Var10);
                    objQ12 = sVar2.Q();
                    if (zF7) {
                        boolean z324 = z19;
                        l1.b1 b1Var118 = b1Var8;
                        l1.b1 b1Var119 = b1Var10;
                        h5 h5Var8 = h5Var2;
                        boolean z325 = z15;
                        objQ12 = new v4(z324, exoPlayer3, cVar4, z325, h5Var8, b1Var118, b1Var119, null);
                        z22 = z324;
                        z15 = z325;
                        b1Var12 = b1Var118;
                        b1Var13 = b1Var119;
                        h5Var3 = h5Var8;
                        sVar2.o0(objQ12);
                    } else {
                        boolean z326 = z19;
                        l1.b1 b1Var1110 = b1Var8;
                        l1.b1 b1Var1111 = b1Var10;
                        h5 h5Var9 = h5Var2;
                        boolean z327 = z15;
                        objQ12 = new v4(z326, exoPlayer3, cVar4, z327, h5Var9, b1Var1110, b1Var1111, null);
                        z22 = z326;
                        z15 = z327;
                        b1Var12 = b1Var1110;
                        b1Var13 = b1Var1111;
                        h5Var3 = h5Var9;
                        sVar2.o0(objQ12);
                    }
                    l1.t.f((fz.e) objQ12, boolValueOf6, sVar2);
                    Long lValueOf3 = Long.valueOf(j13);
                    if ((i23 & 57344) == 16384) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    boolean zF115 = z23 | sVar2.f(b1Var5) | sVar2.h(h5Var3) | sVar2.f(b1Var) | sVar2.h(r23) | sVar2.f(b1Var7) | sVar2.f(b1Var12) | sVar2.f(b1Var13);
                    if (i27 == 1048576) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zF115 | z24;
                    objQ13 = sVar2.Q();
                    if (z25) {
                        fz.c cVar18 = cVar4;
                        long j18 = j13;
                        objQ13 = new w4(j18, r23, cVar18, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                        j14 = j18;
                        cVar5 = cVar18;
                        sVar2.o0(objQ13);
                    } else {
                        fz.c cVar19 = cVar4;
                        long j19 = j13;
                        objQ13 = new w4(j19, r23, cVar19, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                        j14 = j19;
                        cVar5 = cVar19;
                        sVar2.o0(objQ13);
                    }
                    l1.t.f((fz.e) objQ13, lValueOf3, sVar2);
                    lifecycleOwner = (LifecycleOwner) sVar2.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    zH2 = sVar2.h(r23) | sVar2.h(lifecycleOwner);
                    objQ14 = sVar2.Q();
                    if (zH2) {
                        objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                        sVar2.o0(objQ14);
                    } else {
                        objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                        sVar2.o0(objQ14);
                    }
                    l1.t.d(lifecycleOwner, r23, (fz.c) objQ14, sVar2);
                    zH3 = sVar2.h(h5Var3) | sVar2.h(r23);
                    objQ15 = sVar2.Q();
                    if (zH3) {
                        objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                        sVar2.o0(objQ15);
                    } else {
                        objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                        sVar2.o0(objQ15);
                    }
                    l1.t.c(r23, (fz.c) objQ15, sVar2);
                    z1.r rVarA4 = d2.h.a(rVar, ((Number) b3VarB3.getValue()).floatValue());
                    w2.q0 q0VarD7 = j0.o.d(z1.c.f58463a, false);
                    iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL8 = sVar2.l();
                    z1.r rVarC12 = z1.a.c(sVar2, rVarA4);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    h5Var4 = h5Var3;
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD7, sVar2);
                    y2.h hVar12 = y2.j.f56916e;
                    l1.t.J(hVar12, q1VarL8, sVar2);
                    y2.h hVar13 = y2.j.f56918g;
                    if (sVar2.S) {
                        hVar2 = hVar;
                        if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        }
                        y2.h hVar14 = y2.j.f56915d;
                        l1.t.J(hVar14, rVarC12, sVar2);
                        boolean zF116 = sVar2.f(b1Var);
                        if (i27 == 1048576) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = zF116 | z26;
                        objQ16 = sVar2.Q();
                        if (z27) {
                            gVar2 = gVar;
                            if (objQ16 == gVar2) {
                            }
                            fz.c cVar110 = (fz.c) objQ16;
                            boolean zF117 = sVar2.f(b1Var11);
                            cVar6 = cVar5;
                            if (i26 == 2048) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            boolean zG12 = zF117 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                            b0Var3 = b0Var2;
                            zH4 = zG12 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                            objQ17 = sVar2.Q();
                            if (zH4) {
                                final l1.b1 b1Var21111116 = b1Var12;
                                final l1.b1 b1Var21111117 = b1Var7;
                                final l1.b1 b1Var21111118 = b1Var13;
                                final boolean z31117 = z22;
                                final boolean z31118 = z15;
                                final l1.b1 b1Var21111119 = b1Var11;
                                objQ17 = new fz.a() { // from class: dt.q4
                                    @Override // fz.a
                                    public final Object invoke() {
                                        b1Var21111119.setValue(Boolean.TRUE);
                                        y4.d(z31118, z31117, h5Var4, b0Var3, b1Var21111116, b1Var21111118, b1Var21111117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                        return qy.b0.f48488a;
                                    }
                                };
                                z15 = z31118;
                                b1Var14 = b1Var21111118;
                                exoPlayer4 = exoPlayer3;
                                z29 = z31117;
                                sVar2.o0(objQ17);
                            } else {
                                final l1.b1 b1Var211111110 = b1Var12;
                                final l1.b1 b1Var211111111 = b1Var7;
                                final l1.b1 b1Var211111112 = b1Var13;
                                final boolean z31119 = z22;
                                final boolean z311110 = z15;
                                final l1.b1 b1Var211111113 = b1Var11;
                                objQ17 = new fz.a() { // from class: dt.q4
                                    @Override // fz.a
                                    public final Object invoke() {
                                        b1Var211111113.setValue(Boolean.TRUE);
                                        y4.d(z311110, z31119, h5Var4, b0Var3, b1Var211111110, b1Var211111112, b1Var211111111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                        return qy.b0.f48488a;
                                    }
                                };
                                z15 = z311110;
                                b1Var14 = b1Var211111112;
                                exoPlayer4 = exoPlayer3;
                                z29 = z31119;
                                sVar2.o0(objQ17);
                            }
                            e(exoPlayer4, cVar110, (fz.a) objQ17, sVar2, 0);
                            if (z29) {
                                cVar6 = cVar6;
                                sVar3 = sVar2;
                                z30 = true;
                                sVar3.d0(1439380887);
                                sVar3.p(false);
                            } else {
                                cVar6 = cVar6;
                                sVar3 = sVar2;
                                z30 = true;
                                sVar3.d0(1439380887);
                                sVar3.p(false);
                            }
                            sVar3.p(z30);
                            sVar = sVar3;
                            obj2 = obj3;
                            z14 = z15;
                            cVar3 = cVar6;
                            j12 = j14;
                            recordingStatus2 = recordingStatus6;
                        } else {
                            gVar2 = gVar;
                        }
                        objQ16 = new y3(cVar5, b1Var, 1);
                        sVar2.o0(objQ16);
                        fz.c cVar111 = (fz.c) objQ16;
                        boolean zF118 = sVar2.f(b1Var11);
                        cVar6 = cVar5;
                        if (i26 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean zG13 = zF118 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                        b0Var3 = b0Var2;
                        zH4 = zG13 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                        objQ17 = sVar2.Q();
                        if (zH4) {
                            final l1.b1 b1Var211111114 = b1Var12;
                            final l1.b1 b1Var211111115 = b1Var7;
                            final l1.b1 b1Var211111116 = b1Var13;
                            final boolean z311111 = z22;
                            final boolean z311112 = z15;
                            final l1.b1 b1Var211111117 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var211111117.setValue(Boolean.TRUE);
                                    y4.d(z311112, z311111, h5Var4, b0Var3, b1Var211111114, b1Var211111116, b1Var211111115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z311112;
                            b1Var14 = b1Var211111116;
                            exoPlayer4 = exoPlayer3;
                            z29 = z311111;
                            sVar2.o0(objQ17);
                        } else {
                            final l1.b1 b1Var211111118 = b1Var12;
                            final l1.b1 b1Var211111119 = b1Var7;
                            final l1.b1 b1Var2111111110 = b1Var13;
                            final boolean z311113 = z22;
                            final boolean z311114 = z15;
                            final l1.b1 b1Var2111111111 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var2111111111.setValue(Boolean.TRUE);
                                    y4.d(z311114, z311113, h5Var4, b0Var3, b1Var211111118, b1Var2111111110, b1Var211111119, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z311114;
                            b1Var14 = b1Var2111111110;
                            exoPlayer4 = exoPlayer3;
                            z29 = z311113;
                            sVar2.o0(objQ17);
                        }
                        e(exoPlayer4, cVar111, (fz.a) objQ17, sVar2, 0);
                        if (z29) {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        } else {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        }
                        sVar3.p(z30);
                        sVar = sVar3;
                        obj2 = obj3;
                        z14 = z15;
                        cVar3 = cVar6;
                        j12 = j14;
                        recordingStatus2 = recordingStatus6;
                    } else {
                        hVar2 = hVar;
                    }
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar13);
                    y2.h hVar15 = y2.j.f56915d;
                    l1.t.J(hVar15, rVarC12, sVar2);
                    boolean zF119 = sVar2.f(b1Var);
                    if (i27 == 1048576) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zF119 | z26;
                    objQ16 = sVar2.Q();
                    if (z27) {
                        gVar2 = gVar;
                        if (objQ16 == gVar2) {
                        }
                        fz.c cVar112 = (fz.c) objQ16;
                        boolean zF1110 = sVar2.f(b1Var11);
                        cVar6 = cVar5;
                        if (i26 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean zG14 = zF1110 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                        b0Var3 = b0Var2;
                        zH4 = zG14 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                        objQ17 = sVar2.Q();
                        if (zH4) {
                            final l1.b1 b1Var2111111112 = b1Var12;
                            final l1.b1 b1Var2111111113 = b1Var7;
                            final l1.b1 b1Var2111111114 = b1Var13;
                            final boolean z311115 = z22;
                            final boolean z311116 = z15;
                            final l1.b1 b1Var2111111115 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var2111111115.setValue(Boolean.TRUE);
                                    y4.d(z311116, z311115, h5Var4, b0Var3, b1Var2111111112, b1Var2111111114, b1Var2111111113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z311116;
                            b1Var14 = b1Var2111111114;
                            exoPlayer4 = exoPlayer3;
                            z29 = z311115;
                            sVar2.o0(objQ17);
                        } else {
                            final l1.b1 b1Var2111111116 = b1Var12;
                            final l1.b1 b1Var2111111117 = b1Var7;
                            final l1.b1 b1Var2111111118 = b1Var13;
                            final boolean z311117 = z22;
                            final boolean z311118 = z15;
                            final l1.b1 b1Var2111111119 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var2111111119.setValue(Boolean.TRUE);
                                    y4.d(z311118, z311117, h5Var4, b0Var3, b1Var2111111116, b1Var2111111118, b1Var2111111117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z311118;
                            b1Var14 = b1Var2111111118;
                            exoPlayer4 = exoPlayer3;
                            z29 = z311117;
                            sVar2.o0(objQ17);
                        }
                        e(exoPlayer4, cVar112, (fz.a) objQ17, sVar2, 0);
                        if (z29) {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        } else {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        }
                        sVar3.p(z30);
                        sVar = sVar3;
                        obj2 = obj3;
                        z14 = z15;
                        cVar3 = cVar6;
                        j12 = j14;
                        recordingStatus2 = recordingStatus6;
                    } else {
                        gVar2 = gVar;
                    }
                    objQ16 = new y3(cVar5, b1Var, 1);
                    sVar2.o0(objQ16);
                    fz.c cVar113 = (fz.c) objQ16;
                    boolean zF1111 = sVar2.f(b1Var11);
                    cVar6 = cVar5;
                    if (i26 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean zG15 = zF1111 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                    b0Var3 = b0Var2;
                    zH4 = zG15 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                    objQ17 = sVar2.Q();
                    if (zH4) {
                        final l1.b1 b1Var21111111110 = b1Var12;
                        final l1.b1 b1Var21111111111 = b1Var7;
                        final l1.b1 b1Var21111111112 = b1Var13;
                        final boolean z311119 = z22;
                        final boolean z3111110 = z15;
                        final l1.b1 b1Var21111111113 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var21111111113.setValue(Boolean.TRUE);
                                y4.d(z3111110, z311119, h5Var4, b0Var3, b1Var21111111110, b1Var21111111112, b1Var21111111111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z3111110;
                        b1Var14 = b1Var21111111112;
                        exoPlayer4 = exoPlayer3;
                        z29 = z311119;
                        sVar2.o0(objQ17);
                    } else {
                        final l1.b1 b1Var21111111114 = b1Var12;
                        final l1.b1 b1Var21111111115 = b1Var7;
                        final l1.b1 b1Var21111111116 = b1Var13;
                        final boolean z3111111 = z22;
                        final boolean z3111112 = z15;
                        final l1.b1 b1Var21111111117 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var21111111117.setValue(Boolean.TRUE);
                                y4.d(z3111112, z3111111, h5Var4, b0Var3, b1Var21111111114, b1Var21111111116, b1Var21111111115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z3111112;
                        b1Var14 = b1Var21111111116;
                        exoPlayer4 = exoPlayer3;
                        z29 = z3111111;
                        sVar2.o0(objQ17);
                    }
                    e(exoPlayer4, cVar113, (fz.a) objQ17, sVar2, 0);
                    if (z29) {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    } else {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    }
                    sVar3.p(z30);
                    sVar = sVar3;
                    obj2 = obj3;
                    z14 = z15;
                    cVar3 = cVar6;
                    j12 = j14;
                    recordingStatus2 = recordingStatus6;
                } else {
                    sVar4.W();
                    z14 = z12;
                    sVar = sVar4;
                    cVar3 = cVar2;
                    j12 = j11;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.s4
                        @Override // fz.e
                        public final Object invoke(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            y4.a(uri, rVar, recordingStatus2, z14, j12, obj2, cVar3, (l1.n) obj4, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 24576;
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= 196608;
                obj2 = obj;
            } else {
                obj2 = obj;
                if ((i11 & 196608) == 0) {
                    if (sVar4.h(obj2)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            i21 = i12 & 64;
            if (i21 != 0) {
                i13 |= 1572864;
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
                if ((i11 & 1572864) == 0) {
                    if (sVar4.h(cVar2)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i13 |= i22;
                }
            }
            if ((i13 & 599187) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar4.T(i13 & 1, z13)) {
                if (i28 != 0) {
                    recordingStatus3 = null;
                } else {
                    recordingStatus3 = recordingStatus2;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i16 != 0) {
                    j13 = 0;
                } else {
                    j13 = j11;
                }
                if (i18 != 0) {
                    obj3 = qy.b0.f48488a;
                } else {
                    obj3 = obj2;
                }
                gVar = l1.m.f39353a;
                if (i21 != 0) {
                    objQ22 = sVar4.Q();
                    if (objQ22 == gVar) {
                        objQ22 = new d0.y1(29);
                        sVar4.o0(objQ22);
                    }
                    cVar4 = (fz.c) objQ22;
                } else {
                    cVar4 = cVar2;
                }
                context = (Context) sVar4.j(AndroidCompositionLocals_androidKt.f1200b);
                objQ = sVar4.Q();
                if (objQ == gVar) {
                    objQ = l1.t.q(sVar4);
                    sVar4.o0(objQ);
                }
                b0Var = (rz.b0) objQ;
                objQ2 = sVar4.Q();
                if (objQ2 == gVar) {
                    objQ2 = new f7.n(context).a();
                    sVar4.o0(objQ2);
                }
                exoPlayer = (ExoPlayer) objQ2;
                kotlin.jvm.internal.m.c(exoPlayer);
                zF = sVar4.f(obj3);
                objQ3 = sVar4.Q();
                if (zF) {
                    objQ3 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ3);
                } else {
                    objQ3 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ3);
                }
                b1Var = (l1.b1) objQ3;
                zF2 = sVar4.f(obj3);
                objQ4 = sVar4.Q();
                if (zF2) {
                    objQ4 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ4);
                } else {
                    objQ4 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ4);
                }
                b1Var2 = (l1.b1) objQ4;
                zF3 = sVar4.f(obj3);
                objQ5 = sVar4.Q();
                if (zF3) {
                    objQ5 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ5);
                } else {
                    objQ5 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ5);
                }
                b1Var3 = (l1.b1) objQ5;
                zF4 = sVar4.f(obj3);
                objQ6 = sVar4.Q();
                if (zF4) {
                    objQ6 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ6);
                } else {
                    objQ6 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ6);
                }
                b1Var4 = (l1.b1) objQ6;
                objQ7 = sVar4.Q();
                if (objQ7 == gVar) {
                    objQ7 = new h5();
                    sVar4.o0(objQ7);
                }
                h5Var = (h5) objQ7;
                zF5 = sVar4.f(obj3);
                i23 = i13;
                objQ8 = sVar4.Q();
                if (zF5) {
                    objQ8 = l1.t.B(Long.valueOf(j13));
                    sVar4.o0(objQ8);
                } else {
                    objQ8 = l1.t.B(Long.valueOf(j13));
                    sVar4.o0(objQ8);
                }
                b1Var5 = (l1.b1) objQ8;
                zF6 = sVar4.f(obj3);
                objQ9 = sVar4.Q();
                if (zF6) {
                    objQ9 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ9);
                } else {
                    objQ9 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ9);
                }
                b1Var6 = (l1.b1) objQ9;
                if (((Boolean) b1Var6.getValue()).booleanValue()) {
                    f5 = 1.0f;
                } else {
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                l1.b3 b3VarB4 = b0.h.b(f5, null, "VideoAlphaAnimation", sVar4, 3072, 22);
                zA = kotlin.jvm.internal.m.a(recordingStatus3, RecordingStatus.Recording.INSTANCE);
                RecordingStatus recordingStatus7 = recordingStatus3;
                b1VarH = l1.t.H(Boolean.valueOf(z15), sVar4);
                b1VarH2 = l1.t.H(Boolean.valueOf(zA), sVar4);
                b1VarH3 = l1.t.H(Boolean.valueOf(((Boolean) b1Var4.getValue()).booleanValue()), sVar4);
                b1VarH4 = l1.t.H(cVar4, sVar4);
                boolean zH12 = sVar4.h(h5Var) | sVar4.h(uri) | sVar4.h(exoPlayer) | sVar4.f(b1Var6) | sVar4.f(b1Var) | sVar4.f(b1Var3) | sVar4.f(b1Var4) | sVar4.f(b1Var2);
                i24 = i23 & 3670016;
                if (i24 == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zH12 | z16;
                objQ10 = sVar4.Q();
                if (z17) {
                    b1Var7 = b1Var2;
                    b1Var8 = b1Var3;
                    exoPlayer2 = exoPlayer;
                    i25 = i24;
                    b1Var9 = b1Var6;
                    sVar2 = sVar4;
                    b1Var10 = b1Var4;
                    objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                    sVar2.o0(objQ10);
                } else {
                    b1Var7 = b1Var2;
                    b1Var8 = b1Var3;
                    exoPlayer2 = exoPlayer;
                    i25 = i24;
                    b1Var9 = b1Var6;
                    sVar2 = sVar4;
                    b1Var10 = b1Var4;
                    objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                    sVar2.o0(objQ10);
                }
                l1.t.g(uri, obj3, (fz.e) objQ10, sVar2);
                Boolean boolValueOf7 = Boolean.valueOf(z15);
                i26 = i23 & 7168;
                if (i26 == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zH = z18 | sVar2.h(h5Var) | sVar2.f(b1Var10) | sVar2.h(exoPlayer2) | sVar2.f(b1Var) | sVar2.f(b1Var8) | sVar2.f(b1Var9) | sVar2.g(zA) | sVar2.f(b1Var7) | sVar2.h(b0Var) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.f(b1VarH4);
                objQ11 = sVar2.Q();
                exoPlayer3 = exoPlayer2;
                if (zH) {
                    l1.b1 b1Var1112 = b1Var9;
                    z19 = zA;
                    objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var1112, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                    h5Var2 = h5Var;
                    b1Var11 = b1Var1112;
                    b0Var2 = b0Var;
                    sVar2.o0(objQ11);
                } else {
                    l1.b1 b1Var1113 = b1Var9;
                    z19 = zA;
                    objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var1113, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                    h5Var2 = h5Var;
                    b1Var11 = b1Var1113;
                    b0Var2 = b0Var;
                    sVar2.o0(objQ11);
                }
                l1.t.f((fz.e) objQ11, boolValueOf7, sVar2);
                Boolean boolValueOf8 = Boolean.valueOf(z19);
                boolean zG16 = sVar2.g(z19) | sVar2.h(h5Var2) | sVar2.h(exoPlayer3);
                i27 = i25;
                if (i27 == 1048576) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean zF1112 = zG16 | z20 | sVar2.f(b1Var8);
                if (i26 == 2048) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                zF7 = zF1112 | z21 | sVar2.f(b1Var10);
                objQ12 = sVar2.Q();
                if (zF7) {
                    boolean z328 = z19;
                    l1.b1 b1Var1114 = b1Var8;
                    l1.b1 b1Var1115 = b1Var10;
                    h5 h5Var10 = h5Var2;
                    boolean z329 = z15;
                    objQ12 = new v4(z328, exoPlayer3, cVar4, z329, h5Var10, b1Var1114, b1Var1115, null);
                    z22 = z328;
                    z15 = z329;
                    b1Var12 = b1Var1114;
                    b1Var13 = b1Var1115;
                    h5Var3 = h5Var10;
                    sVar2.o0(objQ12);
                } else {
                    boolean z3210 = z19;
                    l1.b1 b1Var1116 = b1Var8;
                    l1.b1 b1Var1117 = b1Var10;
                    h5 h5Var11 = h5Var2;
                    boolean z3211 = z15;
                    objQ12 = new v4(z3210, exoPlayer3, cVar4, z3211, h5Var11, b1Var1116, b1Var1117, null);
                    z22 = z3210;
                    z15 = z3211;
                    b1Var12 = b1Var1116;
                    b1Var13 = b1Var1117;
                    h5Var3 = h5Var11;
                    sVar2.o0(objQ12);
                }
                l1.t.f((fz.e) objQ12, boolValueOf8, sVar2);
                Long lValueOf4 = Long.valueOf(j13);
                if ((i23 & 57344) == 16384) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean zF1113 = z23 | sVar2.f(b1Var5) | sVar2.h(h5Var3) | sVar2.f(b1Var) | sVar2.h(r23) | sVar2.f(b1Var7) | sVar2.f(b1Var12) | sVar2.f(b1Var13);
                if (i27 == 1048576) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zF1113 | z24;
                objQ13 = sVar2.Q();
                if (z25) {
                    fz.c cVar114 = cVar4;
                    long j110 = j13;
                    objQ13 = new w4(j110, r23, cVar114, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                    j14 = j110;
                    cVar5 = cVar114;
                    sVar2.o0(objQ13);
                } else {
                    fz.c cVar115 = cVar4;
                    long j111 = j13;
                    objQ13 = new w4(j111, r23, cVar115, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                    j14 = j111;
                    cVar5 = cVar115;
                    sVar2.o0(objQ13);
                }
                l1.t.f((fz.e) objQ13, lValueOf4, sVar2);
                lifecycleOwner = (LifecycleOwner) sVar2.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                zH2 = sVar2.h(r23) | sVar2.h(lifecycleOwner);
                objQ14 = sVar2.Q();
                if (zH2) {
                    objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                    sVar2.o0(objQ14);
                } else {
                    objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                    sVar2.o0(objQ14);
                }
                l1.t.d(lifecycleOwner, r23, (fz.c) objQ14, sVar2);
                zH3 = sVar2.h(h5Var3) | sVar2.h(r23);
                objQ15 = sVar2.Q();
                if (zH3) {
                    objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                    sVar2.o0(objQ15);
                } else {
                    objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                    sVar2.o0(objQ15);
                }
                l1.t.c(r23, (fz.c) objQ15, sVar2);
                z1.r rVarA5 = d2.h.a(rVar, ((Number) b3VarB4.getValue()).floatValue());
                w2.q0 q0VarD8 = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL9 = sVar2.l();
                z1.r rVarC13 = z1.a.c(sVar2, rVarA5);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                h5Var4 = h5Var3;
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                hVar = y2.j.f56917f;
                l1.t.J(hVar, q0VarD8, sVar2);
                y2.h hVar16 = y2.j.f56916e;
                l1.t.J(hVar16, q1VarL9, sVar2);
                y2.h hVar17 = y2.j.f56918g;
                if (sVar2.S) {
                    hVar2 = hVar;
                    if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    }
                    y2.h hVar18 = y2.j.f56915d;
                    l1.t.J(hVar18, rVarC13, sVar2);
                    boolean zF1114 = sVar2.f(b1Var);
                    if (i27 == 1048576) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zF1114 | z26;
                    objQ16 = sVar2.Q();
                    if (z27) {
                        gVar2 = gVar;
                        if (objQ16 == gVar2) {
                        }
                        fz.c cVar116 = (fz.c) objQ16;
                        boolean zF1115 = sVar2.f(b1Var11);
                        cVar6 = cVar5;
                        if (i26 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean zG17 = zF1115 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                        b0Var3 = b0Var2;
                        zH4 = zG17 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                        objQ17 = sVar2.Q();
                        if (zH4) {
                            final l1.b1 b1Var21111111118 = b1Var12;
                            final l1.b1 b1Var21111111119 = b1Var7;
                            final l1.b1 b1Var211111111110 = b1Var13;
                            final boolean z3111113 = z22;
                            final boolean z3111114 = z15;
                            final l1.b1 b1Var211111111111 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var211111111111.setValue(Boolean.TRUE);
                                    y4.d(z3111114, z3111113, h5Var4, b0Var3, b1Var21111111118, b1Var211111111110, b1Var21111111119, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z3111114;
                            b1Var14 = b1Var211111111110;
                            exoPlayer4 = exoPlayer3;
                            z29 = z3111113;
                            sVar2.o0(objQ17);
                        } else {
                            final l1.b1 b1Var211111111112 = b1Var12;
                            final l1.b1 b1Var211111111113 = b1Var7;
                            final l1.b1 b1Var211111111114 = b1Var13;
                            final boolean z3111115 = z22;
                            final boolean z3111116 = z15;
                            final l1.b1 b1Var211111111115 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var211111111115.setValue(Boolean.TRUE);
                                    y4.d(z3111116, z3111115, h5Var4, b0Var3, b1Var211111111112, b1Var211111111114, b1Var211111111113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z3111116;
                            b1Var14 = b1Var211111111114;
                            exoPlayer4 = exoPlayer3;
                            z29 = z3111115;
                            sVar2.o0(objQ17);
                        }
                        e(exoPlayer4, cVar116, (fz.a) objQ17, sVar2, 0);
                        if (z29) {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        } else {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        }
                        sVar3.p(z30);
                        sVar = sVar3;
                        obj2 = obj3;
                        z14 = z15;
                        cVar3 = cVar6;
                        j12 = j14;
                        recordingStatus2 = recordingStatus7;
                    } else {
                        gVar2 = gVar;
                    }
                    objQ16 = new y3(cVar5, b1Var, 1);
                    sVar2.o0(objQ16);
                    fz.c cVar117 = (fz.c) objQ16;
                    boolean zF1116 = sVar2.f(b1Var11);
                    cVar6 = cVar5;
                    if (i26 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean zG18 = zF1116 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                    b0Var3 = b0Var2;
                    zH4 = zG18 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                    objQ17 = sVar2.Q();
                    if (zH4) {
                        final l1.b1 b1Var211111111116 = b1Var12;
                        final l1.b1 b1Var211111111117 = b1Var7;
                        final l1.b1 b1Var211111111118 = b1Var13;
                        final boolean z3111117 = z22;
                        final boolean z3111118 = z15;
                        final l1.b1 b1Var211111111119 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var211111111119.setValue(Boolean.TRUE);
                                y4.d(z3111118, z3111117, h5Var4, b0Var3, b1Var211111111116, b1Var211111111118, b1Var211111111117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z3111118;
                        b1Var14 = b1Var211111111118;
                        exoPlayer4 = exoPlayer3;
                        z29 = z3111117;
                        sVar2.o0(objQ17);
                    } else {
                        final l1.b1 b1Var2111111111110 = b1Var12;
                        final l1.b1 b1Var2111111111111 = b1Var7;
                        final l1.b1 b1Var2111111111112 = b1Var13;
                        final boolean z3111119 = z22;
                        final boolean z31111110 = z15;
                        final l1.b1 b1Var2111111111113 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var2111111111113.setValue(Boolean.TRUE);
                                y4.d(z31111110, z3111119, h5Var4, b0Var3, b1Var2111111111110, b1Var2111111111112, b1Var2111111111111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z31111110;
                        b1Var14 = b1Var2111111111112;
                        exoPlayer4 = exoPlayer3;
                        z29 = z3111119;
                        sVar2.o0(objQ17);
                    }
                    e(exoPlayer4, cVar117, (fz.a) objQ17, sVar2, 0);
                    if (z29) {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    } else {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    }
                    sVar3.p(z30);
                    sVar = sVar3;
                    obj2 = obj3;
                    z14 = z15;
                    cVar3 = cVar6;
                    j12 = j14;
                    recordingStatus2 = recordingStatus7;
                } else {
                    hVar2 = hVar;
                }
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar17);
                y2.h hVar19 = y2.j.f56915d;
                l1.t.J(hVar19, rVarC13, sVar2);
                boolean zF1117 = sVar2.f(b1Var);
                if (i27 == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = zF1117 | z26;
                objQ16 = sVar2.Q();
                if (z27) {
                    gVar2 = gVar;
                    if (objQ16 == gVar2) {
                    }
                    fz.c cVar118 = (fz.c) objQ16;
                    boolean zF1118 = sVar2.f(b1Var11);
                    cVar6 = cVar5;
                    if (i26 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean zG19 = zF1118 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                    b0Var3 = b0Var2;
                    zH4 = zG19 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                    objQ17 = sVar2.Q();
                    if (zH4) {
                        final l1.b1 b1Var2111111111114 = b1Var12;
                        final l1.b1 b1Var2111111111115 = b1Var7;
                        final l1.b1 b1Var2111111111116 = b1Var13;
                        final boolean z31111111 = z22;
                        final boolean z31111112 = z15;
                        final l1.b1 b1Var2111111111117 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var2111111111117.setValue(Boolean.TRUE);
                                y4.d(z31111112, z31111111, h5Var4, b0Var3, b1Var2111111111114, b1Var2111111111116, b1Var2111111111115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z31111112;
                        b1Var14 = b1Var2111111111116;
                        exoPlayer4 = exoPlayer3;
                        z29 = z31111111;
                        sVar2.o0(objQ17);
                    } else {
                        final l1.b1 b1Var2111111111118 = b1Var12;
                        final l1.b1 b1Var2111111111119 = b1Var7;
                        final l1.b1 b1Var21111111111110 = b1Var13;
                        final boolean z31111113 = z22;
                        final boolean z31111114 = z15;
                        final l1.b1 b1Var21111111111111 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var21111111111111.setValue(Boolean.TRUE);
                                y4.d(z31111114, z31111113, h5Var4, b0Var3, b1Var2111111111118, b1Var21111111111110, b1Var2111111111119, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z31111114;
                        b1Var14 = b1Var21111111111110;
                        exoPlayer4 = exoPlayer3;
                        z29 = z31111113;
                        sVar2.o0(objQ17);
                    }
                    e(exoPlayer4, cVar118, (fz.a) objQ17, sVar2, 0);
                    if (z29) {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    } else {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    }
                    sVar3.p(z30);
                    sVar = sVar3;
                    obj2 = obj3;
                    z14 = z15;
                    cVar3 = cVar6;
                    j12 = j14;
                    recordingStatus2 = recordingStatus7;
                } else {
                    gVar2 = gVar;
                }
                objQ16 = new y3(cVar5, b1Var, 1);
                sVar2.o0(objQ16);
                fz.c cVar119 = (fz.c) objQ16;
                boolean zF1119 = sVar2.f(b1Var11);
                cVar6 = cVar5;
                if (i26 == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean zG110 = zF1119 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                b0Var3 = b0Var2;
                zH4 = zG110 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                objQ17 = sVar2.Q();
                if (zH4) {
                    final l1.b1 b1Var21111111111112 = b1Var12;
                    final l1.b1 b1Var21111111111113 = b1Var7;
                    final l1.b1 b1Var21111111111114 = b1Var13;
                    final boolean z31111115 = z22;
                    final boolean z31111116 = z15;
                    final l1.b1 b1Var21111111111115 = b1Var11;
                    objQ17 = new fz.a() { // from class: dt.q4
                        @Override // fz.a
                        public final Object invoke() {
                            b1Var21111111111115.setValue(Boolean.TRUE);
                            y4.d(z31111116, z31111115, h5Var4, b0Var3, b1Var21111111111112, b1Var21111111111114, b1Var21111111111113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                            return qy.b0.f48488a;
                        }
                    };
                    z15 = z31111116;
                    b1Var14 = b1Var21111111111114;
                    exoPlayer4 = exoPlayer3;
                    z29 = z31111115;
                    sVar2.o0(objQ17);
                } else {
                    final l1.b1 b1Var21111111111116 = b1Var12;
                    final l1.b1 b1Var21111111111117 = b1Var7;
                    final l1.b1 b1Var21111111111118 = b1Var13;
                    final boolean z31111117 = z22;
                    final boolean z31111118 = z15;
                    final l1.b1 b1Var21111111111119 = b1Var11;
                    objQ17 = new fz.a() { // from class: dt.q4
                        @Override // fz.a
                        public final Object invoke() {
                            b1Var21111111111119.setValue(Boolean.TRUE);
                            y4.d(z31111118, z31111117, h5Var4, b0Var3, b1Var21111111111116, b1Var21111111111118, b1Var21111111111117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                            return qy.b0.f48488a;
                        }
                    };
                    z15 = z31111118;
                    b1Var14 = b1Var21111111111118;
                    exoPlayer4 = exoPlayer3;
                    z29 = z31111117;
                    sVar2.o0(objQ17);
                }
                e(exoPlayer4, cVar119, (fz.a) objQ17, sVar2, 0);
                if (z29) {
                    cVar6 = cVar6;
                    sVar3 = sVar2;
                    z30 = true;
                    sVar3.d0(1439380887);
                    sVar3.p(false);
                } else {
                    cVar6 = cVar6;
                    sVar3 = sVar2;
                    z30 = true;
                    sVar3.d0(1439380887);
                    sVar3.p(false);
                }
                sVar3.p(z30);
                sVar = sVar3;
                obj2 = obj3;
                z14 = z15;
                cVar3 = cVar6;
                j12 = j14;
                recordingStatus2 = recordingStatus7;
            } else {
                sVar4.W();
                z14 = z12;
                sVar = sVar4;
                cVar3 = cVar2;
                j12 = j11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.s4
                    @Override // fz.e
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        y4.a(uri, rVar, recordingStatus2, z14, j12, obj2, cVar3, (l1.n) obj4, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 384;
        recordingStatus2 = recordingStatus;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                z12 = z11;
                if (sVar4.g(z12)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    if (sVar4.e(j11)) {
                        i17 = 16384;
                    } else {
                        i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= 196608;
                    obj2 = obj;
                } else {
                    obj2 = obj;
                    if ((i11 & 196608) == 0) {
                        if (sVar4.h(obj2)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                }
                i21 = i12 & 64;
                if (i21 != 0) {
                    i13 |= 1572864;
                    cVar2 = cVar;
                } else {
                    cVar2 = cVar;
                    if ((i11 & 1572864) == 0) {
                        if (sVar4.h(cVar2)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i13 |= i22;
                    }
                }
                if ((i13 & 599187) != 599186) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar4.T(i13 & 1, z13)) {
                    if (i28 != 0) {
                        recordingStatus3 = null;
                    } else {
                        recordingStatus3 = recordingStatus2;
                    }
                    if (i14 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i16 != 0) {
                        j13 = 0;
                    } else {
                        j13 = j11;
                    }
                    if (i18 != 0) {
                        obj3 = qy.b0.f48488a;
                    } else {
                        obj3 = obj2;
                    }
                    gVar = l1.m.f39353a;
                    if (i21 != 0) {
                        objQ22 = sVar4.Q();
                        if (objQ22 == gVar) {
                            objQ22 = new d0.y1(29);
                            sVar4.o0(objQ22);
                        }
                        cVar4 = (fz.c) objQ22;
                    } else {
                        cVar4 = cVar2;
                    }
                    context = (Context) sVar4.j(AndroidCompositionLocals_androidKt.f1200b);
                    objQ = sVar4.Q();
                    if (objQ == gVar) {
                        objQ = l1.t.q(sVar4);
                        sVar4.o0(objQ);
                    }
                    b0Var = (rz.b0) objQ;
                    objQ2 = sVar4.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new f7.n(context).a();
                        sVar4.o0(objQ2);
                    }
                    exoPlayer = (ExoPlayer) objQ2;
                    kotlin.jvm.internal.m.c(exoPlayer);
                    zF = sVar4.f(obj3);
                    objQ3 = sVar4.Q();
                    if (zF) {
                        objQ3 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ3);
                    } else {
                        objQ3 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ3);
                    }
                    b1Var = (l1.b1) objQ3;
                    zF2 = sVar4.f(obj3);
                    objQ4 = sVar4.Q();
                    if (zF2) {
                        objQ4 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ4);
                    } else {
                        objQ4 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ4);
                    }
                    b1Var2 = (l1.b1) objQ4;
                    zF3 = sVar4.f(obj3);
                    objQ5 = sVar4.Q();
                    if (zF3) {
                        objQ5 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ5);
                    } else {
                        objQ5 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ5);
                    }
                    b1Var3 = (l1.b1) objQ5;
                    zF4 = sVar4.f(obj3);
                    objQ6 = sVar4.Q();
                    if (zF4) {
                        objQ6 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ6);
                    } else {
                        objQ6 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ6);
                    }
                    b1Var4 = (l1.b1) objQ6;
                    objQ7 = sVar4.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new h5();
                        sVar4.o0(objQ7);
                    }
                    h5Var = (h5) objQ7;
                    zF5 = sVar4.f(obj3);
                    i23 = i13;
                    objQ8 = sVar4.Q();
                    if (zF5) {
                        objQ8 = l1.t.B(Long.valueOf(j13));
                        sVar4.o0(objQ8);
                    } else {
                        objQ8 = l1.t.B(Long.valueOf(j13));
                        sVar4.o0(objQ8);
                    }
                    b1Var5 = (l1.b1) objQ8;
                    zF6 = sVar4.f(obj3);
                    objQ9 = sVar4.Q();
                    if (zF6) {
                        objQ9 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ9);
                    } else {
                        objQ9 = l1.t.B(Boolean.FALSE);
                        sVar4.o0(objQ9);
                    }
                    b1Var6 = (l1.b1) objQ9;
                    if (((Boolean) b1Var6.getValue()).booleanValue()) {
                        f5 = 1.0f;
                    } else {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    l1.b3 b3VarB5 = b0.h.b(f5, null, "VideoAlphaAnimation", sVar4, 3072, 22);
                    zA = kotlin.jvm.internal.m.a(recordingStatus3, RecordingStatus.Recording.INSTANCE);
                    RecordingStatus recordingStatus8 = recordingStatus3;
                    b1VarH = l1.t.H(Boolean.valueOf(z15), sVar4);
                    b1VarH2 = l1.t.H(Boolean.valueOf(zA), sVar4);
                    b1VarH3 = l1.t.H(Boolean.valueOf(((Boolean) b1Var4.getValue()).booleanValue()), sVar4);
                    b1VarH4 = l1.t.H(cVar4, sVar4);
                    boolean zH13 = sVar4.h(h5Var) | sVar4.h(uri) | sVar4.h(exoPlayer) | sVar4.f(b1Var6) | sVar4.f(b1Var) | sVar4.f(b1Var3) | sVar4.f(b1Var4) | sVar4.f(b1Var2);
                    i24 = i23 & 3670016;
                    if (i24 == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zH13 | z16;
                    objQ10 = sVar4.Q();
                    if (z17) {
                        b1Var7 = b1Var2;
                        b1Var8 = b1Var3;
                        exoPlayer2 = exoPlayer;
                        i25 = i24;
                        b1Var9 = b1Var6;
                        sVar2 = sVar4;
                        b1Var10 = b1Var4;
                        objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                        sVar2.o0(objQ10);
                    } else {
                        b1Var7 = b1Var2;
                        b1Var8 = b1Var3;
                        exoPlayer2 = exoPlayer;
                        i25 = i24;
                        b1Var9 = b1Var6;
                        sVar2 = sVar4;
                        b1Var10 = b1Var4;
                        objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                        sVar2.o0(objQ10);
                    }
                    l1.t.g(uri, obj3, (fz.e) objQ10, sVar2);
                    Boolean boolValueOf9 = Boolean.valueOf(z15);
                    i26 = i23 & 7168;
                    if (i26 == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zH = z18 | sVar2.h(h5Var) | sVar2.f(b1Var10) | sVar2.h(exoPlayer2) | sVar2.f(b1Var) | sVar2.f(b1Var8) | sVar2.f(b1Var9) | sVar2.g(zA) | sVar2.f(b1Var7) | sVar2.h(b0Var) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.f(b1VarH4);
                    objQ11 = sVar2.Q();
                    exoPlayer3 = exoPlayer2;
                    if (zH) {
                        l1.b1 b1Var1118 = b1Var9;
                        z19 = zA;
                        objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var1118, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                        h5Var2 = h5Var;
                        b1Var11 = b1Var1118;
                        b0Var2 = b0Var;
                        sVar2.o0(objQ11);
                    } else {
                        l1.b1 b1Var1119 = b1Var9;
                        z19 = zA;
                        objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var1119, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                        h5Var2 = h5Var;
                        b1Var11 = b1Var1119;
                        b0Var2 = b0Var;
                        sVar2.o0(objQ11);
                    }
                    l1.t.f((fz.e) objQ11, boolValueOf9, sVar2);
                    Boolean boolValueOf10 = Boolean.valueOf(z19);
                    boolean zG111 = sVar2.g(z19) | sVar2.h(h5Var2) | sVar2.h(exoPlayer3);
                    i27 = i25;
                    if (i27 == 1048576) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    boolean zF11110 = zG111 | z20 | sVar2.f(b1Var8);
                    if (i26 == 2048) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    zF7 = zF11110 | z21 | sVar2.f(b1Var10);
                    objQ12 = sVar2.Q();
                    if (zF7) {
                        boolean z3212 = z19;
                        l1.b1 b1Var11110 = b1Var8;
                        l1.b1 b1Var11111 = b1Var10;
                        h5 h5Var12 = h5Var2;
                        boolean z3213 = z15;
                        objQ12 = new v4(z3212, exoPlayer3, cVar4, z3213, h5Var12, b1Var11110, b1Var11111, null);
                        z22 = z3212;
                        z15 = z3213;
                        b1Var12 = b1Var11110;
                        b1Var13 = b1Var11111;
                        h5Var3 = h5Var12;
                        sVar2.o0(objQ12);
                    } else {
                        boolean z3214 = z19;
                        l1.b1 b1Var11112 = b1Var8;
                        l1.b1 b1Var11113 = b1Var10;
                        h5 h5Var13 = h5Var2;
                        boolean z3215 = z15;
                        objQ12 = new v4(z3214, exoPlayer3, cVar4, z3215, h5Var13, b1Var11112, b1Var11113, null);
                        z22 = z3214;
                        z15 = z3215;
                        b1Var12 = b1Var11112;
                        b1Var13 = b1Var11113;
                        h5Var3 = h5Var13;
                        sVar2.o0(objQ12);
                    }
                    l1.t.f((fz.e) objQ12, boolValueOf10, sVar2);
                    Long lValueOf5 = Long.valueOf(j13);
                    if ((i23 & 57344) == 16384) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    boolean zF11111 = z23 | sVar2.f(b1Var5) | sVar2.h(h5Var3) | sVar2.f(b1Var) | sVar2.h(r23) | sVar2.f(b1Var7) | sVar2.f(b1Var12) | sVar2.f(b1Var13);
                    if (i27 == 1048576) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zF11111 | z24;
                    objQ13 = sVar2.Q();
                    if (z25) {
                        fz.c cVar1110 = cVar4;
                        long j112 = j13;
                        objQ13 = new w4(j112, r23, cVar1110, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                        j14 = j112;
                        cVar5 = cVar1110;
                        sVar2.o0(objQ13);
                    } else {
                        fz.c cVar1111 = cVar4;
                        long j113 = j13;
                        objQ13 = new w4(j113, r23, cVar1111, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                        j14 = j113;
                        cVar5 = cVar1111;
                        sVar2.o0(objQ13);
                    }
                    l1.t.f((fz.e) objQ13, lValueOf5, sVar2);
                    lifecycleOwner = (LifecycleOwner) sVar2.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    zH2 = sVar2.h(r23) | sVar2.h(lifecycleOwner);
                    objQ14 = sVar2.Q();
                    if (zH2) {
                        objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                        sVar2.o0(objQ14);
                    } else {
                        objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                        sVar2.o0(objQ14);
                    }
                    l1.t.d(lifecycleOwner, r23, (fz.c) objQ14, sVar2);
                    zH3 = sVar2.h(h5Var3) | sVar2.h(r23);
                    objQ15 = sVar2.Q();
                    if (zH3) {
                        objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                        sVar2.o0(objQ15);
                    } else {
                        objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                        sVar2.o0(objQ15);
                    }
                    l1.t.c(r23, (fz.c) objQ15, sVar2);
                    z1.r rVarA6 = d2.h.a(rVar, ((Number) b3VarB5.getValue()).floatValue());
                    w2.q0 q0VarD9 = j0.o.d(z1.c.f58463a, false);
                    iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL10 = sVar2.l();
                    z1.r rVarC14 = z1.a.c(sVar2, rVarA6);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    h5Var4 = h5Var3;
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD9, sVar2);
                    y2.h hVar110 = y2.j.f56916e;
                    l1.t.J(hVar110, q1VarL10, sVar2);
                    y2.h hVar111 = y2.j.f56918g;
                    if (sVar2.S) {
                        hVar2 = hVar;
                        if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        }
                        y2.h hVar112 = y2.j.f56915d;
                        l1.t.J(hVar112, rVarC14, sVar2);
                        boolean zF11112 = sVar2.f(b1Var);
                        if (i27 == 1048576) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = zF11112 | z26;
                        objQ16 = sVar2.Q();
                        if (z27) {
                            gVar2 = gVar;
                            if (objQ16 == gVar2) {
                            }
                            fz.c cVar1112 = (fz.c) objQ16;
                            boolean zF11113 = sVar2.f(b1Var11);
                            cVar6 = cVar5;
                            if (i26 == 2048) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            boolean zG112 = zF11113 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                            b0Var3 = b0Var2;
                            zH4 = zG112 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                            objQ17 = sVar2.Q();
                            if (zH4) {
                                final l1.b1 b1Var211111111111110 = b1Var12;
                                final l1.b1 b1Var211111111111111 = b1Var7;
                                final l1.b1 b1Var211111111111112 = b1Var13;
                                final boolean z31111119 = z22;
                                final boolean z311111110 = z15;
                                final l1.b1 b1Var211111111111113 = b1Var11;
                                objQ17 = new fz.a() { // from class: dt.q4
                                    @Override // fz.a
                                    public final Object invoke() {
                                        b1Var211111111111113.setValue(Boolean.TRUE);
                                        y4.d(z311111110, z31111119, h5Var4, b0Var3, b1Var211111111111110, b1Var211111111111112, b1Var211111111111111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                        return qy.b0.f48488a;
                                    }
                                };
                                z15 = z311111110;
                                b1Var14 = b1Var211111111111112;
                                exoPlayer4 = exoPlayer3;
                                z29 = z31111119;
                                sVar2.o0(objQ17);
                            } else {
                                final l1.b1 b1Var211111111111114 = b1Var12;
                                final l1.b1 b1Var211111111111115 = b1Var7;
                                final l1.b1 b1Var211111111111116 = b1Var13;
                                final boolean z311111111 = z22;
                                final boolean z311111112 = z15;
                                final l1.b1 b1Var211111111111117 = b1Var11;
                                objQ17 = new fz.a() { // from class: dt.q4
                                    @Override // fz.a
                                    public final Object invoke() {
                                        b1Var211111111111117.setValue(Boolean.TRUE);
                                        y4.d(z311111112, z311111111, h5Var4, b0Var3, b1Var211111111111114, b1Var211111111111116, b1Var211111111111115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                        return qy.b0.f48488a;
                                    }
                                };
                                z15 = z311111112;
                                b1Var14 = b1Var211111111111116;
                                exoPlayer4 = exoPlayer3;
                                z29 = z311111111;
                                sVar2.o0(objQ17);
                            }
                            e(exoPlayer4, cVar1112, (fz.a) objQ17, sVar2, 0);
                            if (z29) {
                                cVar6 = cVar6;
                                sVar3 = sVar2;
                                z30 = true;
                                sVar3.d0(1439380887);
                                sVar3.p(false);
                            } else {
                                cVar6 = cVar6;
                                sVar3 = sVar2;
                                z30 = true;
                                sVar3.d0(1439380887);
                                sVar3.p(false);
                            }
                            sVar3.p(z30);
                            sVar = sVar3;
                            obj2 = obj3;
                            z14 = z15;
                            cVar3 = cVar6;
                            j12 = j14;
                            recordingStatus2 = recordingStatus8;
                        } else {
                            gVar2 = gVar;
                        }
                        objQ16 = new y3(cVar5, b1Var, 1);
                        sVar2.o0(objQ16);
                        fz.c cVar1113 = (fz.c) objQ16;
                        boolean zF11114 = sVar2.f(b1Var11);
                        cVar6 = cVar5;
                        if (i26 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean zG113 = zF11114 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                        b0Var3 = b0Var2;
                        zH4 = zG113 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                        objQ17 = sVar2.Q();
                        if (zH4) {
                            final l1.b1 b1Var211111111111118 = b1Var12;
                            final l1.b1 b1Var211111111111119 = b1Var7;
                            final l1.b1 b1Var2111111111111110 = b1Var13;
                            final boolean z311111113 = z22;
                            final boolean z311111114 = z15;
                            final l1.b1 b1Var2111111111111111 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var2111111111111111.setValue(Boolean.TRUE);
                                    y4.d(z311111114, z311111113, h5Var4, b0Var3, b1Var211111111111118, b1Var2111111111111110, b1Var211111111111119, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z311111114;
                            b1Var14 = b1Var2111111111111110;
                            exoPlayer4 = exoPlayer3;
                            z29 = z311111113;
                            sVar2.o0(objQ17);
                        } else {
                            final l1.b1 b1Var2111111111111112 = b1Var12;
                            final l1.b1 b1Var2111111111111113 = b1Var7;
                            final l1.b1 b1Var2111111111111114 = b1Var13;
                            final boolean z311111115 = z22;
                            final boolean z311111116 = z15;
                            final l1.b1 b1Var2111111111111115 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var2111111111111115.setValue(Boolean.TRUE);
                                    y4.d(z311111116, z311111115, h5Var4, b0Var3, b1Var2111111111111112, b1Var2111111111111114, b1Var2111111111111113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z311111116;
                            b1Var14 = b1Var2111111111111114;
                            exoPlayer4 = exoPlayer3;
                            z29 = z311111115;
                            sVar2.o0(objQ17);
                        }
                        e(exoPlayer4, cVar1113, (fz.a) objQ17, sVar2, 0);
                        if (z29) {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        } else {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        }
                        sVar3.p(z30);
                        sVar = sVar3;
                        obj2 = obj3;
                        z14 = z15;
                        cVar3 = cVar6;
                        j12 = j14;
                        recordingStatus2 = recordingStatus8;
                    } else {
                        hVar2 = hVar;
                    }
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar111);
                    y2.h hVar113 = y2.j.f56915d;
                    l1.t.J(hVar113, rVarC14, sVar2);
                    boolean zF11115 = sVar2.f(b1Var);
                    if (i27 == 1048576) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zF11115 | z26;
                    objQ16 = sVar2.Q();
                    if (z27) {
                        gVar2 = gVar;
                        if (objQ16 == gVar2) {
                        }
                        fz.c cVar1114 = (fz.c) objQ16;
                        boolean zF11116 = sVar2.f(b1Var11);
                        cVar6 = cVar5;
                        if (i26 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean zG114 = zF11116 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                        b0Var3 = b0Var2;
                        zH4 = zG114 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                        objQ17 = sVar2.Q();
                        if (zH4) {
                            final l1.b1 b1Var2111111111111116 = b1Var12;
                            final l1.b1 b1Var2111111111111117 = b1Var7;
                            final l1.b1 b1Var2111111111111118 = b1Var13;
                            final boolean z311111117 = z22;
                            final boolean z311111118 = z15;
                            final l1.b1 b1Var2111111111111119 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var2111111111111119.setValue(Boolean.TRUE);
                                    y4.d(z311111118, z311111117, h5Var4, b0Var3, b1Var2111111111111116, b1Var2111111111111118, b1Var2111111111111117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z311111118;
                            b1Var14 = b1Var2111111111111118;
                            exoPlayer4 = exoPlayer3;
                            z29 = z311111117;
                            sVar2.o0(objQ17);
                        } else {
                            final l1.b1 b1Var21111111111111110 = b1Var12;
                            final l1.b1 b1Var21111111111111111 = b1Var7;
                            final l1.b1 b1Var21111111111111112 = b1Var13;
                            final boolean z311111119 = z22;
                            final boolean z3111111110 = z15;
                            final l1.b1 b1Var21111111111111113 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var21111111111111113.setValue(Boolean.TRUE);
                                    y4.d(z3111111110, z311111119, h5Var4, b0Var3, b1Var21111111111111110, b1Var21111111111111112, b1Var21111111111111111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z3111111110;
                            b1Var14 = b1Var21111111111111112;
                            exoPlayer4 = exoPlayer3;
                            z29 = z311111119;
                            sVar2.o0(objQ17);
                        }
                        e(exoPlayer4, cVar1114, (fz.a) objQ17, sVar2, 0);
                        if (z29) {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        } else {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        }
                        sVar3.p(z30);
                        sVar = sVar3;
                        obj2 = obj3;
                        z14 = z15;
                        cVar3 = cVar6;
                        j12 = j14;
                        recordingStatus2 = recordingStatus8;
                    } else {
                        gVar2 = gVar;
                    }
                    objQ16 = new y3(cVar5, b1Var, 1);
                    sVar2.o0(objQ16);
                    fz.c cVar1115 = (fz.c) objQ16;
                    boolean zF11117 = sVar2.f(b1Var11);
                    cVar6 = cVar5;
                    if (i26 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean zG115 = zF11117 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                    b0Var3 = b0Var2;
                    zH4 = zG115 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                    objQ17 = sVar2.Q();
                    if (zH4) {
                        final l1.b1 b1Var21111111111111114 = b1Var12;
                        final l1.b1 b1Var21111111111111115 = b1Var7;
                        final l1.b1 b1Var21111111111111116 = b1Var13;
                        final boolean z3111111111 = z22;
                        final boolean z3111111112 = z15;
                        final l1.b1 b1Var21111111111111117 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var21111111111111117.setValue(Boolean.TRUE);
                                y4.d(z3111111112, z3111111111, h5Var4, b0Var3, b1Var21111111111111114, b1Var21111111111111116, b1Var21111111111111115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z3111111112;
                        b1Var14 = b1Var21111111111111116;
                        exoPlayer4 = exoPlayer3;
                        z29 = z3111111111;
                        sVar2.o0(objQ17);
                    } else {
                        final l1.b1 b1Var21111111111111118 = b1Var12;
                        final l1.b1 b1Var21111111111111119 = b1Var7;
                        final l1.b1 b1Var211111111111111110 = b1Var13;
                        final boolean z3111111113 = z22;
                        final boolean z3111111114 = z15;
                        final l1.b1 b1Var211111111111111111 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var211111111111111111.setValue(Boolean.TRUE);
                                y4.d(z3111111114, z3111111113, h5Var4, b0Var3, b1Var21111111111111118, b1Var211111111111111110, b1Var21111111111111119, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z3111111114;
                        b1Var14 = b1Var211111111111111110;
                        exoPlayer4 = exoPlayer3;
                        z29 = z3111111113;
                        sVar2.o0(objQ17);
                    }
                    e(exoPlayer4, cVar1115, (fz.a) objQ17, sVar2, 0);
                    if (z29) {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    } else {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    }
                    sVar3.p(z30);
                    sVar = sVar3;
                    obj2 = obj3;
                    z14 = z15;
                    cVar3 = cVar6;
                    j12 = j14;
                    recordingStatus2 = recordingStatus8;
                } else {
                    sVar4.W();
                    z14 = z12;
                    sVar = sVar4;
                    cVar3 = cVar2;
                    j12 = j11;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.s4
                        @Override // fz.e
                        public final Object invoke(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            y4.a(uri, rVar, recordingStatus2, z14, j12, obj2, cVar3, (l1.n) obj4, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 24576;
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= 196608;
                obj2 = obj;
            } else {
                obj2 = obj;
                if ((i11 & 196608) == 0) {
                    if (sVar4.h(obj2)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            i21 = i12 & 64;
            if (i21 != 0) {
                i13 |= 1572864;
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
                if ((i11 & 1572864) == 0) {
                    if (sVar4.h(cVar2)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i13 |= i22;
                }
            }
            if ((i13 & 599187) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar4.T(i13 & 1, z13)) {
                if (i28 != 0) {
                    recordingStatus3 = null;
                } else {
                    recordingStatus3 = recordingStatus2;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i16 != 0) {
                    j13 = 0;
                } else {
                    j13 = j11;
                }
                if (i18 != 0) {
                    obj3 = qy.b0.f48488a;
                } else {
                    obj3 = obj2;
                }
                gVar = l1.m.f39353a;
                if (i21 != 0) {
                    objQ22 = sVar4.Q();
                    if (objQ22 == gVar) {
                        objQ22 = new d0.y1(29);
                        sVar4.o0(objQ22);
                    }
                    cVar4 = (fz.c) objQ22;
                } else {
                    cVar4 = cVar2;
                }
                context = (Context) sVar4.j(AndroidCompositionLocals_androidKt.f1200b);
                objQ = sVar4.Q();
                if (objQ == gVar) {
                    objQ = l1.t.q(sVar4);
                    sVar4.o0(objQ);
                }
                b0Var = (rz.b0) objQ;
                objQ2 = sVar4.Q();
                if (objQ2 == gVar) {
                    objQ2 = new f7.n(context).a();
                    sVar4.o0(objQ2);
                }
                exoPlayer = (ExoPlayer) objQ2;
                kotlin.jvm.internal.m.c(exoPlayer);
                zF = sVar4.f(obj3);
                objQ3 = sVar4.Q();
                if (zF) {
                    objQ3 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ3);
                } else {
                    objQ3 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ3);
                }
                b1Var = (l1.b1) objQ3;
                zF2 = sVar4.f(obj3);
                objQ4 = sVar4.Q();
                if (zF2) {
                    objQ4 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ4);
                } else {
                    objQ4 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ4);
                }
                b1Var2 = (l1.b1) objQ4;
                zF3 = sVar4.f(obj3);
                objQ5 = sVar4.Q();
                if (zF3) {
                    objQ5 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ5);
                } else {
                    objQ5 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ5);
                }
                b1Var3 = (l1.b1) objQ5;
                zF4 = sVar4.f(obj3);
                objQ6 = sVar4.Q();
                if (zF4) {
                    objQ6 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ6);
                } else {
                    objQ6 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ6);
                }
                b1Var4 = (l1.b1) objQ6;
                objQ7 = sVar4.Q();
                if (objQ7 == gVar) {
                    objQ7 = new h5();
                    sVar4.o0(objQ7);
                }
                h5Var = (h5) objQ7;
                zF5 = sVar4.f(obj3);
                i23 = i13;
                objQ8 = sVar4.Q();
                if (zF5) {
                    objQ8 = l1.t.B(Long.valueOf(j13));
                    sVar4.o0(objQ8);
                } else {
                    objQ8 = l1.t.B(Long.valueOf(j13));
                    sVar4.o0(objQ8);
                }
                b1Var5 = (l1.b1) objQ8;
                zF6 = sVar4.f(obj3);
                objQ9 = sVar4.Q();
                if (zF6) {
                    objQ9 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ9);
                } else {
                    objQ9 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ9);
                }
                b1Var6 = (l1.b1) objQ9;
                if (((Boolean) b1Var6.getValue()).booleanValue()) {
                    f5 = 1.0f;
                } else {
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                l1.b3 b3VarB6 = b0.h.b(f5, null, "VideoAlphaAnimation", sVar4, 3072, 22);
                zA = kotlin.jvm.internal.m.a(recordingStatus3, RecordingStatus.Recording.INSTANCE);
                RecordingStatus recordingStatus9 = recordingStatus3;
                b1VarH = l1.t.H(Boolean.valueOf(z15), sVar4);
                b1VarH2 = l1.t.H(Boolean.valueOf(zA), sVar4);
                b1VarH3 = l1.t.H(Boolean.valueOf(((Boolean) b1Var4.getValue()).booleanValue()), sVar4);
                b1VarH4 = l1.t.H(cVar4, sVar4);
                boolean zH14 = sVar4.h(h5Var) | sVar4.h(uri) | sVar4.h(exoPlayer) | sVar4.f(b1Var6) | sVar4.f(b1Var) | sVar4.f(b1Var3) | sVar4.f(b1Var4) | sVar4.f(b1Var2);
                i24 = i23 & 3670016;
                if (i24 == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zH14 | z16;
                objQ10 = sVar4.Q();
                if (z17) {
                    b1Var7 = b1Var2;
                    b1Var8 = b1Var3;
                    exoPlayer2 = exoPlayer;
                    i25 = i24;
                    b1Var9 = b1Var6;
                    sVar2 = sVar4;
                    b1Var10 = b1Var4;
                    objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                    sVar2.o0(objQ10);
                } else {
                    b1Var7 = b1Var2;
                    b1Var8 = b1Var3;
                    exoPlayer2 = exoPlayer;
                    i25 = i24;
                    b1Var9 = b1Var6;
                    sVar2 = sVar4;
                    b1Var10 = b1Var4;
                    objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                    sVar2.o0(objQ10);
                }
                l1.t.g(uri, obj3, (fz.e) objQ10, sVar2);
                Boolean boolValueOf11 = Boolean.valueOf(z15);
                i26 = i23 & 7168;
                if (i26 == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zH = z18 | sVar2.h(h5Var) | sVar2.f(b1Var10) | sVar2.h(exoPlayer2) | sVar2.f(b1Var) | sVar2.f(b1Var8) | sVar2.f(b1Var9) | sVar2.g(zA) | sVar2.f(b1Var7) | sVar2.h(b0Var) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.f(b1VarH4);
                objQ11 = sVar2.Q();
                exoPlayer3 = exoPlayer2;
                if (zH) {
                    l1.b1 b1Var11114 = b1Var9;
                    z19 = zA;
                    objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var11114, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                    h5Var2 = h5Var;
                    b1Var11 = b1Var11114;
                    b0Var2 = b0Var;
                    sVar2.o0(objQ11);
                } else {
                    l1.b1 b1Var11115 = b1Var9;
                    z19 = zA;
                    objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var11115, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                    h5Var2 = h5Var;
                    b1Var11 = b1Var11115;
                    b0Var2 = b0Var;
                    sVar2.o0(objQ11);
                }
                l1.t.f((fz.e) objQ11, boolValueOf11, sVar2);
                Boolean boolValueOf12 = Boolean.valueOf(z19);
                boolean zG116 = sVar2.g(z19) | sVar2.h(h5Var2) | sVar2.h(exoPlayer3);
                i27 = i25;
                if (i27 == 1048576) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean zF11118 = zG116 | z20 | sVar2.f(b1Var8);
                if (i26 == 2048) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                zF7 = zF11118 | z21 | sVar2.f(b1Var10);
                objQ12 = sVar2.Q();
                if (zF7) {
                    boolean z3216 = z19;
                    l1.b1 b1Var11116 = b1Var8;
                    l1.b1 b1Var11117 = b1Var10;
                    h5 h5Var14 = h5Var2;
                    boolean z3217 = z15;
                    objQ12 = new v4(z3216, exoPlayer3, cVar4, z3217, h5Var14, b1Var11116, b1Var11117, null);
                    z22 = z3216;
                    z15 = z3217;
                    b1Var12 = b1Var11116;
                    b1Var13 = b1Var11117;
                    h5Var3 = h5Var14;
                    sVar2.o0(objQ12);
                } else {
                    boolean z3218 = z19;
                    l1.b1 b1Var11118 = b1Var8;
                    l1.b1 b1Var11119 = b1Var10;
                    h5 h5Var15 = h5Var2;
                    boolean z3219 = z15;
                    objQ12 = new v4(z3218, exoPlayer3, cVar4, z3219, h5Var15, b1Var11118, b1Var11119, null);
                    z22 = z3218;
                    z15 = z3219;
                    b1Var12 = b1Var11118;
                    b1Var13 = b1Var11119;
                    h5Var3 = h5Var15;
                    sVar2.o0(objQ12);
                }
                l1.t.f((fz.e) objQ12, boolValueOf12, sVar2);
                Long lValueOf6 = Long.valueOf(j13);
                if ((i23 & 57344) == 16384) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean zF11119 = z23 | sVar2.f(b1Var5) | sVar2.h(h5Var3) | sVar2.f(b1Var) | sVar2.h(r23) | sVar2.f(b1Var7) | sVar2.f(b1Var12) | sVar2.f(b1Var13);
                if (i27 == 1048576) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zF11119 | z24;
                objQ13 = sVar2.Q();
                if (z25) {
                    fz.c cVar1116 = cVar4;
                    long j114 = j13;
                    objQ13 = new w4(j114, r23, cVar1116, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                    j14 = j114;
                    cVar5 = cVar1116;
                    sVar2.o0(objQ13);
                } else {
                    fz.c cVar1117 = cVar4;
                    long j115 = j13;
                    objQ13 = new w4(j115, r23, cVar1117, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                    j14 = j115;
                    cVar5 = cVar1117;
                    sVar2.o0(objQ13);
                }
                l1.t.f((fz.e) objQ13, lValueOf6, sVar2);
                lifecycleOwner = (LifecycleOwner) sVar2.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                zH2 = sVar2.h(r23) | sVar2.h(lifecycleOwner);
                objQ14 = sVar2.Q();
                if (zH2) {
                    objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                    sVar2.o0(objQ14);
                } else {
                    objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                    sVar2.o0(objQ14);
                }
                l1.t.d(lifecycleOwner, r23, (fz.c) objQ14, sVar2);
                zH3 = sVar2.h(h5Var3) | sVar2.h(r23);
                objQ15 = sVar2.Q();
                if (zH3) {
                    objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                    sVar2.o0(objQ15);
                } else {
                    objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                    sVar2.o0(objQ15);
                }
                l1.t.c(r23, (fz.c) objQ15, sVar2);
                z1.r rVarA7 = d2.h.a(rVar, ((Number) b3VarB6.getValue()).floatValue());
                w2.q0 q0VarD10 = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL11 = sVar2.l();
                z1.r rVarC15 = z1.a.c(sVar2, rVarA7);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                h5Var4 = h5Var3;
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                hVar = y2.j.f56917f;
                l1.t.J(hVar, q0VarD10, sVar2);
                y2.h hVar114 = y2.j.f56916e;
                l1.t.J(hVar114, q1VarL11, sVar2);
                y2.h hVar115 = y2.j.f56918g;
                if (sVar2.S) {
                    hVar2 = hVar;
                    if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    }
                    y2.h hVar116 = y2.j.f56915d;
                    l1.t.J(hVar116, rVarC15, sVar2);
                    boolean zF111110 = sVar2.f(b1Var);
                    if (i27 == 1048576) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zF111110 | z26;
                    objQ16 = sVar2.Q();
                    if (z27) {
                        gVar2 = gVar;
                        if (objQ16 == gVar2) {
                        }
                        fz.c cVar1118 = (fz.c) objQ16;
                        boolean zF111111 = sVar2.f(b1Var11);
                        cVar6 = cVar5;
                        if (i26 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean zG117 = zF111111 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                        b0Var3 = b0Var2;
                        zH4 = zG117 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                        objQ17 = sVar2.Q();
                        if (zH4) {
                            final l1.b1 b1Var211111111111111112 = b1Var12;
                            final l1.b1 b1Var211111111111111113 = b1Var7;
                            final l1.b1 b1Var211111111111111114 = b1Var13;
                            final boolean z3111111115 = z22;
                            final boolean z3111111116 = z15;
                            final l1.b1 b1Var211111111111111115 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var211111111111111115.setValue(Boolean.TRUE);
                                    y4.d(z3111111116, z3111111115, h5Var4, b0Var3, b1Var211111111111111112, b1Var211111111111111114, b1Var211111111111111113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z3111111116;
                            b1Var14 = b1Var211111111111111114;
                            exoPlayer4 = exoPlayer3;
                            z29 = z3111111115;
                            sVar2.o0(objQ17);
                        } else {
                            final l1.b1 b1Var211111111111111116 = b1Var12;
                            final l1.b1 b1Var211111111111111117 = b1Var7;
                            final l1.b1 b1Var211111111111111118 = b1Var13;
                            final boolean z3111111117 = z22;
                            final boolean z3111111118 = z15;
                            final l1.b1 b1Var211111111111111119 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var211111111111111119.setValue(Boolean.TRUE);
                                    y4.d(z3111111118, z3111111117, h5Var4, b0Var3, b1Var211111111111111116, b1Var211111111111111118, b1Var211111111111111117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z3111111118;
                            b1Var14 = b1Var211111111111111118;
                            exoPlayer4 = exoPlayer3;
                            z29 = z3111111117;
                            sVar2.o0(objQ17);
                        }
                        e(exoPlayer4, cVar1118, (fz.a) objQ17, sVar2, 0);
                        if (z29) {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        } else {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        }
                        sVar3.p(z30);
                        sVar = sVar3;
                        obj2 = obj3;
                        z14 = z15;
                        cVar3 = cVar6;
                        j12 = j14;
                        recordingStatus2 = recordingStatus9;
                    } else {
                        gVar2 = gVar;
                    }
                    objQ16 = new y3(cVar5, b1Var, 1);
                    sVar2.o0(objQ16);
                    fz.c cVar1119 = (fz.c) objQ16;
                    boolean zF111112 = sVar2.f(b1Var11);
                    cVar6 = cVar5;
                    if (i26 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean zG118 = zF111112 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                    b0Var3 = b0Var2;
                    zH4 = zG118 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                    objQ17 = sVar2.Q();
                    if (zH4) {
                        final l1.b1 b1Var2111111111111111110 = b1Var12;
                        final l1.b1 b1Var2111111111111111111 = b1Var7;
                        final l1.b1 b1Var2111111111111111112 = b1Var13;
                        final boolean z3111111119 = z22;
                        final boolean z31111111110 = z15;
                        final l1.b1 b1Var2111111111111111113 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var2111111111111111113.setValue(Boolean.TRUE);
                                y4.d(z31111111110, z3111111119, h5Var4, b0Var3, b1Var2111111111111111110, b1Var2111111111111111112, b1Var2111111111111111111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z31111111110;
                        b1Var14 = b1Var2111111111111111112;
                        exoPlayer4 = exoPlayer3;
                        z29 = z3111111119;
                        sVar2.o0(objQ17);
                    } else {
                        final l1.b1 b1Var2111111111111111114 = b1Var12;
                        final l1.b1 b1Var2111111111111111115 = b1Var7;
                        final l1.b1 b1Var2111111111111111116 = b1Var13;
                        final boolean z31111111111 = z22;
                        final boolean z31111111112 = z15;
                        final l1.b1 b1Var2111111111111111117 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var2111111111111111117.setValue(Boolean.TRUE);
                                y4.d(z31111111112, z31111111111, h5Var4, b0Var3, b1Var2111111111111111114, b1Var2111111111111111116, b1Var2111111111111111115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z31111111112;
                        b1Var14 = b1Var2111111111111111116;
                        exoPlayer4 = exoPlayer3;
                        z29 = z31111111111;
                        sVar2.o0(objQ17);
                    }
                    e(exoPlayer4, cVar1119, (fz.a) objQ17, sVar2, 0);
                    if (z29) {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    } else {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    }
                    sVar3.p(z30);
                    sVar = sVar3;
                    obj2 = obj3;
                    z14 = z15;
                    cVar3 = cVar6;
                    j12 = j14;
                    recordingStatus2 = recordingStatus9;
                } else {
                    hVar2 = hVar;
                }
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar115);
                y2.h hVar117 = y2.j.f56915d;
                l1.t.J(hVar117, rVarC15, sVar2);
                boolean zF111113 = sVar2.f(b1Var);
                if (i27 == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = zF111113 | z26;
                objQ16 = sVar2.Q();
                if (z27) {
                    gVar2 = gVar;
                    if (objQ16 == gVar2) {
                    }
                    fz.c cVar11110 = (fz.c) objQ16;
                    boolean zF111114 = sVar2.f(b1Var11);
                    cVar6 = cVar5;
                    if (i26 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean zG119 = zF111114 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                    b0Var3 = b0Var2;
                    zH4 = zG119 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                    objQ17 = sVar2.Q();
                    if (zH4) {
                        final l1.b1 b1Var2111111111111111118 = b1Var12;
                        final l1.b1 b1Var2111111111111111119 = b1Var7;
                        final l1.b1 b1Var21111111111111111110 = b1Var13;
                        final boolean z31111111113 = z22;
                        final boolean z31111111114 = z15;
                        final l1.b1 b1Var21111111111111111111 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var21111111111111111111.setValue(Boolean.TRUE);
                                y4.d(z31111111114, z31111111113, h5Var4, b0Var3, b1Var2111111111111111118, b1Var21111111111111111110, b1Var2111111111111111119, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z31111111114;
                        b1Var14 = b1Var21111111111111111110;
                        exoPlayer4 = exoPlayer3;
                        z29 = z31111111113;
                        sVar2.o0(objQ17);
                    } else {
                        final l1.b1 b1Var21111111111111111112 = b1Var12;
                        final l1.b1 b1Var21111111111111111113 = b1Var7;
                        final l1.b1 b1Var21111111111111111114 = b1Var13;
                        final boolean z31111111115 = z22;
                        final boolean z31111111116 = z15;
                        final l1.b1 b1Var21111111111111111115 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var21111111111111111115.setValue(Boolean.TRUE);
                                y4.d(z31111111116, z31111111115, h5Var4, b0Var3, b1Var21111111111111111112, b1Var21111111111111111114, b1Var21111111111111111113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z31111111116;
                        b1Var14 = b1Var21111111111111111114;
                        exoPlayer4 = exoPlayer3;
                        z29 = z31111111115;
                        sVar2.o0(objQ17);
                    }
                    e(exoPlayer4, cVar11110, (fz.a) objQ17, sVar2, 0);
                    if (z29) {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    } else {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    }
                    sVar3.p(z30);
                    sVar = sVar3;
                    obj2 = obj3;
                    z14 = z15;
                    cVar3 = cVar6;
                    j12 = j14;
                    recordingStatus2 = recordingStatus9;
                } else {
                    gVar2 = gVar;
                }
                objQ16 = new y3(cVar5, b1Var, 1);
                sVar2.o0(objQ16);
                fz.c cVar11111 = (fz.c) objQ16;
                boolean zF111115 = sVar2.f(b1Var11);
                cVar6 = cVar5;
                if (i26 == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean zG1110 = zF111115 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                b0Var3 = b0Var2;
                zH4 = zG1110 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                objQ17 = sVar2.Q();
                if (zH4) {
                    final l1.b1 b1Var21111111111111111116 = b1Var12;
                    final l1.b1 b1Var21111111111111111117 = b1Var7;
                    final l1.b1 b1Var21111111111111111118 = b1Var13;
                    final boolean z31111111117 = z22;
                    final boolean z31111111118 = z15;
                    final l1.b1 b1Var21111111111111111119 = b1Var11;
                    objQ17 = new fz.a() { // from class: dt.q4
                        @Override // fz.a
                        public final Object invoke() {
                            b1Var21111111111111111119.setValue(Boolean.TRUE);
                            y4.d(z31111111118, z31111111117, h5Var4, b0Var3, b1Var21111111111111111116, b1Var21111111111111111118, b1Var21111111111111111117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                            return qy.b0.f48488a;
                        }
                    };
                    z15 = z31111111118;
                    b1Var14 = b1Var21111111111111111118;
                    exoPlayer4 = exoPlayer3;
                    z29 = z31111111117;
                    sVar2.o0(objQ17);
                } else {
                    final l1.b1 b1Var211111111111111111110 = b1Var12;
                    final l1.b1 b1Var211111111111111111111 = b1Var7;
                    final l1.b1 b1Var211111111111111111112 = b1Var13;
                    final boolean z31111111119 = z22;
                    final boolean z311111111110 = z15;
                    final l1.b1 b1Var211111111111111111113 = b1Var11;
                    objQ17 = new fz.a() { // from class: dt.q4
                        @Override // fz.a
                        public final Object invoke() {
                            b1Var211111111111111111113.setValue(Boolean.TRUE);
                            y4.d(z311111111110, z31111111119, h5Var4, b0Var3, b1Var211111111111111111110, b1Var211111111111111111112, b1Var211111111111111111111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                            return qy.b0.f48488a;
                        }
                    };
                    z15 = z311111111110;
                    b1Var14 = b1Var211111111111111111112;
                    exoPlayer4 = exoPlayer3;
                    z29 = z31111111119;
                    sVar2.o0(objQ17);
                }
                e(exoPlayer4, cVar11111, (fz.a) objQ17, sVar2, 0);
                if (z29) {
                    cVar6 = cVar6;
                    sVar3 = sVar2;
                    z30 = true;
                    sVar3.d0(1439380887);
                    sVar3.p(false);
                } else {
                    cVar6 = cVar6;
                    sVar3 = sVar2;
                    z30 = true;
                    sVar3.d0(1439380887);
                    sVar3.p(false);
                }
                sVar3.p(z30);
                sVar = sVar3;
                obj2 = obj3;
                z14 = z15;
                cVar3 = cVar6;
                j12 = j14;
                recordingStatus2 = recordingStatus9;
            } else {
                sVar4.W();
                z14 = z12;
                sVar = sVar4;
                cVar3 = cVar2;
                j12 = j11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.s4
                    @Override // fz.e
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        y4.a(uri, rVar, recordingStatus2, z14, j12, obj2, cVar3, (l1.n) obj4, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 3072;
        z12 = z11;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                if (sVar4.e(j11)) {
                    i17 = 16384;
                } else {
                    i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i13 |= i17;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= 196608;
                obj2 = obj;
            } else {
                obj2 = obj;
                if ((i11 & 196608) == 0) {
                    if (sVar4.h(obj2)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
            }
            i21 = i12 & 64;
            if (i21 != 0) {
                i13 |= 1572864;
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
                if ((i11 & 1572864) == 0) {
                    if (sVar4.h(cVar2)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i13 |= i22;
                }
            }
            if ((i13 & 599187) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar4.T(i13 & 1, z13)) {
                if (i28 != 0) {
                    recordingStatus3 = null;
                } else {
                    recordingStatus3 = recordingStatus2;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i16 != 0) {
                    j13 = 0;
                } else {
                    j13 = j11;
                }
                if (i18 != 0) {
                    obj3 = qy.b0.f48488a;
                } else {
                    obj3 = obj2;
                }
                gVar = l1.m.f39353a;
                if (i21 != 0) {
                    objQ22 = sVar4.Q();
                    if (objQ22 == gVar) {
                        objQ22 = new d0.y1(29);
                        sVar4.o0(objQ22);
                    }
                    cVar4 = (fz.c) objQ22;
                } else {
                    cVar4 = cVar2;
                }
                context = (Context) sVar4.j(AndroidCompositionLocals_androidKt.f1200b);
                objQ = sVar4.Q();
                if (objQ == gVar) {
                    objQ = l1.t.q(sVar4);
                    sVar4.o0(objQ);
                }
                b0Var = (rz.b0) objQ;
                objQ2 = sVar4.Q();
                if (objQ2 == gVar) {
                    objQ2 = new f7.n(context).a();
                    sVar4.o0(objQ2);
                }
                exoPlayer = (ExoPlayer) objQ2;
                kotlin.jvm.internal.m.c(exoPlayer);
                zF = sVar4.f(obj3);
                objQ3 = sVar4.Q();
                if (zF) {
                    objQ3 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ3);
                } else {
                    objQ3 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ3);
                }
                b1Var = (l1.b1) objQ3;
                zF2 = sVar4.f(obj3);
                objQ4 = sVar4.Q();
                if (zF2) {
                    objQ4 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ4);
                } else {
                    objQ4 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ4);
                }
                b1Var2 = (l1.b1) objQ4;
                zF3 = sVar4.f(obj3);
                objQ5 = sVar4.Q();
                if (zF3) {
                    objQ5 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ5);
                } else {
                    objQ5 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ5);
                }
                b1Var3 = (l1.b1) objQ5;
                zF4 = sVar4.f(obj3);
                objQ6 = sVar4.Q();
                if (zF4) {
                    objQ6 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ6);
                } else {
                    objQ6 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ6);
                }
                b1Var4 = (l1.b1) objQ6;
                objQ7 = sVar4.Q();
                if (objQ7 == gVar) {
                    objQ7 = new h5();
                    sVar4.o0(objQ7);
                }
                h5Var = (h5) objQ7;
                zF5 = sVar4.f(obj3);
                i23 = i13;
                objQ8 = sVar4.Q();
                if (zF5) {
                    objQ8 = l1.t.B(Long.valueOf(j13));
                    sVar4.o0(objQ8);
                } else {
                    objQ8 = l1.t.B(Long.valueOf(j13));
                    sVar4.o0(objQ8);
                }
                b1Var5 = (l1.b1) objQ8;
                zF6 = sVar4.f(obj3);
                objQ9 = sVar4.Q();
                if (zF6) {
                    objQ9 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ9);
                } else {
                    objQ9 = l1.t.B(Boolean.FALSE);
                    sVar4.o0(objQ9);
                }
                b1Var6 = (l1.b1) objQ9;
                if (((Boolean) b1Var6.getValue()).booleanValue()) {
                    f5 = 1.0f;
                } else {
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                l1.b3 b3VarB7 = b0.h.b(f5, null, "VideoAlphaAnimation", sVar4, 3072, 22);
                zA = kotlin.jvm.internal.m.a(recordingStatus3, RecordingStatus.Recording.INSTANCE);
                RecordingStatus recordingStatus10 = recordingStatus3;
                b1VarH = l1.t.H(Boolean.valueOf(z15), sVar4);
                b1VarH2 = l1.t.H(Boolean.valueOf(zA), sVar4);
                b1VarH3 = l1.t.H(Boolean.valueOf(((Boolean) b1Var4.getValue()).booleanValue()), sVar4);
                b1VarH4 = l1.t.H(cVar4, sVar4);
                boolean zH15 = sVar4.h(h5Var) | sVar4.h(uri) | sVar4.h(exoPlayer) | sVar4.f(b1Var6) | sVar4.f(b1Var) | sVar4.f(b1Var3) | sVar4.f(b1Var4) | sVar4.f(b1Var2);
                i24 = i23 & 3670016;
                if (i24 == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zH15 | z16;
                objQ10 = sVar4.Q();
                if (z17) {
                    b1Var7 = b1Var2;
                    b1Var8 = b1Var3;
                    exoPlayer2 = exoPlayer;
                    i25 = i24;
                    b1Var9 = b1Var6;
                    sVar2 = sVar4;
                    b1Var10 = b1Var4;
                    objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                    sVar2.o0(objQ10);
                } else {
                    b1Var7 = b1Var2;
                    b1Var8 = b1Var3;
                    exoPlayer2 = exoPlayer;
                    i25 = i24;
                    b1Var9 = b1Var6;
                    sVar2 = sVar4;
                    b1Var10 = b1Var4;
                    objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                    sVar2.o0(objQ10);
                }
                l1.t.g(uri, obj3, (fz.e) objQ10, sVar2);
                Boolean boolValueOf13 = Boolean.valueOf(z15);
                i26 = i23 & 7168;
                if (i26 == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zH = z18 | sVar2.h(h5Var) | sVar2.f(b1Var10) | sVar2.h(exoPlayer2) | sVar2.f(b1Var) | sVar2.f(b1Var8) | sVar2.f(b1Var9) | sVar2.g(zA) | sVar2.f(b1Var7) | sVar2.h(b0Var) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.f(b1VarH4);
                objQ11 = sVar2.Q();
                exoPlayer3 = exoPlayer2;
                if (zH) {
                    l1.b1 b1Var111110 = b1Var9;
                    z19 = zA;
                    objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var111110, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                    h5Var2 = h5Var;
                    b1Var11 = b1Var111110;
                    b0Var2 = b0Var;
                    sVar2.o0(objQ11);
                } else {
                    l1.b1 b1Var111111 = b1Var9;
                    z19 = zA;
                    objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var111111, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                    h5Var2 = h5Var;
                    b1Var11 = b1Var111111;
                    b0Var2 = b0Var;
                    sVar2.o0(objQ11);
                }
                l1.t.f((fz.e) objQ11, boolValueOf13, sVar2);
                Boolean boolValueOf14 = Boolean.valueOf(z19);
                boolean zG1111 = sVar2.g(z19) | sVar2.h(h5Var2) | sVar2.h(exoPlayer3);
                i27 = i25;
                if (i27 == 1048576) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean zF111116 = zG1111 | z20 | sVar2.f(b1Var8);
                if (i26 == 2048) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                zF7 = zF111116 | z21 | sVar2.f(b1Var10);
                objQ12 = sVar2.Q();
                if (zF7) {
                    boolean z32110 = z19;
                    l1.b1 b1Var111112 = b1Var8;
                    l1.b1 b1Var111113 = b1Var10;
                    h5 h5Var16 = h5Var2;
                    boolean z32111 = z15;
                    objQ12 = new v4(z32110, exoPlayer3, cVar4, z32111, h5Var16, b1Var111112, b1Var111113, null);
                    z22 = z32110;
                    z15 = z32111;
                    b1Var12 = b1Var111112;
                    b1Var13 = b1Var111113;
                    h5Var3 = h5Var16;
                    sVar2.o0(objQ12);
                } else {
                    boolean z32112 = z19;
                    l1.b1 b1Var111114 = b1Var8;
                    l1.b1 b1Var111115 = b1Var10;
                    h5 h5Var17 = h5Var2;
                    boolean z32113 = z15;
                    objQ12 = new v4(z32112, exoPlayer3, cVar4, z32113, h5Var17, b1Var111114, b1Var111115, null);
                    z22 = z32112;
                    z15 = z32113;
                    b1Var12 = b1Var111114;
                    b1Var13 = b1Var111115;
                    h5Var3 = h5Var17;
                    sVar2.o0(objQ12);
                }
                l1.t.f((fz.e) objQ12, boolValueOf14, sVar2);
                Long lValueOf7 = Long.valueOf(j13);
                if ((i23 & 57344) == 16384) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean zF111117 = z23 | sVar2.f(b1Var5) | sVar2.h(h5Var3) | sVar2.f(b1Var) | sVar2.h(r23) | sVar2.f(b1Var7) | sVar2.f(b1Var12) | sVar2.f(b1Var13);
                if (i27 == 1048576) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zF111117 | z24;
                objQ13 = sVar2.Q();
                if (z25) {
                    fz.c cVar11112 = cVar4;
                    long j116 = j13;
                    objQ13 = new w4(j116, r23, cVar11112, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                    j14 = j116;
                    cVar5 = cVar11112;
                    sVar2.o0(objQ13);
                } else {
                    fz.c cVar11113 = cVar4;
                    long j117 = j13;
                    objQ13 = new w4(j117, r23, cVar11113, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                    j14 = j117;
                    cVar5 = cVar11113;
                    sVar2.o0(objQ13);
                }
                l1.t.f((fz.e) objQ13, lValueOf7, sVar2);
                lifecycleOwner = (LifecycleOwner) sVar2.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                zH2 = sVar2.h(r23) | sVar2.h(lifecycleOwner);
                objQ14 = sVar2.Q();
                if (zH2) {
                    objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                    sVar2.o0(objQ14);
                } else {
                    objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                    sVar2.o0(objQ14);
                }
                l1.t.d(lifecycleOwner, r23, (fz.c) objQ14, sVar2);
                zH3 = sVar2.h(h5Var3) | sVar2.h(r23);
                objQ15 = sVar2.Q();
                if (zH3) {
                    objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                    sVar2.o0(objQ15);
                } else {
                    objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                    sVar2.o0(objQ15);
                }
                l1.t.c(r23, (fz.c) objQ15, sVar2);
                z1.r rVarA8 = d2.h.a(rVar, ((Number) b3VarB7.getValue()).floatValue());
                w2.q0 q0VarD11 = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL12 = sVar2.l();
                z1.r rVarC16 = z1.a.c(sVar2, rVarA8);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                h5Var4 = h5Var3;
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                hVar = y2.j.f56917f;
                l1.t.J(hVar, q0VarD11, sVar2);
                y2.h hVar118 = y2.j.f56916e;
                l1.t.J(hVar118, q1VarL12, sVar2);
                y2.h hVar119 = y2.j.f56918g;
                if (sVar2.S) {
                    hVar2 = hVar;
                    if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    }
                    y2.h hVar1110 = y2.j.f56915d;
                    l1.t.J(hVar1110, rVarC16, sVar2);
                    boolean zF111118 = sVar2.f(b1Var);
                    if (i27 == 1048576) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zF111118 | z26;
                    objQ16 = sVar2.Q();
                    if (z27) {
                        gVar2 = gVar;
                        if (objQ16 == gVar2) {
                        }
                        fz.c cVar11114 = (fz.c) objQ16;
                        boolean zF111119 = sVar2.f(b1Var11);
                        cVar6 = cVar5;
                        if (i26 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        boolean zG1112 = zF111119 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                        b0Var3 = b0Var2;
                        zH4 = zG1112 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                        objQ17 = sVar2.Q();
                        if (zH4) {
                            final l1.b1 b1Var211111111111111111114 = b1Var12;
                            final l1.b1 b1Var211111111111111111115 = b1Var7;
                            final l1.b1 b1Var211111111111111111116 = b1Var13;
                            final boolean z311111111111 = z22;
                            final boolean z311111111112 = z15;
                            final l1.b1 b1Var211111111111111111117 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var211111111111111111117.setValue(Boolean.TRUE);
                                    y4.d(z311111111112, z311111111111, h5Var4, b0Var3, b1Var211111111111111111114, b1Var211111111111111111116, b1Var211111111111111111115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z311111111112;
                            b1Var14 = b1Var211111111111111111116;
                            exoPlayer4 = exoPlayer3;
                            z29 = z311111111111;
                            sVar2.o0(objQ17);
                        } else {
                            final l1.b1 b1Var211111111111111111118 = b1Var12;
                            final l1.b1 b1Var211111111111111111119 = b1Var7;
                            final l1.b1 b1Var2111111111111111111110 = b1Var13;
                            final boolean z311111111113 = z22;
                            final boolean z311111111114 = z15;
                            final l1.b1 b1Var2111111111111111111111 = b1Var11;
                            objQ17 = new fz.a() { // from class: dt.q4
                                @Override // fz.a
                                public final Object invoke() {
                                    b1Var2111111111111111111111.setValue(Boolean.TRUE);
                                    y4.d(z311111111114, z311111111113, h5Var4, b0Var3, b1Var211111111111111111118, b1Var2111111111111111111110, b1Var211111111111111111119, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                    return qy.b0.f48488a;
                                }
                            };
                            z15 = z311111111114;
                            b1Var14 = b1Var2111111111111111111110;
                            exoPlayer4 = exoPlayer3;
                            z29 = z311111111113;
                            sVar2.o0(objQ17);
                        }
                        e(exoPlayer4, cVar11114, (fz.a) objQ17, sVar2, 0);
                        if (z29) {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        } else {
                            cVar6 = cVar6;
                            sVar3 = sVar2;
                            z30 = true;
                            sVar3.d0(1439380887);
                            sVar3.p(false);
                        }
                        sVar3.p(z30);
                        sVar = sVar3;
                        obj2 = obj3;
                        z14 = z15;
                        cVar3 = cVar6;
                        j12 = j14;
                        recordingStatus2 = recordingStatus10;
                    } else {
                        gVar2 = gVar;
                    }
                    objQ16 = new y3(cVar5, b1Var, 1);
                    sVar2.o0(objQ16);
                    fz.c cVar11115 = (fz.c) objQ16;
                    boolean zF1111110 = sVar2.f(b1Var11);
                    cVar6 = cVar5;
                    if (i26 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean zG1113 = zF1111110 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                    b0Var3 = b0Var2;
                    zH4 = zG1113 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                    objQ17 = sVar2.Q();
                    if (zH4) {
                        final l1.b1 b1Var2111111111111111111112 = b1Var12;
                        final l1.b1 b1Var2111111111111111111113 = b1Var7;
                        final l1.b1 b1Var2111111111111111111114 = b1Var13;
                        final boolean z311111111115 = z22;
                        final boolean z311111111116 = z15;
                        final l1.b1 b1Var2111111111111111111115 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var2111111111111111111115.setValue(Boolean.TRUE);
                                y4.d(z311111111116, z311111111115, h5Var4, b0Var3, b1Var2111111111111111111112, b1Var2111111111111111111114, b1Var2111111111111111111113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z311111111116;
                        b1Var14 = b1Var2111111111111111111114;
                        exoPlayer4 = exoPlayer3;
                        z29 = z311111111115;
                        sVar2.o0(objQ17);
                    } else {
                        final l1.b1 b1Var2111111111111111111116 = b1Var12;
                        final l1.b1 b1Var2111111111111111111117 = b1Var7;
                        final l1.b1 b1Var2111111111111111111118 = b1Var13;
                        final boolean z311111111117 = z22;
                        final boolean z311111111118 = z15;
                        final l1.b1 b1Var2111111111111111111119 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var2111111111111111111119.setValue(Boolean.TRUE);
                                y4.d(z311111111118, z311111111117, h5Var4, b0Var3, b1Var2111111111111111111116, b1Var2111111111111111111118, b1Var2111111111111111111117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z311111111118;
                        b1Var14 = b1Var2111111111111111111118;
                        exoPlayer4 = exoPlayer3;
                        z29 = z311111111117;
                        sVar2.o0(objQ17);
                    }
                    e(exoPlayer4, cVar11115, (fz.a) objQ17, sVar2, 0);
                    if (z29) {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    } else {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    }
                    sVar3.p(z30);
                    sVar = sVar3;
                    obj2 = obj3;
                    z14 = z15;
                    cVar3 = cVar6;
                    j12 = j14;
                    recordingStatus2 = recordingStatus10;
                } else {
                    hVar2 = hVar;
                }
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar119);
                y2.h hVar1111 = y2.j.f56915d;
                l1.t.J(hVar1111, rVarC16, sVar2);
                boolean zF1111111 = sVar2.f(b1Var);
                if (i27 == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = zF1111111 | z26;
                objQ16 = sVar2.Q();
                if (z27) {
                    gVar2 = gVar;
                    if (objQ16 == gVar2) {
                    }
                    fz.c cVar11116 = (fz.c) objQ16;
                    boolean zF1111112 = sVar2.f(b1Var11);
                    cVar6 = cVar5;
                    if (i26 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean zG1114 = zF1111112 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                    b0Var3 = b0Var2;
                    zH4 = zG1114 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                    objQ17 = sVar2.Q();
                    if (zH4) {
                        final l1.b1 b1Var21111111111111111111110 = b1Var12;
                        final l1.b1 b1Var21111111111111111111111 = b1Var7;
                        final l1.b1 b1Var21111111111111111111112 = b1Var13;
                        final boolean z311111111119 = z22;
                        final boolean z3111111111110 = z15;
                        final l1.b1 b1Var21111111111111111111113 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var21111111111111111111113.setValue(Boolean.TRUE);
                                y4.d(z3111111111110, z311111111119, h5Var4, b0Var3, b1Var21111111111111111111110, b1Var21111111111111111111112, b1Var21111111111111111111111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z3111111111110;
                        b1Var14 = b1Var21111111111111111111112;
                        exoPlayer4 = exoPlayer3;
                        z29 = z311111111119;
                        sVar2.o0(objQ17);
                    } else {
                        final l1.b1 b1Var21111111111111111111114 = b1Var12;
                        final l1.b1 b1Var21111111111111111111115 = b1Var7;
                        final l1.b1 b1Var21111111111111111111116 = b1Var13;
                        final boolean z3111111111111 = z22;
                        final boolean z3111111111112 = z15;
                        final l1.b1 b1Var21111111111111111111117 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var21111111111111111111117.setValue(Boolean.TRUE);
                                y4.d(z3111111111112, z3111111111111, h5Var4, b0Var3, b1Var21111111111111111111114, b1Var21111111111111111111116, b1Var21111111111111111111115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z3111111111112;
                        b1Var14 = b1Var21111111111111111111116;
                        exoPlayer4 = exoPlayer3;
                        z29 = z3111111111111;
                        sVar2.o0(objQ17);
                    }
                    e(exoPlayer4, cVar11116, (fz.a) objQ17, sVar2, 0);
                    if (z29) {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    } else {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    }
                    sVar3.p(z30);
                    sVar = sVar3;
                    obj2 = obj3;
                    z14 = z15;
                    cVar3 = cVar6;
                    j12 = j14;
                    recordingStatus2 = recordingStatus10;
                } else {
                    gVar2 = gVar;
                }
                objQ16 = new y3(cVar5, b1Var, 1);
                sVar2.o0(objQ16);
                fz.c cVar11117 = (fz.c) objQ16;
                boolean zF1111113 = sVar2.f(b1Var11);
                cVar6 = cVar5;
                if (i26 == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean zG1115 = zF1111113 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                b0Var3 = b0Var2;
                zH4 = zG1115 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                objQ17 = sVar2.Q();
                if (zH4) {
                    final l1.b1 b1Var21111111111111111111118 = b1Var12;
                    final l1.b1 b1Var21111111111111111111119 = b1Var7;
                    final l1.b1 b1Var211111111111111111111110 = b1Var13;
                    final boolean z3111111111113 = z22;
                    final boolean z3111111111114 = z15;
                    final l1.b1 b1Var211111111111111111111111 = b1Var11;
                    objQ17 = new fz.a() { // from class: dt.q4
                        @Override // fz.a
                        public final Object invoke() {
                            b1Var211111111111111111111111.setValue(Boolean.TRUE);
                            y4.d(z3111111111114, z3111111111113, h5Var4, b0Var3, b1Var21111111111111111111118, b1Var211111111111111111111110, b1Var21111111111111111111119, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                            return qy.b0.f48488a;
                        }
                    };
                    z15 = z3111111111114;
                    b1Var14 = b1Var211111111111111111111110;
                    exoPlayer4 = exoPlayer3;
                    z29 = z3111111111113;
                    sVar2.o0(objQ17);
                } else {
                    final l1.b1 b1Var211111111111111111111112 = b1Var12;
                    final l1.b1 b1Var211111111111111111111113 = b1Var7;
                    final l1.b1 b1Var211111111111111111111114 = b1Var13;
                    final boolean z3111111111115 = z22;
                    final boolean z3111111111116 = z15;
                    final l1.b1 b1Var211111111111111111111115 = b1Var11;
                    objQ17 = new fz.a() { // from class: dt.q4
                        @Override // fz.a
                        public final Object invoke() {
                            b1Var211111111111111111111115.setValue(Boolean.TRUE);
                            y4.d(z3111111111116, z3111111111115, h5Var4, b0Var3, b1Var211111111111111111111112, b1Var211111111111111111111114, b1Var211111111111111111111113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                            return qy.b0.f48488a;
                        }
                    };
                    z15 = z3111111111116;
                    b1Var14 = b1Var211111111111111111111114;
                    exoPlayer4 = exoPlayer3;
                    z29 = z3111111111115;
                    sVar2.o0(objQ17);
                }
                e(exoPlayer4, cVar11117, (fz.a) objQ17, sVar2, 0);
                if (z29) {
                    cVar6 = cVar6;
                    sVar3 = sVar2;
                    z30 = true;
                    sVar3.d0(1439380887);
                    sVar3.p(false);
                } else {
                    cVar6 = cVar6;
                    sVar3 = sVar2;
                    z30 = true;
                    sVar3.d0(1439380887);
                    sVar3.p(false);
                }
                sVar3.p(z30);
                sVar = sVar3;
                obj2 = obj3;
                z14 = z15;
                cVar3 = cVar6;
                j12 = j14;
                recordingStatus2 = recordingStatus10;
            } else {
                sVar4.W();
                z14 = z12;
                sVar = sVar4;
                cVar3 = cVar2;
                j12 = j11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.s4
                    @Override // fz.e
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        y4.a(uri, rVar, recordingStatus2, z14, j12, obj2, cVar3, (l1.n) obj4, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 24576;
        i18 = i12 & 32;
        if (i18 != 0) {
            i13 |= 196608;
            obj2 = obj;
        } else {
            obj2 = obj;
            if ((i11 & 196608) == 0) {
                if (sVar4.h(obj2)) {
                    i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
        }
        i21 = i12 & 64;
        if (i21 != 0) {
            i13 |= 1572864;
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            if ((i11 & 1572864) == 0) {
                if (sVar4.h(cVar2)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i13 |= i22;
            }
        }
        if ((i13 & 599187) != 599186) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar4.T(i13 & 1, z13)) {
            if (i28 != 0) {
                recordingStatus3 = null;
            } else {
                recordingStatus3 = recordingStatus2;
            }
            if (i14 != 0) {
                z15 = true;
            } else {
                z15 = z12;
            }
            if (i16 != 0) {
                j13 = 0;
            } else {
                j13 = j11;
            }
            if (i18 != 0) {
                obj3 = qy.b0.f48488a;
            } else {
                obj3 = obj2;
            }
            gVar = l1.m.f39353a;
            if (i21 != 0) {
                objQ22 = sVar4.Q();
                if (objQ22 == gVar) {
                    objQ22 = new d0.y1(29);
                    sVar4.o0(objQ22);
                }
                cVar4 = (fz.c) objQ22;
            } else {
                cVar4 = cVar2;
            }
            context = (Context) sVar4.j(AndroidCompositionLocals_androidKt.f1200b);
            objQ = sVar4.Q();
            if (objQ == gVar) {
                objQ = l1.t.q(sVar4);
                sVar4.o0(objQ);
            }
            b0Var = (rz.b0) objQ;
            objQ2 = sVar4.Q();
            if (objQ2 == gVar) {
                objQ2 = new f7.n(context).a();
                sVar4.o0(objQ2);
            }
            exoPlayer = (ExoPlayer) objQ2;
            kotlin.jvm.internal.m.c(exoPlayer);
            zF = sVar4.f(obj3);
            objQ3 = sVar4.Q();
            if (zF) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ3);
            } else {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ3);
            }
            b1Var = (l1.b1) objQ3;
            zF2 = sVar4.f(obj3);
            objQ4 = sVar4.Q();
            if (zF2) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ4);
            } else {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ4);
            }
            b1Var2 = (l1.b1) objQ4;
            zF3 = sVar4.f(obj3);
            objQ5 = sVar4.Q();
            if (zF3) {
                objQ5 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ5);
            } else {
                objQ5 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ5);
            }
            b1Var3 = (l1.b1) objQ5;
            zF4 = sVar4.f(obj3);
            objQ6 = sVar4.Q();
            if (zF4) {
                objQ6 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ6);
            } else {
                objQ6 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ6);
            }
            b1Var4 = (l1.b1) objQ6;
            objQ7 = sVar4.Q();
            if (objQ7 == gVar) {
                objQ7 = new h5();
                sVar4.o0(objQ7);
            }
            h5Var = (h5) objQ7;
            zF5 = sVar4.f(obj3);
            i23 = i13;
            objQ8 = sVar4.Q();
            if (zF5) {
                objQ8 = l1.t.B(Long.valueOf(j13));
                sVar4.o0(objQ8);
            } else {
                objQ8 = l1.t.B(Long.valueOf(j13));
                sVar4.o0(objQ8);
            }
            b1Var5 = (l1.b1) objQ8;
            zF6 = sVar4.f(obj3);
            objQ9 = sVar4.Q();
            if (zF6) {
                objQ9 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ9);
            } else {
                objQ9 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ9);
            }
            b1Var6 = (l1.b1) objQ9;
            if (((Boolean) b1Var6.getValue()).booleanValue()) {
                f5 = 1.0f;
            } else {
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            l1.b3 b3VarB8 = b0.h.b(f5, null, "VideoAlphaAnimation", sVar4, 3072, 22);
            zA = kotlin.jvm.internal.m.a(recordingStatus3, RecordingStatus.Recording.INSTANCE);
            RecordingStatus recordingStatus11 = recordingStatus3;
            b1VarH = l1.t.H(Boolean.valueOf(z15), sVar4);
            b1VarH2 = l1.t.H(Boolean.valueOf(zA), sVar4);
            b1VarH3 = l1.t.H(Boolean.valueOf(((Boolean) b1Var4.getValue()).booleanValue()), sVar4);
            b1VarH4 = l1.t.H(cVar4, sVar4);
            boolean zH16 = sVar4.h(h5Var) | sVar4.h(uri) | sVar4.h(exoPlayer) | sVar4.f(b1Var6) | sVar4.f(b1Var) | sVar4.f(b1Var3) | sVar4.f(b1Var4) | sVar4.f(b1Var2);
            i24 = i23 & 3670016;
            if (i24 == 1048576) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zH16 | z16;
            objQ10 = sVar4.Q();
            if (z17) {
                b1Var7 = b1Var2;
                b1Var8 = b1Var3;
                exoPlayer2 = exoPlayer;
                i25 = i24;
                b1Var9 = b1Var6;
                sVar2 = sVar4;
                b1Var10 = b1Var4;
                objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                sVar2.o0(objQ10);
            } else {
                b1Var7 = b1Var2;
                b1Var8 = b1Var3;
                exoPlayer2 = exoPlayer;
                i25 = i24;
                b1Var9 = b1Var6;
                sVar2 = sVar4;
                b1Var10 = b1Var4;
                objQ10 = new t4(uri, exoPlayer2, cVar4, h5Var, b1Var9, b1Var, b1Var8, b1Var10, b1Var7, null);
                sVar2.o0(objQ10);
            }
            l1.t.g(uri, obj3, (fz.e) objQ10, sVar2);
            Boolean boolValueOf15 = Boolean.valueOf(z15);
            i26 = i23 & 7168;
            if (i26 == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            zH = z18 | sVar2.h(h5Var) | sVar2.f(b1Var10) | sVar2.h(exoPlayer2) | sVar2.f(b1Var) | sVar2.f(b1Var8) | sVar2.f(b1Var9) | sVar2.g(zA) | sVar2.f(b1Var7) | sVar2.h(b0Var) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.f(b1VarH4);
            objQ11 = sVar2.Q();
            exoPlayer3 = exoPlayer2;
            if (zH) {
                l1.b1 b1Var111116 = b1Var9;
                z19 = zA;
                objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var111116, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                h5Var2 = h5Var;
                b1Var11 = b1Var111116;
                b0Var2 = b0Var;
                sVar2.o0(objQ11);
            } else {
                l1.b1 b1Var111117 = b1Var9;
                z19 = zA;
                objQ11 = new u4(z15, exoPlayer3, h5Var, b1Var10, b1Var, b1Var8, b1Var111117, z19, b0Var, b1Var7, b1VarH, b1VarH2, b1VarH3, b1VarH4, null);
                h5Var2 = h5Var;
                b1Var11 = b1Var111117;
                b0Var2 = b0Var;
                sVar2.o0(objQ11);
            }
            l1.t.f((fz.e) objQ11, boolValueOf15, sVar2);
            Boolean boolValueOf16 = Boolean.valueOf(z19);
            boolean zG1116 = sVar2.g(z19) | sVar2.h(h5Var2) | sVar2.h(exoPlayer3);
            i27 = i25;
            if (i27 == 1048576) {
                z20 = true;
            } else {
                z20 = false;
            }
            boolean zF1111114 = zG1116 | z20 | sVar2.f(b1Var8);
            if (i26 == 2048) {
                z21 = true;
            } else {
                z21 = false;
            }
            zF7 = zF1111114 | z21 | sVar2.f(b1Var10);
            objQ12 = sVar2.Q();
            if (zF7) {
                boolean z32114 = z19;
                l1.b1 b1Var111118 = b1Var8;
                l1.b1 b1Var111119 = b1Var10;
                h5 h5Var18 = h5Var2;
                boolean z32115 = z15;
                objQ12 = new v4(z32114, exoPlayer3, cVar4, z32115, h5Var18, b1Var111118, b1Var111119, null);
                z22 = z32114;
                z15 = z32115;
                b1Var12 = b1Var111118;
                b1Var13 = b1Var111119;
                h5Var3 = h5Var18;
                sVar2.o0(objQ12);
            } else {
                boolean z32116 = z19;
                l1.b1 b1Var1111110 = b1Var8;
                l1.b1 b1Var1111111 = b1Var10;
                h5 h5Var19 = h5Var2;
                boolean z32117 = z15;
                objQ12 = new v4(z32116, exoPlayer3, cVar4, z32117, h5Var19, b1Var1111110, b1Var1111111, null);
                z22 = z32116;
                z15 = z32117;
                b1Var12 = b1Var1111110;
                b1Var13 = b1Var1111111;
                h5Var3 = h5Var19;
                sVar2.o0(objQ12);
            }
            l1.t.f((fz.e) objQ12, boolValueOf16, sVar2);
            Long lValueOf8 = Long.valueOf(j13);
            if ((i23 & 57344) == 16384) {
                z23 = true;
            } else {
                z23 = false;
            }
            boolean zF1111115 = z23 | sVar2.f(b1Var5) | sVar2.h(h5Var3) | sVar2.f(b1Var) | sVar2.h(r23) | sVar2.f(b1Var7) | sVar2.f(b1Var12) | sVar2.f(b1Var13);
            if (i27 == 1048576) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = zF1111115 | z24;
            objQ13 = sVar2.Q();
            if (z25) {
                fz.c cVar11118 = cVar4;
                long j118 = j13;
                objQ13 = new w4(j118, r23, cVar11118, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                j14 = j118;
                cVar5 = cVar11118;
                sVar2.o0(objQ13);
            } else {
                fz.c cVar11119 = cVar4;
                long j119 = j13;
                objQ13 = new w4(j119, r23, cVar11119, b1Var5, h5Var3, b1Var, b1Var7, b1Var12, b1Var13, null);
                j14 = j119;
                cVar5 = cVar11119;
                sVar2.o0(objQ13);
            }
            l1.t.f((fz.e) objQ13, lValueOf8, sVar2);
            lifecycleOwner = (LifecycleOwner) sVar2.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            zH2 = sVar2.h(r23) | sVar2.h(lifecycleOwner);
            objQ14 = sVar2.Q();
            if (zH2) {
                objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                sVar2.o0(objQ14);
            } else {
                objQ14 = new com.google.accompanist.permissions.a(9, lifecycleOwner, r23);
                sVar2.o0(objQ14);
            }
            l1.t.d(lifecycleOwner, r23, (fz.c) objQ14, sVar2);
            zH3 = sVar2.h(h5Var3) | sVar2.h(r23);
            objQ15 = sVar2.Q();
            if (zH3) {
                objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                sVar2.o0(objQ15);
            } else {
                objQ15 = new com.google.accompanist.permissions.a(10, r23, h5Var3);
                sVar2.o0(objQ15);
            }
            l1.t.c(r23, (fz.c) objQ15, sVar2);
            z1.r rVarA9 = d2.h.a(rVar, ((Number) b3VarB8.getValue()).floatValue());
            w2.q0 q0VarD12 = j0.o.d(z1.c.f58463a, false);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL13 = sVar2.l();
            z1.r rVarC17 = z1.a.c(sVar2, rVarA9);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            h5Var4 = h5Var3;
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD12, sVar2);
            y2.h hVar1112 = y2.j.f56916e;
            l1.t.J(hVar1112, q1VarL13, sVar2);
            y2.h hVar1113 = y2.j.f56918g;
            if (sVar2.S) {
                hVar2 = hVar;
                if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                }
                y2.h hVar1114 = y2.j.f56915d;
                l1.t.J(hVar1114, rVarC17, sVar2);
                boolean zF1111116 = sVar2.f(b1Var);
                if (i27 == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = zF1111116 | z26;
                objQ16 = sVar2.Q();
                if (z27) {
                    gVar2 = gVar;
                    if (objQ16 == gVar2) {
                    }
                    fz.c cVar111110 = (fz.c) objQ16;
                    boolean zF1111117 = sVar2.f(b1Var11);
                    cVar6 = cVar5;
                    if (i26 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean zG1117 = zF1111117 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                    b0Var3 = b0Var2;
                    zH4 = zG1117 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                    objQ17 = sVar2.Q();
                    if (zH4) {
                        final l1.b1 b1Var211111111111111111111116 = b1Var12;
                        final l1.b1 b1Var211111111111111111111117 = b1Var7;
                        final l1.b1 b1Var211111111111111111111118 = b1Var13;
                        final boolean z3111111111117 = z22;
                        final boolean z3111111111118 = z15;
                        final l1.b1 b1Var211111111111111111111119 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var211111111111111111111119.setValue(Boolean.TRUE);
                                y4.d(z3111111111118, z3111111111117, h5Var4, b0Var3, b1Var211111111111111111111116, b1Var211111111111111111111118, b1Var211111111111111111111117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z3111111111118;
                        b1Var14 = b1Var211111111111111111111118;
                        exoPlayer4 = exoPlayer3;
                        z29 = z3111111111117;
                        sVar2.o0(objQ17);
                    } else {
                        final l1.b1 b1Var2111111111111111111111110 = b1Var12;
                        final l1.b1 b1Var2111111111111111111111111 = b1Var7;
                        final l1.b1 b1Var2111111111111111111111112 = b1Var13;
                        final boolean z3111111111119 = z22;
                        final boolean z31111111111110 = z15;
                        final l1.b1 b1Var2111111111111111111111113 = b1Var11;
                        objQ17 = new fz.a() { // from class: dt.q4
                            @Override // fz.a
                            public final Object invoke() {
                                b1Var2111111111111111111111113.setValue(Boolean.TRUE);
                                y4.d(z31111111111110, z3111111111119, h5Var4, b0Var3, b1Var2111111111111111111111110, b1Var2111111111111111111111112, b1Var2111111111111111111111111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                                return qy.b0.f48488a;
                            }
                        };
                        z15 = z31111111111110;
                        b1Var14 = b1Var2111111111111111111111112;
                        exoPlayer4 = exoPlayer3;
                        z29 = z3111111111119;
                        sVar2.o0(objQ17);
                    }
                    e(exoPlayer4, cVar111110, (fz.a) objQ17, sVar2, 0);
                    if (z29) {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    } else {
                        cVar6 = cVar6;
                        sVar3 = sVar2;
                        z30 = true;
                        sVar3.d0(1439380887);
                        sVar3.p(false);
                    }
                    sVar3.p(z30);
                    sVar = sVar3;
                    obj2 = obj3;
                    z14 = z15;
                    cVar3 = cVar6;
                    j12 = j14;
                    recordingStatus2 = recordingStatus11;
                } else {
                    gVar2 = gVar;
                }
                objQ16 = new y3(cVar5, b1Var, 1);
                sVar2.o0(objQ16);
                fz.c cVar111111 = (fz.c) objQ16;
                boolean zF1111118 = sVar2.f(b1Var11);
                cVar6 = cVar5;
                if (i26 == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean zG1118 = zF1111118 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                b0Var3 = b0Var2;
                zH4 = zG1118 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                objQ17 = sVar2.Q();
                if (zH4) {
                    final l1.b1 b1Var2111111111111111111111114 = b1Var12;
                    final l1.b1 b1Var2111111111111111111111115 = b1Var7;
                    final l1.b1 b1Var2111111111111111111111116 = b1Var13;
                    final boolean z31111111111111 = z22;
                    final boolean z31111111111112 = z15;
                    final l1.b1 b1Var2111111111111111111111117 = b1Var11;
                    objQ17 = new fz.a() { // from class: dt.q4
                        @Override // fz.a
                        public final Object invoke() {
                            b1Var2111111111111111111111117.setValue(Boolean.TRUE);
                            y4.d(z31111111111112, z31111111111111, h5Var4, b0Var3, b1Var2111111111111111111111114, b1Var2111111111111111111111116, b1Var2111111111111111111111115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                            return qy.b0.f48488a;
                        }
                    };
                    z15 = z31111111111112;
                    b1Var14 = b1Var2111111111111111111111116;
                    exoPlayer4 = exoPlayer3;
                    z29 = z31111111111111;
                    sVar2.o0(objQ17);
                } else {
                    final l1.b1 b1Var2111111111111111111111118 = b1Var12;
                    final l1.b1 b1Var2111111111111111111111119 = b1Var7;
                    final l1.b1 b1Var21111111111111111111111110 = b1Var13;
                    final boolean z31111111111113 = z22;
                    final boolean z31111111111114 = z15;
                    final l1.b1 b1Var21111111111111111111111111 = b1Var11;
                    objQ17 = new fz.a() { // from class: dt.q4
                        @Override // fz.a
                        public final Object invoke() {
                            b1Var21111111111111111111111111.setValue(Boolean.TRUE);
                            y4.d(z31111111111114, z31111111111113, h5Var4, b0Var3, b1Var2111111111111111111111118, b1Var21111111111111111111111110, b1Var2111111111111111111111119, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                            return qy.b0.f48488a;
                        }
                    };
                    z15 = z31111111111114;
                    b1Var14 = b1Var21111111111111111111111110;
                    exoPlayer4 = exoPlayer3;
                    z29 = z31111111111113;
                    sVar2.o0(objQ17);
                }
                e(exoPlayer4, cVar111111, (fz.a) objQ17, sVar2, 0);
                if (z29) {
                    cVar6 = cVar6;
                    sVar3 = sVar2;
                    z30 = true;
                    sVar3.d0(1439380887);
                    sVar3.p(false);
                } else {
                    cVar6 = cVar6;
                    sVar3 = sVar2;
                    z30 = true;
                    sVar3.d0(1439380887);
                    sVar3.p(false);
                }
                sVar3.p(z30);
                sVar = sVar3;
                obj2 = obj3;
                z14 = z15;
                cVar3 = cVar6;
                j12 = j14;
                recordingStatus2 = recordingStatus11;
            } else {
                hVar2 = hVar;
            }
            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar1113);
            y2.h hVar1115 = y2.j.f56915d;
            l1.t.J(hVar1115, rVarC17, sVar2);
            boolean zF1111119 = sVar2.f(b1Var);
            if (i27 == 1048576) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = zF1111119 | z26;
            objQ16 = sVar2.Q();
            if (z27) {
                gVar2 = gVar;
                if (objQ16 == gVar2) {
                }
                fz.c cVar111112 = (fz.c) objQ16;
                boolean zF11111110 = sVar2.f(b1Var11);
                cVar6 = cVar5;
                if (i26 == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean zG1119 = zF11111110 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
                b0Var3 = b0Var2;
                zH4 = zG1119 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
                objQ17 = sVar2.Q();
                if (zH4) {
                    final l1.b1 b1Var21111111111111111111111112 = b1Var12;
                    final l1.b1 b1Var21111111111111111111111113 = b1Var7;
                    final l1.b1 b1Var21111111111111111111111114 = b1Var13;
                    final boolean z31111111111115 = z22;
                    final boolean z31111111111116 = z15;
                    final l1.b1 b1Var21111111111111111111111115 = b1Var11;
                    objQ17 = new fz.a() { // from class: dt.q4
                        @Override // fz.a
                        public final Object invoke() {
                            b1Var21111111111111111111111115.setValue(Boolean.TRUE);
                            y4.d(z31111111111116, z31111111111115, h5Var4, b0Var3, b1Var21111111111111111111111112, b1Var21111111111111111111111114, b1Var21111111111111111111111113, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                            return qy.b0.f48488a;
                        }
                    };
                    z15 = z31111111111116;
                    b1Var14 = b1Var21111111111111111111111114;
                    exoPlayer4 = exoPlayer3;
                    z29 = z31111111111115;
                    sVar2.o0(objQ17);
                } else {
                    final l1.b1 b1Var21111111111111111111111116 = b1Var12;
                    final l1.b1 b1Var21111111111111111111111117 = b1Var7;
                    final l1.b1 b1Var21111111111111111111111118 = b1Var13;
                    final boolean z31111111111117 = z22;
                    final boolean z31111111111118 = z15;
                    final l1.b1 b1Var21111111111111111111111119 = b1Var11;
                    objQ17 = new fz.a() { // from class: dt.q4
                        @Override // fz.a
                        public final Object invoke() {
                            b1Var21111111111111111111111119.setValue(Boolean.TRUE);
                            y4.d(z31111111111118, z31111111111117, h5Var4, b0Var3, b1Var21111111111111111111111116, b1Var21111111111111111111111118, b1Var21111111111111111111111117, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                            return qy.b0.f48488a;
                        }
                    };
                    z15 = z31111111111118;
                    b1Var14 = b1Var21111111111111111111111118;
                    exoPlayer4 = exoPlayer3;
                    z29 = z31111111111117;
                    sVar2.o0(objQ17);
                }
                e(exoPlayer4, cVar111112, (fz.a) objQ17, sVar2, 0);
                if (z29) {
                    cVar6 = cVar6;
                    sVar3 = sVar2;
                    z30 = true;
                    sVar3.d0(1439380887);
                    sVar3.p(false);
                } else {
                    cVar6 = cVar6;
                    sVar3 = sVar2;
                    z30 = true;
                    sVar3.d0(1439380887);
                    sVar3.p(false);
                }
                sVar3.p(z30);
                sVar = sVar3;
                obj2 = obj3;
                z14 = z15;
                cVar3 = cVar6;
                j12 = j14;
                recordingStatus2 = recordingStatus11;
            } else {
                gVar2 = gVar;
            }
            objQ16 = new y3(cVar5, b1Var, 1);
            sVar2.o0(objQ16);
            fz.c cVar111113 = (fz.c) objQ16;
            boolean zF11111111 = sVar2.f(b1Var11);
            cVar6 = cVar5;
            if (i26 == 2048) {
                z28 = true;
            } else {
                z28 = false;
            }
            boolean zG11110 = zF11111111 | z28 | sVar2.g(z22) | sVar2.f(b1Var12) | sVar2.f(b1Var13) | sVar2.f(b1Var7) | sVar2.h(h5Var4);
            b0Var3 = b0Var2;
            zH4 = zG11110 | sVar2.h(b0Var3) | sVar2.f(b1VarH) | sVar2.f(b1VarH2) | sVar2.f(b1VarH3) | sVar2.h(exoPlayer3) | sVar2.f(b1VarH4);
            objQ17 = sVar2.Q();
            if (zH4) {
                final l1.b1 b1Var211111111111111111111111110 = b1Var12;
                final l1.b1 b1Var211111111111111111111111111 = b1Var7;
                final l1.b1 b1Var211111111111111111111111112 = b1Var13;
                final boolean z31111111111119 = z22;
                final boolean z311111111111110 = z15;
                final l1.b1 b1Var211111111111111111111111113 = b1Var11;
                objQ17 = new fz.a() { // from class: dt.q4
                    @Override // fz.a
                    public final Object invoke() {
                        b1Var211111111111111111111111113.setValue(Boolean.TRUE);
                        y4.d(z311111111111110, z31111111111119, h5Var4, b0Var3, b1Var211111111111111111111111110, b1Var211111111111111111111111112, b1Var211111111111111111111111111, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                        return qy.b0.f48488a;
                    }
                };
                z15 = z311111111111110;
                b1Var14 = b1Var211111111111111111111111112;
                exoPlayer4 = exoPlayer3;
                z29 = z31111111111119;
                sVar2.o0(objQ17);
            } else {
                final l1.b1 b1Var211111111111111111111111114 = b1Var12;
                final l1.b1 b1Var211111111111111111111111115 = b1Var7;
                final l1.b1 b1Var211111111111111111111111116 = b1Var13;
                final boolean z311111111111111 = z22;
                final boolean z311111111111112 = z15;
                final l1.b1 b1Var211111111111111111111111117 = b1Var11;
                objQ17 = new fz.a() { // from class: dt.q4
                    @Override // fz.a
                    public final Object invoke() {
                        b1Var211111111111111111111111117.setValue(Boolean.TRUE);
                        y4.d(z311111111111112, z311111111111111, h5Var4, b0Var3, b1Var211111111111111111111111114, b1Var211111111111111111111111116, b1Var211111111111111111111111115, exoPlayer3, b1VarH, b1VarH2, b1VarH3, b1VarH4);
                        return qy.b0.f48488a;
                    }
                };
                z15 = z311111111111112;
                b1Var14 = b1Var211111111111111111111111116;
                exoPlayer4 = exoPlayer3;
                z29 = z311111111111111;
                sVar2.o0(objQ17);
            }
            e(exoPlayer4, cVar111113, (fz.a) objQ17, sVar2, 0);
            if (z29) {
                cVar6 = cVar6;
                sVar3 = sVar2;
                z30 = true;
                sVar3.d0(1439380887);
                sVar3.p(false);
            } else {
                cVar6 = cVar6;
                sVar3 = sVar2;
                z30 = true;
                sVar3.d0(1439380887);
                sVar3.p(false);
            }
            sVar3.p(z30);
            sVar = sVar3;
            obj2 = obj3;
            z14 = z15;
            cVar3 = cVar6;
            j12 = j14;
            recordingStatus2 = recordingStatus11;
        } else {
            sVar4.W();
            z14 = z12;
            sVar = sVar4;
            cVar3 = cVar2;
            j12 = j11;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.s4
                @Override // fz.e
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    y4.a(uri, rVar, recordingStatus2, z14, j12, obj2, cVar3, (l1.n) obj4, l1.t.M(i11 | 1), i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void b(h5 h5Var) {
        rz.z1 z1Var = h5Var.f23864a;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        h5Var.f23864a = null;
    }

    public static final void c(l1.b1 b1Var, boolean z11) {
        b1Var.setValue(Boolean.valueOf(z11));
    }

    public static final void d(boolean z11, boolean z12, h5 h5Var, rz.b0 b0Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, ExoPlayer exoPlayer, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6, l1.b1 b1Var7) {
        if (!z11 || z12 || ((Boolean) b1Var.getValue()).booleanValue() || ((Boolean) b1Var2.getValue()).booleanValue()) {
            return;
        }
        b1Var.setValue(Boolean.TRUE);
        c(b1Var3, true);
        b(h5Var);
        h5Var.f23864a = rz.e0.B(b0Var, null, null, new b0.g(exoPlayer, h5Var, b1Var4, b1Var5, b1Var6, b1Var7, (vy.d) null), 3);
    }

    public static final void e(final ExoPlayer exoPlayer, fz.c cVar, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1574524072);
        int i12 = (sVar.h(exoPlayer) ? 4 : 2) | i11 | (sVar.h(cVar) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            boolean zH = ((i12 & 112) == 32) | ((i12 & 896) == 256) | sVar.h(exoPlayer);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new aj.c(exoPlayer, cVar, aVar, 24);
                sVar.o0(objQ);
            }
            l1.t.c(exoPlayer, (fz.c) objQ, sVar);
            boolean zH2 = sVar.h(exoPlayer);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                final int i13 = 1;
                objQ2 = new fz.c() { // from class: dt.o4
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i13) {
                            case 0:
                                PlayerView view = (PlayerView) obj;
                                kotlin.jvm.internal.m.f(view, "view");
                                y6.j0 player = view.getPlayer();
                                ExoPlayer exoPlayer2 = exoPlayer;
                                if (!kotlin.jvm.internal.m.a(player, exoPlayer2)) {
                                    view.setPlayer(exoPlayer2);
                                }
                                return qy.b0.f48488a;
                            default:
                                Context context = (Context) obj;
                                kotlin.jvm.internal.m.f(context, "context");
                                PlayerView playerView = new PlayerView(context);
                                playerView.setPlayer(exoPlayer);
                                PlayerControlView playerControlView = playerView.N;
                                if (playerControlView != null) {
                                    playerControlView.g();
                                }
                                playerView.setUseController(false);
                                playerView.setResizeMode(4);
                                return playerView;
                        }
                    }
                };
                sVar.o0(objQ2);
            }
            fz.c cVar2 = (fz.c) objQ2;
            boolean zH3 = sVar.h(exoPlayer);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                final int i14 = 0;
                objQ3 = new fz.c() { // from class: dt.o4
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                PlayerView view = (PlayerView) obj;
                                kotlin.jvm.internal.m.f(view, "view");
                                y6.j0 player = view.getPlayer();
                                ExoPlayer exoPlayer2 = exoPlayer;
                                if (!kotlin.jvm.internal.m.a(player, exoPlayer2)) {
                                    view.setPlayer(exoPlayer2);
                                }
                                return qy.b0.f48488a;
                            default:
                                Context context = (Context) obj;
                                kotlin.jvm.internal.m.f(context, "context");
                                PlayerView playerView = new PlayerView(context);
                                playerView.setPlayer(exoPlayer);
                                PlayerControlView playerControlView = playerView.N;
                                if (playerControlView != null) {
                                    playerControlView.g();
                                }
                                playerView.setUseController(false);
                                playerView.setResizeMode(4);
                                return playerView;
                        }
                    }
                };
                sVar.o0(objQ3);
            }
            y3.h.b(cVar2, null, (fz.c) objQ3, sVar, 0, 2);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i((Object) exoPlayer, cVar, (Object) aVar, i11, 22);
        }
    }
}
