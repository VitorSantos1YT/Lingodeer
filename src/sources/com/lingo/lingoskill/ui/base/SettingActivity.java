package com.lingo.lingoskill.ui.base;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import bp.c5;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import fr.o0;
import hh.p0;
import ji.b;
import kotlin.jvm.internal.m;
import l.a;
import pi.e;
import yj.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SettingActivity extends b {
    public SettingActivity() {
        super(BuildConfig.VERSION_NAME, c5.f4526a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
    @Override // ji.b
    public final void r(Bundle bundle) {
        String string = getString(R.string.settings);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        int i11 = ((o0) l()).f27733a.keyLanguage;
        if (i11 != 40) {
            if (i11 == 57) {
                h.A(this, new ro.b());
                return;
            }
            if (i11 == 61) {
                h.A(this, new jl.b());
                return;
            }
            if (i11 == 63) {
                h.A(this, new xp.b());
                return;
            }
            if (i11 == 65) {
                h.A(this, new dl.b());
                return;
            }
            if (i11 == 69) {
                h.A(this, new in.b());
                return;
            }
            switch (i11) {
                case 0:
                    h.A(this, new e());
                    break;
                case 1:
                    h.A(this, new em.a());
                    break;
                case 2:
                    h.A(this, new ym.a());
                    break;
                case 3:
                    h.A(this, new c());
                    break;
                case 4:
                    h.A(this, new fk.b());
                    break;
                case 5:
                    h.A(this, new sk.a());
                    break;
                case 6:
                    h.A(this, new mj.a());
                    break;
                case 7:
                    h.A(this, new iq.a());
                    break;
                case 8:
                    h.A(this, new sn.a());
                    break;
                default:
                    switch (i11) {
                        case 10:
                        case 22:
                            h.A(this, new bo.a());
                            break;
                        case 11:
                            h.A(this, new e());
                            break;
                        case 12:
                            h.A(this, new em.a());
                            break;
                        case 13:
                            h.A(this, new ym.a());
                            break;
                        case 14:
                            h.A(this, new fk.b());
                            break;
                        case 15:
                            h.A(this, new sk.a());
                            break;
                        case 16:
                            h.A(this, new mj.a());
                            break;
                        case 17:
                            h.A(this, new sn.a());
                            break;
                        case 18:
                            h.A(this, new tl.b());
                            break;
                        case 19:
                            h.A(this, new nn.b());
                            break;
                        case 20:
                            break;
                        case 21:
                            h.A(this, new wo.b());
                            break;
                        default:
                            switch (i11) {
                                case 47:
                                case 48:
                                    h.A(this, new mk.a());
                                    break;
                                case 49:
                                case 50:
                                    h.A(this, new uj.a());
                                    break;
                                case 51:
                                    break;
                                default:
                                    switch (i11) {
                                        case 53:
                                        case 54:
                                            h.A(this, new zk.a());
                                            break;
                                    }
                                    break;
                            }
                            h.A(this, new xh.a());
                            break;
                    }
                    break;
            }
            return;
        }
        h.A(this, new yl.a());
    }
}
