package ot;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.api.Service;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.japanskill.ui.syllablenew.JPSyllableIndexActivity;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementRecord;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.SRSStatusScheduleKt;
import com.yalantis.ucrop.view.CropImageView;
import fr.p3;
import hj.a3;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import qp.n4;
import qp.v2;
import qp.w4;
import qp.x3;
import rt.d5;
import rt.h8;
import rt.j6;
import rt.r4;
import rt.s4;
import rt.u4;
import rt.u8;
import rt.x4;
import rt.x8;
import rt.y4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45801b;

    public /* synthetic */ e2(Object obj, int i11) {
        this.f45800a = i11;
        this.f45801b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0342 A[Catch: Exception -> 0x03a7, TRY_ENTER, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0346 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0361 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x03af A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x03b3 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x03c4 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x03c8 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x03d5 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x03d9 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x03e9 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x03ed A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0408 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0439 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x043d A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0441 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0445 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0454 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x046a A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x047d A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x04d8 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x04e7 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x050c A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x051f A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0529 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0544 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0575 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0579 A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x057d A[Catch: Exception -> 0x03a7, TryCatch #0 {Exception -> 0x03a7, blocks: (B:97:0x0326, B:100:0x0342, B:102:0x0346, B:104:0x0361, B:106:0x039a, B:108:0x03a2, B:111:0x03aa, B:112:0x03af, B:113:0x03b2, B:114:0x03b3, B:116:0x03c4, B:118:0x03c8, B:120:0x03d5, B:122:0x03d9, B:124:0x03e9, B:126:0x03ed, B:128:0x0408, B:129:0x0439, B:130:0x043c, B:131:0x043d, B:132:0x0440, B:133:0x0441, B:134:0x0444, B:135:0x0445, B:137:0x0454, B:139:0x046a, B:141:0x047d, B:143:0x0483, B:145:0x0487, B:147:0x04a2, B:148:0x04d4, B:149:0x04d7, B:150:0x04d8, B:152:0x04e7, B:154:0x04ee, B:156:0x04f8, B:158:0x050c, B:160:0x051f, B:162:0x0525, B:164:0x0529, B:166:0x0544, B:167:0x0575, B:168:0x0578, B:169:0x0579, B:170:0x057c, B:171:0x057d, B:172:0x0580), top: B:247:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x025a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0261  */
    /* JADX WARN: Code duplicated, block: B:89:0x0305  */
    /* JADX WARN: Code duplicated, block: B:91:0x0310  */
    /* JADX WARN: Code duplicated, block: B:96:0x0325  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        qy.l lVar;
        qy.l lVar2;
        long jMax;
        View view;
        String str;
        int i11;
        ta.a aVar;
        ta.a aVar2;
        int i12;
        ta.a aVar3;
        int iIndexOfChild;
        ArrayList arrayList;
        String word;
        ta.a aVar4;
        int iIndexOfChild2;
        ArrayList arrayList2;
        String word2;
        ArrayList arrayList3;
        String word3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String word4;
        ArrayList arrayList7;
        String word5;
        String strConcat;
        jp.p0 p0Var;
        vy.d dVar = null;
        switch (this.f45800a) {
            case 0:
                h2 h2Var = (h2) this.f45801b;
                SRSStatus original = (SRSStatus) obj;
                kotlin.jvm.internal.m.f(original, "original");
                LinkedHashSet linkedHashSet = h2Var.f45843f;
                long j11 = h2Var.f45840c;
                if ((linkedHashSet.contains(original.getId()) || h2Var.f45844g.contains(original.getId())) && !original.isExcludedFromReview() && original.getNextReviewTime() > j11) {
                    Long l9 = (Long) h2Var.f45846i.get(original.getId());
                    if (l9 != null) {
                        jMax = l9.longValue();
                    } else {
                        long nextReviewTime = original.getNextReviewTime() - j11;
                        wt.c0 c0Var = (wt.c0) h2Var.f45845h.get(original.getId());
                        if (c0Var == wt.c0.AGAIN) {
                            lVar2 = new qy.l(1L, 4L);
                        } else {
                            wt.c0 c0Var2 = wt.c0.HARD;
                            if (c0Var == c0Var2 && linkedHashSet.contains(original.getId())) {
                                lVar = new qy.l(35L, 100L);
                            } else if (c0Var == c0Var2) {
                                lVar2 = new qy.l(1L, 2L);
                            } else {
                                wt.c0 c0Var3 = wt.c0.GOOD;
                                if (c0Var == c0Var3 && linkedHashSet.contains(original.getId())) {
                                    lVar2 = new qy.l(1L, 2L);
                                } else if (c0Var == wt.c0.EASY && linkedHashSet.contains(original.getId())) {
                                    lVar = new qy.l(3L, 5L);
                                } else if (c0Var == c0Var3) {
                                    lVar2 = new qy.l(3L, 4L);
                                } else {
                                    lVar = new qy.l(17L, 20L);
                                }
                            }
                            lVar2 = lVar;
                        }
                        jMax = j11 + Math.max(86400L, (nextReviewTime * ((Number) lVar2.f48495a).longValue()) / ((Number) lVar2.f48496b).longValue());
                    }
                    long j12 = jMax;
                    if (j12 < original.getNextReviewTime()) {
                        return new i2(original.getId(), original.getNextReviewTime(), SRSStatus.copy$default(original, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, j12, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, null, 2095103, null), h2Var.f45847j.contains(original.getId()));
                    }
                }
                return null;
            case 1:
                return ((oz.k) this.f45801b).d(((Integer) obj).intValue());
            case 2:
                AchievementLanguage achievementLanguage = (AchievementLanguage) this.f45801b;
                i2.d Canvas = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                i2.d.p0(Canvas, p3.A(v10.c.s(achievementLanguage)), 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
                return qy.b0.f48488a;
            case 3:
                AchievementLeaderBoard achievementLeaderBoard = (AchievementLeaderBoard) this.f45801b;
                i2.d Canvas2 = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas2, "$this$Canvas");
                i2.d.p0(Canvas2, p3.A(vc.a.n(achievementLeaderBoard)), 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
                return qy.b0.f48488a;
            case 4:
                AchievementRecord achievementRecord = (AchievementRecord) this.f45801b;
                i2.d Canvas3 = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas3, "$this$Canvas");
                i2.d.p0(Canvas3, p3.A(android.support.v4.media.session.a.x(achievementRecord)), 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
                return qy.b0.f48488a;
            case 5:
                qv.j jVar = (qv.j) this.f45801b;
                String it = (String) obj;
                kotlin.jvm.internal.m.f(it, "it");
                jVar.getClass();
                jVar.f48442a.h(it);
                return qy.b0.f48488a;
            case 6:
                JPSyllableIndexActivity jPSyllableIndexActivity = (JPSyllableIndexActivity) this.f45801b;
                int iIntValue = ((Integer) obj).intValue();
                int i13 = JPSyllableIndexActivity.f21908t;
                Intent intent = new Intent(jPSyllableIndexActivity, (Class<?>) LoginActivity.class);
                intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                jPSyllableIndexActivity.startActivity(intent);
                return qy.b0.f48488a;
            case 7:
                qp.v0 v0Var = (qp.v0) this.f45801b;
                View v11 = (View) obj;
                kotlin.jvm.internal.m.f(v11, "v");
                View view2 = (View) v0Var.f47818j;
                mp.b bVar = v0Var.f47881a;
                if (view2 != null) {
                    v0Var.r(view2);
                }
                v0Var.f47818j = v11;
                Object tag = v11.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                qy.q qVar = fv.b.f28186a;
                jp.p0 p0Var2 = (jp.p0) bVar;
                p0Var2.I(fv.b.Y(((Word) tag).getWordId(), null, null));
                v0Var.s(v11);
                p0Var2.O(4);
                return qy.b0.f48488a;
            case 8:
                qp.s1 s1Var = (qp.s1) this.f45801b;
                View v12 = (View) obj;
                kotlin.jvm.internal.m.f(v12, "v");
                s1Var.getClass();
                View view3 = (View) s1Var.f47818j;
                if (view3 != null) {
                    s1Var.r(view3);
                }
                s1Var.f47818j = v12;
                s1Var.s(v12);
                ((jp.p0) s1Var.f47881a).O(4);
                return qy.b0.f48488a;
            case 9:
                qp.i2 i2Var = (qp.i2) this.f45801b;
                kotlin.jvm.internal.m.f((View) obj, "it");
                mp.b bVar2 = i2Var.f47881a;
                Sentence sentenceV = i2Var.v();
                qy.q qVar2 = fv.b.f28186a;
                ((jp.p0) bVar2).I(fv.b.G(sentenceV.getSentenceId(), null, null));
                return qy.b0.f48488a;
            case 10:
                qp.k2 k2Var = (qp.k2) this.f45801b;
                kotlin.jvm.internal.m.f((View) obj, "it");
                yz.f fVar = rz.o0.f50940a;
                rz.e0.B(rz.e0.c(wz.m.f55536a), null, null, new mv.f0(k2Var, dVar, 13), 3);
                return qy.b0.f48488a;
            case 11:
                qp.s2 s2Var = (qp.s2) this.f45801b;
                View v13 = (View) obj;
                kotlin.jvm.internal.m.f(v13, "v");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - s2Var.f48184o <= s2Var.f48185p) {
                    s2Var.f48184o = jCurrentTimeMillis;
                } else {
                    s2Var.f48184o = jCurrentTimeMillis;
                    s2Var.f48183n = null;
                    char c11 = 2;
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    ta.a aVar5 = s2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    int childCount = ((hj.a2) aVar5).f32335c.getChildCount();
                    int i14 = 1;
                    while (i14 < childCount) {
                        ta.a aVar6 = s2Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar6);
                        View childAt = ((hj.a2) aVar6).f32335c.getChildAt(i14);
                        Object tag2 = childAt.getTag();
                        kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                        Word word6 = (Word) tag2;
                        char c12 = c11;
                        if (childAt.getTag(R.id.tag_view) == null && kotlin.jvm.internal.m.a(word6.getWord(), "_____")) {
                            s2Var.f48183n = childAt;
                            if (s2Var.f48183n != null) {
                                s2Var.u(false);
                                int[] iArr3 = bq.r.f4959a;
                                if (!bq.m.F()) {
                                    view = s2Var.f48183n;
                                    str = gkbGsXmgaxRjJ.IjEmSWnUQUk;
                                    if (s2Var.f47884d.isAudioModel || ((jp.p0) s2Var.f47881a).Q) {
                                        i11 = 0;
                                    } else {
                                        i11 = 1;
                                    }
                                    try {
                                        aVar = s2Var.f47886f;
                                        kotlin.jvm.internal.m.c(aVar);
                                        if (((hj.a2) aVar).f32335c.indexOfChild(view) != i11) {
                                            aVar2 = s2Var.f47886f;
                                            kotlin.jvm.internal.m.c(aVar2);
                                            i12 = i11 + 1;
                                            if (((hj.a2) aVar2).f32335c.indexOfChild(view) != i12) {
                                                aVar3 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar3);
                                                if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                    ta.a aVar7 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar7);
                                                    iIndexOfChild = (((hj.a2) aVar7).f32335c.indexOfChild(view) - i11) - 1;
                                                    arrayList = s2Var.f48181k;
                                                    if (arrayList != null) {
                                                        kotlin.jvm.internal.m.n("stemList");
                                                        throw null;
                                                    }
                                                    Word word7 = (Word) arrayList.get(iIndexOfChild);
                                                    word = word7.getWord();
                                                    kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                    if (com.bumptech.glide.d.s(word) || bq.m.F()) {
                                                        aVar4 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar4);
                                                        if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12 && word7.getWordType() == 1 && !kotlin.jvm.internal.m.a(word7.getWord(), "_____")) {
                                                            ta.a aVar8 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar8);
                                                            iIndexOfChild2 = (((hj.a2) aVar8).f32335c.indexOfChild(view) - i11) - 2;
                                                            arrayList2 = s2Var.f48181k;
                                                            if (arrayList2 != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word2) && !bq.m.F()) {
                                                                arrayList3 = s2Var.f48181k;
                                                                if (arrayList3 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word3)) {
                                                                    TextView textView = (TextView) v13.findViewById(R.id.tv_middle);
                                                                    String string = textView.getText().toString();
                                                                    String strSubstring = string.substring(0, 1);
                                                                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                                                    String upperCase = strSubstring.toUpperCase(bq.m.p());
                                                                    kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                                                                    String strSubstring2 = string.substring(1);
                                                                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                                                    textView.setText(upperCase.concat(strSubstring2));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        ArrayList arrayList8 = s2Var.f48181k;
                                                        if (arrayList8 == null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        String word8 = ((Word) arrayList8.get(arrayList8.size() - 1)).getWord();
                                                        kotlin.jvm.internal.m.e(word8, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word8)) {
                                                            TextView textView2 = (TextView) v13.findViewById(R.id.tv_middle);
                                                            String string2 = textView2.getText().toString();
                                                            String strSubstring3 = string2.substring(0, 1);
                                                            kotlin.jvm.internal.m.e(strSubstring3, "substring(...)");
                                                            String upperCase2 = strSubstring3.toUpperCase(bq.m.p());
                                                            kotlin.jvm.internal.m.e(upperCase2, "toUpperCase(...)");
                                                            String strSubstring4 = string2.substring(1);
                                                            kotlin.jvm.internal.m.e(strSubstring4, "substring(...)");
                                                            textView2.setText(upperCase2.concat(strSubstring4));
                                                        } else {
                                                            aVar4 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar4);
                                                            if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                ta.a aVar9 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar9);
                                                                iIndexOfChild2 = (((hj.a2) aVar9).f32335c.indexOfChild(view) - i11) - 2;
                                                                arrayList2 = s2Var.f48181k;
                                                                if (arrayList2 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word2)) {
                                                                    arrayList3 = s2Var.f48181k;
                                                                    if (arrayList3 != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                    kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word3)) {
                                                                        TextView textView3 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                        String string3 = textView3.getText().toString();
                                                                        String strSubstring5 = string3.substring(0, 1);
                                                                        kotlin.jvm.internal.m.e(strSubstring5, "substring(...)");
                                                                        String upperCase3 = strSubstring5.toUpperCase(bq.m.p());
                                                                        kotlin.jvm.internal.m.e(upperCase3, "toUpperCase(...)");
                                                                        String strSubstring6 = string3.substring(1);
                                                                        kotlin.jvm.internal.m.e(strSubstring6, "substring(...)");
                                                                        textView3.setText(upperCase3.concat(strSubstring6));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                arrayList4 = s2Var.f48181k;
                                                if (arrayList4 != null) {
                                                    kotlin.jvm.internal.m.n("stemList");
                                                    throw null;
                                                }
                                                if (((Word) arrayList4.get(0)).getWordType() != 1) {
                                                    aVar3 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar3);
                                                    if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                        ta.a aVar10 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar10);
                                                        iIndexOfChild = (((hj.a2) aVar10).f32335c.indexOfChild(view) - i11) - 1;
                                                        arrayList = s2Var.f48181k;
                                                        if (arrayList != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        Word word9 = (Word) arrayList.get(iIndexOfChild);
                                                        word = word9.getWord();
                                                        kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word)) {
                                                            aVar4 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar4);
                                                            if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                ta.a aVar11 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar11);
                                                                iIndexOfChild2 = (((hj.a2) aVar11).f32335c.indexOfChild(view) - i11) - 2;
                                                                arrayList2 = s2Var.f48181k;
                                                                if (arrayList2 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word2)) {
                                                                    arrayList3 = s2Var.f48181k;
                                                                    if (arrayList3 != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                    kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word3)) {
                                                                        TextView textView4 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                        String string4 = textView4.getText().toString();
                                                                        String strSubstring7 = string4.substring(0, 1);
                                                                        kotlin.jvm.internal.m.e(strSubstring7, "substring(...)");
                                                                        String upperCase4 = strSubstring7.toUpperCase(bq.m.p());
                                                                        kotlin.jvm.internal.m.e(upperCase4, "toUpperCase(...)");
                                                                        String strSubstring8 = string4.substring(1);
                                                                        kotlin.jvm.internal.m.e(strSubstring8, "substring(...)");
                                                                        textView4.setText(upperCase4.concat(strSubstring8));
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            aVar4 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar4);
                                                            if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                ta.a aVar12 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar12);
                                                                iIndexOfChild2 = (((hj.a2) aVar12).f32335c.indexOfChild(view) - i11) - 2;
                                                                arrayList2 = s2Var.f48181k;
                                                                if (arrayList2 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word2)) {
                                                                    arrayList3 = s2Var.f48181k;
                                                                    if (arrayList3 != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                    kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word3)) {
                                                                        TextView textView5 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                        String string5 = textView5.getText().toString();
                                                                        String strSubstring9 = string5.substring(0, 1);
                                                                        kotlin.jvm.internal.m.e(strSubstring9, "substring(...)");
                                                                        String upperCase5 = strSubstring9.toUpperCase(bq.m.p());
                                                                        kotlin.jvm.internal.m.e(upperCase5, "toUpperCase(...)");
                                                                        String strSubstring10 = string5.substring(1);
                                                                        kotlin.jvm.internal.m.e(strSubstring10, "substring(...)");
                                                                        textView5.setText(upperCase5.concat(strSubstring10));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    arrayList5 = s2Var.f48181k;
                                                    if (arrayList5 != null) {
                                                        kotlin.jvm.internal.m.n("stemList");
                                                        throw null;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(((Word) arrayList5.get(0)).getWord(), "_____")) {
                                                        aVar3 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar3);
                                                        if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                            ta.a aVar13 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar13);
                                                            iIndexOfChild = (((hj.a2) aVar13).f32335c.indexOfChild(view) - i11) - 1;
                                                            arrayList = s2Var.f48181k;
                                                            if (arrayList != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            Word word10 = (Word) arrayList.get(iIndexOfChild);
                                                            word = word10.getWord();
                                                            kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word)) {
                                                                aVar4 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar4);
                                                                if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                    ta.a aVar14 = s2Var.f47886f;
                                                                    kotlin.jvm.internal.m.c(aVar14);
                                                                    iIndexOfChild2 = (((hj.a2) aVar14).f32335c.indexOfChild(view) - i11) - 2;
                                                                    arrayList2 = s2Var.f48181k;
                                                                    if (arrayList2 != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word2)) {
                                                                        arrayList3 = s2Var.f48181k;
                                                                        if (arrayList3 != null) {
                                                                            kotlin.jvm.internal.m.n("stemList");
                                                                            throw null;
                                                                        }
                                                                        word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                        kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                        if (com.bumptech.glide.d.s(word3)) {
                                                                            TextView textView6 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                            String string6 = textView6.getText().toString();
                                                                            String strSubstring11 = string6.substring(0, 1);
                                                                            kotlin.jvm.internal.m.e(strSubstring11, "substring(...)");
                                                                            String upperCase6 = strSubstring11.toUpperCase(bq.m.p());
                                                                            kotlin.jvm.internal.m.e(upperCase6, "toUpperCase(...)");
                                                                            String strSubstring12 = string6.substring(1);
                                                                            kotlin.jvm.internal.m.e(strSubstring12, "substring(...)");
                                                                            textView6.setText(upperCase6.concat(strSubstring12));
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                aVar4 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar4);
                                                                if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                    ta.a aVar15 = s2Var.f47886f;
                                                                    kotlin.jvm.internal.m.c(aVar15);
                                                                    iIndexOfChild2 = (((hj.a2) aVar15).f32335c.indexOfChild(view) - i11) - 2;
                                                                    arrayList2 = s2Var.f48181k;
                                                                    if (arrayList2 != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word2)) {
                                                                        arrayList3 = s2Var.f48181k;
                                                                        if (arrayList3 != null) {
                                                                            kotlin.jvm.internal.m.n("stemList");
                                                                            throw null;
                                                                        }
                                                                        word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                        kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                        if (com.bumptech.glide.d.s(word3)) {
                                                                            TextView textView7 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                            String string7 = textView7.getText().toString();
                                                                            String strSubstring13 = string7.substring(0, 1);
                                                                            kotlin.jvm.internal.m.e(strSubstring13, "substring(...)");
                                                                            String upperCase7 = strSubstring13.toUpperCase(bq.m.p());
                                                                            kotlin.jvm.internal.m.e(upperCase7, "toUpperCase(...)");
                                                                            String strSubstring14 = string7.substring(1);
                                                                            kotlin.jvm.internal.m.e(strSubstring14, "substring(...)");
                                                                            textView7.setText(upperCase7.concat(strSubstring14));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        arrayList6 = s2Var.f48181k;
                                                        if (arrayList6 != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        word4 = ((Word) arrayList6.get(arrayList6.size() - 1)).getWord();
                                                        kotlin.jvm.internal.m.e(word4, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word4)) {
                                                            TextView textView8 = (TextView) v13.findViewById(R.id.tv_middle);
                                                            String string8 = textView8.getText().toString();
                                                            String strSubstring15 = string8.substring(0, 1);
                                                            kotlin.jvm.internal.m.e(strSubstring15, "substring(...)");
                                                            String upperCase8 = strSubstring15.toUpperCase(bq.m.p());
                                                            kotlin.jvm.internal.m.e(upperCase8, "toUpperCase(...)");
                                                            String strSubstring16 = string8.substring(1);
                                                            kotlin.jvm.internal.m.e(strSubstring16, "substring(...)");
                                                            textView8.setText(upperCase8.concat(strSubstring16));
                                                        } else {
                                                            aVar3 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar3);
                                                            if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                                ta.a aVar16 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar16);
                                                                iIndexOfChild = (((hj.a2) aVar16).f32335c.indexOfChild(view) - i11) - 1;
                                                                arrayList = s2Var.f48181k;
                                                                if (arrayList != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                Word word11 = (Word) arrayList.get(iIndexOfChild);
                                                                word = word11.getWord();
                                                                kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word)) {
                                                                    aVar4 = s2Var.f47886f;
                                                                    kotlin.jvm.internal.m.c(aVar4);
                                                                    if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                        ta.a aVar17 = s2Var.f47886f;
                                                                        kotlin.jvm.internal.m.c(aVar17);
                                                                        iIndexOfChild2 = (((hj.a2) aVar17).f32335c.indexOfChild(view) - i11) - 2;
                                                                        arrayList2 = s2Var.f48181k;
                                                                        if (arrayList2 != null) {
                                                                            kotlin.jvm.internal.m.n("stemList");
                                                                            throw null;
                                                                        }
                                                                        word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                        if (com.bumptech.glide.d.s(word2)) {
                                                                            arrayList3 = s2Var.f48181k;
                                                                            if (arrayList3 != null) {
                                                                                kotlin.jvm.internal.m.n("stemList");
                                                                                throw null;
                                                                            }
                                                                            word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                            kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                            if (com.bumptech.glide.d.s(word3)) {
                                                                                TextView textView9 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                                String string9 = textView9.getText().toString();
                                                                                String strSubstring17 = string9.substring(0, 1);
                                                                                kotlin.jvm.internal.m.e(strSubstring17, "substring(...)");
                                                                                String upperCase9 = strSubstring17.toUpperCase(bq.m.p());
                                                                                kotlin.jvm.internal.m.e(upperCase9, "toUpperCase(...)");
                                                                                String strSubstring18 = string9.substring(1);
                                                                                kotlin.jvm.internal.m.e(strSubstring18, "substring(...)");
                                                                                textView9.setText(upperCase9.concat(strSubstring18));
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    aVar4 = s2Var.f47886f;
                                                                    kotlin.jvm.internal.m.c(aVar4);
                                                                    if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                        ta.a aVar18 = s2Var.f47886f;
                                                                        kotlin.jvm.internal.m.c(aVar18);
                                                                        iIndexOfChild2 = (((hj.a2) aVar18).f32335c.indexOfChild(view) - i11) - 2;
                                                                        arrayList2 = s2Var.f48181k;
                                                                        if (arrayList2 != null) {
                                                                            kotlin.jvm.internal.m.n("stemList");
                                                                            throw null;
                                                                        }
                                                                        word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                        if (com.bumptech.glide.d.s(word2)) {
                                                                            arrayList3 = s2Var.f48181k;
                                                                            if (arrayList3 != null) {
                                                                                kotlin.jvm.internal.m.n("stemList");
                                                                                throw null;
                                                                            }
                                                                            word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                            kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                            if (com.bumptech.glide.d.s(word3)) {
                                                                                TextView textView10 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                                String string10 = textView10.getText().toString();
                                                                                String strSubstring19 = string10.substring(0, 1);
                                                                                kotlin.jvm.internal.m.e(strSubstring19, "substring(...)");
                                                                                String upperCase10 = strSubstring19.toUpperCase(bq.m.p());
                                                                                kotlin.jvm.internal.m.e(upperCase10, "toUpperCase(...)");
                                                                                String strSubstring110 = string10.substring(1);
                                                                                kotlin.jvm.internal.m.e(strSubstring110, "substring(...)");
                                                                                textView10.setText(upperCase10.concat(strSubstring110));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            arrayList7 = s2Var.f48181k;
                                            if (arrayList7 != null) {
                                                kotlin.jvm.internal.m.n("stemList");
                                                throw null;
                                            }
                                            word5 = ((Word) arrayList7.get(arrayList7.size() - 1)).getWord();
                                            kotlin.jvm.internal.m.e(word5, "getWord(...)");
                                            if (com.bumptech.glide.d.s(word5)) {
                                                TextView textView11 = (TextView) v13.findViewById(R.id.tv_middle);
                                                String string11 = textView11.getText().toString();
                                                String strSubstring20 = string11.substring(0, 1);
                                                kotlin.jvm.internal.m.e(strSubstring20, "substring(...)");
                                                String upperCase11 = strSubstring20.toUpperCase(bq.m.p());
                                                kotlin.jvm.internal.m.e(upperCase11, "toUpperCase(...)");
                                                String strSubstring21 = string11.substring(1);
                                                kotlin.jvm.internal.m.e(strSubstring21, "substring(...)");
                                                strConcat = upperCase11.concat(strSubstring21);
                                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                                if (cf.x.n().keyLanguage == 65 && oz.x.s0(strConcat, "Έ", false)) {
                                                    strConcat = str.concat(strConcat);
                                                }
                                                textView11.setText(strConcat);
                                            } else {
                                                aVar2 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar2);
                                                i12 = i11 + 1;
                                                if (((hj.a2) aVar2).f32335c.indexOfChild(view) != i12) {
                                                    aVar3 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar3);
                                                    if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                        ta.a aVar19 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar19);
                                                        iIndexOfChild = (((hj.a2) aVar19).f32335c.indexOfChild(view) - i11) - 1;
                                                        arrayList = s2Var.f48181k;
                                                        if (arrayList != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        Word word12 = (Word) arrayList.get(iIndexOfChild);
                                                        word = word12.getWord();
                                                        kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word)) {
                                                            aVar4 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar4);
                                                            if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                ta.a aVar110 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar110);
                                                                iIndexOfChild2 = (((hj.a2) aVar110).f32335c.indexOfChild(view) - i11) - 2;
                                                                arrayList2 = s2Var.f48181k;
                                                                if (arrayList2 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word2)) {
                                                                    arrayList3 = s2Var.f48181k;
                                                                    if (arrayList3 != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                    kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word3)) {
                                                                        TextView textView12 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                        String string12 = textView12.getText().toString();
                                                                        String strSubstring111 = string12.substring(0, 1);
                                                                        kotlin.jvm.internal.m.e(strSubstring111, "substring(...)");
                                                                        String upperCase12 = strSubstring111.toUpperCase(bq.m.p());
                                                                        kotlin.jvm.internal.m.e(upperCase12, "toUpperCase(...)");
                                                                        String strSubstring112 = string12.substring(1);
                                                                        kotlin.jvm.internal.m.e(strSubstring112, "substring(...)");
                                                                        textView12.setText(upperCase12.concat(strSubstring112));
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            aVar4 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar4);
                                                            if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                ta.a aVar111 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar111);
                                                                iIndexOfChild2 = (((hj.a2) aVar111).f32335c.indexOfChild(view) - i11) - 2;
                                                                arrayList2 = s2Var.f48181k;
                                                                if (arrayList2 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word2)) {
                                                                    arrayList3 = s2Var.f48181k;
                                                                    if (arrayList3 != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                    kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word3)) {
                                                                        TextView textView13 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                        String string13 = textView13.getText().toString();
                                                                        String strSubstring113 = string13.substring(0, 1);
                                                                        kotlin.jvm.internal.m.e(strSubstring113, "substring(...)");
                                                                        String upperCase13 = strSubstring113.toUpperCase(bq.m.p());
                                                                        kotlin.jvm.internal.m.e(upperCase13, "toUpperCase(...)");
                                                                        String strSubstring114 = string13.substring(1);
                                                                        kotlin.jvm.internal.m.e(strSubstring114, "substring(...)");
                                                                        textView13.setText(upperCase13.concat(strSubstring114));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    arrayList4 = s2Var.f48181k;
                                                    if (arrayList4 != null) {
                                                        kotlin.jvm.internal.m.n("stemList");
                                                        throw null;
                                                    }
                                                    if (((Word) arrayList4.get(0)).getWordType() != 1) {
                                                        aVar3 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar3);
                                                        if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                            ta.a aVar112 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar112);
                                                            iIndexOfChild = (((hj.a2) aVar112).f32335c.indexOfChild(view) - i11) - 1;
                                                            arrayList = s2Var.f48181k;
                                                            if (arrayList != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            Word word13 = (Word) arrayList.get(iIndexOfChild);
                                                            word = word13.getWord();
                                                            kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word)) {
                                                                aVar4 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar4);
                                                                if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                    ta.a aVar113 = s2Var.f47886f;
                                                                    kotlin.jvm.internal.m.c(aVar113);
                                                                    iIndexOfChild2 = (((hj.a2) aVar113).f32335c.indexOfChild(view) - i11) - 2;
                                                                    arrayList2 = s2Var.f48181k;
                                                                    if (arrayList2 != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word2)) {
                                                                        arrayList3 = s2Var.f48181k;
                                                                        if (arrayList3 != null) {
                                                                            kotlin.jvm.internal.m.n("stemList");
                                                                            throw null;
                                                                        }
                                                                        word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                        kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                        if (com.bumptech.glide.d.s(word3)) {
                                                                            TextView textView14 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                            String string14 = textView14.getText().toString();
                                                                            String strSubstring115 = string14.substring(0, 1);
                                                                            kotlin.jvm.internal.m.e(strSubstring115, "substring(...)");
                                                                            String upperCase14 = strSubstring115.toUpperCase(bq.m.p());
                                                                            kotlin.jvm.internal.m.e(upperCase14, "toUpperCase(...)");
                                                                            String strSubstring116 = string14.substring(1);
                                                                            kotlin.jvm.internal.m.e(strSubstring116, "substring(...)");
                                                                            textView14.setText(upperCase14.concat(strSubstring116));
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                aVar4 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar4);
                                                                if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                    ta.a aVar114 = s2Var.f47886f;
                                                                    kotlin.jvm.internal.m.c(aVar114);
                                                                    iIndexOfChild2 = (((hj.a2) aVar114).f32335c.indexOfChild(view) - i11) - 2;
                                                                    arrayList2 = s2Var.f48181k;
                                                                    if (arrayList2 != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word2)) {
                                                                        arrayList3 = s2Var.f48181k;
                                                                        if (arrayList3 != null) {
                                                                            kotlin.jvm.internal.m.n("stemList");
                                                                            throw null;
                                                                        }
                                                                        word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                        kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                        if (com.bumptech.glide.d.s(word3)) {
                                                                            TextView textView15 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                            String string15 = textView15.getText().toString();
                                                                            String strSubstring117 = string15.substring(0, 1);
                                                                            kotlin.jvm.internal.m.e(strSubstring117, "substring(...)");
                                                                            String upperCase15 = strSubstring117.toUpperCase(bq.m.p());
                                                                            kotlin.jvm.internal.m.e(upperCase15, "toUpperCase(...)");
                                                                            String strSubstring118 = string15.substring(1);
                                                                            kotlin.jvm.internal.m.e(strSubstring118, "substring(...)");
                                                                            textView15.setText(upperCase15.concat(strSubstring118));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        arrayList5 = s2Var.f48181k;
                                                        if (arrayList5 != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        if (kotlin.jvm.internal.m.a(((Word) arrayList5.get(0)).getWord(), "_____")) {
                                                            aVar3 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar3);
                                                            if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                                ta.a aVar115 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar115);
                                                                iIndexOfChild = (((hj.a2) aVar115).f32335c.indexOfChild(view) - i11) - 1;
                                                                arrayList = s2Var.f48181k;
                                                                if (arrayList != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                Word word14 = (Word) arrayList.get(iIndexOfChild);
                                                                word = word14.getWord();
                                                                kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word)) {
                                                                    aVar4 = s2Var.f47886f;
                                                                    kotlin.jvm.internal.m.c(aVar4);
                                                                    if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                        ta.a aVar116 = s2Var.f47886f;
                                                                        kotlin.jvm.internal.m.c(aVar116);
                                                                        iIndexOfChild2 = (((hj.a2) aVar116).f32335c.indexOfChild(view) - i11) - 2;
                                                                        arrayList2 = s2Var.f48181k;
                                                                        if (arrayList2 != null) {
                                                                            kotlin.jvm.internal.m.n("stemList");
                                                                            throw null;
                                                                        }
                                                                        word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                        if (com.bumptech.glide.d.s(word2)) {
                                                                            arrayList3 = s2Var.f48181k;
                                                                            if (arrayList3 != null) {
                                                                                kotlin.jvm.internal.m.n("stemList");
                                                                                throw null;
                                                                            }
                                                                            word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                            kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                            if (com.bumptech.glide.d.s(word3)) {
                                                                                TextView textView16 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                                String string16 = textView16.getText().toString();
                                                                                String strSubstring119 = string16.substring(0, 1);
                                                                                kotlin.jvm.internal.m.e(strSubstring119, "substring(...)");
                                                                                String upperCase16 = strSubstring119.toUpperCase(bq.m.p());
                                                                                kotlin.jvm.internal.m.e(upperCase16, "toUpperCase(...)");
                                                                                String strSubstring1110 = string16.substring(1);
                                                                                kotlin.jvm.internal.m.e(strSubstring1110, "substring(...)");
                                                                                textView16.setText(upperCase16.concat(strSubstring1110));
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    aVar4 = s2Var.f47886f;
                                                                    kotlin.jvm.internal.m.c(aVar4);
                                                                    if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                        ta.a aVar117 = s2Var.f47886f;
                                                                        kotlin.jvm.internal.m.c(aVar117);
                                                                        iIndexOfChild2 = (((hj.a2) aVar117).f32335c.indexOfChild(view) - i11) - 2;
                                                                        arrayList2 = s2Var.f48181k;
                                                                        if (arrayList2 != null) {
                                                                            kotlin.jvm.internal.m.n("stemList");
                                                                            throw null;
                                                                        }
                                                                        word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                        if (com.bumptech.glide.d.s(word2)) {
                                                                            arrayList3 = s2Var.f48181k;
                                                                            if (arrayList3 != null) {
                                                                                kotlin.jvm.internal.m.n("stemList");
                                                                                throw null;
                                                                            }
                                                                            word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                            kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                            if (com.bumptech.glide.d.s(word3)) {
                                                                                TextView textView17 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                                String string17 = textView17.getText().toString();
                                                                                String strSubstring1111 = string17.substring(0, 1);
                                                                                kotlin.jvm.internal.m.e(strSubstring1111, "substring(...)");
                                                                                String upperCase17 = strSubstring1111.toUpperCase(bq.m.p());
                                                                                kotlin.jvm.internal.m.e(upperCase17, "toUpperCase(...)");
                                                                                String strSubstring1112 = string17.substring(1);
                                                                                kotlin.jvm.internal.m.e(strSubstring1112, "substring(...)");
                                                                                textView17.setText(upperCase17.concat(strSubstring1112));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            arrayList6 = s2Var.f48181k;
                                                            if (arrayList6 != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            word4 = ((Word) arrayList6.get(arrayList6.size() - 1)).getWord();
                                                            kotlin.jvm.internal.m.e(word4, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word4)) {
                                                                TextView textView18 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                String string18 = textView18.getText().toString();
                                                                String strSubstring120 = string18.substring(0, 1);
                                                                kotlin.jvm.internal.m.e(strSubstring120, "substring(...)");
                                                                String upperCase18 = strSubstring120.toUpperCase(bq.m.p());
                                                                kotlin.jvm.internal.m.e(upperCase18, "toUpperCase(...)");
                                                                String strSubstring121 = string18.substring(1);
                                                                kotlin.jvm.internal.m.e(strSubstring121, "substring(...)");
                                                                textView18.setText(upperCase18.concat(strSubstring121));
                                                            } else {
                                                                aVar3 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar3);
                                                                if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                                    ta.a aVar118 = s2Var.f47886f;
                                                                    kotlin.jvm.internal.m.c(aVar118);
                                                                    iIndexOfChild = (((hj.a2) aVar118).f32335c.indexOfChild(view) - i11) - 1;
                                                                    arrayList = s2Var.f48181k;
                                                                    if (arrayList != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    Word word15 = (Word) arrayList.get(iIndexOfChild);
                                                                    word = word15.getWord();
                                                                    kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word)) {
                                                                        aVar4 = s2Var.f47886f;
                                                                        kotlin.jvm.internal.m.c(aVar4);
                                                                        if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                            ta.a aVar119 = s2Var.f47886f;
                                                                            kotlin.jvm.internal.m.c(aVar119);
                                                                            iIndexOfChild2 = (((hj.a2) aVar119).f32335c.indexOfChild(view) - i11) - 2;
                                                                            arrayList2 = s2Var.f48181k;
                                                                            if (arrayList2 != null) {
                                                                                kotlin.jvm.internal.m.n("stemList");
                                                                                throw null;
                                                                            }
                                                                            word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                            if (com.bumptech.glide.d.s(word2)) {
                                                                                arrayList3 = s2Var.f48181k;
                                                                                if (arrayList3 != null) {
                                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                                    throw null;
                                                                                }
                                                                                word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                                if (com.bumptech.glide.d.s(word3)) {
                                                                                    TextView textView19 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                                    String string19 = textView19.getText().toString();
                                                                                    String strSubstring1113 = string19.substring(0, 1);
                                                                                    kotlin.jvm.internal.m.e(strSubstring1113, "substring(...)");
                                                                                    String upperCase19 = strSubstring1113.toUpperCase(bq.m.p());
                                                                                    kotlin.jvm.internal.m.e(upperCase19, "toUpperCase(...)");
                                                                                    String strSubstring1114 = string19.substring(1);
                                                                                    kotlin.jvm.internal.m.e(strSubstring1114, "substring(...)");
                                                                                    textView19.setText(upperCase19.concat(strSubstring1114));
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        aVar4 = s2Var.f47886f;
                                                                        kotlin.jvm.internal.m.c(aVar4);
                                                                        if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                            ta.a aVar1110 = s2Var.f47886f;
                                                                            kotlin.jvm.internal.m.c(aVar1110);
                                                                            iIndexOfChild2 = (((hj.a2) aVar1110).f32335c.indexOfChild(view) - i11) - 2;
                                                                            arrayList2 = s2Var.f48181k;
                                                                            if (arrayList2 != null) {
                                                                                kotlin.jvm.internal.m.n("stemList");
                                                                                throw null;
                                                                            }
                                                                            word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                            if (com.bumptech.glide.d.s(word2)) {
                                                                                arrayList3 = s2Var.f48181k;
                                                                                if (arrayList3 != null) {
                                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                                    throw null;
                                                                                }
                                                                                word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                                if (com.bumptech.glide.d.s(word3)) {
                                                                                    TextView textView110 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                                    String string110 = textView110.getText().toString();
                                                                                    String strSubstring1115 = string110.substring(0, 1);
                                                                                    kotlin.jvm.internal.m.e(strSubstring1115, "substring(...)");
                                                                                    String upperCase110 = strSubstring1115.toUpperCase(bq.m.p());
                                                                                    kotlin.jvm.internal.m.e(upperCase110, "toUpperCase(...)");
                                                                                    String strSubstring1116 = string110.substring(1);
                                                                                    kotlin.jvm.internal.m.e(strSubstring1116, "substring(...)");
                                                                                    textView110.setText(upperCase110.concat(strSubstring1116));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Exception e8) {
                                        e8.printStackTrace();
                                    }
                                }
                                v13.postDelayed(new b2.c(4, v13, new qp.m2(s2Var, v13, iArr, iArr2)), 0L);
                            }
                        } else {
                            i14++;
                            c11 = c12;
                        }
                    }
                    if (s2Var.f48183n != null) {
                        s2Var.u(false);
                        int[] iArr4 = bq.r.f4959a;
                        if (!bq.m.F()) {
                            view = s2Var.f48183n;
                            str = gkbGsXmgaxRjJ.IjEmSWnUQUk;
                            if (s2Var.f47884d.isAudioModel) {
                                i11 = 0;
                            } else {
                                i11 = 0;
                            }
                            aVar = s2Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar);
                            if (((hj.a2) aVar).f32335c.indexOfChild(view) != i11) {
                                aVar2 = s2Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar2);
                                i12 = i11 + 1;
                                if (((hj.a2) aVar2).f32335c.indexOfChild(view) != i12) {
                                    aVar3 = s2Var.f47886f;
                                    kotlin.jvm.internal.m.c(aVar3);
                                    if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                        ta.a aVar1111 = s2Var.f47886f;
                                        kotlin.jvm.internal.m.c(aVar1111);
                                        iIndexOfChild = (((hj.a2) aVar1111).f32335c.indexOfChild(view) - i11) - 1;
                                        arrayList = s2Var.f48181k;
                                        if (arrayList != null) {
                                            kotlin.jvm.internal.m.n("stemList");
                                            throw null;
                                        }
                                        Word word16 = (Word) arrayList.get(iIndexOfChild);
                                        word = word16.getWord();
                                        kotlin.jvm.internal.m.e(word, "getWord(...)");
                                        if (com.bumptech.glide.d.s(word)) {
                                            aVar4 = s2Var.f47886f;
                                            kotlin.jvm.internal.m.c(aVar4);
                                            if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                ta.a aVar1112 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar1112);
                                                iIndexOfChild2 = (((hj.a2) aVar1112).f32335c.indexOfChild(view) - i11) - 2;
                                                arrayList2 = s2Var.f48181k;
                                                if (arrayList2 != null) {
                                                    kotlin.jvm.internal.m.n("stemList");
                                                    throw null;
                                                }
                                                word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                if (com.bumptech.glide.d.s(word2)) {
                                                    arrayList3 = s2Var.f48181k;
                                                    if (arrayList3 != null) {
                                                        kotlin.jvm.internal.m.n("stemList");
                                                        throw null;
                                                    }
                                                    word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                    kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                    if (com.bumptech.glide.d.s(word3)) {
                                                        TextView textView111 = (TextView) v13.findViewById(R.id.tv_middle);
                                                        String string111 = textView111.getText().toString();
                                                        String strSubstring1117 = string111.substring(0, 1);
                                                        kotlin.jvm.internal.m.e(strSubstring1117, "substring(...)");
                                                        String upperCase111 = strSubstring1117.toUpperCase(bq.m.p());
                                                        kotlin.jvm.internal.m.e(upperCase111, "toUpperCase(...)");
                                                        String strSubstring1118 = string111.substring(1);
                                                        kotlin.jvm.internal.m.e(strSubstring1118, "substring(...)");
                                                        textView111.setText(upperCase111.concat(strSubstring1118));
                                                    }
                                                }
                                            }
                                        } else {
                                            aVar4 = s2Var.f47886f;
                                            kotlin.jvm.internal.m.c(aVar4);
                                            if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                ta.a aVar1113 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar1113);
                                                iIndexOfChild2 = (((hj.a2) aVar1113).f32335c.indexOfChild(view) - i11) - 2;
                                                arrayList2 = s2Var.f48181k;
                                                if (arrayList2 != null) {
                                                    kotlin.jvm.internal.m.n("stemList");
                                                    throw null;
                                                }
                                                word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                if (com.bumptech.glide.d.s(word2)) {
                                                    arrayList3 = s2Var.f48181k;
                                                    if (arrayList3 != null) {
                                                        kotlin.jvm.internal.m.n("stemList");
                                                        throw null;
                                                    }
                                                    word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                    kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                    if (com.bumptech.glide.d.s(word3)) {
                                                        TextView textView112 = (TextView) v13.findViewById(R.id.tv_middle);
                                                        String string112 = textView112.getText().toString();
                                                        String strSubstring1119 = string112.substring(0, 1);
                                                        kotlin.jvm.internal.m.e(strSubstring1119, "substring(...)");
                                                        String upperCase112 = strSubstring1119.toUpperCase(bq.m.p());
                                                        kotlin.jvm.internal.m.e(upperCase112, "toUpperCase(...)");
                                                        String strSubstring11110 = string112.substring(1);
                                                        kotlin.jvm.internal.m.e(strSubstring11110, "substring(...)");
                                                        textView112.setText(upperCase112.concat(strSubstring11110));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    arrayList4 = s2Var.f48181k;
                                    if (arrayList4 != null) {
                                        kotlin.jvm.internal.m.n("stemList");
                                        throw null;
                                    }
                                    if (((Word) arrayList4.get(0)).getWordType() != 1) {
                                        aVar3 = s2Var.f47886f;
                                        kotlin.jvm.internal.m.c(aVar3);
                                        if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                            ta.a aVar1114 = s2Var.f47886f;
                                            kotlin.jvm.internal.m.c(aVar1114);
                                            iIndexOfChild = (((hj.a2) aVar1114).f32335c.indexOfChild(view) - i11) - 1;
                                            arrayList = s2Var.f48181k;
                                            if (arrayList != null) {
                                                kotlin.jvm.internal.m.n("stemList");
                                                throw null;
                                            }
                                            Word word17 = (Word) arrayList.get(iIndexOfChild);
                                            word = word17.getWord();
                                            kotlin.jvm.internal.m.e(word, "getWord(...)");
                                            if (com.bumptech.glide.d.s(word)) {
                                                aVar4 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar4);
                                                if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                    ta.a aVar1115 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar1115);
                                                    iIndexOfChild2 = (((hj.a2) aVar1115).f32335c.indexOfChild(view) - i11) - 2;
                                                    arrayList2 = s2Var.f48181k;
                                                    if (arrayList2 != null) {
                                                        kotlin.jvm.internal.m.n("stemList");
                                                        throw null;
                                                    }
                                                    word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                    if (com.bumptech.glide.d.s(word2)) {
                                                        arrayList3 = s2Var.f48181k;
                                                        if (arrayList3 != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                        kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word3)) {
                                                            TextView textView113 = (TextView) v13.findViewById(R.id.tv_middle);
                                                            String string113 = textView113.getText().toString();
                                                            String strSubstring11111 = string113.substring(0, 1);
                                                            kotlin.jvm.internal.m.e(strSubstring11111, "substring(...)");
                                                            String upperCase113 = strSubstring11111.toUpperCase(bq.m.p());
                                                            kotlin.jvm.internal.m.e(upperCase113, "toUpperCase(...)");
                                                            String strSubstring11112 = string113.substring(1);
                                                            kotlin.jvm.internal.m.e(strSubstring11112, "substring(...)");
                                                            textView113.setText(upperCase113.concat(strSubstring11112));
                                                        }
                                                    }
                                                }
                                            } else {
                                                aVar4 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar4);
                                                if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                    ta.a aVar1116 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar1116);
                                                    iIndexOfChild2 = (((hj.a2) aVar1116).f32335c.indexOfChild(view) - i11) - 2;
                                                    arrayList2 = s2Var.f48181k;
                                                    if (arrayList2 != null) {
                                                        kotlin.jvm.internal.m.n("stemList");
                                                        throw null;
                                                    }
                                                    word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                    if (com.bumptech.glide.d.s(word2)) {
                                                        arrayList3 = s2Var.f48181k;
                                                        if (arrayList3 != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                        kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word3)) {
                                                            TextView textView114 = (TextView) v13.findViewById(R.id.tv_middle);
                                                            String string114 = textView114.getText().toString();
                                                            String strSubstring11113 = string114.substring(0, 1);
                                                            kotlin.jvm.internal.m.e(strSubstring11113, "substring(...)");
                                                            String upperCase114 = strSubstring11113.toUpperCase(bq.m.p());
                                                            kotlin.jvm.internal.m.e(upperCase114, "toUpperCase(...)");
                                                            String strSubstring11114 = string114.substring(1);
                                                            kotlin.jvm.internal.m.e(strSubstring11114, "substring(...)");
                                                            textView114.setText(upperCase114.concat(strSubstring11114));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        arrayList5 = s2Var.f48181k;
                                        if (arrayList5 != null) {
                                            kotlin.jvm.internal.m.n("stemList");
                                            throw null;
                                        }
                                        if (kotlin.jvm.internal.m.a(((Word) arrayList5.get(0)).getWord(), "_____")) {
                                            aVar3 = s2Var.f47886f;
                                            kotlin.jvm.internal.m.c(aVar3);
                                            if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                ta.a aVar1117 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar1117);
                                                iIndexOfChild = (((hj.a2) aVar1117).f32335c.indexOfChild(view) - i11) - 1;
                                                arrayList = s2Var.f48181k;
                                                if (arrayList != null) {
                                                    kotlin.jvm.internal.m.n("stemList");
                                                    throw null;
                                                }
                                                Word word18 = (Word) arrayList.get(iIndexOfChild);
                                                word = word18.getWord();
                                                kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                if (com.bumptech.glide.d.s(word)) {
                                                    aVar4 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar4);
                                                    if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                        ta.a aVar1118 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar1118);
                                                        iIndexOfChild2 = (((hj.a2) aVar1118).f32335c.indexOfChild(view) - i11) - 2;
                                                        arrayList2 = s2Var.f48181k;
                                                        if (arrayList2 != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word2)) {
                                                            arrayList3 = s2Var.f48181k;
                                                            if (arrayList3 != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                            kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word3)) {
                                                                TextView textView115 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                String string115 = textView115.getText().toString();
                                                                String strSubstring11115 = string115.substring(0, 1);
                                                                kotlin.jvm.internal.m.e(strSubstring11115, "substring(...)");
                                                                String upperCase115 = strSubstring11115.toUpperCase(bq.m.p());
                                                                kotlin.jvm.internal.m.e(upperCase115, "toUpperCase(...)");
                                                                String strSubstring11116 = string115.substring(1);
                                                                kotlin.jvm.internal.m.e(strSubstring11116, "substring(...)");
                                                                textView115.setText(upperCase115.concat(strSubstring11116));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    aVar4 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar4);
                                                    if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                        ta.a aVar1119 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar1119);
                                                        iIndexOfChild2 = (((hj.a2) aVar1119).f32335c.indexOfChild(view) - i11) - 2;
                                                        arrayList2 = s2Var.f48181k;
                                                        if (arrayList2 != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word2)) {
                                                            arrayList3 = s2Var.f48181k;
                                                            if (arrayList3 != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                            kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word3)) {
                                                                TextView textView116 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                String string116 = textView116.getText().toString();
                                                                String strSubstring11117 = string116.substring(0, 1);
                                                                kotlin.jvm.internal.m.e(strSubstring11117, "substring(...)");
                                                                String upperCase116 = strSubstring11117.toUpperCase(bq.m.p());
                                                                kotlin.jvm.internal.m.e(upperCase116, "toUpperCase(...)");
                                                                String strSubstring11118 = string116.substring(1);
                                                                kotlin.jvm.internal.m.e(strSubstring11118, "substring(...)");
                                                                textView116.setText(upperCase116.concat(strSubstring11118));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            arrayList6 = s2Var.f48181k;
                                            if (arrayList6 != null) {
                                                kotlin.jvm.internal.m.n("stemList");
                                                throw null;
                                            }
                                            word4 = ((Word) arrayList6.get(arrayList6.size() - 1)).getWord();
                                            kotlin.jvm.internal.m.e(word4, "getWord(...)");
                                            if (com.bumptech.glide.d.s(word4)) {
                                                TextView textView117 = (TextView) v13.findViewById(R.id.tv_middle);
                                                String string117 = textView117.getText().toString();
                                                String strSubstring122 = string117.substring(0, 1);
                                                kotlin.jvm.internal.m.e(strSubstring122, "substring(...)");
                                                String upperCase117 = strSubstring122.toUpperCase(bq.m.p());
                                                kotlin.jvm.internal.m.e(upperCase117, "toUpperCase(...)");
                                                String strSubstring123 = string117.substring(1);
                                                kotlin.jvm.internal.m.e(strSubstring123, "substring(...)");
                                                textView117.setText(upperCase117.concat(strSubstring123));
                                            } else {
                                                aVar3 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar3);
                                                if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                    ta.a aVar11110 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar11110);
                                                    iIndexOfChild = (((hj.a2) aVar11110).f32335c.indexOfChild(view) - i11) - 1;
                                                    arrayList = s2Var.f48181k;
                                                    if (arrayList != null) {
                                                        kotlin.jvm.internal.m.n("stemList");
                                                        throw null;
                                                    }
                                                    Word word19 = (Word) arrayList.get(iIndexOfChild);
                                                    word = word19.getWord();
                                                    kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                    if (com.bumptech.glide.d.s(word)) {
                                                        aVar4 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar4);
                                                        if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                            ta.a aVar11111 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar11111);
                                                            iIndexOfChild2 = (((hj.a2) aVar11111).f32335c.indexOfChild(view) - i11) - 2;
                                                            arrayList2 = s2Var.f48181k;
                                                            if (arrayList2 != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word2)) {
                                                                arrayList3 = s2Var.f48181k;
                                                                if (arrayList3 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word3)) {
                                                                    TextView textView118 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                    String string118 = textView118.getText().toString();
                                                                    String strSubstring11119 = string118.substring(0, 1);
                                                                    kotlin.jvm.internal.m.e(strSubstring11119, "substring(...)");
                                                                    String upperCase118 = strSubstring11119.toUpperCase(bq.m.p());
                                                                    kotlin.jvm.internal.m.e(upperCase118, "toUpperCase(...)");
                                                                    String strSubstring111110 = string118.substring(1);
                                                                    kotlin.jvm.internal.m.e(strSubstring111110, "substring(...)");
                                                                    textView118.setText(upperCase118.concat(strSubstring111110));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        aVar4 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar4);
                                                        if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                            ta.a aVar11112 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar11112);
                                                            iIndexOfChild2 = (((hj.a2) aVar11112).f32335c.indexOfChild(view) - i11) - 2;
                                                            arrayList2 = s2Var.f48181k;
                                                            if (arrayList2 != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word2)) {
                                                                arrayList3 = s2Var.f48181k;
                                                                if (arrayList3 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word3)) {
                                                                    TextView textView119 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                    String string119 = textView119.getText().toString();
                                                                    String strSubstring111111 = string119.substring(0, 1);
                                                                    kotlin.jvm.internal.m.e(strSubstring111111, "substring(...)");
                                                                    String upperCase119 = strSubstring111111.toUpperCase(bq.m.p());
                                                                    kotlin.jvm.internal.m.e(upperCase119, "toUpperCase(...)");
                                                                    String strSubstring111112 = string119.substring(1);
                                                                    kotlin.jvm.internal.m.e(strSubstring111112, "substring(...)");
                                                                    textView119.setText(upperCase119.concat(strSubstring111112));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                arrayList7 = s2Var.f48181k;
                                if (arrayList7 != null) {
                                    kotlin.jvm.internal.m.n("stemList");
                                    throw null;
                                }
                                word5 = ((Word) arrayList7.get(arrayList7.size() - 1)).getWord();
                                kotlin.jvm.internal.m.e(word5, "getWord(...)");
                                if (com.bumptech.glide.d.s(word5)) {
                                    TextView textView120 = (TextView) v13.findViewById(R.id.tv_middle);
                                    String string120 = textView120.getText().toString();
                                    String strSubstring22 = string120.substring(0, 1);
                                    kotlin.jvm.internal.m.e(strSubstring22, "substring(...)");
                                    String upperCase120 = strSubstring22.toUpperCase(bq.m.p());
                                    kotlin.jvm.internal.m.e(upperCase120, "toUpperCase(...)");
                                    String strSubstring23 = string120.substring(1);
                                    kotlin.jvm.internal.m.e(strSubstring23, "substring(...)");
                                    strConcat = upperCase120.concat(strSubstring23);
                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                    if (cf.x.n().keyLanguage == 65) {
                                        strConcat = str.concat(strConcat);
                                    }
                                    textView120.setText(strConcat);
                                } else {
                                    aVar2 = s2Var.f47886f;
                                    kotlin.jvm.internal.m.c(aVar2);
                                    i12 = i11 + 1;
                                    if (((hj.a2) aVar2).f32335c.indexOfChild(view) != i12) {
                                        aVar3 = s2Var.f47886f;
                                        kotlin.jvm.internal.m.c(aVar3);
                                        if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                            ta.a aVar11113 = s2Var.f47886f;
                                            kotlin.jvm.internal.m.c(aVar11113);
                                            iIndexOfChild = (((hj.a2) aVar11113).f32335c.indexOfChild(view) - i11) - 1;
                                            arrayList = s2Var.f48181k;
                                            if (arrayList != null) {
                                                kotlin.jvm.internal.m.n("stemList");
                                                throw null;
                                            }
                                            Word word110 = (Word) arrayList.get(iIndexOfChild);
                                            word = word110.getWord();
                                            kotlin.jvm.internal.m.e(word, "getWord(...)");
                                            if (com.bumptech.glide.d.s(word)) {
                                                aVar4 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar4);
                                                if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                    ta.a aVar11114 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar11114);
                                                    iIndexOfChild2 = (((hj.a2) aVar11114).f32335c.indexOfChild(view) - i11) - 2;
                                                    arrayList2 = s2Var.f48181k;
                                                    if (arrayList2 != null) {
                                                        kotlin.jvm.internal.m.n("stemList");
                                                        throw null;
                                                    }
                                                    word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                    if (com.bumptech.glide.d.s(word2)) {
                                                        arrayList3 = s2Var.f48181k;
                                                        if (arrayList3 != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                        kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word3)) {
                                                            TextView textView1110 = (TextView) v13.findViewById(R.id.tv_middle);
                                                            String string1110 = textView1110.getText().toString();
                                                            String strSubstring111113 = string1110.substring(0, 1);
                                                            kotlin.jvm.internal.m.e(strSubstring111113, "substring(...)");
                                                            String upperCase1110 = strSubstring111113.toUpperCase(bq.m.p());
                                                            kotlin.jvm.internal.m.e(upperCase1110, "toUpperCase(...)");
                                                            String strSubstring111114 = string1110.substring(1);
                                                            kotlin.jvm.internal.m.e(strSubstring111114, "substring(...)");
                                                            textView1110.setText(upperCase1110.concat(strSubstring111114));
                                                        }
                                                    }
                                                }
                                            } else {
                                                aVar4 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar4);
                                                if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                    ta.a aVar11115 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar11115);
                                                    iIndexOfChild2 = (((hj.a2) aVar11115).f32335c.indexOfChild(view) - i11) - 2;
                                                    arrayList2 = s2Var.f48181k;
                                                    if (arrayList2 != null) {
                                                        kotlin.jvm.internal.m.n("stemList");
                                                        throw null;
                                                    }
                                                    word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                    kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                    if (com.bumptech.glide.d.s(word2)) {
                                                        arrayList3 = s2Var.f48181k;
                                                        if (arrayList3 != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                        kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word3)) {
                                                            TextView textView1111 = (TextView) v13.findViewById(R.id.tv_middle);
                                                            String string1111 = textView1111.getText().toString();
                                                            String strSubstring111115 = string1111.substring(0, 1);
                                                            kotlin.jvm.internal.m.e(strSubstring111115, "substring(...)");
                                                            String upperCase1111 = strSubstring111115.toUpperCase(bq.m.p());
                                                            kotlin.jvm.internal.m.e(upperCase1111, "toUpperCase(...)");
                                                            String strSubstring111116 = string1111.substring(1);
                                                            kotlin.jvm.internal.m.e(strSubstring111116, "substring(...)");
                                                            textView1111.setText(upperCase1111.concat(strSubstring111116));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        arrayList4 = s2Var.f48181k;
                                        if (arrayList4 != null) {
                                            kotlin.jvm.internal.m.n("stemList");
                                            throw null;
                                        }
                                        if (((Word) arrayList4.get(0)).getWordType() != 1) {
                                            aVar3 = s2Var.f47886f;
                                            kotlin.jvm.internal.m.c(aVar3);
                                            if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                ta.a aVar11116 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar11116);
                                                iIndexOfChild = (((hj.a2) aVar11116).f32335c.indexOfChild(view) - i11) - 1;
                                                arrayList = s2Var.f48181k;
                                                if (arrayList != null) {
                                                    kotlin.jvm.internal.m.n("stemList");
                                                    throw null;
                                                }
                                                Word word111 = (Word) arrayList.get(iIndexOfChild);
                                                word = word111.getWord();
                                                kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                if (com.bumptech.glide.d.s(word)) {
                                                    aVar4 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar4);
                                                    if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                        ta.a aVar11117 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar11117);
                                                        iIndexOfChild2 = (((hj.a2) aVar11117).f32335c.indexOfChild(view) - i11) - 2;
                                                        arrayList2 = s2Var.f48181k;
                                                        if (arrayList2 != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word2)) {
                                                            arrayList3 = s2Var.f48181k;
                                                            if (arrayList3 != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                            kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word3)) {
                                                                TextView textView1112 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                String string1112 = textView1112.getText().toString();
                                                                String strSubstring111117 = string1112.substring(0, 1);
                                                                kotlin.jvm.internal.m.e(strSubstring111117, "substring(...)");
                                                                String upperCase1112 = strSubstring111117.toUpperCase(bq.m.p());
                                                                kotlin.jvm.internal.m.e(upperCase1112, "toUpperCase(...)");
                                                                String strSubstring111118 = string1112.substring(1);
                                                                kotlin.jvm.internal.m.e(strSubstring111118, "substring(...)");
                                                                textView1112.setText(upperCase1112.concat(strSubstring111118));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    aVar4 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar4);
                                                    if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                        ta.a aVar11118 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar11118);
                                                        iIndexOfChild2 = (((hj.a2) aVar11118).f32335c.indexOfChild(view) - i11) - 2;
                                                        arrayList2 = s2Var.f48181k;
                                                        if (arrayList2 != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word2)) {
                                                            arrayList3 = s2Var.f48181k;
                                                            if (arrayList3 != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                            kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word3)) {
                                                                TextView textView1113 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                String string1113 = textView1113.getText().toString();
                                                                String strSubstring111119 = string1113.substring(0, 1);
                                                                kotlin.jvm.internal.m.e(strSubstring111119, "substring(...)");
                                                                String upperCase1113 = strSubstring111119.toUpperCase(bq.m.p());
                                                                kotlin.jvm.internal.m.e(upperCase1113, "toUpperCase(...)");
                                                                String strSubstring1111110 = string1113.substring(1);
                                                                kotlin.jvm.internal.m.e(strSubstring1111110, "substring(...)");
                                                                textView1113.setText(upperCase1113.concat(strSubstring1111110));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            arrayList5 = s2Var.f48181k;
                                            if (arrayList5 != null) {
                                                kotlin.jvm.internal.m.n("stemList");
                                                throw null;
                                            }
                                            if (kotlin.jvm.internal.m.a(((Word) arrayList5.get(0)).getWord(), "_____")) {
                                                aVar3 = s2Var.f47886f;
                                                kotlin.jvm.internal.m.c(aVar3);
                                                if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                    ta.a aVar11119 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar11119);
                                                    iIndexOfChild = (((hj.a2) aVar11119).f32335c.indexOfChild(view) - i11) - 1;
                                                    arrayList = s2Var.f48181k;
                                                    if (arrayList != null) {
                                                        kotlin.jvm.internal.m.n("stemList");
                                                        throw null;
                                                    }
                                                    Word word112 = (Word) arrayList.get(iIndexOfChild);
                                                    word = word112.getWord();
                                                    kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                    if (com.bumptech.glide.d.s(word)) {
                                                        aVar4 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar4);
                                                        if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                            ta.a aVar111110 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar111110);
                                                            iIndexOfChild2 = (((hj.a2) aVar111110).f32335c.indexOfChild(view) - i11) - 2;
                                                            arrayList2 = s2Var.f48181k;
                                                            if (arrayList2 != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word2)) {
                                                                arrayList3 = s2Var.f48181k;
                                                                if (arrayList3 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word3)) {
                                                                    TextView textView1114 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                    String string1114 = textView1114.getText().toString();
                                                                    String strSubstring1111111 = string1114.substring(0, 1);
                                                                    kotlin.jvm.internal.m.e(strSubstring1111111, "substring(...)");
                                                                    String upperCase1114 = strSubstring1111111.toUpperCase(bq.m.p());
                                                                    kotlin.jvm.internal.m.e(upperCase1114, "toUpperCase(...)");
                                                                    String strSubstring1111112 = string1114.substring(1);
                                                                    kotlin.jvm.internal.m.e(strSubstring1111112, "substring(...)");
                                                                    textView1114.setText(upperCase1114.concat(strSubstring1111112));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        aVar4 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar4);
                                                        if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                            ta.a aVar111111 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar111111);
                                                            iIndexOfChild2 = (((hj.a2) aVar111111).f32335c.indexOfChild(view) - i11) - 2;
                                                            arrayList2 = s2Var.f48181k;
                                                            if (arrayList2 != null) {
                                                                kotlin.jvm.internal.m.n("stemList");
                                                                throw null;
                                                            }
                                                            word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                            if (com.bumptech.glide.d.s(word2)) {
                                                                arrayList3 = s2Var.f48181k;
                                                                if (arrayList3 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word3)) {
                                                                    TextView textView1115 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                    String string1115 = textView1115.getText().toString();
                                                                    String strSubstring1111113 = string1115.substring(0, 1);
                                                                    kotlin.jvm.internal.m.e(strSubstring1111113, "substring(...)");
                                                                    String upperCase1115 = strSubstring1111113.toUpperCase(bq.m.p());
                                                                    kotlin.jvm.internal.m.e(upperCase1115, "toUpperCase(...)");
                                                                    String strSubstring1111114 = string1115.substring(1);
                                                                    kotlin.jvm.internal.m.e(strSubstring1111114, "substring(...)");
                                                                    textView1115.setText(upperCase1115.concat(strSubstring1111114));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                arrayList6 = s2Var.f48181k;
                                                if (arrayList6 != null) {
                                                    kotlin.jvm.internal.m.n("stemList");
                                                    throw null;
                                                }
                                                word4 = ((Word) arrayList6.get(arrayList6.size() - 1)).getWord();
                                                kotlin.jvm.internal.m.e(word4, "getWord(...)");
                                                if (com.bumptech.glide.d.s(word4)) {
                                                    TextView textView1116 = (TextView) v13.findViewById(R.id.tv_middle);
                                                    String string1116 = textView1116.getText().toString();
                                                    String strSubstring124 = string1116.substring(0, 1);
                                                    kotlin.jvm.internal.m.e(strSubstring124, "substring(...)");
                                                    String upperCase1116 = strSubstring124.toUpperCase(bq.m.p());
                                                    kotlin.jvm.internal.m.e(upperCase1116, "toUpperCase(...)");
                                                    String strSubstring125 = string1116.substring(1);
                                                    kotlin.jvm.internal.m.e(strSubstring125, "substring(...)");
                                                    textView1116.setText(upperCase1116.concat(strSubstring125));
                                                } else {
                                                    aVar3 = s2Var.f47886f;
                                                    kotlin.jvm.internal.m.c(aVar3);
                                                    if (((hj.a2) aVar3).f32335c.indexOfChild(view) > i11) {
                                                        ta.a aVar111112 = s2Var.f47886f;
                                                        kotlin.jvm.internal.m.c(aVar111112);
                                                        iIndexOfChild = (((hj.a2) aVar111112).f32335c.indexOfChild(view) - i11) - 1;
                                                        arrayList = s2Var.f48181k;
                                                        if (arrayList != null) {
                                                            kotlin.jvm.internal.m.n("stemList");
                                                            throw null;
                                                        }
                                                        Word word113 = (Word) arrayList.get(iIndexOfChild);
                                                        word = word113.getWord();
                                                        kotlin.jvm.internal.m.e(word, "getWord(...)");
                                                        if (com.bumptech.glide.d.s(word)) {
                                                            aVar4 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar4);
                                                            if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                ta.a aVar111113 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar111113);
                                                                iIndexOfChild2 = (((hj.a2) aVar111113).f32335c.indexOfChild(view) - i11) - 2;
                                                                arrayList2 = s2Var.f48181k;
                                                                if (arrayList2 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word2)) {
                                                                    arrayList3 = s2Var.f48181k;
                                                                    if (arrayList3 != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                    kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word3)) {
                                                                        TextView textView1117 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                        String string1117 = textView1117.getText().toString();
                                                                        String strSubstring1111115 = string1117.substring(0, 1);
                                                                        kotlin.jvm.internal.m.e(strSubstring1111115, "substring(...)");
                                                                        String upperCase1117 = strSubstring1111115.toUpperCase(bq.m.p());
                                                                        kotlin.jvm.internal.m.e(upperCase1117, "toUpperCase(...)");
                                                                        String strSubstring1111116 = string1117.substring(1);
                                                                        kotlin.jvm.internal.m.e(strSubstring1111116, "substring(...)");
                                                                        textView1117.setText(upperCase1117.concat(strSubstring1111116));
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            aVar4 = s2Var.f47886f;
                                                            kotlin.jvm.internal.m.c(aVar4);
                                                            if (((hj.a2) aVar4).f32335c.indexOfChild(view) > i12) {
                                                                ta.a aVar111114 = s2Var.f47886f;
                                                                kotlin.jvm.internal.m.c(aVar111114);
                                                                iIndexOfChild2 = (((hj.a2) aVar111114).f32335c.indexOfChild(view) - i11) - 2;
                                                                arrayList2 = s2Var.f48181k;
                                                                if (arrayList2 != null) {
                                                                    kotlin.jvm.internal.m.n("stemList");
                                                                    throw null;
                                                                }
                                                                word2 = ((Word) arrayList2.get(iIndexOfChild2)).getWord();
                                                                kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                                                if (com.bumptech.glide.d.s(word2)) {
                                                                    arrayList3 = s2Var.f48181k;
                                                                    if (arrayList3 != null) {
                                                                        kotlin.jvm.internal.m.n("stemList");
                                                                        throw null;
                                                                    }
                                                                    word3 = ((Word) arrayList3.get(arrayList3.size() - 1)).getWord();
                                                                    kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                                                    if (com.bumptech.glide.d.s(word3)) {
                                                                        TextView textView1118 = (TextView) v13.findViewById(R.id.tv_middle);
                                                                        String string1118 = textView1118.getText().toString();
                                                                        String strSubstring1111117 = string1118.substring(0, 1);
                                                                        kotlin.jvm.internal.m.e(strSubstring1111117, "substring(...)");
                                                                        String upperCase1118 = strSubstring1111117.toUpperCase(bq.m.p());
                                                                        kotlin.jvm.internal.m.e(upperCase1118, "toUpperCase(...)");
                                                                        String strSubstring1111118 = string1118.substring(1);
                                                                        kotlin.jvm.internal.m.e(strSubstring1111118, "substring(...)");
                                                                        textView1118.setText(upperCase1118.concat(strSubstring1111118));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        v13.postDelayed(new b2.c(4, v13, new qp.m2(s2Var, v13, iArr, iArr2)), 0L);
                    }
                }
                return qy.b0.f48488a;
            case 12:
                v2 v2Var = (v2) this.f45801b;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ((jp.p0) v2Var.f47881a).I(v2Var.b());
                return qy.b0.f48488a;
            case 13:
                x3 x3Var = (x3) this.f45801b;
                View v14 = (View) obj;
                kotlin.jvm.internal.m.f(v14, "v");
                View view4 = (View) x3Var.f47818j;
                mp.b bVar3 = x3Var.f47881a;
                if (view4 != null) {
                    x3Var.r(view4);
                }
                x3Var.f47818j = v14;
                if (x3Var.f47884d.isAudioModel) {
                    int[] iArr5 = bq.r.f4959a;
                    if (bq.m.F()) {
                        p0Var = (jp.p0) bVar3;
                        if (!p0Var.Q) {
                            Object tag3 = v14.getTag();
                            kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                            p0Var.I(x3Var.u((Word) tag3));
                        }
                    } else {
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        if (ry.l.D(new Integer[]{51, 55, 57, 61, 63, 65}, Integer.valueOf(cf.x.n().keyLanguage))) {
                            p0Var = (jp.p0) bVar3;
                            if (!p0Var.Q) {
                                Object tag4 = v14.getTag();
                                kotlin.jvm.internal.m.d(tag4, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                p0Var.I(x3Var.u((Word) tag4));
                            }
                        }
                    }
                }
                x3Var.s(v14);
                ((jp.p0) bVar3).O(4);
                return qy.b0.f48488a;
            case 14:
                n4 n4Var = (n4) this.f45801b;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ta.a aVar20 = n4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar20);
                ((SlowPlaySwitchBtn) ((a3) aVar20).f32338b.f32490c).c();
                ta.a aVar21 = n4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar21);
                boolean z11 = ((SlowPlaySwitchBtn) ((a3) aVar21).f32338b.f32490c).f22150c;
                n4Var.f48084p = z11;
                Env env = n4Var.f47884d;
                env.wordModel6AudioSwitch = z11;
                env.updateEntry("wordModel6AudioSwitch");
                return qy.b0.f48488a;
            case 15:
                w4 w4Var = (w4) this.f45801b;
                View v15 = (View) obj;
                kotlin.jvm.internal.m.f(v15, "v");
                View view5 = (View) w4Var.f47818j;
                mp.b bVar4 = w4Var.f47881a;
                if (view5 != null) {
                    w4Var.r(view5);
                }
                w4Var.f47818j = v15;
                Object tag5 = v15.getTag();
                kotlin.jvm.internal.m.d(tag5, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                qy.q qVar3 = fv.b.f28186a;
                jp.p0 p0Var3 = (jp.p0) bVar4;
                p0Var3.I(fv.b.Y(((Word) tag5).getWordId(), null, null));
                w4Var.s(v15);
                p0Var3.O(4);
                return qy.b0.f48488a;
            case 16:
                ((tu.j) this.f45801b).a(new tu.d(((Integer) obj).intValue()));
                return qy.b0.f48488a;
            case 17:
                rq.i iVar = (rq.i) this.f45801b;
                kotlin.jvm.internal.m.f((View) obj, "it");
                mp.b bVar5 = iVar.f49357a;
                qy.q qVar4 = fv.b.f28186a;
                String strA = iVar.f49389n.a(iVar.f49358b.f46983a);
                kotlin.jvm.internal.m.e(strA, "getCharName(...)");
                String strC = fv.b.c(strA, null, null);
                ta.a aVar22 = iVar.f49363g;
                kotlin.jvm.internal.m.c(aVar22);
                ((jp.p0) bVar5).H((ImageView) ((hj.y1) aVar22).f33612b.f32408d, strC);
                return qy.b0.f48488a;
            case 18:
                ((rt.j) this.f45801b).Z = (String) obj;
                return qy.b0.f48488a;
            case 19:
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f45801b;
                SRSStatus it2 = (SRSStatus) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return Boolean.valueOf(it2.isExcludedFromReview() || linkedHashSet2.contains(it2.getId()));
            case 20:
                ZoneId zoneId = (ZoneId) this.f45801b;
                SRSStatus it3 = (SRSStatus) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return SRSStatusScheduleKt.scheduledDate(it3, zoneId);
            case 21:
                d5 d5Var = (d5) this.f45801b;
                SRSStatus review = (SRSStatus) obj;
                kotlin.jvm.internal.m.f(review, "review");
                return new u4(d5Var.f49613a, d5Var.f49615c, review);
            case 22:
                y4 y4Var = (y4) this.f45801b;
                x4 it4 = (x4) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                return x4.a(it4, null, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO, y4Var, false, null, false, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4079);
            case 23:
                s4 s4Var = (s4) this.f45801b;
                x4 settings = (x4) obj;
                kotlin.jvm.internal.m.f(settings, "settings");
                return x4.a(settings, null, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, false, s4Var, false, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4031);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                r4 r4Var = (r4) this.f45801b;
                x4 it5 = (x4) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                return x4.a(it5, r4Var, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, false, null, false, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4094);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                x8 x8Var = (x8) this.f45801b;
                j6 it6 = (j6) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                return ry.m.g0(it6.a(x8Var));
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(((Map.Entry) obj).getValue(), ((h8) this.f45801b).f49836a));
            case 27:
                u8 u8Var = (u8) this.f45801b;
                kotlin.jvm.internal.m.f((u8) obj, "it");
                return u8Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return obj == ((ry.a) this.f45801b) ? "(this Collection)" : String.valueOf(obj);
            default:
                ry.f fVar2 = (ry.f) this.f45801b;
                Map.Entry it7 = (Map.Entry) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                StringBuilder sb2 = new StringBuilder();
                Object key = it7.getKey();
                sb2.append(key == fVar2 ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = it7.getValue();
                sb2.append(value != fVar2 ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
        }
    }
}
