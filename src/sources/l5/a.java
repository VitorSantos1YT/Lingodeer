package l5;

import a5.g;
import a5.j;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.Lifecycle;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import g3.a0;
import g3.f;
import g3.k;
import g3.l;
import g3.o;
import g3.t;
import g3.u;
import g3.y;
import j3.a1;
import j3.b1;
import j3.h;
import j3.i;
import j3.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import n3.s;
import qp.m4;
import qy.b0;
import ry.r;
import u3.n;
import u3.p;
import y.d0;
import y.i0;
import y.m;
import y.n0;
import y.u0;
import y.v;
import y.w;
import z2.g0;
import z2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z4.b f39737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(z4.b bVar, int i11) {
        super(0);
        this.f39736c = i11;
        this.f39737d = bVar;
    }

    private final g r(int i11) {
        return new g(AccessibilityNodeInfo.obtain(((b) this.f39737d).r(i11).f380a));
    }

    @Override // a5.j
    public void d(int i11, g gVar, String str, Bundle bundle) {
        switch (this.f39736c) {
            case 1:
                ((x) this.f39737d).j(i11, gVar, str, bundle);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0206  */
    /* JADX WARN: Code duplicated, block: B:110:0x020b  */
    /* JADX WARN: Code duplicated, block: B:115:0x021e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0228  */
    /* JADX WARN: Code duplicated, block: B:119:0x0237  */
    /* JADX WARN: Code duplicated, block: B:121:0x0253  */
    /* JADX WARN: Code duplicated, block: B:123:0x025c  */
    /* JADX WARN: Code duplicated, block: B:126:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:139:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:140:0x02df  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:148:0x0302  */
    /* JADX WARN: Code duplicated, block: B:150:0x030c  */
    /* JADX WARN: Code duplicated, block: B:153:0x031d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0354  */
    /* JADX WARN: Code duplicated, block: B:159:0x035f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:161:0x036f  */
    /* JADX WARN: Code duplicated, block: B:167:0x038d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0395  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a7 A[LOOP:3: B:169:0x0393->B:172:0x03a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:179:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:187:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:189:0x0413  */
    /* JADX WARN: Code duplicated, block: B:193:0x0436  */
    /* JADX WARN: Code duplicated, block: B:195:0x0444  */
    /* JADX WARN: Code duplicated, block: B:197:0x044b  */
    /* JADX WARN: Code duplicated, block: B:199:0x0461  */
    /* JADX WARN: Code duplicated, block: B:201:0x0473  */
    /* JADX WARN: Code duplicated, block: B:203:0x047d  */
    /* JADX WARN: Code duplicated, block: B:205:0x048d  */
    /* JADX WARN: Code duplicated, block: B:208:0x049b  */
    /* JADX WARN: Code duplicated, block: B:211:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:213:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:216:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:222:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:224:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:225:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:227:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:230:0x050b  */
    /* JADX WARN: Code duplicated, block: B:233:0x0510  */
    /* JADX WARN: Code duplicated, block: B:235:0x0516  */
    /* JADX WARN: Code duplicated, block: B:236:0x051a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0521  */
    /* JADX WARN: Code duplicated, block: B:241:0x052b  */
    /* JADX WARN: Code duplicated, block: B:246:0x053d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0545  */
    /* JADX WARN: Code duplicated, block: B:251:0x054a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0551  */
    /* JADX WARN: Code duplicated, block: B:256:0x055d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0562  */
    /* JADX WARN: Code duplicated, block: B:261:0x0565  */
    /* JADX WARN: Code duplicated, block: B:264:0x057c A[LOOP:7: B:260:0x0563->B:264:0x057c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:267:0x0584  */
    /* JADX WARN: Code duplicated, block: B:270:0x058f  */
    /* JADX WARN: Code duplicated, block: B:273:0x0594  */
    /* JADX WARN: Code duplicated, block: B:276:0x059d  */
    /* JADX WARN: Code duplicated, block: B:278:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:281:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:284:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:285:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:288:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:290:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:292:0x0605  */
    /* JADX WARN: Code duplicated, block: B:293:0x060c  */
    /* JADX WARN: Code duplicated, block: B:296:0x061f  */
    /* JADX WARN: Code duplicated, block: B:299:0x0624  */
    /* JADX WARN: Code duplicated, block: B:302:0x0635  */
    /* JADX WARN: Code duplicated, block: B:304:0x0643  */
    /* JADX WARN: Code duplicated, block: B:305:0x0645  */
    /* JADX WARN: Code duplicated, block: B:309:0x064d  */
    /* JADX WARN: Code duplicated, block: B:310:0x064f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0651  */
    /* JADX WARN: Code duplicated, block: B:316:0x065a  */
    /* JADX WARN: Code duplicated, block: B:317:0x065c  */
    /* JADX WARN: Code duplicated, block: B:319:0x065f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:323:0x0666  */
    /* JADX WARN: Code duplicated, block: B:326:0x0670  */
    /* JADX WARN: Code duplicated, block: B:331:0x0690  */
    /* JADX WARN: Code duplicated, block: B:333:0x069a  */
    /* JADX WARN: Code duplicated, block: B:336:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:339:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:341:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:344:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:347:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:350:0x070f  */
    /* JADX WARN: Code duplicated, block: B:354:0x0721  */
    /* JADX WARN: Code duplicated, block: B:355:0x0728  */
    /* JADX WARN: Code duplicated, block: B:357:0x072b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:360:0x073e  */
    /* JADX WARN: Code duplicated, block: B:364:0x0747  */
    /* JADX WARN: Code duplicated, block: B:366:0x074a  */
    /* JADX WARN: Code duplicated, block: B:368:0x0761  */
    /* JADX WARN: Code duplicated, block: B:369:0x0764  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:372:0x0786  */
    /* JADX WARN: Code duplicated, block: B:376:0x078f  */
    /* JADX WARN: Code duplicated, block: B:378:0x0792  */
    /* JADX WARN: Code duplicated, block: B:382:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:385:0x07af  */
    /* JADX WARN: Code duplicated, block: B:387:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:389:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:394:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:397:0x07d0 A[LOOP:8: B:386:0x07b3->B:397:0x07d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:400:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:402:0x07de  */
    /* JADX WARN: Code duplicated, block: B:404:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:406:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:408:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:411:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:414:0x0805  */
    /* JADX WARN: Code duplicated, block: B:416:0x0811  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:420:0x081a  */
    /* JADX WARN: Code duplicated, block: B:422:0x081d  */
    /* JADX WARN: Code duplicated, block: B:427:0x0832  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:430:0x083f  */
    /* JADX WARN: Code duplicated, block: B:434:0x0860  */
    /* JADX WARN: Code duplicated, block: B:436:0x086c  */
    /* JADX WARN: Code duplicated, block: B:437:0x0872  */
    /* JADX WARN: Code duplicated, block: B:440:0x087b  */
    /* JADX WARN: Code duplicated, block: B:443:0x088d  */
    /* JADX WARN: Code duplicated, block: B:447:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:450:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:453:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:456:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:459:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:461:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:464:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:467:0x090e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:470:0x0914  */
    /* JADX WARN: Code duplicated, block: B:471:0x0920  */
    /* JADX WARN: Code duplicated, block: B:474:0x0934  */
    /* JADX WARN: Code duplicated, block: B:476:0x0937  */
    /* JADX WARN: Code duplicated, block: B:478:0x0943  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:480:0x0957  */
    /* JADX WARN: Code duplicated, block: B:484:0x0963  */
    /* JADX WARN: Code duplicated, block: B:486:0x096a  */
    /* JADX WARN: Code duplicated, block: B:487:0x096c  */
    /* JADX WARN: Code duplicated, block: B:489:0x0972  */
    /* JADX WARN: Code duplicated, block: B:493:0x099b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:496:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:498:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:500:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:503:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:504:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:506:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:509:0x09da  */
    /* JADX WARN: Code duplicated, block: B:512:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:514:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:516:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:517:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:519:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:520:0x09ff  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:525:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:527:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:528:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:530:0x0a1d  */
    /* JADX WARN: Code duplicated, block: B:531:0x0a20  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a33 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:546:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:563:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:566:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:568:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:571:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:574:0x0afc  */
    /* JADX WARN: Code duplicated, block: B:577:0x0b1b  */
    /* JADX WARN: Code duplicated, block: B:579:0x0b2f  */
    /* JADX WARN: Code duplicated, block: B:581:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:584:0x0b4c  */
    /* JADX WARN: Code duplicated, block: B:585:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:589:0x0b63 A[LOOP:9: B:588:0x0b61->B:589:0x0b63, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:592:0x0b78  */
    /* JADX WARN: Code duplicated, block: B:594:0x0b8d  */
    /* JADX WARN: Code duplicated, block: B:595:0x0b8f  */
    /* JADX WARN: Code duplicated, block: B:597:0x0b92  */
    /* JADX WARN: Code duplicated, block: B:599:0x0b9c  */
    /* JADX WARN: Code duplicated, block: B:602:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:606:0x0beb A[LOOP:11: B:605:0x0be9->B:606:0x0beb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:607:0x0c12  */
    /* JADX WARN: Code duplicated, block: B:609:0x0c19 A[LOOP:12: B:608:0x0c17->B:609:0x0c19, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:611:0x0c49  */
    /* JADX WARN: Code duplicated, block: B:615:0x0c6e  */
    /* JADX WARN: Code duplicated, block: B:617:0x0c78  */
    /* JADX WARN: Code duplicated, block: B:618:0x0c7e  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:620:0x0c8a  */
    /* JADX WARN: Code duplicated, block: B:623:0x0c96  */
    /* JADX WARN: Code duplicated, block: B:628:0x0cb6  */
    /* JADX WARN: Code duplicated, block: B:639:0x0ccb  */
    /* JADX WARN: Code duplicated, block: B:643:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0125  */
    /* JADX WARN: Code duplicated, block: B:655:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x041d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x0571 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x07d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d  */
    /* JADX WARN: Code duplicated, block: B:670:0x07d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x0bc0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x095a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:73:0x0151  */
    /* JADX WARN: Code duplicated, block: B:75:0x0154  */
    /* JADX WARN: Code duplicated, block: B:76:0x0163  */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178  */
    /* JADX WARN: Code duplicated, block: B:86:0x0192  */
    /* JADX WARN: Code duplicated, block: B:88:0x0198  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e0  */
    /* JADX WARN: Instruction removed from duplicated block: B:484:0x0963, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:639:0x0ccb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [a5.g] */
    /* JADX WARN: Type inference failed for: r2v52, types: [ry.r] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v155 */
    /* JADX WARN: Type inference failed for: r6v156, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v163, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v182 */
    /* JADX WARN: Type inference failed for: r6v185, types: [a5.g] */
    /* JADX WARN: Type inference failed for: r6v190 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40, types: [z2.x] */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v5, types: [z2.x] */
    @Override // a5.j
    public final g e(int i11) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        g gVar;
        int i12;
        t tVarL;
        Integer numValueOf;
        int iIntValue;
        w wVar;
        v vVar;
        u0 u0Var;
        Resources resources;
        o oVar;
        i0 i0Var;
        Object objG;
        k kVar;
        w wVar2;
        u0 u0Var2;
        boolean zJ;
        List listJ;
        int size;
        boolean z11;
        int i13;
        int i14;
        AccessibilityNodeInfo accessibilityNodeInfo;
        h hVarU;
        k kVar2;
        t tVar;
        o oVar2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        i0 i0Var2;
        Resources resources2;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        ?? r9;
        SpannableString spannableString;
        a0 a0Var;
        i0 i0Var3;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        t tVar2;
        Object objG2;
        i3.a aVar;
        Object objG3;
        Boolean bool;
        k kVar3;
        int i15;
        o oVar3;
        Object objG4;
        List list;
        String str;
        Object objG5;
        String str2;
        Object objG6;
        int i16;
        Object objG7;
        Integer num;
        int iIntValue2;
        a0 a0Var2;
        x xVar;
        int i17;
        ?? r11;
        Object objG8;
        g3.a aVar2;
        g3.a aVar3;
        g3.a aVar4;
        String strT;
        boolean z12;
        g3.j jVar;
        int i18;
        Object objG9;
        g3.d dVar;
        ArrayList arrayList;
        Object objG10;
        boolean zI;
        int size2;
        List listJ2;
        int size3;
        int i19;
        t tVar3;
        l lVar;
        l lVar2;
        int iD;
        AndroidComposeView androidComposeView;
        Bundle bundle;
        int iD2;
        String str3;
        ?? r12;
        AndroidViewHolder androidViewHolderC;
        AndroidViewHolder androidViewHolderC2;
        g3.a aVar5;
        g3.a aVar6;
        g3.a aVar7;
        o oVarM;
        a0 a0Var3;
        List list2;
        w wVar3;
        u0 u0Var3;
        d0 d0VarA;
        u0 u0Var4;
        boolean z13;
        int size4;
        int i21;
        d0 d0Var;
        w wVar4;
        int[] iArr;
        int i22;
        int i23;
        ArrayList arrayList2;
        int size5;
        int i24;
        int size6;
        int i25;
        f fVar;
        boolean z14;
        String strA;
        int iD3;
        boolean z15;
        Object objG11;
        boolean z16;
        y2.i0 i0Var4;
        boolean z17;
        a5.c cVar;
        boolean z18;
        a5.c cVar2;
        Object objG12;
        Object objG13;
        g3.a aVar8;
        lz.d dVar2;
        float f5;
        a0 a0Var4;
        float fFloatValue;
        float fFloatValue2;
        float f11;
        float fFloatValue3;
        float fFloatValue4;
        ArrayList arrayListL;
        CharSequence charSequenceG;
        boolean z19;
        g3.a aVar9;
        String str4;
        List list3;
        boolean z20;
        y2.i0 i0VarW;
        o oVarY;
        boolean zA;
        Object objG14;
        o oVarY2;
        boolean z21;
        boolean z22;
        g3.a aVar10;
        g3.a aVar11;
        g3.a aVar12;
        g3.a aVar13;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        int iD4;
        t tVarL2;
        boolean zBooleanValue;
        o oVar4;
        a0 a0Var5;
        boolean zBooleanValue2;
        Object objG15;
        v3.c density;
        m4 m4Var;
        SpannableString spannableString2;
        List list4;
        ArrayList arrayList3;
        SpannableString spannableString3;
        ?? arrayList4;
        ?? arrayList5;
        int size7;
        int i26;
        int size8;
        int i27;
        List listA;
        int size9;
        int i28;
        j3.f fVar2;
        int i29;
        Object obj;
        int i30;
        j3.w wVar5;
        WeakHashMap weakHashMap;
        Object eVar;
        j3.f fVar3;
        j3.v vVar2;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        a1 a1Var;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size10;
        int i31;
        j3.f fVar4;
        b1 b1Var;
        int i32;
        int i33;
        int size11;
        int i34;
        j3.f fVar5;
        int size12;
        int i35;
        int i36;
        int i37;
        long jB;
        s sVar;
        n3.o oVar5;
        p pVar;
        long j11;
        u3.l lVar3;
        u3.o cVar3;
        SpannableString spannableString4;
        s sVar2;
        int i38;
        int i39;
        int i40;
        t tVar4;
        m mVarS;
        int i41;
        AndroidViewHolder androidViewHolder;
        u uVar;
        boolean zA2;
        t tVar5;
        int i42;
        int i43;
        String strE;
        Object parentForAccessibility;
        View view;
        ?? r13;
        g gVar2;
        Lifecycle lifecycle;
        switch (this.f39736c) {
            case 0:
                return r(i11);
            default:
                x xVar2 = (x) this.f39737d;
                AccessibilityManager accessibilityManager = xVar2.f58724t;
                AndroidComposeView androidComposeView2 = xVar2.f58708d;
                z2.k viewTreeOwners = androidComposeView2.getViewTreeOwners();
                if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.f58595a.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.DESTROYED) {
                    if (accessibilityManager.isEnabled()) {
                        gVar2 = null;
                    } else {
                        gVar2 = new g(AccessibilityNodeInfo.obtain());
                    }
                    i16 = i11;
                    r13 = xVar2;
                    r12 = gVar2;
                } else {
                    u uVar2 = (u) xVar2.s().b(i11);
                    if (uVar2 == null) {
                        if (accessibilityManager.isEnabled()) {
                            gVar2 = null;
                        } else {
                            gVar2 = new g(AccessibilityNodeInfo.obtain());
                        }
                        i16 = i11;
                        r13 = xVar2;
                        r12 = gVar2;
                    } else {
                        t tVar6 = uVar2.f28703a;
                        o oVarK = tVar6.k();
                        y2.i0 i0Var5 = tVar6.f28698c;
                        Object objG16 = oVarK.f28691a.g(g3.x.f28722n);
                        if (objG16 == null) {
                            objG16 = null;
                        }
                        boolean zA3 = kotlin.jvm.internal.m.a(objG16, Boolean.TRUE);
                        if (!zA3) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            gVar = new g(accessibilityNodeInfoObtain);
                            i12 = Build.VERSION.SDK_INT;
                            if (i12 >= 34) {
                                a5.b.n(accessibilityNodeInfoObtain, zA3);
                            } else {
                                gVar.k(64, zA3);
                            }
                            if (i11 == -1) {
                                parentForAccessibility = androidComposeView2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    view = (View) parentForAccessibility;
                                } else {
                                    view = null;
                                }
                                gVar.f381b = -1;
                                accessibilityNodeInfoObtain.setParent(view);
                            } else {
                                tVarL = tVar6.l();
                                if (tVarL != null) {
                                    numValueOf = Integer.valueOf(tVarL.f28702g);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    v2.a.c("semanticsNode " + i11 + " has null parent");
                                    throw new KotlinNothingValueException();
                                }
                                iIntValue = numValueOf.intValue();
                                if (iIntValue == androidComposeView2.getSemanticsOwner().a().f28702g) {
                                    iIntValue = -1;
                                }
                                gVar.f381b = iIntValue;
                                accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                            }
                            gVar.f382c = i11;
                            accessibilityNodeInfoObtain.setSource(androidComposeView2, i11);
                            gVar.l(xVar2.k(uVar2));
                            wVar = x.f58704q0;
                            vVar = xVar2.f58720m0;
                            u0Var = xVar2.V;
                            resources = androidComposeView2.getContext().getResources();
                            gVar.m("android.view.View");
                            oVar = tVar6.f28699d;
                            i0Var = oVar.f28691a;
                            if (i0Var.c(g3.x.F)) {
                                gVar.m("android.widget.EditText");
                            }
                            if (i0Var.c(g3.x.B)) {
                                gVar.m("android.widget.TextView");
                            }
                            objG = i0Var.g(g3.x.f28733y);
                            if (objG == null) {
                                objG = null;
                            }
                            kVar = (k) objG;
                            if (kVar != null) {
                                i42 = kVar.f28656a;
                                u0Var2 = u0Var;
                                if (tVar6.f28700e) {
                                    i43 = 4;
                                    wVar2 = wVar;
                                    if (t.j(4, tVar6).isEmpty()) {
                                    }
                                } else {
                                    i43 = 4;
                                    wVar2 = wVar;
                                }
                                if (i42 == i43) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (i42 == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strE = g0.E(i42);
                                    if (i42 == 5 || tVar6.o() || oVar.f28693c) {
                                        gVar.m(strE);
                                    }
                                }
                            } else {
                                wVar2 = wVar;
                                u0Var2 = u0Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(g3.w.f(tVar6));
                            if (i12 >= 34) {
                                zJ = a5.b.j(accessibilityManager);
                            } else {
                                zJ = true;
                            }
                            listJ = t.j(4, tVar6);
                            size = listJ.size();
                            z11 = zJ;
                            i13 = 0;
                            i14 = 0;
                            while (true) {
                                accessibilityNodeInfo = gVar.f380a;
                                if (i14 < size) {
                                    List list5 = listJ;
                                    tVar4 = (t) listJ.get(i14);
                                    int i44 = size;
                                    mVarS = xVar2.s();
                                    int i45 = i14;
                                    i41 = tVar4.f28702g;
                                    if (mVarS.a(i41)) {
                                        androidViewHolder = androidComposeView2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(tVar4.f28698c);
                                        if (i41 != -1) {
                                            if (androidViewHolder != null) {
                                                accessibilityNodeInfo.addChild(androidViewHolder);
                                            } else {
                                                uVar = (u) xVar2.s().b(i41);
                                                if (uVar != null || (tVar5 = uVar.f28703a) == null) {
                                                    zA2 = false;
                                                } else {
                                                    Object objG17 = tVar5.k().f28691a.g(g3.x.f28722n);
                                                    if (objG17 == null) {
                                                        objG17 = null;
                                                    }
                                                    zA2 = kotlin.jvm.internal.m.a(objG17, Boolean.TRUE);
                                                }
                                                if (z11 || !zA2) {
                                                    accessibilityNodeInfo.addChild(androidComposeView2, i41);
                                                }
                                            }
                                            vVar.f(i41, i13);
                                            i13++;
                                        }
                                    }
                                    i14 = i45 + 1;
                                    size = i44;
                                    listJ = list5;
                                } else {
                                    if (i11 == xVar2.N) {
                                        gVar.i(true);
                                        gVar.b(a5.c.f363i);
                                    } else {
                                        gVar.i(false);
                                        gVar.b(a5.c.f362h);
                                    }
                                    hVarU = g0.u(tVar6);
                                    if (hVarU != null) {
                                        androidComposeView2.getFontFamilyResolver();
                                        density = androidComposeView2.getDensity();
                                        m4Var = xVar2.f58716i0;
                                        String str5 = hVarU.f35700b;
                                        list4 = hVarU.f35699a;
                                        spannableString2 = new SpannableString(str5);
                                        arrayList3 = hVarU.f35701c;
                                        if (arrayList3 != null) {
                                            size12 = arrayList3.size();
                                            i35 = 0;
                                            while (i35 < size12) {
                                                int i46 = size12;
                                                j3.f fVar6 = (j3.f) arrayList3.get(i35);
                                                int i47 = i35;
                                                p0 p0Var = (p0) fVar6.f35689a;
                                                ArrayList arrayList6 = arrayList3;
                                                i36 = fVar6.f35690b;
                                                i37 = fVar6.f35691c;
                                                k kVar4 = kVar;
                                                jB = p0Var.f35754a.b();
                                                t tVar7 = tVar6;
                                                o oVar6 = oVar;
                                                long j12 = p0Var.f35755b;
                                                sVar = p0Var.f35756c;
                                                oVar5 = p0Var.f35757d;
                                                pVar = p0Var.f35763j;
                                                Resources resources3 = resources;
                                                q3.b bVar = p0Var.f35764k;
                                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfo;
                                                i0 i0Var6 = i0Var;
                                                j11 = p0Var.f35765l;
                                                lVar3 = p0Var.m;
                                                cVar3 = p0Var.f35754a;
                                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfoObtain;
                                                g gVar3 = gVar;
                                                if (!g2.x.d(jB, cVar3.b())) {
                                                    if (jB != 16) {
                                                        cVar3 = new u3.c(jB);
                                                    } else {
                                                        cVar3 = n.f52756a;
                                                    }
                                                }
                                                se.p.b0(spannableString2, cVar3.b(), i36, i37);
                                                spannableString4 = spannableString2;
                                                se.p.c0(spannableString4, j12, density, i36, i37);
                                                if (sVar == null || oVar5 != null) {
                                                    if (sVar == null) {
                                                        sVar2 = s.f43178t;
                                                    } else {
                                                        sVar2 = sVar;
                                                    }
                                                    if (oVar5 != null) {
                                                        i38 = oVar5.f43170a;
                                                    } else {
                                                        i38 = 0;
                                                    }
                                                    StyleSpan styleSpan = new StyleSpan(ew.a.n(sVar2, i38));
                                                    i39 = 33;
                                                    spannableString4.setSpan(styleSpan, i36, i37, 33);
                                                } else {
                                                    i39 = 33;
                                                }
                                                if (lVar3 != null) {
                                                    i40 = lVar3.f52754a;
                                                    if ((i40 | 1) == i40) {
                                                        spannableString4.setSpan(new UnderlineSpan(), i36, i37, i39);
                                                    }
                                                    if ((i40 | 2) == i40) {
                                                        spannableString4.setSpan(new StrikethroughSpan(), i36, i37, i39);
                                                    }
                                                }
                                                if (pVar != null) {
                                                    spannableString4.setSpan(new ScaleXSpan(pVar.f52758a), i36, i37, i39);
                                                }
                                                se.p.d0(spannableString4, bVar, i36, i37);
                                                if (j11 != 16) {
                                                    spannableString4.setSpan(new BackgroundColorSpan(f0.E(j11)), i36, i37, i39);
                                                }
                                                i35 = i47 + 1;
                                                spannableString2 = spannableString4;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo6;
                                                size12 = i46;
                                                arrayList3 = arrayList6;
                                                kVar = kVar4;
                                                tVar6 = tVar7;
                                                oVar = oVar6;
                                                resources = resources3;
                                                i0Var = i0Var6;
                                                accessibilityNodeInfo = accessibilityNodeInfo5;
                                                gVar = gVar3;
                                            }
                                        }
                                        kVar2 = kVar;
                                        tVar = tVar6;
                                        oVar2 = oVar;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        i0Var2 = i0Var;
                                        resources2 = resources;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        g gVar4 = gVar;
                                        spannableString3 = spannableString2;
                                        int length = str5.length();
                                        arrayList4 = r.f50854a;
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size11 = list4.size();
                                            while (i34 < size11) {
                                                Object obj2 = list4.get(i34);
                                                fVar5 = (j3.f) obj2;
                                                if (!(fVar5.f35689a instanceof b1) && i.b(0, length, fVar5.f35690b, fVar5.f35691c)) {
                                                    arrayList5.add(obj2);
                                                }
                                            }
                                        } else {
                                            arrayList5 = arrayList4;
                                        }
                                        size7 = arrayList5.size();
                                        while (i26 < size7) {
                                            j3.f fVar7 = (j3.f) arrayList5.get(i26);
                                            b1Var = (b1) fVar7.f35689a;
                                            i32 = fVar7.f35690b;
                                            i33 = fVar7.f35691c;
                                            if (b1Var instanceof b1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(b1Var.f35667a).build(), i32, i33, 33);
                                        }
                                        int length2 = str5.length();
                                        if (list4 != null) {
                                            arrayList4 = new ArrayList(list4.size());
                                            size10 = list4.size();
                                            while (i31 < size10) {
                                                Object obj3 = list4.get(i31);
                                                fVar4 = (j3.f) obj3;
                                                if (!(fVar4.f35689a instanceof a1) && i.b(0, length2, fVar4.f35690b, fVar4.f35691c)) {
                                                    arrayList4.add(obj3);
                                                }
                                            }
                                        }
                                        size8 = arrayList4.size();
                                        while (i27 < size8) {
                                            j3.f fVar8 = (j3.f) arrayList4.get(i27);
                                            a1Var = (a1) fVar8.f35689a;
                                            int i48 = fVar8.f35690b;
                                            int i49 = fVar8.f35691c;
                                            weakHashMap3 = (WeakHashMap) m4Var.f48060b;
                                            uRLSpan2 = weakHashMap3.get(a1Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(a1Var.f35660a);
                                                weakHashMap3.put(a1Var, uRLSpan2);
                                            }
                                            spannableString3.setSpan((URLSpan) uRLSpan2, i48, i49, 33);
                                        }
                                        listA = hVarU.a(str5.length());
                                        size9 = listA.size();
                                        while (i28 < size9) {
                                            fVar2 = (j3.f) listA.get(i28);
                                            i29 = fVar2.f35690b;
                                            obj = fVar2.f35689a;
                                            i30 = fVar2.f35691c;
                                            if (i29 != i30) {
                                                wVar5 = (j3.w) obj;
                                                if (wVar5 instanceof j3.v) {
                                                    kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                                    vVar2 = (j3.v) obj;
                                                    fVar3 = new j3.f(vVar2, i29, i30);
                                                    weakHashMap2 = (WeakHashMap) m4Var.f48061c;
                                                    uRLSpan = weakHashMap2.get(fVar3);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(vVar2.f35803a);
                                                        weakHashMap2.put(fVar3, uRLSpan);
                                                    }
                                                    spannableString3.setSpan((URLSpan) uRLSpan, i29, i30, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) m4Var.f48062d;
                                                    eVar = weakHashMap.get(fVar2);
                                                    if (eVar == null) {
                                                        eVar = new r3.e(wVar5);
                                                        weakHashMap.put(fVar2, eVar);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) eVar, i29, i30, 33);
                                                }
                                            }
                                        }
                                        spannableString = (SpannableString) x.P(spannableString3);
                                        r9 = gVar4;
                                    } else {
                                        kVar2 = kVar;
                                        vVar = vVar;
                                        tVar = tVar6;
                                        oVar2 = oVar;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        i0Var2 = i0Var;
                                        resources2 = resources;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        r9 = gVar;
                                        spannableString = null;
                                    }
                                    r9.x(spannableString);
                                    a0Var = g3.x.L;
                                    i0Var3 = i0Var2;
                                    if (i0Var3.c(a0Var)) {
                                        accessibilityNodeInfo3.setContentInvalid(true);
                                        objG15 = i0Var3.g(a0Var);
                                        if (objG15 == null) {
                                            objG15 = null;
                                        }
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo4.setError((CharSequence) objG15);
                                    } else {
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                    }
                                    tVar2 = tVar;
                                    Resources resources4 = resources2;
                                    r9.w(g0.t(tVar2, resources4));
                                    accessibilityNodeInfo4.setCheckable(g0.s(tVar2));
                                    objG2 = i0Var3.g(g3.x.J);
                                    if (objG2 == null) {
                                        objG2 = null;
                                    }
                                    aVar = (i3.a) objG2;
                                    if (aVar != null) {
                                        if (aVar == i3.a.On) {
                                            accessibilityNodeInfo4.setChecked(true);
                                        } else if (aVar == i3.a.Off) {
                                            accessibilityNodeInfo4.setChecked(false);
                                        }
                                    }
                                    objG3 = i0Var3.g(g3.x.I);
                                    if (objG3 == null) {
                                        objG3 = null;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (kVar2 == null) {
                                            kVar3 = kVar2;
                                            i15 = 4;
                                        } else {
                                            kVar3 = kVar2;
                                            i15 = 4;
                                            if (kVar3.f28656a == 4) {
                                                accessibilityNodeInfo4.setSelected(zBooleanValue2);
                                            }
                                        }
                                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                                    } else {
                                        kVar3 = kVar2;
                                        i15 = 4;
                                    }
                                    oVar3 = oVar2;
                                    if (oVar3.f28693c || t.j(i15, tVar2).isEmpty()) {
                                        objG4 = i0Var3.g(g3.x.f28710a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) ry.m.s0(list);
                                        } else {
                                            str = null;
                                        }
                                        r9.p(str);
                                    }
                                    objG5 = i0Var3.g(g3.x.f28734z);
                                    if (objG5 == null) {
                                        objG5 = null;
                                    }
                                    str2 = (String) objG5;
                                    if (str2 != null) {
                                        tVarL2 = tVar2;
                                        while (true) {
                                            if (tVarL2 != null) {
                                                oVar4 = tVarL2.f28699d;
                                                a0Var5 = y.f28735a;
                                                if (oVar4.f28691a.c(a0Var5)) {
                                                    zBooleanValue = ((Boolean) oVar4.e(a0Var5)).booleanValue();
                                                } else {
                                                    tVarL2 = tVarL2.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo3.setViewIdResourceName(str2);
                                        }
                                    }
                                    objG6 = i0Var3.g(g3.x.f28717h);
                                    if (objG6 == null) {
                                        objG6 = null;
                                    }
                                    if (((b0) objG6) != null) {
                                        r9.q(true);
                                    }
                                    i16 = i11;
                                    if (i16 != -1) {
                                        iD4 = vVar.d(tVar2.f28702g);
                                        if (iD4 != -1) {
                                            accessibilityNodeInfo3.setDrawingOrder(iD4);
                                        }
                                    }
                                    accessibilityNodeInfo3.setPassword(i0Var3.c(g3.x.K));
                                    accessibilityNodeInfo3.setEditable(i0Var3.c(g3.x.N));
                                    objG7 = i0Var3.g(g3.x.O);
                                    if (objG7 == null) {
                                        objG7 = null;
                                    }
                                    num = (Integer) objG7;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                                    accessibilityNodeInfo4.setEnabled(g0.j(tVar2));
                                    a0Var2 = g3.x.f28720k;
                                    accessibilityNodeInfo4.setFocusable(i0Var3.c(a0Var2));
                                    if (accessibilityNodeInfo3.isFocusable()) {
                                        accessibilityNodeInfo4.setFocused(((Boolean) oVar3.e(a0Var2)).booleanValue());
                                        if (accessibilityNodeInfo3.isFocused()) {
                                            r9.a(2);
                                            x xVar3 = xVar2;
                                            xVar3.O = i16;
                                            xVar = xVar3;
                                        } else {
                                            r11 = xVar2;
                                            i17 = 1;
                                            r9.a(1);
                                        }
                                        r9.y((g3.w.e(tVar2) ? 1 : 0) ^ i17);
                                        objG8 = i0Var3.g(g3.x.f28719j);
                                        if (objG8 == null) {
                                            objG8 = null;
                                        }
                                        if (((g3.h) objG8) != null) {
                                            accessibilityNodeInfo3.setLiveRegion(i17);
                                        }
                                        accessibilityNodeInfo4.setClickable(false);
                                        aVar2 = (g3.a) g3.w.d(oVar3, g3.n.f28667b);
                                        if (aVar2 != null) {
                                            boolean zA4 = kotlin.jvm.internal.m.a(g3.w.d(oVar3, g3.x.I), Boolean.TRUE);
                                            if (kVar3 == null && kVar3.f28656a == 4) {
                                                z23 = true;
                                            } else {
                                                z23 = false;
                                            }
                                            if (z23) {
                                                z24 = true;
                                            } else {
                                                if (kVar3 == null && kVar3.f28656a == 3) {
                                                    z26 = true;
                                                } else {
                                                    z26 = false;
                                                }
                                                if (z26) {
                                                    z24 = true;
                                                } else {
                                                    z24 = false;
                                                }
                                            }
                                            if (z24 || (z24 && !zA4)) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            accessibilityNodeInfo4.setClickable(z25);
                                            if (g0.j(tVar2) && accessibilityNodeInfo3.isClickable()) {
                                                r9.b(new a5.c(16, aVar2.f28634a));
                                            }
                                        }
                                        accessibilityNodeInfo4.setLongClickable(false);
                                        aVar3 = (g3.a) g3.w.d(oVar3, g3.n.f28668c);
                                        if (aVar3 != null) {
                                            accessibilityNodeInfo4.setLongClickable(true);
                                            if (g0.j(tVar2)) {
                                                r9.b(new a5.c(32, aVar3.f28634a));
                                            }
                                        }
                                        aVar4 = (g3.a) g3.w.d(oVar3, g3.n.f28681q);
                                        if (aVar4 != null) {
                                            r9.b(new a5.c(16384, aVar4.f28634a));
                                        }
                                        if (g0.j(tVar2)) {
                                            aVar10 = (g3.a) g3.w.d(oVar3, g3.n.f28676k);
                                            if (aVar10 != null) {
                                                r9.b(new a5.c(2097152, aVar10.f28634a));
                                            }
                                            aVar11 = (g3.a) g3.w.d(oVar3, g3.n.f28680p);
                                            if (aVar11 != null) {
                                                r9.b(new a5.c(android.R.id.accessibilityActionImeEnter, aVar11.f28634a));
                                            }
                                            aVar12 = (g3.a) g3.w.d(oVar3, g3.n.f28682r);
                                            if (aVar12 != null) {
                                                r9.b(new a5.c(65536, aVar12.f28634a));
                                            }
                                            aVar13 = (g3.a) g3.w.d(oVar3, g3.n.f28683s);
                                            if (aVar13 != null && accessibilityNodeInfo3.isFocused()) {
                                                primaryClipDescription = androidComposeView2.getClipboardManager().f58568a.getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    r9.b(new a5.c(32768, aVar13.f28634a));
                                                }
                                            }
                                        }
                                        strT = x.t(tVar2);
                                        if (strT != null || strT.length() == 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            accessibilityNodeInfo3.setTextSelection(r11.r(tVar2), r11.q(tVar2));
                                            aVar9 = (g3.a) g3.w.d(oVar3, g3.n.f28675j);
                                            if (aVar9 != null) {
                                                str4 = aVar9.f28634a;
                                            } else {
                                                str4 = null;
                                            }
                                            r9.b(new a5.c(OSSConstants.DEFAULT_STREAM_BUFFER_SIZE, str4));
                                            r9.a(256);
                                            r9.a(512);
                                            accessibilityNodeInfo4.setMovementGranularities(11);
                                            list3 = (List) g3.w.d(oVar3, g3.x.f28710a);
                                            if (list3 != null || list3.isEmpty()) {
                                                z20 = true;
                                            } else {
                                                z20 = false;
                                            }
                                            if (z20 && i0Var3.c(g3.n.f28666a)) {
                                                if (i0Var3.c(g3.x.F) || kotlin.jvm.internal.m.a(g3.w.d(oVar3, a0Var2), Boolean.TRUE)) {
                                                    i0VarW = i0Var5.w();
                                                    while (true) {
                                                        if (i0VarW == null) {
                                                            i0VarW = null;
                                                        } else {
                                                            oVarY2 = i0VarW.y();
                                                            if (oVarY2 != null || !oVarY2.f28693c) {
                                                                z21 = false;
                                                            } else if (oVarY2.f28691a.c(g3.x.F)) {
                                                                z21 = true;
                                                            } else {
                                                                z21 = false;
                                                            }
                                                            if (!z21) {
                                                                i0VarW = i0VarW.w();
                                                            }
                                                        }
                                                    }
                                                    if (i0VarW != null) {
                                                        oVarY = i0VarW.y();
                                                        if (oVarY != null) {
                                                            objG14 = oVarY.f28691a.g(a0Var2);
                                                            if (objG14 == null) {
                                                                objG14 = null;
                                                            }
                                                            zA = kotlin.jvm.internal.m.a(objG14, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        z22 = zA ? false : true;
                                                    }
                                                }
                                                if (!z22) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            arrayListL = w4.c.l("androidx.compose.ui.semantics.id");
                                            charSequenceG = r9.g();
                                            if (charSequenceG != null || charSequenceG.length() == 0) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            if (!z19 && i0Var3.c(g3.n.f28666a)) {
                                                arrayListL.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (i0Var3.c(g3.x.f28734z)) {
                                                arrayListL.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (i0Var3.c(g3.x.P)) {
                                                arrayListL.add("androidx.compose.ui.semantics.shapeType");
                                                arrayListL.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayListL.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayListL.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            r9.j(arrayListL);
                                        }
                                        jVar = (g3.j) g3.w.d(oVar3, g3.x.f28712c);
                                        if (jVar != null) {
                                            dVar2 = jVar.f28654b;
                                            f5 = jVar.f28653a;
                                            a0Var4 = g3.n.f28674i;
                                            if (i0Var3.c(a0Var4)) {
                                                r9.m("android.widget.SeekBar");
                                            } else {
                                                r9.m("android.widget.ProgressBar");
                                            }
                                            if (jVar != g3.j.f28652d) {
                                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, dVar2.f40530a, dVar2.f40531b, f5));
                                            }
                                            if (i0Var3.c(a0Var4) && g0.j(tVar2)) {
                                                fFloatValue = ((Number) dVar2.a()).floatValue();
                                                fFloatValue2 = ((Number) dVar2.b()).floatValue();
                                                if (fFloatValue < fFloatValue2) {
                                                    fFloatValue = fFloatValue2;
                                                }
                                                if (f5 < fFloatValue) {
                                                    r9.b(a5.c.f364j);
                                                }
                                                f11 = jVar.f28653a;
                                                fFloatValue3 = ((Number) dVar2.b()).floatValue();
                                                fFloatValue4 = ((Number) dVar2.a()).floatValue();
                                                if (fFloatValue3 > fFloatValue4) {
                                                    fFloatValue3 = fFloatValue4;
                                                }
                                                if (f11 > fFloatValue3) {
                                                    r9.b(a5.c.f365k);
                                                }
                                            }
                                        }
                                        i18 = Build.VERSION.SDK_INT;
                                        if (g0.j(tVar2)) {
                                            objG13 = tVar2.f28699d.f28691a.g(g3.n.f28674i);
                                            if (objG13 == null) {
                                                objG13 = null;
                                            }
                                            aVar8 = (g3.a) objG13;
                                            if (aVar8 != null) {
                                                r9.b(new a5.c(android.R.id.accessibilityActionSetProgress, aVar8.f28634a));
                                            }
                                        }
                                        objG9 = tVar2.k().f28691a.g(g3.x.f28715f);
                                        if (objG9 == null) {
                                            objG9 = null;
                                        }
                                        dVar = (g3.d) objG9;
                                        if (dVar != null) {
                                            r9.n(hd.d.v(dVar.f28644a, dVar.f28645b, 0, false));
                                        } else {
                                            arrayList = new ArrayList();
                                            objG10 = tVar2.k().f28691a.g(g3.x.f28714e);
                                            if ((objG10 != null ? objG10 : null) != null) {
                                                listJ2 = t.j(4, tVar2);
                                                size3 = listJ2.size();
                                                while (i19 < size3) {
                                                    tVar3 = (t) listJ2.get(i19);
                                                    if (tVar3.k().f28691a.c(g3.x.I)) {
                                                        arrayList.add(tVar3);
                                                    }
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                zI = com.bumptech.glide.e.i(arrayList);
                                                if (zI) {
                                                    size2 = 1;
                                                } else {
                                                    size2 = arrayList.size();
                                                }
                                                r9.n(hd.d.v(size2, zI ? arrayList.size() : 1, 0, false));
                                            }
                                        }
                                        com.bumptech.glide.e.E(r9, tVar2);
                                        lVar = (l) g3.w.d(tVar2.m(), g3.x.f28729u);
                                        g3.a aVar14 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28669d);
                                        if (lVar != null && aVar14 != null) {
                                            objG11 = tVar2.k().f28691a.g(g3.x.f28715f);
                                            if (objG11 == null) {
                                                objG11 = null;
                                            }
                                            if (objG11 == null) {
                                                objG12 = tVar2.k().f28691a.g(g3.x.f28714e);
                                                if (objG12 == null) {
                                                    objG12 = null;
                                                }
                                                if (objG12 != null) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                            } else {
                                                z16 = true;
                                            }
                                            if (!z16) {
                                                r9.m("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) lVar.f28658b.invoke()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                                                r9.u(true);
                                            }
                                            if (g0.j(tVar2)) {
                                                if (x.z(lVar)) {
                                                    r9.b(a5.c.f364j);
                                                    i0Var4 = i0Var5;
                                                    if (i0Var4.f56883c0 == v3.m.Rtl) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    if (z18) {
                                                        cVar2 = a5.c.f371r;
                                                    } else {
                                                        cVar2 = a5.c.f369p;
                                                    }
                                                    r9.b(cVar2);
                                                } else {
                                                    i0Var4 = i0Var5;
                                                }
                                                if (x.y(lVar)) {
                                                    r9.b(a5.c.f365k);
                                                    if (i0Var4.f56883c0 == v3.m.Rtl) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z17) {
                                                        cVar = a5.c.f369p;
                                                    } else {
                                                        cVar = a5.c.f371r;
                                                    }
                                                    r9.b(cVar);
                                                }
                                            }
                                        }
                                        lVar2 = (l) g3.w.d(tVar2.m(), g3.x.f28730v);
                                        if (lVar2 == null && aVar14 != null) {
                                            Object objG18 = tVar2.k().f28691a.g(g3.x.f28715f);
                                            if (objG18 == null) {
                                                objG18 = null;
                                            }
                                            if (objG18 == null) {
                                                Object objG19 = tVar2.k().f28691a.g(g3.x.f28714e);
                                                if (objG19 == null) {
                                                    objG19 = null;
                                                }
                                                if (objG19 != null) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                            } else {
                                                z15 = true;
                                            }
                                            if (!z15) {
                                                r9.m("android.widget.ScrollView");
                                            }
                                            if (((Number) lVar2.f28658b.invoke()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                                                r9.u(true);
                                            }
                                            if (g0.j(tVar2)) {
                                                if (x.z(lVar2)) {
                                                    r9.b(a5.c.f364j);
                                                    r9.b(a5.c.f370q);
                                                }
                                                if (x.y(lVar2)) {
                                                    r9.b(a5.c.f365k);
                                                    r9.b(a5.c.f368o);
                                                }
                                            }
                                        }
                                        if (i18 >= 29) {
                                            g0.n(r9, tVar2);
                                        }
                                        r9.s((CharSequence) g3.w.d(tVar2.m(), g3.x.f28713d));
                                        if (g0.j(tVar2)) {
                                            aVar5 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28684t);
                                            if (aVar5 != null) {
                                                r9.b(new a5.c(262144, aVar5.f28634a));
                                            }
                                            aVar6 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28685u);
                                            if (aVar6 != null) {
                                                r9.b(new a5.c(524288, aVar6.f28634a));
                                            }
                                            aVar7 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28686v);
                                            if (aVar7 != null) {
                                                r9.b(new a5.c(1048576, aVar7.f28634a));
                                            }
                                            oVarM = tVar2.m();
                                            a0Var3 = g3.n.f28688x;
                                            oVarM.getClass();
                                            if (oVarM.f28691a.c(g3.n.f28688x)) {
                                                list2 = (List) tVar2.m().e(a0Var3);
                                                wVar3 = wVar2;
                                                if (list2.size() < wVar3.f56783b) {
                                                    throw new IllegalStateException(hh.p0.i(wVar3.f56783b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                }
                                                u0Var3 = new u0(0);
                                                d0VarA = n0.a();
                                                u0Var4 = u0Var2;
                                                if (u0Var4.f56770a) {
                                                    y.s.a(u0Var4);
                                                }
                                                if (z.a.a(u0Var4.f56773d, i16, u0Var4.f56771b) >= 0) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (z13) {
                                                    d0Var = (d0) u0Var4.d(i16);
                                                    wVar4 = new w();
                                                    iArr = wVar3.f56782a;
                                                    i22 = wVar3.f56783b;
                                                    while (i23 < i22) {
                                                        wVar4.a(iArr[i23]);
                                                    }
                                                    arrayList2 = new ArrayList();
                                                    size5 = list2.size();
                                                    i24 = 0;
                                                    while (i24 < size5) {
                                                        fVar = (f) list2.get(i24);
                                                        kotlin.jvm.internal.m.c(d0Var);
                                                        int i50 = size5;
                                                        if (d0Var.d(fVar.a()) >= 0) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        if (z14) {
                                                            strA = fVar.a();
                                                            iD3 = d0Var.d(strA);
                                                            if (iD3 >= 0) {
                                                                z.a.e("There is no key " + ((Object) strA) + " in the map");
                                                                throw null;
                                                            }
                                                            int i51 = d0Var.f56679c[iD3];
                                                            u0Var3.g(i51, fVar.a());
                                                            d0VarA.g(i51, fVar.a());
                                                            wVar4.e(i51);
                                                            r9.b(new a5.c(i51, fVar.a()));
                                                        } else {
                                                            arrayList2.add(fVar);
                                                        }
                                                        i24++;
                                                        size5 = i50;
                                                        d0Var = d0Var;
                                                    }
                                                    size6 = arrayList2.size();
                                                    while (i25 < size6) {
                                                        f fVar9 = (f) arrayList2.get(i25);
                                                        int iC = wVar4.c(i25);
                                                        u0Var3.g(iC, fVar9.a());
                                                        d0VarA.g(iC, fVar9.a());
                                                        r9.b(new a5.c(iC, fVar9.a()));
                                                    }
                                                } else {
                                                    size4 = list2.size();
                                                    while (i21 < size4) {
                                                        f fVar10 = (f) list2.get(i21);
                                                        int iC2 = wVar3.c(i21);
                                                        u0Var3.g(iC2, fVar10.a());
                                                        d0VarA.g(iC2, fVar10.a());
                                                        r9.b(new a5.c(iC2, fVar10.a()));
                                                    }
                                                }
                                                r11.U.g(i16, u0Var3);
                                                u0Var4.g(i16, d0VarA);
                                            }
                                        }
                                        r9.t(g0.l(tVar2, resources4));
                                        iD = r11.f58711e0.d(i16);
                                        if (iD != -1) {
                                            androidViewHolderC2 = g0.C(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                            if (androidViewHolderC2 != null) {
                                                accessibilityNodeInfo4.setTraversalBefore(androidViewHolderC2);
                                                androidComposeView = androidComposeView2;
                                            } else {
                                                androidComposeView = androidComposeView2;
                                                accessibilityNodeInfo4.setTraversalBefore(androidComposeView, iD);
                                            }
                                            bundle = null;
                                            r11.j(i16, r9, r11.f58714g0, null);
                                        } else {
                                            androidComposeView = androidComposeView2;
                                            bundle = null;
                                        }
                                        iD2 = r11.f58713f0.d(i16);
                                        if (iD2 != -1 && (androidViewHolderC = g0.C(androidComposeView.getAndroidViewsHandler$ui(), iD2)) != null) {
                                            accessibilityNodeInfo4.setTraversalAfter(androidViewHolderC);
                                            r11.j(i16, r9, r11.f58715h0, bundle);
                                        }
                                        str3 = (String) g3.w.d(tVar2.m(), y.f28736b);
                                        if (str3 != null) {
                                            r9.m(str3);
                                        }
                                        r12 = r9;
                                        r13 = r11;
                                    } else {
                                        xVar = xVar2;
                                    }
                                    i17 = 1;
                                    r11 = xVar;
                                    r9.y((g3.w.e(tVar2) ? 1 : 0) ^ i17);
                                    objG8 = i0Var3.g(g3.x.f28719j);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    if (((g3.h) objG8) != null) {
                                        accessibilityNodeInfo3.setLiveRegion(i17);
                                    }
                                    accessibilityNodeInfo4.setClickable(false);
                                    aVar2 = (g3.a) g3.w.d(oVar3, g3.n.f28667b);
                                    if (aVar2 != null) {
                                        boolean zA5 = kotlin.jvm.internal.m.a(g3.w.d(oVar3, g3.x.I), Boolean.TRUE);
                                        if (kVar3 == null) {
                                            z23 = false;
                                        } else {
                                            z23 = true;
                                        }
                                        if (z23) {
                                            z24 = true;
                                        } else {
                                            if (kVar3 == null) {
                                                z26 = false;
                                            } else {
                                                z26 = true;
                                            }
                                            if (z26) {
                                                z24 = true;
                                            } else {
                                                z24 = false;
                                            }
                                        }
                                        if (z24) {
                                            z25 = true;
                                        } else {
                                            z25 = true;
                                        }
                                        accessibilityNodeInfo4.setClickable(z25);
                                        if (g0.j(tVar2)) {
                                            r9.b(new a5.c(16, aVar2.f28634a));
                                        }
                                    }
                                    accessibilityNodeInfo4.setLongClickable(false);
                                    aVar3 = (g3.a) g3.w.d(oVar3, g3.n.f28668c);
                                    if (aVar3 != null) {
                                        accessibilityNodeInfo4.setLongClickable(true);
                                        if (g0.j(tVar2)) {
                                            r9.b(new a5.c(32, aVar3.f28634a));
                                        }
                                    }
                                    aVar4 = (g3.a) g3.w.d(oVar3, g3.n.f28681q);
                                    if (aVar4 != null) {
                                        r9.b(new a5.c(16384, aVar4.f28634a));
                                    }
                                    if (g0.j(tVar2)) {
                                        aVar10 = (g3.a) g3.w.d(oVar3, g3.n.f28676k);
                                        if (aVar10 != null) {
                                            r9.b(new a5.c(2097152, aVar10.f28634a));
                                        }
                                        aVar11 = (g3.a) g3.w.d(oVar3, g3.n.f28680p);
                                        if (aVar11 != null) {
                                            r9.b(new a5.c(android.R.id.accessibilityActionImeEnter, aVar11.f28634a));
                                        }
                                        aVar12 = (g3.a) g3.w.d(oVar3, g3.n.f28682r);
                                        if (aVar12 != null) {
                                            r9.b(new a5.c(65536, aVar12.f28634a));
                                        }
                                        aVar13 = (g3.a) g3.w.d(oVar3, g3.n.f28683s);
                                        if (aVar13 != null) {
                                            primaryClipDescription = androidComposeView2.getClipboardManager().f58568a.getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                r9.b(new a5.c(32768, aVar13.f28634a));
                                            }
                                        }
                                    }
                                    strT = x.t(tVar2);
                                    if (strT != null) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                    }
                                    if (!z12) {
                                        accessibilityNodeInfo3.setTextSelection(r11.r(tVar2), r11.q(tVar2));
                                        aVar9 = (g3.a) g3.w.d(oVar3, g3.n.f28675j);
                                        if (aVar9 != null) {
                                            str4 = aVar9.f28634a;
                                        } else {
                                            str4 = null;
                                        }
                                        r9.b(new a5.c(OSSConstants.DEFAULT_STREAM_BUFFER_SIZE, str4));
                                        r9.a(256);
                                        r9.a(512);
                                        accessibilityNodeInfo4.setMovementGranularities(11);
                                        list3 = (List) g3.w.d(oVar3, g3.x.f28710a);
                                        if (list3 != null) {
                                            z20 = true;
                                        } else {
                                            z20 = true;
                                        }
                                        if (z20) {
                                            if (i0Var3.c(g3.x.F)) {
                                                i0VarW = i0Var5.w();
                                                while (true) {
                                                    if (i0VarW == null) {
                                                        i0VarW = null;
                                                    } else {
                                                        oVarY2 = i0VarW.y();
                                                        if (oVarY2 != null) {
                                                            z21 = false;
                                                        } else {
                                                            z21 = false;
                                                        }
                                                        if (!z21) {
                                                            i0VarW = i0VarW.w();
                                                        }
                                                    }
                                                }
                                                if (i0VarW != null) {
                                                    oVarY = i0VarW.y();
                                                    if (oVarY != null) {
                                                        objG14 = oVarY.f28691a.g(a0Var2);
                                                        if (objG14 == null) {
                                                            objG14 = null;
                                                        }
                                                        zA = kotlin.jvm.internal.m.a(objG14, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                    }
                                                }
                                            } else {
                                                i0VarW = i0Var5.w();
                                                while (true) {
                                                    if (i0VarW == null) {
                                                        i0VarW = null;
                                                    } else {
                                                        oVarY2 = i0VarW.y();
                                                        if (oVarY2 != null) {
                                                            z21 = false;
                                                        } else {
                                                            z21 = false;
                                                        }
                                                        if (!z21) {
                                                            i0VarW = i0VarW.w();
                                                        }
                                                    }
                                                }
                                                if (i0VarW != null) {
                                                    oVarY = i0VarW.y();
                                                    if (oVarY != null) {
                                                        objG14 = oVarY.f28691a.g(a0Var2);
                                                        if (objG14 == null) {
                                                            objG14 = null;
                                                        }
                                                        zA = kotlin.jvm.internal.m.a(objG14, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                    }
                                                }
                                            }
                                            if (!z22) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                            }
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        arrayListL = w4.c.l("androidx.compose.ui.semantics.id");
                                        charSequenceG = r9.g();
                                        if (charSequenceG != null) {
                                            z19 = true;
                                        } else {
                                            z19 = true;
                                        }
                                        if (!z19) {
                                            arrayListL.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (i0Var3.c(g3.x.f28734z)) {
                                            arrayListL.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (i0Var3.c(g3.x.P)) {
                                            arrayListL.add("androidx.compose.ui.semantics.shapeType");
                                            arrayListL.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayListL.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayListL.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        r9.j(arrayListL);
                                    }
                                    jVar = (g3.j) g3.w.d(oVar3, g3.x.f28712c);
                                    if (jVar != null) {
                                        dVar2 = jVar.f28654b;
                                        f5 = jVar.f28653a;
                                        a0Var4 = g3.n.f28674i;
                                        if (i0Var3.c(a0Var4)) {
                                            r9.m("android.widget.SeekBar");
                                        } else {
                                            r9.m("android.widget.ProgressBar");
                                        }
                                        if (jVar != g3.j.f28652d) {
                                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, dVar2.f40530a, dVar2.f40531b, f5));
                                        }
                                        if (i0Var3.c(a0Var4)) {
                                            fFloatValue = ((Number) dVar2.a()).floatValue();
                                            fFloatValue2 = ((Number) dVar2.b()).floatValue();
                                            if (fFloatValue < fFloatValue2) {
                                                fFloatValue = fFloatValue2;
                                            }
                                            if (f5 < fFloatValue) {
                                                r9.b(a5.c.f364j);
                                            }
                                            f11 = jVar.f28653a;
                                            fFloatValue3 = ((Number) dVar2.b()).floatValue();
                                            fFloatValue4 = ((Number) dVar2.a()).floatValue();
                                            if (fFloatValue3 > fFloatValue4) {
                                                fFloatValue3 = fFloatValue4;
                                            }
                                            if (f11 > fFloatValue3) {
                                                r9.b(a5.c.f365k);
                                            }
                                        }
                                    }
                                    i18 = Build.VERSION.SDK_INT;
                                    if (g0.j(tVar2)) {
                                        objG13 = tVar2.f28699d.f28691a.g(g3.n.f28674i);
                                        if (objG13 == null) {
                                            objG13 = null;
                                        }
                                        aVar8 = (g3.a) objG13;
                                        if (aVar8 != null) {
                                            r9.b(new a5.c(android.R.id.accessibilityActionSetProgress, aVar8.f28634a));
                                        }
                                    }
                                    objG9 = tVar2.k().f28691a.g(g3.x.f28715f);
                                    if (objG9 == null) {
                                        objG9 = null;
                                    }
                                    dVar = (g3.d) objG9;
                                    if (dVar != null) {
                                        r9.n(hd.d.v(dVar.f28644a, dVar.f28645b, 0, false));
                                    } else {
                                        arrayList = new ArrayList();
                                        objG10 = tVar2.k().f28691a.g(g3.x.f28714e);
                                        if ((objG10 != null ? objG10 : null) != null) {
                                            listJ2 = t.j(4, tVar2);
                                            size3 = listJ2.size();
                                            while (i19 < size3) {
                                                tVar3 = (t) listJ2.get(i19);
                                                if (tVar3.k().f28691a.c(g3.x.I)) {
                                                    arrayList.add(tVar3);
                                                }
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            zI = com.bumptech.glide.e.i(arrayList);
                                            if (zI) {
                                                size2 = 1;
                                            } else {
                                                size2 = arrayList.size();
                                            }
                                            r9.n(hd.d.v(size2, zI ? arrayList.size() : 1, 0, false));
                                        }
                                    }
                                    com.bumptech.glide.e.E(r9, tVar2);
                                    lVar = (l) g3.w.d(tVar2.m(), g3.x.f28729u);
                                    g3.a aVar15 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28669d);
                                    if (lVar != null) {
                                        objG11 = tVar2.k().f28691a.g(g3.x.f28715f);
                                        if (objG11 == null) {
                                            objG11 = null;
                                        }
                                        if (objG11 == null) {
                                            objG12 = tVar2.k().f28691a.g(g3.x.f28714e);
                                            if (objG12 == null) {
                                                objG12 = null;
                                            }
                                            if (objG12 != null) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                        } else {
                                            z16 = true;
                                        }
                                        if (!z16) {
                                            r9.m("android.widget.HorizontalScrollView");
                                        }
                                        if (((Number) lVar.f28658b.invoke()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                                            r9.u(true);
                                        }
                                        if (g0.j(tVar2)) {
                                            if (x.z(lVar)) {
                                                r9.b(a5.c.f364j);
                                                i0Var4 = i0Var5;
                                                if (i0Var4.f56883c0 == v3.m.Rtl) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                if (z18) {
                                                    cVar2 = a5.c.f371r;
                                                } else {
                                                    cVar2 = a5.c.f369p;
                                                }
                                                r9.b(cVar2);
                                            } else {
                                                i0Var4 = i0Var5;
                                            }
                                            if (x.y(lVar)) {
                                                r9.b(a5.c.f365k);
                                                if (i0Var4.f56883c0 == v3.m.Rtl) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    cVar = a5.c.f369p;
                                                } else {
                                                    cVar = a5.c.f371r;
                                                }
                                                r9.b(cVar);
                                            }
                                        }
                                    }
                                    lVar2 = (l) g3.w.d(tVar2.m(), g3.x.f28730v);
                                    if (lVar2 == null) {
                                    }
                                    if (i18 >= 29) {
                                        g0.n(r9, tVar2);
                                    }
                                    r9.s((CharSequence) g3.w.d(tVar2.m(), g3.x.f28713d));
                                    if (g0.j(tVar2)) {
                                        aVar5 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28684t);
                                        if (aVar5 != null) {
                                            r9.b(new a5.c(262144, aVar5.f28634a));
                                        }
                                        aVar6 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28685u);
                                        if (aVar6 != null) {
                                            r9.b(new a5.c(524288, aVar6.f28634a));
                                        }
                                        aVar7 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28686v);
                                        if (aVar7 != null) {
                                            r9.b(new a5.c(1048576, aVar7.f28634a));
                                        }
                                        oVarM = tVar2.m();
                                        a0Var3 = g3.n.f28688x;
                                        oVarM.getClass();
                                        if (oVarM.f28691a.c(g3.n.f28688x)) {
                                            list2 = (List) tVar2.m().e(a0Var3);
                                            wVar3 = wVar2;
                                            if (list2.size() < wVar3.f56783b) {
                                                throw new IllegalStateException(hh.p0.i(wVar3.f56783b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                            }
                                            u0Var3 = new u0(0);
                                            d0VarA = n0.a();
                                            u0Var4 = u0Var2;
                                            if (u0Var4.f56770a) {
                                                y.s.a(u0Var4);
                                            }
                                            if (z.a.a(u0Var4.f56773d, i16, u0Var4.f56771b) >= 0) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                d0Var = (d0) u0Var4.d(i16);
                                                wVar4 = new w();
                                                iArr = wVar3.f56782a;
                                                i22 = wVar3.f56783b;
                                                while (i23 < i22) {
                                                    wVar4.a(iArr[i23]);
                                                }
                                                arrayList2 = new ArrayList();
                                                size5 = list2.size();
                                                i24 = 0;
                                                while (i24 < size5) {
                                                    fVar = (f) list2.get(i24);
                                                    kotlin.jvm.internal.m.c(d0Var);
                                                    int i52 = size5;
                                                    if (d0Var.d(fVar.a()) >= 0) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (z14) {
                                                        strA = fVar.a();
                                                        iD3 = d0Var.d(strA);
                                                        if (iD3 >= 0) {
                                                            z.a.e("There is no key " + ((Object) strA) + " in the map");
                                                            throw null;
                                                        }
                                                        int i53 = d0Var.f56679c[iD3];
                                                        u0Var3.g(i53, fVar.a());
                                                        d0VarA.g(i53, fVar.a());
                                                        wVar4.e(i53);
                                                        r9.b(new a5.c(i53, fVar.a()));
                                                    } else {
                                                        arrayList2.add(fVar);
                                                    }
                                                    i24++;
                                                    size5 = i52;
                                                    d0Var = d0Var;
                                                }
                                                size6 = arrayList2.size();
                                                while (i25 < size6) {
                                                    f fVar11 = (f) arrayList2.get(i25);
                                                    int iC3 = wVar4.c(i25);
                                                    u0Var3.g(iC3, fVar11.a());
                                                    d0VarA.g(iC3, fVar11.a());
                                                    r9.b(new a5.c(iC3, fVar11.a()));
                                                }
                                            } else {
                                                size4 = list2.size();
                                                while (i21 < size4) {
                                                    f fVar12 = (f) list2.get(i21);
                                                    int iC4 = wVar3.c(i21);
                                                    u0Var3.g(iC4, fVar12.a());
                                                    d0VarA.g(iC4, fVar12.a());
                                                    r9.b(new a5.c(iC4, fVar12.a()));
                                                }
                                            }
                                            r11.U.g(i16, u0Var3);
                                            u0Var4.g(i16, d0VarA);
                                        }
                                    }
                                    r9.t(g0.l(tVar2, resources4));
                                    iD = r11.f58711e0.d(i16);
                                    if (iD != -1) {
                                        androidViewHolderC2 = g0.C(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                        if (androidViewHolderC2 != null) {
                                            accessibilityNodeInfo4.setTraversalBefore(androidViewHolderC2);
                                            androidComposeView = androidComposeView2;
                                        } else {
                                            androidComposeView = androidComposeView2;
                                            accessibilityNodeInfo4.setTraversalBefore(androidComposeView, iD);
                                        }
                                        bundle = null;
                                        r11.j(i16, r9, r11.f58714g0, null);
                                    } else {
                                        androidComposeView = androidComposeView2;
                                        bundle = null;
                                    }
                                    iD2 = r11.f58713f0.d(i16);
                                    if (iD2 != -1) {
                                        accessibilityNodeInfo4.setTraversalAfter(androidViewHolderC);
                                        r11.j(i16, r9, r11.f58715h0, bundle);
                                    }
                                    str3 = (String) g3.w.d(tVar2.m(), y.f28736b);
                                    if (str3 != null) {
                                        r9.m(str3);
                                    }
                                    r12 = r9;
                                    r13 = r11;
                                }
                            }
                        } else if (Build.VERSION.SDK_INT >= 34 ? a5.b.j(accessibilityManager) : true) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            gVar = new g(accessibilityNodeInfoObtain);
                            i12 = Build.VERSION.SDK_INT;
                            if (i12 >= 34) {
                                a5.b.n(accessibilityNodeInfoObtain, zA3);
                            } else {
                                gVar.k(64, zA3);
                            }
                            if (i11 == -1) {
                                parentForAccessibility = androidComposeView2.getParentForAccessibility();
                                if (parentForAccessibility instanceof View) {
                                    view = (View) parentForAccessibility;
                                } else {
                                    view = null;
                                }
                                gVar.f381b = -1;
                                accessibilityNodeInfoObtain.setParent(view);
                            } else {
                                tVarL = tVar6.l();
                                if (tVarL != null) {
                                    numValueOf = Integer.valueOf(tVarL.f28702g);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    v2.a.c("semanticsNode " + i11 + " has null parent");
                                    throw new KotlinNothingValueException();
                                }
                                iIntValue = numValueOf.intValue();
                                if (iIntValue == androidComposeView2.getSemanticsOwner().a().f28702g) {
                                    iIntValue = -1;
                                }
                                gVar.f381b = iIntValue;
                                accessibilityNodeInfoObtain.setParent(androidComposeView2, iIntValue);
                            }
                            gVar.f382c = i11;
                            accessibilityNodeInfoObtain.setSource(androidComposeView2, i11);
                            gVar.l(xVar2.k(uVar2));
                            wVar = x.f58704q0;
                            vVar = xVar2.f58720m0;
                            u0Var = xVar2.V;
                            resources = androidComposeView2.getContext().getResources();
                            gVar.m("android.view.View");
                            oVar = tVar6.f28699d;
                            i0Var = oVar.f28691a;
                            if (i0Var.c(g3.x.F)) {
                                gVar.m("android.widget.EditText");
                            }
                            if (i0Var.c(g3.x.B)) {
                                gVar.m("android.widget.TextView");
                            }
                            objG = i0Var.g(g3.x.f28733y);
                            if (objG == null) {
                                objG = null;
                            }
                            kVar = (k) objG;
                            if (kVar != null) {
                                i42 = kVar.f28656a;
                                u0Var2 = u0Var;
                                if (tVar6.f28700e) {
                                    i43 = 4;
                                    wVar2 = wVar;
                                } else {
                                    i43 = 4;
                                    wVar2 = wVar;
                                    if (t.j(4, tVar6).isEmpty()) {
                                    }
                                }
                                if (i42 == i43) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (i42 == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strE = g0.E(i42);
                                    if (i42 == 5) {
                                        gVar.m(strE);
                                    } else {
                                        gVar.m(strE);
                                    }
                                }
                            } else {
                                wVar2 = wVar;
                                u0Var2 = u0Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(g3.w.f(tVar6));
                            if (i12 >= 34) {
                                zJ = a5.b.j(accessibilityManager);
                            } else {
                                zJ = true;
                            }
                            listJ = t.j(4, tVar6);
                            size = listJ.size();
                            z11 = zJ;
                            i13 = 0;
                            i14 = 0;
                            while (true) {
                                accessibilityNodeInfo = gVar.f380a;
                                if (i14 < size) {
                                    List list6 = listJ;
                                    tVar4 = (t) listJ.get(i14);
                                    int i410 = size;
                                    mVarS = xVar2.s();
                                    int i411 = i14;
                                    i41 = tVar4.f28702g;
                                    if (mVarS.a(i41)) {
                                        androidViewHolder = androidComposeView2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(tVar4.f28698c);
                                        if (i41 != -1) {
                                            if (androidViewHolder != null) {
                                                accessibilityNodeInfo.addChild(androidViewHolder);
                                            } else {
                                                uVar = (u) xVar2.s().b(i41);
                                                if (uVar != null) {
                                                    zA2 = false;
                                                } else {
                                                    zA2 = false;
                                                }
                                                if (z11) {
                                                    accessibilityNodeInfo.addChild(androidComposeView2, i41);
                                                } else {
                                                    accessibilityNodeInfo.addChild(androidComposeView2, i41);
                                                }
                                            }
                                            vVar.f(i41, i13);
                                            i13++;
                                        }
                                    }
                                    i14 = i411 + 1;
                                    size = i410;
                                    listJ = list6;
                                } else {
                                    if (i11 == xVar2.N) {
                                        gVar.i(true);
                                        gVar.b(a5.c.f363i);
                                    } else {
                                        gVar.i(false);
                                        gVar.b(a5.c.f362h);
                                    }
                                    hVarU = g0.u(tVar6);
                                    if (hVarU != null) {
                                        androidComposeView2.getFontFamilyResolver();
                                        density = androidComposeView2.getDensity();
                                        m4Var = xVar2.f58716i0;
                                        String str6 = hVarU.f35700b;
                                        list4 = hVarU.f35699a;
                                        spannableString2 = new SpannableString(str6);
                                        arrayList3 = hVarU.f35701c;
                                        if (arrayList3 != null) {
                                            size12 = arrayList3.size();
                                            i35 = 0;
                                            while (i35 < size12) {
                                                int i412 = size12;
                                                j3.f fVar13 = (j3.f) arrayList3.get(i35);
                                                int i413 = i35;
                                                p0 p0Var2 = (p0) fVar13.f35689a;
                                                ArrayList arrayList7 = arrayList3;
                                                i36 = fVar13.f35690b;
                                                i37 = fVar13.f35691c;
                                                k kVar5 = kVar;
                                                jB = p0Var2.f35754a.b();
                                                t tVar8 = tVar6;
                                                o oVar7 = oVar;
                                                long j13 = p0Var2.f35755b;
                                                sVar = p0Var2.f35756c;
                                                oVar5 = p0Var2.f35757d;
                                                pVar = p0Var2.f35763j;
                                                Resources resources5 = resources;
                                                q3.b bVar2 = p0Var2.f35764k;
                                                AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo;
                                                i0 i0Var7 = i0Var;
                                                j11 = p0Var2.f35765l;
                                                lVar3 = p0Var2.m;
                                                cVar3 = p0Var2.f35754a;
                                                AccessibilityNodeInfo accessibilityNodeInfo8 = accessibilityNodeInfoObtain;
                                                g gVar5 = gVar;
                                                if (!g2.x.d(jB, cVar3.b())) {
                                                    if (jB != 16) {
                                                        cVar3 = new u3.c(jB);
                                                    } else {
                                                        cVar3 = n.f52756a;
                                                    }
                                                }
                                                se.p.b0(spannableString2, cVar3.b(), i36, i37);
                                                spannableString4 = spannableString2;
                                                se.p.c0(spannableString4, j13, density, i36, i37);
                                                if (sVar == null) {
                                                    if (sVar == null) {
                                                        sVar2 = s.f43178t;
                                                    } else {
                                                        sVar2 = sVar;
                                                    }
                                                    if (oVar5 != null) {
                                                        i38 = oVar5.f43170a;
                                                    } else {
                                                        i38 = 0;
                                                    }
                                                    StyleSpan styleSpan2 = new StyleSpan(ew.a.n(sVar2, i38));
                                                    i39 = 33;
                                                    spannableString4.setSpan(styleSpan2, i36, i37, 33);
                                                } else {
                                                    if (sVar == null) {
                                                        sVar2 = s.f43178t;
                                                    } else {
                                                        sVar2 = sVar;
                                                    }
                                                    if (oVar5 != null) {
                                                        i38 = oVar5.f43170a;
                                                    } else {
                                                        i38 = 0;
                                                    }
                                                    StyleSpan styleSpan3 = new StyleSpan(ew.a.n(sVar2, i38));
                                                    i39 = 33;
                                                    spannableString4.setSpan(styleSpan3, i36, i37, 33);
                                                }
                                                if (lVar3 != null) {
                                                    i40 = lVar3.f52754a;
                                                    if ((i40 | 1) == i40) {
                                                        spannableString4.setSpan(new UnderlineSpan(), i36, i37, i39);
                                                    }
                                                    if ((i40 | 2) == i40) {
                                                        spannableString4.setSpan(new StrikethroughSpan(), i36, i37, i39);
                                                    }
                                                }
                                                if (pVar != null) {
                                                    spannableString4.setSpan(new ScaleXSpan(pVar.f52758a), i36, i37, i39);
                                                }
                                                se.p.d0(spannableString4, bVar2, i36, i37);
                                                if (j11 != 16) {
                                                    spannableString4.setSpan(new BackgroundColorSpan(f0.E(j11)), i36, i37, i39);
                                                }
                                                i35 = i413 + 1;
                                                spannableString2 = spannableString4;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo8;
                                                size12 = i412;
                                                arrayList3 = arrayList7;
                                                kVar = kVar5;
                                                tVar6 = tVar8;
                                                oVar = oVar7;
                                                resources = resources5;
                                                i0Var = i0Var7;
                                                accessibilityNodeInfo = accessibilityNodeInfo7;
                                                gVar = gVar5;
                                            }
                                        }
                                        kVar2 = kVar;
                                        tVar = tVar6;
                                        oVar2 = oVar;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        i0Var2 = i0Var;
                                        resources2 = resources;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        g gVar6 = gVar;
                                        spannableString3 = spannableString2;
                                        int length3 = str6.length();
                                        arrayList4 = r.f50854a;
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size11 = list4.size();
                                            for (i34 = 0; i34 < size11; i34++) {
                                                Object obj4 = list4.get(i34);
                                                fVar5 = (j3.f) obj4;
                                                if (!(fVar5.f35689a instanceof b1)) {
                                                }
                                            }
                                        } else {
                                            arrayList5 = arrayList4;
                                        }
                                        size7 = arrayList5.size();
                                        for (i26 = 0; i26 < size7; i26++) {
                                            j3.f fVar14 = (j3.f) arrayList5.get(i26);
                                            b1Var = (b1) fVar14.f35689a;
                                            i32 = fVar14.f35690b;
                                            i33 = fVar14.f35691c;
                                            if (b1Var instanceof b1) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(b1Var.f35667a).build(), i32, i33, 33);
                                        }
                                        int length4 = str6.length();
                                        if (list4 != null) {
                                            arrayList4 = new ArrayList(list4.size());
                                            size10 = list4.size();
                                            for (i31 = 0; i31 < size10; i31++) {
                                                Object obj5 = list4.get(i31);
                                                fVar4 = (j3.f) obj5;
                                                if (!(fVar4.f35689a instanceof a1)) {
                                                }
                                            }
                                        }
                                        size8 = arrayList4.size();
                                        for (i27 = 0; i27 < size8; i27++) {
                                            j3.f fVar15 = (j3.f) arrayList4.get(i27);
                                            a1Var = (a1) fVar15.f35689a;
                                            int i414 = fVar15.f35690b;
                                            int i415 = fVar15.f35691c;
                                            weakHashMap3 = (WeakHashMap) m4Var.f48060b;
                                            uRLSpan2 = weakHashMap3.get(a1Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(a1Var.f35660a);
                                                weakHashMap3.put(a1Var, uRLSpan2);
                                            }
                                            spannableString3.setSpan((URLSpan) uRLSpan2, i414, i415, 33);
                                        }
                                        listA = hVarU.a(str6.length());
                                        size9 = listA.size();
                                        for (i28 = 0; i28 < size9; i28++) {
                                            fVar2 = (j3.f) listA.get(i28);
                                            i29 = fVar2.f35690b;
                                            obj = fVar2.f35689a;
                                            i30 = fVar2.f35691c;
                                            if (i29 != i30) {
                                                wVar5 = (j3.w) obj;
                                                if (wVar5 instanceof j3.v) {
                                                    kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                                                    vVar2 = (j3.v) obj;
                                                    fVar3 = new j3.f(vVar2, i29, i30);
                                                    weakHashMap2 = (WeakHashMap) m4Var.f48061c;
                                                    uRLSpan = weakHashMap2.get(fVar3);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(vVar2.f35803a);
                                                        weakHashMap2.put(fVar3, uRLSpan);
                                                    }
                                                    spannableString3.setSpan((URLSpan) uRLSpan, i29, i30, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) m4Var.f48062d;
                                                    eVar = weakHashMap.get(fVar2);
                                                    if (eVar == null) {
                                                        eVar = new r3.e(wVar5);
                                                        weakHashMap.put(fVar2, eVar);
                                                    }
                                                    spannableString3.setSpan((ClickableSpan) eVar, i29, i30, 33);
                                                }
                                            }
                                        }
                                        spannableString = (SpannableString) x.P(spannableString3);
                                        r9 = gVar6;
                                    } else {
                                        kVar2 = kVar;
                                        vVar = vVar;
                                        tVar = tVar6;
                                        oVar2 = oVar;
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        i0Var2 = i0Var;
                                        resources2 = resources;
                                        accessibilityNodeInfo3 = accessibilityNodeInfoObtain;
                                        r9 = gVar;
                                        spannableString = null;
                                    }
                                    r9.x(spannableString);
                                    a0Var = g3.x.L;
                                    i0Var3 = i0Var2;
                                    if (i0Var3.c(a0Var)) {
                                        accessibilityNodeInfo3.setContentInvalid(true);
                                        objG15 = i0Var3.g(a0Var);
                                        if (objG15 == null) {
                                            objG15 = null;
                                        }
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                        accessibilityNodeInfo4.setError((CharSequence) objG15);
                                    } else {
                                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                                    }
                                    tVar2 = tVar;
                                    Resources resources6 = resources2;
                                    r9.w(g0.t(tVar2, resources6));
                                    accessibilityNodeInfo4.setCheckable(g0.s(tVar2));
                                    objG2 = i0Var3.g(g3.x.J);
                                    if (objG2 == null) {
                                        objG2 = null;
                                    }
                                    aVar = (i3.a) objG2;
                                    if (aVar != null) {
                                        if (aVar == i3.a.On) {
                                            accessibilityNodeInfo4.setChecked(true);
                                        } else if (aVar == i3.a.Off) {
                                            accessibilityNodeInfo4.setChecked(false);
                                        }
                                    }
                                    objG3 = i0Var3.g(g3.x.I);
                                    if (objG3 == null) {
                                        objG3 = null;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (kVar2 == null) {
                                            kVar3 = kVar2;
                                            i15 = 4;
                                        } else {
                                            kVar3 = kVar2;
                                            i15 = 4;
                                            if (kVar3.f28656a == 4) {
                                                accessibilityNodeInfo4.setSelected(zBooleanValue2);
                                            }
                                        }
                                        accessibilityNodeInfo4.setChecked(zBooleanValue2);
                                    } else {
                                        kVar3 = kVar2;
                                        i15 = 4;
                                    }
                                    oVar3 = oVar2;
                                    if (oVar3.f28693c) {
                                        objG4 = i0Var3.g(g3.x.f28710a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) ry.m.s0(list);
                                        } else {
                                            str = null;
                                        }
                                        r9.p(str);
                                    } else {
                                        objG4 = i0Var3.g(g3.x.f28710a);
                                        if (objG4 == null) {
                                            objG4 = null;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            str = (String) ry.m.s0(list);
                                        } else {
                                            str = null;
                                        }
                                        r9.p(str);
                                    }
                                    objG5 = i0Var3.g(g3.x.f28734z);
                                    if (objG5 == null) {
                                        objG5 = null;
                                    }
                                    str2 = (String) objG5;
                                    if (str2 != null) {
                                        tVarL2 = tVar2;
                                        while (true) {
                                            if (tVarL2 != null) {
                                                oVar4 = tVarL2.f28699d;
                                                a0Var5 = y.f28735a;
                                                if (oVar4.f28691a.c(a0Var5)) {
                                                    zBooleanValue = ((Boolean) oVar4.e(a0Var5)).booleanValue();
                                                } else {
                                                    tVarL2 = tVarL2.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo3.setViewIdResourceName(str2);
                                        }
                                    }
                                    objG6 = i0Var3.g(g3.x.f28717h);
                                    if (objG6 == null) {
                                        objG6 = null;
                                    }
                                    if (((b0) objG6) != null) {
                                        r9.q(true);
                                    }
                                    i16 = i11;
                                    if (i16 != -1) {
                                        iD4 = vVar.d(tVar2.f28702g);
                                        if (iD4 != -1) {
                                            accessibilityNodeInfo3.setDrawingOrder(iD4);
                                        }
                                    }
                                    accessibilityNodeInfo3.setPassword(i0Var3.c(g3.x.K));
                                    accessibilityNodeInfo3.setEditable(i0Var3.c(g3.x.N));
                                    objG7 = i0Var3.g(g3.x.O);
                                    if (objG7 == null) {
                                        objG7 = null;
                                    }
                                    num = (Integer) objG7;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                                    accessibilityNodeInfo4.setEnabled(g0.j(tVar2));
                                    a0Var2 = g3.x.f28720k;
                                    accessibilityNodeInfo4.setFocusable(i0Var3.c(a0Var2));
                                    if (accessibilityNodeInfo3.isFocusable()) {
                                        accessibilityNodeInfo4.setFocused(((Boolean) oVar3.e(a0Var2)).booleanValue());
                                        if (accessibilityNodeInfo3.isFocused()) {
                                            r9.a(2);
                                            x xVar4 = xVar2;
                                            xVar4.O = i16;
                                            xVar = xVar4;
                                        } else {
                                            r11 = xVar2;
                                            i17 = 1;
                                            r9.a(1);
                                        }
                                        r9.y((g3.w.e(tVar2) ? 1 : 0) ^ i17);
                                        objG8 = i0Var3.g(g3.x.f28719j);
                                        if (objG8 == null) {
                                            objG8 = null;
                                        }
                                        if (((g3.h) objG8) != null) {
                                            accessibilityNodeInfo3.setLiveRegion(i17);
                                        }
                                        accessibilityNodeInfo4.setClickable(false);
                                        aVar2 = (g3.a) g3.w.d(oVar3, g3.n.f28667b);
                                        if (aVar2 != null) {
                                            boolean zA6 = kotlin.jvm.internal.m.a(g3.w.d(oVar3, g3.x.I), Boolean.TRUE);
                                            if (kVar3 == null) {
                                                z23 = false;
                                            } else {
                                                z23 = true;
                                            }
                                            if (z23) {
                                                z24 = true;
                                            } else {
                                                if (kVar3 == null) {
                                                    z26 = false;
                                                } else {
                                                    z26 = true;
                                                }
                                                if (z26) {
                                                    z24 = true;
                                                } else {
                                                    z24 = false;
                                                }
                                            }
                                            if (z24) {
                                                z25 = true;
                                            } else {
                                                z25 = true;
                                            }
                                            accessibilityNodeInfo4.setClickable(z25);
                                            if (g0.j(tVar2)) {
                                                r9.b(new a5.c(16, aVar2.f28634a));
                                            }
                                        }
                                        accessibilityNodeInfo4.setLongClickable(false);
                                        aVar3 = (g3.a) g3.w.d(oVar3, g3.n.f28668c);
                                        if (aVar3 != null) {
                                            accessibilityNodeInfo4.setLongClickable(true);
                                            if (g0.j(tVar2)) {
                                                r9.b(new a5.c(32, aVar3.f28634a));
                                            }
                                        }
                                        aVar4 = (g3.a) g3.w.d(oVar3, g3.n.f28681q);
                                        if (aVar4 != null) {
                                            r9.b(new a5.c(16384, aVar4.f28634a));
                                        }
                                        if (g0.j(tVar2)) {
                                            aVar10 = (g3.a) g3.w.d(oVar3, g3.n.f28676k);
                                            if (aVar10 != null) {
                                                r9.b(new a5.c(2097152, aVar10.f28634a));
                                            }
                                            aVar11 = (g3.a) g3.w.d(oVar3, g3.n.f28680p);
                                            if (aVar11 != null) {
                                                r9.b(new a5.c(android.R.id.accessibilityActionImeEnter, aVar11.f28634a));
                                            }
                                            aVar12 = (g3.a) g3.w.d(oVar3, g3.n.f28682r);
                                            if (aVar12 != null) {
                                                r9.b(new a5.c(65536, aVar12.f28634a));
                                            }
                                            aVar13 = (g3.a) g3.w.d(oVar3, g3.n.f28683s);
                                            if (aVar13 != null) {
                                                primaryClipDescription = androidComposeView2.getClipboardManager().f58568a.getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    r9.b(new a5.c(32768, aVar13.f28634a));
                                                }
                                            }
                                        }
                                        strT = x.t(tVar2);
                                        if (strT != null) {
                                            z12 = true;
                                        } else {
                                            z12 = true;
                                        }
                                        if (!z12) {
                                            accessibilityNodeInfo3.setTextSelection(r11.r(tVar2), r11.q(tVar2));
                                            aVar9 = (g3.a) g3.w.d(oVar3, g3.n.f28675j);
                                            if (aVar9 != null) {
                                                str4 = aVar9.f28634a;
                                            } else {
                                                str4 = null;
                                            }
                                            r9.b(new a5.c(OSSConstants.DEFAULT_STREAM_BUFFER_SIZE, str4));
                                            r9.a(256);
                                            r9.a(512);
                                            accessibilityNodeInfo4.setMovementGranularities(11);
                                            list3 = (List) g3.w.d(oVar3, g3.x.f28710a);
                                            if (list3 != null) {
                                                z20 = true;
                                            } else {
                                                z20 = true;
                                            }
                                            if (z20) {
                                                if (i0Var3.c(g3.x.F)) {
                                                    i0VarW = i0Var5.w();
                                                    while (true) {
                                                        if (i0VarW == null) {
                                                            i0VarW = null;
                                                        } else {
                                                            oVarY2 = i0VarW.y();
                                                            if (oVarY2 != null) {
                                                                z21 = false;
                                                            } else {
                                                                z21 = false;
                                                            }
                                                            if (!z21) {
                                                                i0VarW = i0VarW.w();
                                                            }
                                                        }
                                                    }
                                                    if (i0VarW != null) {
                                                        oVarY = i0VarW.y();
                                                        if (oVarY != null) {
                                                            objG14 = oVarY.f28691a.g(a0Var2);
                                                            if (objG14 == null) {
                                                                objG14 = null;
                                                            }
                                                            zA = kotlin.jvm.internal.m.a(objG14, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                } else {
                                                    i0VarW = i0Var5.w();
                                                    while (true) {
                                                        if (i0VarW == null) {
                                                            i0VarW = null;
                                                        } else {
                                                            oVarY2 = i0VarW.y();
                                                            if (oVarY2 != null) {
                                                                z21 = false;
                                                            } else {
                                                                z21 = false;
                                                            }
                                                            if (!z21) {
                                                                i0VarW = i0VarW.w();
                                                            }
                                                        }
                                                    }
                                                    if (i0VarW != null) {
                                                        oVarY = i0VarW.y();
                                                        if (oVarY != null) {
                                                            objG14 = oVarY.f28691a.g(a0Var2);
                                                            if (objG14 == null) {
                                                                objG14 = null;
                                                            }
                                                            zA = kotlin.jvm.internal.m.a(objG14, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                }
                                                if (!z22) {
                                                    accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            arrayListL = w4.c.l("androidx.compose.ui.semantics.id");
                                            charSequenceG = r9.g();
                                            if (charSequenceG != null) {
                                                z19 = true;
                                            } else {
                                                z19 = true;
                                            }
                                            if (!z19) {
                                                arrayListL.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (i0Var3.c(g3.x.f28734z)) {
                                                arrayListL.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (i0Var3.c(g3.x.P)) {
                                                arrayListL.add("androidx.compose.ui.semantics.shapeType");
                                                arrayListL.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayListL.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayListL.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            r9.j(arrayListL);
                                        }
                                        jVar = (g3.j) g3.w.d(oVar3, g3.x.f28712c);
                                        if (jVar != null) {
                                            dVar2 = jVar.f28654b;
                                            f5 = jVar.f28653a;
                                            a0Var4 = g3.n.f28674i;
                                            if (i0Var3.c(a0Var4)) {
                                                r9.m("android.widget.SeekBar");
                                            } else {
                                                r9.m("android.widget.ProgressBar");
                                            }
                                            if (jVar != g3.j.f28652d) {
                                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, dVar2.f40530a, dVar2.f40531b, f5));
                                            }
                                            if (i0Var3.c(a0Var4)) {
                                                fFloatValue = ((Number) dVar2.a()).floatValue();
                                                fFloatValue2 = ((Number) dVar2.b()).floatValue();
                                                if (fFloatValue < fFloatValue2) {
                                                    fFloatValue = fFloatValue2;
                                                }
                                                if (f5 < fFloatValue) {
                                                    r9.b(a5.c.f364j);
                                                }
                                                f11 = jVar.f28653a;
                                                fFloatValue3 = ((Number) dVar2.b()).floatValue();
                                                fFloatValue4 = ((Number) dVar2.a()).floatValue();
                                                if (fFloatValue3 > fFloatValue4) {
                                                    fFloatValue3 = fFloatValue4;
                                                }
                                                if (f11 > fFloatValue3) {
                                                    r9.b(a5.c.f365k);
                                                }
                                            }
                                        }
                                        i18 = Build.VERSION.SDK_INT;
                                        if (g0.j(tVar2)) {
                                            objG13 = tVar2.f28699d.f28691a.g(g3.n.f28674i);
                                            if (objG13 == null) {
                                                objG13 = null;
                                            }
                                            aVar8 = (g3.a) objG13;
                                            if (aVar8 != null) {
                                                r9.b(new a5.c(android.R.id.accessibilityActionSetProgress, aVar8.f28634a));
                                            }
                                        }
                                        objG9 = tVar2.k().f28691a.g(g3.x.f28715f);
                                        if (objG9 == null) {
                                            objG9 = null;
                                        }
                                        dVar = (g3.d) objG9;
                                        if (dVar != null) {
                                            r9.n(hd.d.v(dVar.f28644a, dVar.f28645b, 0, false));
                                        } else {
                                            arrayList = new ArrayList();
                                            objG10 = tVar2.k().f28691a.g(g3.x.f28714e);
                                            if ((objG10 != null ? objG10 : null) != null) {
                                                listJ2 = t.j(4, tVar2);
                                                size3 = listJ2.size();
                                                for (i19 = 0; i19 < size3; i19++) {
                                                    tVar3 = (t) listJ2.get(i19);
                                                    if (tVar3.k().f28691a.c(g3.x.I)) {
                                                        arrayList.add(tVar3);
                                                    }
                                                }
                                            }
                                            if (!arrayList.isEmpty()) {
                                                zI = com.bumptech.glide.e.i(arrayList);
                                                if (zI) {
                                                    size2 = 1;
                                                } else {
                                                    size2 = arrayList.size();
                                                }
                                                r9.n(hd.d.v(size2, zI ? arrayList.size() : 1, 0, false));
                                            }
                                        }
                                        com.bumptech.glide.e.E(r9, tVar2);
                                        lVar = (l) g3.w.d(tVar2.m(), g3.x.f28729u);
                                        g3.a aVar16 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28669d);
                                        if (lVar != null) {
                                            objG11 = tVar2.k().f28691a.g(g3.x.f28715f);
                                            if (objG11 == null) {
                                                objG11 = null;
                                            }
                                            if (objG11 == null) {
                                                objG12 = tVar2.k().f28691a.g(g3.x.f28714e);
                                                if (objG12 == null) {
                                                    objG12 = null;
                                                }
                                                if (objG12 != null) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                            } else {
                                                z16 = true;
                                            }
                                            if (!z16) {
                                                r9.m("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) lVar.f28658b.invoke()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                                                r9.u(true);
                                            }
                                            if (g0.j(tVar2)) {
                                                if (x.z(lVar)) {
                                                    r9.b(a5.c.f364j);
                                                    i0Var4 = i0Var5;
                                                    if (i0Var4.f56883c0 == v3.m.Rtl) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    if (z18) {
                                                        cVar2 = a5.c.f369p;
                                                    } else {
                                                        cVar2 = a5.c.f371r;
                                                    }
                                                    r9.b(cVar2);
                                                } else {
                                                    i0Var4 = i0Var5;
                                                }
                                                if (x.y(lVar)) {
                                                    r9.b(a5.c.f365k);
                                                    if (i0Var4.f56883c0 == v3.m.Rtl) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z17) {
                                                        cVar = a5.c.f371r;
                                                    } else {
                                                        cVar = a5.c.f369p;
                                                    }
                                                    r9.b(cVar);
                                                }
                                            }
                                        }
                                        lVar2 = (l) g3.w.d(tVar2.m(), g3.x.f28730v);
                                        if (lVar2 == null) {
                                        }
                                        if (i18 >= 29) {
                                            g0.n(r9, tVar2);
                                        }
                                        r9.s((CharSequence) g3.w.d(tVar2.m(), g3.x.f28713d));
                                        if (g0.j(tVar2)) {
                                            aVar5 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28684t);
                                            if (aVar5 != null) {
                                                r9.b(new a5.c(262144, aVar5.f28634a));
                                            }
                                            aVar6 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28685u);
                                            if (aVar6 != null) {
                                                r9.b(new a5.c(524288, aVar6.f28634a));
                                            }
                                            aVar7 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28686v);
                                            if (aVar7 != null) {
                                                r9.b(new a5.c(1048576, aVar7.f28634a));
                                            }
                                            oVarM = tVar2.m();
                                            a0Var3 = g3.n.f28688x;
                                            oVarM.getClass();
                                            if (oVarM.f28691a.c(g3.n.f28688x)) {
                                                list2 = (List) tVar2.m().e(a0Var3);
                                                wVar3 = wVar2;
                                                if (list2.size() < wVar3.f56783b) {
                                                    throw new IllegalStateException(hh.p0.i(wVar3.f56783b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                }
                                                u0Var3 = new u0(0);
                                                d0VarA = n0.a();
                                                u0Var4 = u0Var2;
                                                if (u0Var4.f56770a) {
                                                    y.s.a(u0Var4);
                                                }
                                                if (z.a.a(u0Var4.f56773d, i16, u0Var4.f56771b) >= 0) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (z13) {
                                                    d0Var = (d0) u0Var4.d(i16);
                                                    wVar4 = new w();
                                                    iArr = wVar3.f56782a;
                                                    i22 = wVar3.f56783b;
                                                    for (i23 = 0; i23 < i22; i23++) {
                                                        wVar4.a(iArr[i23]);
                                                    }
                                                    arrayList2 = new ArrayList();
                                                    size5 = list2.size();
                                                    i24 = 0;
                                                    while (i24 < size5) {
                                                        fVar = (f) list2.get(i24);
                                                        kotlin.jvm.internal.m.c(d0Var);
                                                        int i54 = size5;
                                                        if (d0Var.d(fVar.a()) >= 0) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        if (z14) {
                                                            strA = fVar.a();
                                                            iD3 = d0Var.d(strA);
                                                            if (iD3 >= 0) {
                                                                z.a.e("There is no key " + ((Object) strA) + " in the map");
                                                                throw null;
                                                            }
                                                            int i55 = d0Var.f56679c[iD3];
                                                            u0Var3.g(i55, fVar.a());
                                                            d0VarA.g(i55, fVar.a());
                                                            wVar4.e(i55);
                                                            r9.b(new a5.c(i55, fVar.a()));
                                                        } else {
                                                            arrayList2.add(fVar);
                                                        }
                                                        i24++;
                                                        size5 = i54;
                                                        d0Var = d0Var;
                                                    }
                                                    size6 = arrayList2.size();
                                                    for (i25 = 0; i25 < size6; i25++) {
                                                        f fVar16 = (f) arrayList2.get(i25);
                                                        int iC5 = wVar4.c(i25);
                                                        u0Var3.g(iC5, fVar16.a());
                                                        d0VarA.g(iC5, fVar16.a());
                                                        r9.b(new a5.c(iC5, fVar16.a()));
                                                    }
                                                } else {
                                                    size4 = list2.size();
                                                    for (i21 = 0; i21 < size4; i21++) {
                                                        f fVar17 = (f) list2.get(i21);
                                                        int iC6 = wVar3.c(i21);
                                                        u0Var3.g(iC6, fVar17.a());
                                                        d0VarA.g(iC6, fVar17.a());
                                                        r9.b(new a5.c(iC6, fVar17.a()));
                                                    }
                                                }
                                                r11.U.g(i16, u0Var3);
                                                u0Var4.g(i16, d0VarA);
                                            }
                                        }
                                        r9.t(g0.l(tVar2, resources6));
                                        iD = r11.f58711e0.d(i16);
                                        if (iD != -1) {
                                            androidViewHolderC2 = g0.C(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                            if (androidViewHolderC2 != null) {
                                                accessibilityNodeInfo4.setTraversalBefore(androidViewHolderC2);
                                                androidComposeView = androidComposeView2;
                                            } else {
                                                androidComposeView = androidComposeView2;
                                                accessibilityNodeInfo4.setTraversalBefore(androidComposeView, iD);
                                            }
                                            bundle = null;
                                            r11.j(i16, r9, r11.f58714g0, null);
                                        } else {
                                            androidComposeView = androidComposeView2;
                                            bundle = null;
                                        }
                                        iD2 = r11.f58713f0.d(i16);
                                        if (iD2 != -1) {
                                            accessibilityNodeInfo4.setTraversalAfter(androidViewHolderC);
                                            r11.j(i16, r9, r11.f58715h0, bundle);
                                        }
                                        str3 = (String) g3.w.d(tVar2.m(), y.f28736b);
                                        if (str3 != null) {
                                            r9.m(str3);
                                        }
                                        r12 = r9;
                                        r13 = r11;
                                    } else {
                                        xVar = xVar2;
                                    }
                                    i17 = 1;
                                    r11 = xVar;
                                    r9.y((g3.w.e(tVar2) ? 1 : 0) ^ i17);
                                    objG8 = i0Var3.g(g3.x.f28719j);
                                    if (objG8 == null) {
                                        objG8 = null;
                                    }
                                    if (((g3.h) objG8) != null) {
                                        accessibilityNodeInfo3.setLiveRegion(i17);
                                    }
                                    accessibilityNodeInfo4.setClickable(false);
                                    aVar2 = (g3.a) g3.w.d(oVar3, g3.n.f28667b);
                                    if (aVar2 != null) {
                                        boolean zA7 = kotlin.jvm.internal.m.a(g3.w.d(oVar3, g3.x.I), Boolean.TRUE);
                                        if (kVar3 == null) {
                                            z23 = false;
                                        } else {
                                            z23 = true;
                                        }
                                        if (z23) {
                                            z24 = true;
                                        } else {
                                            if (kVar3 == null) {
                                                z26 = false;
                                            } else {
                                                z26 = true;
                                            }
                                            if (z26) {
                                                z24 = true;
                                            } else {
                                                z24 = false;
                                            }
                                        }
                                        if (z24) {
                                            z25 = true;
                                        } else {
                                            z25 = true;
                                        }
                                        accessibilityNodeInfo4.setClickable(z25);
                                        if (g0.j(tVar2)) {
                                            r9.b(new a5.c(16, aVar2.f28634a));
                                        }
                                    }
                                    accessibilityNodeInfo4.setLongClickable(false);
                                    aVar3 = (g3.a) g3.w.d(oVar3, g3.n.f28668c);
                                    if (aVar3 != null) {
                                        accessibilityNodeInfo4.setLongClickable(true);
                                        if (g0.j(tVar2)) {
                                            r9.b(new a5.c(32, aVar3.f28634a));
                                        }
                                    }
                                    aVar4 = (g3.a) g3.w.d(oVar3, g3.n.f28681q);
                                    if (aVar4 != null) {
                                        r9.b(new a5.c(16384, aVar4.f28634a));
                                    }
                                    if (g0.j(tVar2)) {
                                        aVar10 = (g3.a) g3.w.d(oVar3, g3.n.f28676k);
                                        if (aVar10 != null) {
                                            r9.b(new a5.c(2097152, aVar10.f28634a));
                                        }
                                        aVar11 = (g3.a) g3.w.d(oVar3, g3.n.f28680p);
                                        if (aVar11 != null) {
                                            r9.b(new a5.c(android.R.id.accessibilityActionImeEnter, aVar11.f28634a));
                                        }
                                        aVar12 = (g3.a) g3.w.d(oVar3, g3.n.f28682r);
                                        if (aVar12 != null) {
                                            r9.b(new a5.c(65536, aVar12.f28634a));
                                        }
                                        aVar13 = (g3.a) g3.w.d(oVar3, g3.n.f28683s);
                                        if (aVar13 != null) {
                                            primaryClipDescription = androidComposeView2.getClipboardManager().f58568a.getPrimaryClipDescription();
                                            if (primaryClipDescription != null) {
                                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                            } else {
                                                zHasMimeType = false;
                                            }
                                            if (zHasMimeType) {
                                                r9.b(new a5.c(32768, aVar13.f28634a));
                                            }
                                        }
                                    }
                                    strT = x.t(tVar2);
                                    if (strT != null) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                    }
                                    if (!z12) {
                                        accessibilityNodeInfo3.setTextSelection(r11.r(tVar2), r11.q(tVar2));
                                        aVar9 = (g3.a) g3.w.d(oVar3, g3.n.f28675j);
                                        if (aVar9 != null) {
                                            str4 = aVar9.f28634a;
                                        } else {
                                            str4 = null;
                                        }
                                        r9.b(new a5.c(OSSConstants.DEFAULT_STREAM_BUFFER_SIZE, str4));
                                        r9.a(256);
                                        r9.a(512);
                                        accessibilityNodeInfo4.setMovementGranularities(11);
                                        list3 = (List) g3.w.d(oVar3, g3.x.f28710a);
                                        if (list3 != null) {
                                            z20 = true;
                                        } else {
                                            z20 = true;
                                        }
                                        if (z20) {
                                            if (i0Var3.c(g3.x.F)) {
                                                i0VarW = i0Var5.w();
                                                while (true) {
                                                    if (i0VarW == null) {
                                                        i0VarW = null;
                                                    } else {
                                                        oVarY2 = i0VarW.y();
                                                        if (oVarY2 != null) {
                                                            z21 = false;
                                                        } else {
                                                            z21 = false;
                                                        }
                                                        if (!z21) {
                                                            i0VarW = i0VarW.w();
                                                        }
                                                    }
                                                }
                                                if (i0VarW != null) {
                                                    oVarY = i0VarW.y();
                                                    if (oVarY != null) {
                                                        objG14 = oVarY.f28691a.g(a0Var2);
                                                        if (objG14 == null) {
                                                            objG14 = null;
                                                        }
                                                        zA = kotlin.jvm.internal.m.a(objG14, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                    }
                                                }
                                            } else {
                                                i0VarW = i0Var5.w();
                                                while (true) {
                                                    if (i0VarW == null) {
                                                        i0VarW = null;
                                                    } else {
                                                        oVarY2 = i0VarW.y();
                                                        if (oVarY2 != null) {
                                                            z21 = false;
                                                        } else {
                                                            z21 = false;
                                                        }
                                                        if (!z21) {
                                                            i0VarW = i0VarW.w();
                                                        }
                                                    }
                                                }
                                                if (i0VarW != null) {
                                                    oVarY = i0VarW.y();
                                                    if (oVarY != null) {
                                                        objG14 = oVarY.f28691a.g(a0Var2);
                                                        if (objG14 == null) {
                                                            objG14 = null;
                                                        }
                                                        zA = kotlin.jvm.internal.m.a(objG14, Boolean.TRUE);
                                                    } else {
                                                        zA = false;
                                                    }
                                                    if (zA) {
                                                    }
                                                }
                                            }
                                            if (!z22) {
                                                accessibilityNodeInfo4.setMovementGranularities(accessibilityNodeInfo3.getMovementGranularities() | 20);
                                            }
                                        }
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        arrayListL = w4.c.l("androidx.compose.ui.semantics.id");
                                        charSequenceG = r9.g();
                                        if (charSequenceG != null) {
                                            z19 = true;
                                        } else {
                                            z19 = true;
                                        }
                                        if (!z19) {
                                            arrayListL.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                        }
                                        if (i0Var3.c(g3.x.f28734z)) {
                                            arrayListL.add("androidx.compose.ui.semantics.testTag");
                                        }
                                        if (i0Var3.c(g3.x.P)) {
                                            arrayListL.add("androidx.compose.ui.semantics.shapeType");
                                            arrayListL.add("androidx.compose.ui.semantics.shapeRect");
                                            arrayListL.add("androidx.compose.ui.semantics.shapeCorners");
                                            arrayListL.add("androidx.compose.ui.semantics.shapeRegion");
                                        }
                                        r9.j(arrayListL);
                                    }
                                    jVar = (g3.j) g3.w.d(oVar3, g3.x.f28712c);
                                    if (jVar != null) {
                                        dVar2 = jVar.f28654b;
                                        f5 = jVar.f28653a;
                                        a0Var4 = g3.n.f28674i;
                                        if (i0Var3.c(a0Var4)) {
                                            r9.m("android.widget.SeekBar");
                                        } else {
                                            r9.m("android.widget.ProgressBar");
                                        }
                                        if (jVar != g3.j.f28652d) {
                                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, dVar2.f40530a, dVar2.f40531b, f5));
                                        }
                                        if (i0Var3.c(a0Var4)) {
                                            fFloatValue = ((Number) dVar2.a()).floatValue();
                                            fFloatValue2 = ((Number) dVar2.b()).floatValue();
                                            if (fFloatValue < fFloatValue2) {
                                                fFloatValue = fFloatValue2;
                                            }
                                            if (f5 < fFloatValue) {
                                                r9.b(a5.c.f364j);
                                            }
                                            f11 = jVar.f28653a;
                                            fFloatValue3 = ((Number) dVar2.b()).floatValue();
                                            fFloatValue4 = ((Number) dVar2.a()).floatValue();
                                            if (fFloatValue3 > fFloatValue4) {
                                                fFloatValue3 = fFloatValue4;
                                            }
                                            if (f11 > fFloatValue3) {
                                                r9.b(a5.c.f365k);
                                            }
                                        }
                                    }
                                    i18 = Build.VERSION.SDK_INT;
                                    if (g0.j(tVar2)) {
                                        objG13 = tVar2.f28699d.f28691a.g(g3.n.f28674i);
                                        if (objG13 == null) {
                                            objG13 = null;
                                        }
                                        aVar8 = (g3.a) objG13;
                                        if (aVar8 != null) {
                                            r9.b(new a5.c(android.R.id.accessibilityActionSetProgress, aVar8.f28634a));
                                        }
                                    }
                                    objG9 = tVar2.k().f28691a.g(g3.x.f28715f);
                                    if (objG9 == null) {
                                        objG9 = null;
                                    }
                                    dVar = (g3.d) objG9;
                                    if (dVar != null) {
                                        r9.n(hd.d.v(dVar.f28644a, dVar.f28645b, 0, false));
                                    } else {
                                        arrayList = new ArrayList();
                                        objG10 = tVar2.k().f28691a.g(g3.x.f28714e);
                                        if ((objG10 != null ? objG10 : null) != null) {
                                            listJ2 = t.j(4, tVar2);
                                            size3 = listJ2.size();
                                            while (i19 < size3) {
                                                tVar3 = (t) listJ2.get(i19);
                                                if (tVar3.k().f28691a.c(g3.x.I)) {
                                                    arrayList.add(tVar3);
                                                }
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            zI = com.bumptech.glide.e.i(arrayList);
                                            if (zI) {
                                                size2 = 1;
                                            } else {
                                                size2 = arrayList.size();
                                            }
                                            r9.n(hd.d.v(size2, zI ? arrayList.size() : 1, 0, false));
                                        }
                                    }
                                    com.bumptech.glide.e.E(r9, tVar2);
                                    lVar = (l) g3.w.d(tVar2.m(), g3.x.f28729u);
                                    g3.a aVar17 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28669d);
                                    if (lVar != null) {
                                        objG11 = tVar2.k().f28691a.g(g3.x.f28715f);
                                        if (objG11 == null) {
                                            objG11 = null;
                                        }
                                        if (objG11 == null) {
                                            objG12 = tVar2.k().f28691a.g(g3.x.f28714e);
                                            if (objG12 == null) {
                                                objG12 = null;
                                            }
                                            if (objG12 != null) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                        } else {
                                            z16 = true;
                                        }
                                        if (!z16) {
                                            r9.m("android.widget.HorizontalScrollView");
                                        }
                                        if (((Number) lVar.f28658b.invoke()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                                            r9.u(true);
                                        }
                                        if (g0.j(tVar2)) {
                                            if (x.z(lVar)) {
                                                r9.b(a5.c.f364j);
                                                i0Var4 = i0Var5;
                                                if (i0Var4.f56883c0 == v3.m.Rtl) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                if (z18) {
                                                    cVar2 = a5.c.f371r;
                                                } else {
                                                    cVar2 = a5.c.f369p;
                                                }
                                                r9.b(cVar2);
                                            } else {
                                                i0Var4 = i0Var5;
                                            }
                                            if (x.y(lVar)) {
                                                r9.b(a5.c.f365k);
                                                if (i0Var4.f56883c0 == v3.m.Rtl) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                if (z17) {
                                                    cVar = a5.c.f369p;
                                                } else {
                                                    cVar = a5.c.f371r;
                                                }
                                                r9.b(cVar);
                                            }
                                        }
                                    }
                                    lVar2 = (l) g3.w.d(tVar2.m(), g3.x.f28730v);
                                    if (lVar2 == null) {
                                    }
                                    if (i18 >= 29) {
                                        g0.n(r9, tVar2);
                                    }
                                    r9.s((CharSequence) g3.w.d(tVar2.m(), g3.x.f28713d));
                                    if (g0.j(tVar2)) {
                                        aVar5 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28684t);
                                        if (aVar5 != null) {
                                            r9.b(new a5.c(262144, aVar5.f28634a));
                                        }
                                        aVar6 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28685u);
                                        if (aVar6 != null) {
                                            r9.b(new a5.c(524288, aVar6.f28634a));
                                        }
                                        aVar7 = (g3.a) g3.w.d(tVar2.m(), g3.n.f28686v);
                                        if (aVar7 != null) {
                                            r9.b(new a5.c(1048576, aVar7.f28634a));
                                        }
                                        oVarM = tVar2.m();
                                        a0Var3 = g3.n.f28688x;
                                        oVarM.getClass();
                                        if (oVarM.f28691a.c(g3.n.f28688x)) {
                                            list2 = (List) tVar2.m().e(a0Var3);
                                            wVar3 = wVar2;
                                            if (list2.size() < wVar3.f56783b) {
                                                throw new IllegalStateException(hh.p0.i(wVar3.f56783b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                            }
                                            u0Var3 = new u0(0);
                                            d0VarA = n0.a();
                                            u0Var4 = u0Var2;
                                            if (u0Var4.f56770a) {
                                                y.s.a(u0Var4);
                                            }
                                            if (z.a.a(u0Var4.f56773d, i16, u0Var4.f56771b) >= 0) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                d0Var = (d0) u0Var4.d(i16);
                                                wVar4 = new w();
                                                iArr = wVar3.f56782a;
                                                i22 = wVar3.f56783b;
                                                while (i23 < i22) {
                                                    wVar4.a(iArr[i23]);
                                                }
                                                arrayList2 = new ArrayList();
                                                size5 = list2.size();
                                                i24 = 0;
                                                while (i24 < size5) {
                                                    fVar = (f) list2.get(i24);
                                                    kotlin.jvm.internal.m.c(d0Var);
                                                    int i56 = size5;
                                                    if (d0Var.d(fVar.a()) >= 0) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (z14) {
                                                        strA = fVar.a();
                                                        iD3 = d0Var.d(strA);
                                                        if (iD3 >= 0) {
                                                            z.a.e("There is no key " + ((Object) strA) + " in the map");
                                                            throw null;
                                                        }
                                                        int i57 = d0Var.f56679c[iD3];
                                                        u0Var3.g(i57, fVar.a());
                                                        d0VarA.g(i57, fVar.a());
                                                        wVar4.e(i57);
                                                        r9.b(new a5.c(i57, fVar.a()));
                                                    } else {
                                                        arrayList2.add(fVar);
                                                    }
                                                    i24++;
                                                    size5 = i56;
                                                    d0Var = d0Var;
                                                }
                                                size6 = arrayList2.size();
                                                while (i25 < size6) {
                                                    f fVar18 = (f) arrayList2.get(i25);
                                                    int iC7 = wVar4.c(i25);
                                                    u0Var3.g(iC7, fVar18.a());
                                                    d0VarA.g(iC7, fVar18.a());
                                                    r9.b(new a5.c(iC7, fVar18.a()));
                                                }
                                            } else {
                                                size4 = list2.size();
                                                while (i21 < size4) {
                                                    f fVar19 = (f) list2.get(i21);
                                                    int iC8 = wVar3.c(i21);
                                                    u0Var3.g(iC8, fVar19.a());
                                                    d0VarA.g(iC8, fVar19.a());
                                                    r9.b(new a5.c(iC8, fVar19.a()));
                                                }
                                            }
                                            r11.U.g(i16, u0Var3);
                                            u0Var4.g(i16, d0VarA);
                                        }
                                    }
                                    r9.t(g0.l(tVar2, resources6));
                                    iD = r11.f58711e0.d(i16);
                                    if (iD != -1) {
                                        androidViewHolderC2 = g0.C(androidComposeView2.getAndroidViewsHandler$ui(), iD);
                                        if (androidViewHolderC2 != null) {
                                            accessibilityNodeInfo4.setTraversalBefore(androidViewHolderC2);
                                            androidComposeView = androidComposeView2;
                                        } else {
                                            androidComposeView = androidComposeView2;
                                            accessibilityNodeInfo4.setTraversalBefore(androidComposeView, iD);
                                        }
                                        bundle = null;
                                        r11.j(i16, r9, r11.f58714g0, null);
                                    } else {
                                        androidComposeView = androidComposeView2;
                                        bundle = null;
                                    }
                                    iD2 = r11.f58713f0.d(i16);
                                    if (iD2 != -1) {
                                        accessibilityNodeInfo4.setTraversalAfter(androidViewHolderC);
                                        r11.j(i16, r9, r11.f58715h0, bundle);
                                    }
                                    str3 = (String) g3.w.d(tVar2.m(), y.f28736b);
                                    if (str3 != null) {
                                        r9.m(str3);
                                    }
                                    r12 = r9;
                                    r13 = r11;
                                }
                            }
                        } else {
                            i16 = i11;
                            r13 = xVar2;
                            r12 = 0;
                        }
                    }
                }
                if (r13.R) {
                    if (i16 == r13.N) {
                        r13.P = r12;
                    }
                    if (i16 == r13.O) {
                        r13.Q = r12;
                    }
                }
                return r12;
        }
    }

    @Override // a5.j
    public final g i(int i11) {
        switch (this.f39736c) {
            case 0:
                b bVar = (b) this.f39737d;
                int i12 = i11 == 2 ? bVar.M : bVar.N;
                if (i12 == Integer.MIN_VALUE) {
                    return null;
                }
                return e(i12);
            default:
                x xVar = (x) this.f39737d;
                if (i11 != 1) {
                    if (i11 == 2) {
                        return e(xVar.N);
                    }
                    throw new IllegalArgumentException(nv.p.j(i11, "Unknown focus type: "));
                }
                int i13 = xVar.O;
                if (i13 == Integer.MIN_VALUE) {
                    return null;
                }
                return e(i13);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:147:0x0258  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:244:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:246:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:247:0x03db  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:250:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:251:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:258:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:259:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:262:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:263:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:266:0x0400  */
    /* JADX WARN: Code duplicated, block: B:267:0x0402  */
    /* JADX WARN: Code duplicated, block: B:274:0x040e  */
    /* JADX WARN: Code duplicated, block: B:281:0x041a  */
    /* JADX WARN: Code duplicated, block: B:284:0x041f  */
    /* JADX WARN: Code duplicated, block: B:286:0x0427  */
    /* JADX WARN: Code duplicated, block: B:289:0x0432  */
    /* JADX WARN: Code duplicated, block: B:292:0x0437  */
    /* JADX WARN: Code duplicated, block: B:294:0x043b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0443  */
    /* JADX WARN: Code duplicated, block: B:297:0x0445  */
    /* JADX WARN: Code duplicated, block: B:301:0x044b  */
    /* JADX WARN: Code duplicated, block: B:304:0x0450  */
    /* JADX WARN: Code duplicated, block: B:306:0x0458  */
    /* JADX WARN: Code duplicated, block: B:308:0x045f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0466  */
    /* JADX WARN: Code duplicated, block: B:312:0x0479  */
    /* JADX WARN: Code duplicated, block: B:314:0x0494  */
    /* JADX WARN: Code duplicated, block: B:317:0x0499  */
    /* JADX WARN: Code duplicated, block: B:322:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:325:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:329:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:331:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:334:0x04d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:375:0x0559  */
    /* JADX WARN: Code duplicated, block: B:378:0x0563  */
    /* JADX WARN: Code duplicated, block: B:381:0x0568 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:383:0x056c  */
    /* JADX WARN: Code duplicated, block: B:384:0x0571  */
    /* JADX WARN: Code duplicated, block: B:386:0x057e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:387:0x0580  */
    /* JADX WARN: Code duplicated, block: B:390:0x0587  */
    /* JADX WARN: Code duplicated, block: B:392:0x058f  */
    /* JADX WARN: Code duplicated, block: B:398:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:400:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:402:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:403:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:405:0x05be  */
    /* JADX WARN: Code duplicated, block: B:407:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:408:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:411:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:474:0x06be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:475:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:477:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:478:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:481:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:482:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:488:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:493:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:506:0x0712  */
    /* JADX WARN: Code duplicated, block: B:512:0x072c  */
    /* JADX WARN: Code duplicated, block: B:519:0x073e  */
    /* JADX WARN: Code duplicated, block: B:521:0x0742  */
    /* JADX WARN: Code duplicated, block: B:523:0x0755  */
    /* JADX WARN: Code duplicated, block: B:525:0x0759  */
    /* JADX WARN: Code duplicated, block: B:537:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:539:0x07d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:540:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:541:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:544:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:545:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:548:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:550:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:562:0x081d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:563:0x081f  */
    /* JADX WARN: Code duplicated, block: B:564:0x0822  */
    /* JADX WARN: Code duplicated, block: B:567:0x0827  */
    /* JADX WARN: Code duplicated, block: B:568:0x082a  */
    /* JADX WARN: Code duplicated, block: B:570:0x0845  */
    /* JADX WARN: Code duplicated, block: B:572:0x084b  */
    /* JADX WARN: Code duplicated, block: B:573:0x084d  */
    /* JADX WARN: Code duplicated, block: B:575:0x0851  */
    /* JADX WARN: Code duplicated, block: B:576:0x0862  */
    /* JADX WARN: Code duplicated, block: B:581:0x0872  */
    /* JADX WARN: Code duplicated, block: B:584:0x0877  */
    /* JADX WARN: Code duplicated, block: B:586:0x087b  */
    /* JADX WARN: Code duplicated, block: B:587:0x087d  */
    /* JADX WARN: Code duplicated, block: B:589:0x0881  */
    /* JADX WARN: Code duplicated, block: B:591:0x0885  */
    /* JADX WARN: Code duplicated, block: B:592:0x088c  */
    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02f7, code lost:
    
        if (((java.lang.Boolean) r1.invoke(java.lang.Float.valueOf(r3), java.lang.Float.valueOf(r15))).booleanValue() == true) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x01c1, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Switch 'out' block B:8:0x002b for B:39:0x0081 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:8:0x002b for B:40:0x0084 already processed. Defaulting to fallback option. */
    /* JADX WARN: Type inference failed for: r1v162, types: [fz.a, kotlin.jvm.internal.n] */
    @Override // a5.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r27, int r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 2400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.a.q(int, int, android.os.Bundle):boolean");
    }
}
