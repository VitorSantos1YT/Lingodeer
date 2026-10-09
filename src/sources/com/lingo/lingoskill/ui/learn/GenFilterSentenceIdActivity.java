package com.lingo.lingoskill.ui.learn;

import android.os.Bundle;
import bq.z;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import gr.s;
import hj.u;
import j9.a0;
import ji.b;
import jp.e1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class GenFilterSentenceIdActivity extends b {
    public static final /* synthetic */ int Q = 0;
    public final String P;

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Illegal instructions before constructor call */
    public GenFilterSentenceIdActivity() {
        e1 e1Var = e1.f36466a;
        String str = BuildConfig.VERSION_NAME;
        super(BuildConfig.VERSION_NAME, e1Var);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 == 1) {
            str = "30, 1986, 2084, 2186, 2187, 2201, 2204, 2674, 2679, 131, 1987, 2168, 2578, 2585, 2596, 132, 287, 2579, 2584, 2595, 2615, 2676, 133, 2189, 2580, 2583, 2590, 2616, 134, 437, 1990, 2411, 2581, 2582, 144, 145, 2591, 146, 147, 2045, 2064, 148";
        } else if (i11 == 2) {
            str = "131, 132, 133, 134, 135, 136, 139, 140, 143, 144, 145, 146, 147, 153, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 183, 184, 185, 186, 187, 188, 189, 194";
        } else if (i11 != 4) {
            if (i11 != 47 && i11 != 48) {
                switch (i11) {
                    case 12:
                        str = "446, 523, 719, 1078, 1126, 1585, 485, 1128, 50, 823, 1309, 1332, 1503, 1514, 1545, 1548, 1806, 1509, 1587";
                        break;
                    case 13:
                        str = "62, 110, 482, 542, 572, 774, 1053, 1105, 13591499, 1519, 1563, 1566, 1718, 1737";
                        break;
                    case 14:
                        str = "34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 158, 159, 160, 161, 164, 900, 796, 807, 797, 1105, 165, 802, 166, 804, 894, 167, 799, 277, 226, 905";
                        break;
                }
            } else {
                str = "96, 97, 98, 99, 102, 103, 104, 108, 109, 110, 111, 240, 241, 242, 246, 247, 248, 249, 251, 1602, 252, 253, 1567, 1504, 260, 1560, 254, 1577, 1750, 294, 295, 1564";
            }
        } else {
            str = "34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 158, 159, 160, 161, 164, 900, 796, 807, 797, 1105, 165, 802, 166, 804, 894, 167, 799, 277, 226, 905";
        }
        this.P = str;
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        z.b(((u) j()).f33369c, new s(this, 19));
        z.b(((u) j()).f33368b, new a0(this));
    }
}
