package bp;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.AckDao;
import com.lingo.lingoskill.object.AckFav;
import com.lingo.lingoskill.object.AckFavDao;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.Model_Sentence_010;
import com.lingo.lingoskill.object.Model_Sentence_010Dao;
import com.lingo.lingoskill.object.Model_Sentence_020;
import com.lingo.lingoskill.object.Model_Sentence_020Dao;
import com.lingo.lingoskill.object.Model_Sentence_030;
import com.lingo.lingoskill.object.Model_Sentence_030Dao;
import com.lingo.lingoskill.object.Model_Sentence_040;
import com.lingo.lingoskill.object.Model_Sentence_040Dao;
import com.lingo.lingoskill.object.Model_Sentence_050;
import com.lingo.lingoskill.object.Model_Sentence_050Dao;
import com.lingo.lingoskill.object.Model_Sentence_060;
import com.lingo.lingoskill.object.Model_Sentence_060Dao;
import com.lingo.lingoskill.object.Model_Sentence_070;
import com.lingo.lingoskill.object.Model_Sentence_070Dao;
import com.lingo.lingoskill.object.Model_Sentence_080;
import com.lingo.lingoskill.object.Model_Sentence_080Dao;
import com.lingo.lingoskill.object.Model_Sentence_100;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Model_Word_010Dao;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.PdWordDao;
import com.lingo.lingoskill.object.PdWordFav;
import com.lingo.lingoskill.object.ScFav;
import com.lingo.lingoskill.object.ScFavNew;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.base.PicTestIndexActivity;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingo.lingoskill.ui.review.AckCardActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4577a;

    public /* synthetic */ g(int i11) {
        this.f4577a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:102:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:104:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:106:0x0400  */
    /* JADX WARN: Code duplicated, block: B:23:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:25:0x0111  */
    /* JADX WARN: Code duplicated, block: B:27:0x0120  */
    /* JADX WARN: Code duplicated, block: B:29:0x0133  */
    /* JADX WARN: Code duplicated, block: B:30:0x0137  */
    /* JADX WARN: Code duplicated, block: B:33:0x015c  */
    /* JADX WARN: Code duplicated, block: B:35:0x016e  */
    /* JADX WARN: Code duplicated, block: B:37:0x017b  */
    /* JADX WARN: Code duplicated, block: B:39:0x018e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0190  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0208  */
    /* JADX WARN: Code duplicated, block: B:52:0x020a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0228  */
    /* JADX WARN: Code duplicated, block: B:56:0x022a  */
    /* JADX WARN: Code duplicated, block: B:60:0x024f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0270  */
    /* JADX WARN: Code duplicated, block: B:64:0x027e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0291  */
    /* JADX WARN: Code duplicated, block: B:67:0x0295  */
    /* JADX WARN: Code duplicated, block: B:70:0x02be  */
    /* JADX WARN: Code duplicated, block: B:72:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x02da  */
    /* JADX WARN: Code duplicated, block: B:76:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0316  */
    /* JADX WARN: Code duplicated, block: B:83:0x0326  */
    /* JADX WARN: Code duplicated, block: B:85:0x0339  */
    /* JADX WARN: Code duplicated, block: B:87:0x033e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0368  */
    /* JADX WARN: Code duplicated, block: B:92:0x0373  */
    /* JADX WARN: Code duplicated, block: B:94:0x0386  */
    /* JADX WARN: Code duplicated, block: B:95:0x0389  */
    /* JADX WARN: Code duplicated, block: B:97:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:99:0x03b9  */
    private final Object a() throws IOException {
        File file;
        String str;
        String str2;
        String str3;
        File file2;
        File file3;
        e00.i iVar;
        String name;
        String str4;
        String name2;
        String name3;
        String name4;
        String str5;
        String str6;
        String name5;
        String name6;
        String str7;
        String str8;
        String name7;
        String str9;
        String name8;
        String str10;
        String name9;
        String str11;
        Pattern patternCompile;
        String string;
        String str12;
        String str13;
        String name10;
        String str14;
        String name11;
        String str15;
        File file4 = new File(defpackage.e.m(xt.b.a().e(), "main/"));
        File file5 = new File(defpackage.e.m(xt.b.a().e(), "story/"));
        new File(se.i.p()).mkdirs();
        new File(se.i.o()).mkdirs();
        new File(se.i.q()).mkdirs();
        new File(se.i.r()).mkdirs();
        new File(se.i.s()).mkdirs();
        String str16 = "_";
        String str17 = "f";
        String str18 = "m";
        boolean z11 = false;
        if (file4.isDirectory()) {
            File[] fileArrListFiles = file4.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                file = file5;
                str = "_";
                str2 = "f";
                str3 = "m";
            } else {
                e00.i iVarA = kotlin.jvm.internal.l.a(fileArrListFiles);
                while (iVarA.hasNext()) {
                    File file6 = (File) iVarA.next();
                    file6.getAbsolutePath();
                    String name12 = file6.getName();
                    kotlin.jvm.internal.m.e(name12, "getName(...)");
                    if (oz.x.k0(name12, ".mp3", z11)) {
                        String name13 = file6.getName();
                        kotlin.jvm.internal.m.e(name13, "getName(...)");
                        if (oz.q.v0(name13, "-s-", z11)) {
                            String strP = se.i.p();
                            File file7 = file4;
                            String name14 = file6.getName();
                            kotlin.jvm.internal.m.e(name14, "getName(...)");
                            e00.i iVar2 = iVarA;
                            file6.renameTo(new File(strP, oz.x.q0(name14, "-s-", "-" + (se.i.v() ? str18 : str17) + "-s-")));
                            file4 = file7;
                            file5 = file5;
                            iVarA = iVar2;
                        } else {
                            file2 = file4;
                            file3 = file5;
                            iVar = iVarA;
                            name = file6.getName();
                            kotlin.jvm.internal.m.e(name, "getName(...)");
                            if (oz.x.k0(name, ".mp3", false)) {
                                name11 = file6.getName();
                                kotlin.jvm.internal.m.e(name11, "getName(...)");
                                if (oz.q.v0(name11, "-w-", false)) {
                                    String strP2 = se.i.p();
                                    String name15 = file6.getName();
                                    kotlin.jvm.internal.m.e(name15, "getName(...)");
                                    if (se.i.v()) {
                                        str4 = str17;
                                        str15 = str18;
                                    } else {
                                        str15 = str17;
                                        str4 = str15;
                                    }
                                    file6.renameTo(new File(strP2, oz.x.q0(name15, "-w-", "-" + str15 + "-w-")));
                                } else {
                                    str4 = str17;
                                    name2 = file6.getName();
                                    kotlin.jvm.internal.m.e(name2, "getName(...)");
                                    if (oz.x.k0(name2, ".mp3", false)) {
                                        name10 = file6.getName();
                                        kotlin.jvm.internal.m.e(name10, "getName(...)");
                                        if (oz.q.v0(name10, "-zy-", false)) {
                                            String strO = se.i.o();
                                            String name16 = file6.getName();
                                            kotlin.jvm.internal.m.e(name16, "getName(...)");
                                            if (se.i.u()) {
                                                str14 = str18;
                                            } else {
                                                str14 = str4;
                                            }
                                            file6.renameTo(new File(strO, oz.x.q0(name16, "-zy-", "-" + str14 + "-zy-")));
                                        } else {
                                            name3 = file6.getName();
                                            kotlin.jvm.internal.m.e(name3, "getName(...)");
                                            if (oz.x.k0(name3, ".zip", false)) {
                                                int[] iArr = bq.r.f4959a;
                                                String name17 = file6.getName();
                                                kotlin.jvm.internal.m.e(name17, "getName(...)");
                                                String strQ0 = oz.x.q0(name17, ".zip", BuildConfig.VERSION_NAME);
                                                patternCompile = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
                                                try {
                                                    string = new BigDecimal(strQ0).toString();
                                                    kotlin.jvm.internal.m.e(string, "toString(...)");
                                                    if (!patternCompile.matcher(string).matches()) {
                                                        new File(se.i.q(), ep.a.e("lesson_png_", file6.getName())).createNewFile();
                                                        String strP3 = se.i.p();
                                                        if (se.i.v()) {
                                                            str12 = str18;
                                                        } else {
                                                            str12 = str4;
                                                        }
                                                        new File(strP3, defpackage.e.n("lesson_", str12, str16, file6.getName())).createNewFile();
                                                        String strO2 = se.i.o();
                                                        if (se.i.v()) {
                                                            str13 = str18;
                                                        } else {
                                                            str13 = str4;
                                                        }
                                                        new File(strO2, defpackage.e.n("alpha_", str13, str16, file6.getName())).createNewFile();
                                                        file6.delete();
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                            name4 = file6.getName();
                                            kotlin.jvm.internal.m.e(name4, "getName(...)");
                                            if (oz.x.k0(name4, ".zip", false)) {
                                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                                if (ry.l.D(new Integer[]{0, 7}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                                    name9 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name9, "getName(...)");
                                                    if (oz.q.v0(name9, "-zy-", false)) {
                                                        String strO3 = se.i.o();
                                                        String name18 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name18, "getName(...)");
                                                        if (se.i.u()) {
                                                            str11 = str18;
                                                            str6 = str11;
                                                        } else {
                                                            str6 = str18;
                                                            str11 = str4;
                                                        }
                                                        file6.renameTo(new File(strO3, oz.x.q0(name18, "-zy-", "-" + str11 + "-zy-lesson-")));
                                                    } else {
                                                        str6 = str18;
                                                        if (cf.x.n().keyLanguage == 7) {
                                                            name8 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                            if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                                String strO4 = se.i.o();
                                                                String name19 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name19, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str10 = str6;
                                                                } else {
                                                                    str10 = str4;
                                                                }
                                                                file6.renameTo(new File(strO4, oz.x.q0(name19, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                            }
                                                        }
                                                        if (cf.x.n().keyLanguage == 7) {
                                                            name7 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                            if (oz.q.v0(name7, "vt-vt-", false)) {
                                                                String strO5 = se.i.o();
                                                                String name20 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name20, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str9 = str6;
                                                                } else {
                                                                    str9 = str4;
                                                                }
                                                                str5 = str16;
                                                                file6.renameTo(new File(strO5, oz.x.q0(name20, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                            } else {
                                                                str5 = str16;
                                                                if (cf.x.n().keyLanguage == 2) {
                                                                    String strO6 = se.i.o();
                                                                    String name21 = file6.getName();
                                                                    kotlin.jvm.internal.m.e(name21, "getName(...)");
                                                                    if (se.i.u()) {
                                                                        str8 = str6;
                                                                    } else {
                                                                        str8 = str4;
                                                                    }
                                                                    file6.renameTo(new File(strO6, oz.x.q0(name21, "-zy", "-" + str8 + "-zy-table")));
                                                                } else {
                                                                    name6 = file6.getName();
                                                                    kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                                    if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                        String strO7 = se.i.o();
                                                                        String name22 = file6.getName();
                                                                        kotlin.jvm.internal.m.e(name22, "getName(...)");
                                                                        if (se.i.u()) {
                                                                            str7 = str6;
                                                                        } else {
                                                                            str7 = str4;
                                                                        }
                                                                        file6.renameTo(new File(strO7, oz.x.q0(name22, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            str5 = str16;
                                                            if (cf.x.n().keyLanguage == 2) {
                                                                String strO8 = se.i.o();
                                                                String name23 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name23, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str8 = str6;
                                                                } else {
                                                                    str8 = str4;
                                                                }
                                                                file6.renameTo(new File(strO8, oz.x.q0(name23, "-zy", "-" + str8 + "-zy-table")));
                                                            } else {
                                                                name6 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                                if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                    String strO9 = se.i.o();
                                                                    String name24 = file6.getName();
                                                                    kotlin.jvm.internal.m.e(name24, "getName(...)");
                                                                    if (se.i.u()) {
                                                                        str7 = str6;
                                                                    } else {
                                                                        str7 = str4;
                                                                    }
                                                                    file6.renameTo(new File(strO9, oz.x.q0(name24, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    file4 = file2;
                                                    file5 = file3;
                                                    iVarA = iVar;
                                                    str17 = str4;
                                                    str18 = str6;
                                                } else {
                                                    str6 = str18;
                                                    if (cf.x.n().keyLanguage == 7) {
                                                        name8 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                        if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                            String strO10 = se.i.o();
                                                            String name110 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name110, "getName(...)");
                                                            if (se.i.u()) {
                                                                str10 = str6;
                                                            } else {
                                                                str10 = str4;
                                                            }
                                                            file6.renameTo(new File(strO10, oz.x.q0(name110, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                            file4 = file2;
                                                            file5 = file3;
                                                            iVarA = iVar;
                                                            str17 = str4;
                                                            str18 = str6;
                                                        }
                                                    }
                                                    if (cf.x.n().keyLanguage == 7) {
                                                        name7 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                        if (oz.q.v0(name7, "vt-vt-", false)) {
                                                            String strO11 = se.i.o();
                                                            String name25 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name25, "getName(...)");
                                                            if (se.i.u()) {
                                                                str9 = str6;
                                                            } else {
                                                                str9 = str4;
                                                            }
                                                            str5 = str16;
                                                            file6.renameTo(new File(strO11, oz.x.q0(name25, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                        } else {
                                                            str5 = str16;
                                                            if (cf.x.n().keyLanguage == 2) {
                                                                String strO12 = se.i.o();
                                                                String name26 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name26, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str8 = str6;
                                                                } else {
                                                                    str8 = str4;
                                                                }
                                                                file6.renameTo(new File(strO12, oz.x.q0(name26, "-zy", "-" + str8 + "-zy-table")));
                                                            } else {
                                                                name6 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                                if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                    String strO13 = se.i.o();
                                                                    String name27 = file6.getName();
                                                                    kotlin.jvm.internal.m.e(name27, "getName(...)");
                                                                    if (se.i.u()) {
                                                                        str7 = str6;
                                                                    } else {
                                                                        str7 = str4;
                                                                    }
                                                                    file6.renameTo(new File(strO13, oz.x.q0(name27, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        str5 = str16;
                                                        if (cf.x.n().keyLanguage == 2) {
                                                            String strO14 = se.i.o();
                                                            String name28 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name28, "getName(...)");
                                                            if (se.i.u()) {
                                                                str8 = str6;
                                                            } else {
                                                                str8 = str4;
                                                            }
                                                            file6.renameTo(new File(strO14, oz.x.q0(name28, "-zy", "-" + str8 + "-zy-table")));
                                                        } else {
                                                            name6 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                            if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                String strO15 = se.i.o();
                                                                String name29 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name29, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str7 = str6;
                                                                } else {
                                                                    str7 = str4;
                                                                }
                                                                file6.renameTo(new File(strO15, oz.x.q0(name29, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                str5 = str16;
                                                str6 = str18;
                                                name5 = file6.getName();
                                                kotlin.jvm.internal.m.e(name5, "getName(...)");
                                                if (oz.x.k0(name5, ".png", false)) {
                                                    file6.renameTo(new File(se.i.q(), file6.getName()));
                                                }
                                            }
                                            file4 = file2;
                                            file5 = file3;
                                            iVarA = iVar;
                                            str17 = str4;
                                            str18 = str6;
                                            str16 = str5;
                                        }
                                    } else {
                                        name3 = file6.getName();
                                        kotlin.jvm.internal.m.e(name3, "getName(...)");
                                        if (oz.x.k0(name3, ".zip", false)) {
                                            int[] iArr2 = bq.r.f4959a;
                                            String name111 = file6.getName();
                                            kotlin.jvm.internal.m.e(name111, "getName(...)");
                                            String strQ1 = oz.x.q0(name111, ".zip", BuildConfig.VERSION_NAME);
                                            patternCompile = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
                                            string = new BigDecimal(strQ1).toString();
                                            kotlin.jvm.internal.m.e(string, "toString(...)");
                                            if (!patternCompile.matcher(string).matches()) {
                                                new File(se.i.q(), ep.a.e("lesson_png_", file6.getName())).createNewFile();
                                                String strP4 = se.i.p();
                                                if (se.i.v()) {
                                                    str12 = str18;
                                                } else {
                                                    str12 = str4;
                                                }
                                                new File(strP4, defpackage.e.n("lesson_", str12, str16, file6.getName())).createNewFile();
                                                String strO16 = se.i.o();
                                                if (se.i.v()) {
                                                    str13 = str18;
                                                } else {
                                                    str13 = str4;
                                                }
                                                new File(strO16, defpackage.e.n("alpha_", str13, str16, file6.getName())).createNewFile();
                                                file6.delete();
                                            }
                                        }
                                        name4 = file6.getName();
                                        kotlin.jvm.internal.m.e(name4, "getName(...)");
                                        if (oz.x.k0(name4, ".zip", false)) {
                                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                            if (ry.l.D(new Integer[]{0, 7}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                                name9 = file6.getName();
                                                kotlin.jvm.internal.m.e(name9, "getName(...)");
                                                if (oz.q.v0(name9, "-zy-", false)) {
                                                    String strO17 = se.i.o();
                                                    String name112 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name112, "getName(...)");
                                                    if (se.i.u()) {
                                                        str11 = str18;
                                                        str6 = str11;
                                                    } else {
                                                        str6 = str18;
                                                        str11 = str4;
                                                    }
                                                    file6.renameTo(new File(strO17, oz.x.q0(name112, "-zy-", "-" + str11 + "-zy-lesson-")));
                                                } else {
                                                    str6 = str18;
                                                    if (cf.x.n().keyLanguage == 7) {
                                                        name8 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                        if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                            String strO18 = se.i.o();
                                                            String name113 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name113, "getName(...)");
                                                            if (se.i.u()) {
                                                                str10 = str6;
                                                            } else {
                                                                str10 = str4;
                                                            }
                                                            file6.renameTo(new File(strO18, oz.x.q0(name113, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                        }
                                                    }
                                                    if (cf.x.n().keyLanguage == 7) {
                                                        name7 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                        if (oz.q.v0(name7, "vt-vt-", false)) {
                                                            String strO19 = se.i.o();
                                                            String name210 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name210, "getName(...)");
                                                            if (se.i.u()) {
                                                                str9 = str6;
                                                            } else {
                                                                str9 = str4;
                                                            }
                                                            str5 = str16;
                                                            file6.renameTo(new File(strO19, oz.x.q0(name210, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                        } else {
                                                            str5 = str16;
                                                            if (cf.x.n().keyLanguage == 2) {
                                                                String strO110 = se.i.o();
                                                                String name211 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name211, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str8 = str6;
                                                                } else {
                                                                    str8 = str4;
                                                                }
                                                                file6.renameTo(new File(strO110, oz.x.q0(name211, "-zy", "-" + str8 + "-zy-table")));
                                                            } else {
                                                                name6 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                                if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                    String strO111 = se.i.o();
                                                                    String name212 = file6.getName();
                                                                    kotlin.jvm.internal.m.e(name212, "getName(...)");
                                                                    if (se.i.u()) {
                                                                        str7 = str6;
                                                                    } else {
                                                                        str7 = str4;
                                                                    }
                                                                    file6.renameTo(new File(strO111, oz.x.q0(name212, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        str5 = str16;
                                                        if (cf.x.n().keyLanguage == 2) {
                                                            String strO112 = se.i.o();
                                                            String name213 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name213, "getName(...)");
                                                            if (se.i.u()) {
                                                                str8 = str6;
                                                            } else {
                                                                str8 = str4;
                                                            }
                                                            file6.renameTo(new File(strO112, oz.x.q0(name213, "-zy", "-" + str8 + "-zy-table")));
                                                        } else {
                                                            name6 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                            if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                String strO113 = se.i.o();
                                                                String name214 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name214, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str7 = str6;
                                                                } else {
                                                                    str7 = str4;
                                                                }
                                                                file6.renameTo(new File(strO113, oz.x.q0(name214, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                            }
                                                        }
                                                    }
                                                }
                                                file4 = file2;
                                                file5 = file3;
                                                iVarA = iVar;
                                                str17 = str4;
                                                str18 = str6;
                                            } else {
                                                str6 = str18;
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name8 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                    if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                        String strO114 = se.i.o();
                                                        String name114 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name114, "getName(...)");
                                                        if (se.i.u()) {
                                                            str10 = str6;
                                                        } else {
                                                            str10 = str4;
                                                        }
                                                        file6.renameTo(new File(strO114, oz.x.q0(name114, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                        file4 = file2;
                                                        file5 = file3;
                                                        iVarA = iVar;
                                                        str17 = str4;
                                                        str18 = str6;
                                                    }
                                                }
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name7 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                    if (oz.q.v0(name7, "vt-vt-", false)) {
                                                        String strO115 = se.i.o();
                                                        String name215 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name215, "getName(...)");
                                                        if (se.i.u()) {
                                                            str9 = str6;
                                                        } else {
                                                            str9 = str4;
                                                        }
                                                        str5 = str16;
                                                        file6.renameTo(new File(strO115, oz.x.q0(name215, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                    } else {
                                                        str5 = str16;
                                                        if (cf.x.n().keyLanguage == 2) {
                                                            String strO116 = se.i.o();
                                                            String name216 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name216, "getName(...)");
                                                            if (se.i.u()) {
                                                                str8 = str6;
                                                            } else {
                                                                str8 = str4;
                                                            }
                                                            file6.renameTo(new File(strO116, oz.x.q0(name216, "-zy", "-" + str8 + "-zy-table")));
                                                        } else {
                                                            name6 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                            if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                String strO117 = se.i.o();
                                                                String name217 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name217, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str7 = str6;
                                                                } else {
                                                                    str7 = str4;
                                                                }
                                                                file6.renameTo(new File(strO117, oz.x.q0(name217, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str5 = str16;
                                                    if (cf.x.n().keyLanguage == 2) {
                                                        String strO118 = se.i.o();
                                                        String name218 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name218, "getName(...)");
                                                        if (se.i.u()) {
                                                            str8 = str6;
                                                        } else {
                                                            str8 = str4;
                                                        }
                                                        file6.renameTo(new File(strO118, oz.x.q0(name218, "-zy", "-" + str8 + "-zy-table")));
                                                    } else {
                                                        name6 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                        if (oz.q.v0(name6, "-zy.zip", false)) {
                                                            String strO119 = se.i.o();
                                                            String name219 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name219, "getName(...)");
                                                            if (se.i.u()) {
                                                                str7 = str6;
                                                            } else {
                                                                str7 = str4;
                                                            }
                                                            file6.renameTo(new File(strO119, oz.x.q0(name219, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            str5 = str16;
                                            str6 = str18;
                                            name5 = file6.getName();
                                            kotlin.jvm.internal.m.e(name5, "getName(...)");
                                            if (oz.x.k0(name5, ".png", false)) {
                                                file6.renameTo(new File(se.i.q(), file6.getName()));
                                            }
                                        }
                                        file4 = file2;
                                        file5 = file3;
                                        iVarA = iVar;
                                        str17 = str4;
                                        str18 = str6;
                                        str16 = str5;
                                    }
                                }
                                file4 = file2;
                                file5 = file3;
                                iVarA = iVar;
                                str17 = str4;
                            } else {
                                str4 = str17;
                                name2 = file6.getName();
                                kotlin.jvm.internal.m.e(name2, "getName(...)");
                                if (oz.x.k0(name2, ".mp3", false)) {
                                    name10 = file6.getName();
                                    kotlin.jvm.internal.m.e(name10, "getName(...)");
                                    if (oz.q.v0(name10, "-zy-", false)) {
                                        String strO20 = se.i.o();
                                        String name115 = file6.getName();
                                        kotlin.jvm.internal.m.e(name115, "getName(...)");
                                        if (se.i.u()) {
                                            str14 = str18;
                                        } else {
                                            str14 = str4;
                                        }
                                        file6.renameTo(new File(strO20, oz.x.q0(name115, "-zy-", "-" + str14 + "-zy-")));
                                    } else {
                                        name3 = file6.getName();
                                        kotlin.jvm.internal.m.e(name3, "getName(...)");
                                        if (oz.x.k0(name3, ".zip", false)) {
                                            int[] iArr3 = bq.r.f4959a;
                                            String name116 = file6.getName();
                                            kotlin.jvm.internal.m.e(name116, "getName(...)");
                                            String strQ2 = oz.x.q0(name116, ".zip", BuildConfig.VERSION_NAME);
                                            patternCompile = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
                                            string = new BigDecimal(strQ2).toString();
                                            kotlin.jvm.internal.m.e(string, "toString(...)");
                                            if (!patternCompile.matcher(string).matches()) {
                                                new File(se.i.q(), ep.a.e("lesson_png_", file6.getName())).createNewFile();
                                                String strP5 = se.i.p();
                                                if (se.i.v()) {
                                                    str12 = str18;
                                                } else {
                                                    str12 = str4;
                                                }
                                                new File(strP5, defpackage.e.n("lesson_", str12, str16, file6.getName())).createNewFile();
                                                String strO120 = se.i.o();
                                                if (se.i.v()) {
                                                    str13 = str18;
                                                } else {
                                                    str13 = str4;
                                                }
                                                new File(strO120, defpackage.e.n("alpha_", str13, str16, file6.getName())).createNewFile();
                                                file6.delete();
                                            }
                                        }
                                        name4 = file6.getName();
                                        kotlin.jvm.internal.m.e(name4, "getName(...)");
                                        if (oz.x.k0(name4, ".zip", false)) {
                                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                                            if (ry.l.D(new Integer[]{0, 7}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                                name9 = file6.getName();
                                                kotlin.jvm.internal.m.e(name9, "getName(...)");
                                                if (oz.q.v0(name9, "-zy-", false)) {
                                                    String strO121 = se.i.o();
                                                    String name117 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name117, "getName(...)");
                                                    if (se.i.u()) {
                                                        str11 = str18;
                                                        str6 = str11;
                                                    } else {
                                                        str6 = str18;
                                                        str11 = str4;
                                                    }
                                                    file6.renameTo(new File(strO121, oz.x.q0(name117, "-zy-", "-" + str11 + "-zy-lesson-")));
                                                } else {
                                                    str6 = str18;
                                                    if (cf.x.n().keyLanguage == 7) {
                                                        name8 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                        if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                            String strO1110 = se.i.o();
                                                            String name118 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name118, "getName(...)");
                                                            if (se.i.u()) {
                                                                str10 = str6;
                                                            } else {
                                                                str10 = str4;
                                                            }
                                                            file6.renameTo(new File(strO1110, oz.x.q0(name118, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                        }
                                                    }
                                                    if (cf.x.n().keyLanguage == 7) {
                                                        name7 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                        if (oz.q.v0(name7, "vt-vt-", false)) {
                                                            String strO1111 = se.i.o();
                                                            String name2110 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name2110, "getName(...)");
                                                            if (se.i.u()) {
                                                                str9 = str6;
                                                            } else {
                                                                str9 = str4;
                                                            }
                                                            str5 = str16;
                                                            file6.renameTo(new File(strO1111, oz.x.q0(name2110, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                        } else {
                                                            str5 = str16;
                                                            if (cf.x.n().keyLanguage == 2) {
                                                                String strO1112 = se.i.o();
                                                                String name2111 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name2111, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str8 = str6;
                                                                } else {
                                                                    str8 = str4;
                                                                }
                                                                file6.renameTo(new File(strO1112, oz.x.q0(name2111, "-zy", "-" + str8 + "-zy-table")));
                                                            } else {
                                                                name6 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                                if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                    String strO1113 = se.i.o();
                                                                    String name2112 = file6.getName();
                                                                    kotlin.jvm.internal.m.e(name2112, "getName(...)");
                                                                    if (se.i.u()) {
                                                                        str7 = str6;
                                                                    } else {
                                                                        str7 = str4;
                                                                    }
                                                                    file6.renameTo(new File(strO1113, oz.x.q0(name2112, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        str5 = str16;
                                                        if (cf.x.n().keyLanguage == 2) {
                                                            String strO1114 = se.i.o();
                                                            String name2113 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name2113, "getName(...)");
                                                            if (se.i.u()) {
                                                                str8 = str6;
                                                            } else {
                                                                str8 = str4;
                                                            }
                                                            file6.renameTo(new File(strO1114, oz.x.q0(name2113, "-zy", "-" + str8 + "-zy-table")));
                                                        } else {
                                                            name6 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                            if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                String strO1115 = se.i.o();
                                                                String name2114 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name2114, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str7 = str6;
                                                                } else {
                                                                    str7 = str4;
                                                                }
                                                                file6.renameTo(new File(strO1115, oz.x.q0(name2114, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                            }
                                                        }
                                                    }
                                                }
                                                file4 = file2;
                                                file5 = file3;
                                                iVarA = iVar;
                                                str17 = str4;
                                                str18 = str6;
                                            } else {
                                                str6 = str18;
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name8 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                    if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                        String strO1116 = se.i.o();
                                                        String name119 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name119, "getName(...)");
                                                        if (se.i.u()) {
                                                            str10 = str6;
                                                        } else {
                                                            str10 = str4;
                                                        }
                                                        file6.renameTo(new File(strO1116, oz.x.q0(name119, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                        file4 = file2;
                                                        file5 = file3;
                                                        iVarA = iVar;
                                                        str17 = str4;
                                                        str18 = str6;
                                                    }
                                                }
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name7 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                    if (oz.q.v0(name7, "vt-vt-", false)) {
                                                        String strO1117 = se.i.o();
                                                        String name2115 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name2115, "getName(...)");
                                                        if (se.i.u()) {
                                                            str9 = str6;
                                                        } else {
                                                            str9 = str4;
                                                        }
                                                        str5 = str16;
                                                        file6.renameTo(new File(strO1117, oz.x.q0(name2115, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                    } else {
                                                        str5 = str16;
                                                        if (cf.x.n().keyLanguage == 2) {
                                                            String strO1118 = se.i.o();
                                                            String name2116 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name2116, "getName(...)");
                                                            if (se.i.u()) {
                                                                str8 = str6;
                                                            } else {
                                                                str8 = str4;
                                                            }
                                                            file6.renameTo(new File(strO1118, oz.x.q0(name2116, "-zy", "-" + str8 + "-zy-table")));
                                                        } else {
                                                            name6 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                            if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                String strO1119 = se.i.o();
                                                                String name2117 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name2117, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str7 = str6;
                                                                } else {
                                                                    str7 = str4;
                                                                }
                                                                file6.renameTo(new File(strO1119, oz.x.q0(name2117, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str5 = str16;
                                                    if (cf.x.n().keyLanguage == 2) {
                                                        String strO11110 = se.i.o();
                                                        String name2118 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name2118, "getName(...)");
                                                        if (se.i.u()) {
                                                            str8 = str6;
                                                        } else {
                                                            str8 = str4;
                                                        }
                                                        file6.renameTo(new File(strO11110, oz.x.q0(name2118, "-zy", "-" + str8 + "-zy-table")));
                                                    } else {
                                                        name6 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                        if (oz.q.v0(name6, "-zy.zip", false)) {
                                                            String strO11111 = se.i.o();
                                                            String name2119 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name2119, "getName(...)");
                                                            if (se.i.u()) {
                                                                str7 = str6;
                                                            } else {
                                                                str7 = str4;
                                                            }
                                                            file6.renameTo(new File(strO11111, oz.x.q0(name2119, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            str5 = str16;
                                            str6 = str18;
                                            name5 = file6.getName();
                                            kotlin.jvm.internal.m.e(name5, "getName(...)");
                                            if (oz.x.k0(name5, ".png", false)) {
                                                file6.renameTo(new File(se.i.q(), file6.getName()));
                                            }
                                        }
                                        file4 = file2;
                                        file5 = file3;
                                        iVarA = iVar;
                                        str17 = str4;
                                        str18 = str6;
                                        str16 = str5;
                                    }
                                    file4 = file2;
                                    file5 = file3;
                                    iVarA = iVar;
                                    str17 = str4;
                                } else {
                                    name3 = file6.getName();
                                    kotlin.jvm.internal.m.e(name3, "getName(...)");
                                    if (oz.x.k0(name3, ".zip", false)) {
                                        int[] iArr4 = bq.r.f4959a;
                                        String name1110 = file6.getName();
                                        kotlin.jvm.internal.m.e(name1110, "getName(...)");
                                        String strQ3 = oz.x.q0(name1110, ".zip", BuildConfig.VERSION_NAME);
                                        patternCompile = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
                                        string = new BigDecimal(strQ3).toString();
                                        kotlin.jvm.internal.m.e(string, "toString(...)");
                                        if (!patternCompile.matcher(string).matches()) {
                                            new File(se.i.q(), ep.a.e("lesson_png_", file6.getName())).createNewFile();
                                            String strP6 = se.i.p();
                                            if (se.i.v()) {
                                                str12 = str18;
                                            } else {
                                                str12 = str4;
                                            }
                                            new File(strP6, defpackage.e.n("lesson_", str12, str16, file6.getName())).createNewFile();
                                            String strO122 = se.i.o();
                                            if (se.i.v()) {
                                                str13 = str18;
                                            } else {
                                                str13 = str4;
                                            }
                                            new File(strO122, defpackage.e.n("alpha_", str13, str16, file6.getName())).createNewFile();
                                            file6.delete();
                                            file4 = file2;
                                            file5 = file3;
                                            iVarA = iVar;
                                            str17 = str4;
                                        }
                                    }
                                    name4 = file6.getName();
                                    kotlin.jvm.internal.m.e(name4, "getName(...)");
                                    if (oz.x.k0(name4, ".zip", false)) {
                                        LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                        if (ry.l.D(new Integer[]{0, 7}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                            name9 = file6.getName();
                                            kotlin.jvm.internal.m.e(name9, "getName(...)");
                                            if (oz.q.v0(name9, "-zy-", false)) {
                                                String strO123 = se.i.o();
                                                String name1111 = file6.getName();
                                                kotlin.jvm.internal.m.e(name1111, "getName(...)");
                                                if (se.i.u()) {
                                                    str11 = str18;
                                                    str6 = str11;
                                                } else {
                                                    str6 = str18;
                                                    str11 = str4;
                                                }
                                                file6.renameTo(new File(strO123, oz.x.q0(name1111, "-zy-", "-" + str11 + "-zy-lesson-")));
                                            } else {
                                                str6 = str18;
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name8 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                    if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                        String strO11112 = se.i.o();
                                                        String name1112 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name1112, "getName(...)");
                                                        if (se.i.u()) {
                                                            str10 = str6;
                                                        } else {
                                                            str10 = str4;
                                                        }
                                                        file6.renameTo(new File(strO11112, oz.x.q0(name1112, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                    }
                                                }
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name7 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                    if (oz.q.v0(name7, "vt-vt-", false)) {
                                                        String strO11113 = se.i.o();
                                                        String name21110 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name21110, "getName(...)");
                                                        if (se.i.u()) {
                                                            str9 = str6;
                                                        } else {
                                                            str9 = str4;
                                                        }
                                                        str5 = str16;
                                                        file6.renameTo(new File(strO11113, oz.x.q0(name21110, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                    } else {
                                                        str5 = str16;
                                                        if (cf.x.n().keyLanguage == 2) {
                                                            String strO11114 = se.i.o();
                                                            String name21111 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name21111, "getName(...)");
                                                            if (se.i.u()) {
                                                                str8 = str6;
                                                            } else {
                                                                str8 = str4;
                                                            }
                                                            file6.renameTo(new File(strO11114, oz.x.q0(name21111, "-zy", "-" + str8 + "-zy-table")));
                                                        } else {
                                                            name6 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                            if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                String strO11115 = se.i.o();
                                                                String name21112 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name21112, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str7 = str6;
                                                                } else {
                                                                    str7 = str4;
                                                                }
                                                                file6.renameTo(new File(strO11115, oz.x.q0(name21112, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str5 = str16;
                                                    if (cf.x.n().keyLanguage == 2) {
                                                        String strO11116 = se.i.o();
                                                        String name21113 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name21113, "getName(...)");
                                                        if (se.i.u()) {
                                                            str8 = str6;
                                                        } else {
                                                            str8 = str4;
                                                        }
                                                        file6.renameTo(new File(strO11116, oz.x.q0(name21113, "-zy", "-" + str8 + "-zy-table")));
                                                    } else {
                                                        name6 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                        if (oz.q.v0(name6, "-zy.zip", false)) {
                                                            String strO11117 = se.i.o();
                                                            String name21114 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name21114, "getName(...)");
                                                            if (se.i.u()) {
                                                                str7 = str6;
                                                            } else {
                                                                str7 = str4;
                                                            }
                                                            file6.renameTo(new File(strO11117, oz.x.q0(name21114, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                        }
                                                    }
                                                }
                                            }
                                            file4 = file2;
                                            file5 = file3;
                                            iVarA = iVar;
                                            str17 = str4;
                                            str18 = str6;
                                        } else {
                                            str6 = str18;
                                            if (cf.x.n().keyLanguage == 7) {
                                                name8 = file6.getName();
                                                kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                    String strO11118 = se.i.o();
                                                    String name1113 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name1113, "getName(...)");
                                                    if (se.i.u()) {
                                                        str10 = str6;
                                                    } else {
                                                        str10 = str4;
                                                    }
                                                    file6.renameTo(new File(strO11118, oz.x.q0(name1113, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                    file4 = file2;
                                                    file5 = file3;
                                                    iVarA = iVar;
                                                    str17 = str4;
                                                    str18 = str6;
                                                }
                                            }
                                            if (cf.x.n().keyLanguage == 7) {
                                                name7 = file6.getName();
                                                kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                if (oz.q.v0(name7, "vt-vt-", false)) {
                                                    String strO11119 = se.i.o();
                                                    String name21115 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name21115, "getName(...)");
                                                    if (se.i.u()) {
                                                        str9 = str6;
                                                    } else {
                                                        str9 = str4;
                                                    }
                                                    str5 = str16;
                                                    file6.renameTo(new File(strO11119, oz.x.q0(name21115, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                } else {
                                                    str5 = str16;
                                                    if (cf.x.n().keyLanguage == 2) {
                                                        String strO111110 = se.i.o();
                                                        String name21116 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name21116, "getName(...)");
                                                        if (se.i.u()) {
                                                            str8 = str6;
                                                        } else {
                                                            str8 = str4;
                                                        }
                                                        file6.renameTo(new File(strO111110, oz.x.q0(name21116, "-zy", "-" + str8 + "-zy-table")));
                                                    } else {
                                                        name6 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                        if (oz.q.v0(name6, "-zy.zip", false)) {
                                                            String strO111111 = se.i.o();
                                                            String name21117 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name21117, "getName(...)");
                                                            if (se.i.u()) {
                                                                str7 = str6;
                                                            } else {
                                                                str7 = str4;
                                                            }
                                                            file6.renameTo(new File(strO111111, oz.x.q0(name21117, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                        }
                                                    }
                                                }
                                            } else {
                                                str5 = str16;
                                                if (cf.x.n().keyLanguage == 2) {
                                                    String strO111112 = se.i.o();
                                                    String name21118 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name21118, "getName(...)");
                                                    if (se.i.u()) {
                                                        str8 = str6;
                                                    } else {
                                                        str8 = str4;
                                                    }
                                                    file6.renameTo(new File(strO111112, oz.x.q0(name21118, "-zy", "-" + str8 + "-zy-table")));
                                                } else {
                                                    name6 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                    if (oz.q.v0(name6, "-zy.zip", false)) {
                                                        String strO111113 = se.i.o();
                                                        String name21119 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name21119, "getName(...)");
                                                        if (se.i.u()) {
                                                            str7 = str6;
                                                        } else {
                                                            str7 = str4;
                                                        }
                                                        file6.renameTo(new File(strO111113, oz.x.q0(name21119, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        str5 = str16;
                                        str6 = str18;
                                        name5 = file6.getName();
                                        kotlin.jvm.internal.m.e(name5, "getName(...)");
                                        if (oz.x.k0(name5, ".png", false)) {
                                            file6.renameTo(new File(se.i.q(), file6.getName()));
                                        }
                                    }
                                    file4 = file2;
                                    file5 = file3;
                                    iVarA = iVar;
                                    str17 = str4;
                                    str18 = str6;
                                    str16 = str5;
                                }
                            }
                        }
                    } else {
                        file2 = file4;
                        file3 = file5;
                        iVar = iVarA;
                        name = file6.getName();
                        kotlin.jvm.internal.m.e(name, "getName(...)");
                        if (oz.x.k0(name, ".mp3", false)) {
                            name11 = file6.getName();
                            kotlin.jvm.internal.m.e(name11, "getName(...)");
                            if (oz.q.v0(name11, "-w-", false)) {
                                String strP7 = se.i.p();
                                String name120 = file6.getName();
                                kotlin.jvm.internal.m.e(name120, "getName(...)");
                                if (se.i.v()) {
                                    str4 = str17;
                                    str15 = str18;
                                } else {
                                    str15 = str17;
                                    str4 = str15;
                                }
                                file6.renameTo(new File(strP7, oz.x.q0(name120, "-w-", "-" + str15 + "-w-")));
                            } else {
                                str4 = str17;
                                name2 = file6.getName();
                                kotlin.jvm.internal.m.e(name2, "getName(...)");
                                if (oz.x.k0(name2, ".mp3", false)) {
                                    name10 = file6.getName();
                                    kotlin.jvm.internal.m.e(name10, "getName(...)");
                                    if (oz.q.v0(name10, "-zy-", false)) {
                                        String strO21 = se.i.o();
                                        String name1114 = file6.getName();
                                        kotlin.jvm.internal.m.e(name1114, "getName(...)");
                                        if (se.i.u()) {
                                            str14 = str18;
                                        } else {
                                            str14 = str4;
                                        }
                                        file6.renameTo(new File(strO21, oz.x.q0(name1114, "-zy-", "-" + str14 + "-zy-")));
                                    } else {
                                        name3 = file6.getName();
                                        kotlin.jvm.internal.m.e(name3, "getName(...)");
                                        if (oz.x.k0(name3, ".zip", false)) {
                                            int[] iArr5 = bq.r.f4959a;
                                            String name1115 = file6.getName();
                                            kotlin.jvm.internal.m.e(name1115, "getName(...)");
                                            String strQ4 = oz.x.q0(name1115, ".zip", BuildConfig.VERSION_NAME);
                                            patternCompile = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
                                            string = new BigDecimal(strQ4).toString();
                                            kotlin.jvm.internal.m.e(string, "toString(...)");
                                            if (!patternCompile.matcher(string).matches()) {
                                                new File(se.i.q(), ep.a.e("lesson_png_", file6.getName())).createNewFile();
                                                String strP8 = se.i.p();
                                                if (se.i.v()) {
                                                    str12 = str18;
                                                } else {
                                                    str12 = str4;
                                                }
                                                new File(strP8, defpackage.e.n("lesson_", str12, str16, file6.getName())).createNewFile();
                                                String strO124 = se.i.o();
                                                if (se.i.v()) {
                                                    str13 = str18;
                                                } else {
                                                    str13 = str4;
                                                }
                                                new File(strO124, defpackage.e.n("alpha_", str13, str16, file6.getName())).createNewFile();
                                                file6.delete();
                                            }
                                        }
                                        name4 = file6.getName();
                                        kotlin.jvm.internal.m.e(name4, "getName(...)");
                                        if (oz.x.k0(name4, ".zip", false)) {
                                            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                                            if (ry.l.D(new Integer[]{0, 7}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                                name9 = file6.getName();
                                                kotlin.jvm.internal.m.e(name9, "getName(...)");
                                                if (oz.q.v0(name9, "-zy-", false)) {
                                                    String strO125 = se.i.o();
                                                    String name1116 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name1116, "getName(...)");
                                                    if (se.i.u()) {
                                                        str11 = str18;
                                                        str6 = str11;
                                                    } else {
                                                        str6 = str18;
                                                        str11 = str4;
                                                    }
                                                    file6.renameTo(new File(strO125, oz.x.q0(name1116, "-zy-", "-" + str11 + "-zy-lesson-")));
                                                } else {
                                                    str6 = str18;
                                                    if (cf.x.n().keyLanguage == 7) {
                                                        name8 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                        if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                            String strO111114 = se.i.o();
                                                            String name1117 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name1117, "getName(...)");
                                                            if (se.i.u()) {
                                                                str10 = str6;
                                                            } else {
                                                                str10 = str4;
                                                            }
                                                            file6.renameTo(new File(strO111114, oz.x.q0(name1117, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                        }
                                                    }
                                                    if (cf.x.n().keyLanguage == 7) {
                                                        name7 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                        if (oz.q.v0(name7, "vt-vt-", false)) {
                                                            String strO111115 = se.i.o();
                                                            String name211110 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name211110, "getName(...)");
                                                            if (se.i.u()) {
                                                                str9 = str6;
                                                            } else {
                                                                str9 = str4;
                                                            }
                                                            str5 = str16;
                                                            file6.renameTo(new File(strO111115, oz.x.q0(name211110, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                        } else {
                                                            str5 = str16;
                                                            if (cf.x.n().keyLanguage == 2) {
                                                                String strO111116 = se.i.o();
                                                                String name211111 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name211111, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str8 = str6;
                                                                } else {
                                                                    str8 = str4;
                                                                }
                                                                file6.renameTo(new File(strO111116, oz.x.q0(name211111, "-zy", "-" + str8 + "-zy-table")));
                                                            } else {
                                                                name6 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                                if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                    String strO111117 = se.i.o();
                                                                    String name211112 = file6.getName();
                                                                    kotlin.jvm.internal.m.e(name211112, "getName(...)");
                                                                    if (se.i.u()) {
                                                                        str7 = str6;
                                                                    } else {
                                                                        str7 = str4;
                                                                    }
                                                                    file6.renameTo(new File(strO111117, oz.x.q0(name211112, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        str5 = str16;
                                                        if (cf.x.n().keyLanguage == 2) {
                                                            String strO111118 = se.i.o();
                                                            String name211113 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name211113, "getName(...)");
                                                            if (se.i.u()) {
                                                                str8 = str6;
                                                            } else {
                                                                str8 = str4;
                                                            }
                                                            file6.renameTo(new File(strO111118, oz.x.q0(name211113, "-zy", "-" + str8 + "-zy-table")));
                                                        } else {
                                                            name6 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                            if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                String strO111119 = se.i.o();
                                                                String name211114 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name211114, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str7 = str6;
                                                                } else {
                                                                    str7 = str4;
                                                                }
                                                                file6.renameTo(new File(strO111119, oz.x.q0(name211114, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                            }
                                                        }
                                                    }
                                                }
                                                file4 = file2;
                                                file5 = file3;
                                                iVarA = iVar;
                                                str17 = str4;
                                                str18 = str6;
                                            } else {
                                                str6 = str18;
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name8 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                    if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                        String strO1111110 = se.i.o();
                                                        String name1118 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name1118, "getName(...)");
                                                        if (se.i.u()) {
                                                            str10 = str6;
                                                        } else {
                                                            str10 = str4;
                                                        }
                                                        file6.renameTo(new File(strO1111110, oz.x.q0(name1118, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                        file4 = file2;
                                                        file5 = file3;
                                                        iVarA = iVar;
                                                        str17 = str4;
                                                        str18 = str6;
                                                    }
                                                }
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name7 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                    if (oz.q.v0(name7, "vt-vt-", false)) {
                                                        String strO1111111 = se.i.o();
                                                        String name211115 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name211115, "getName(...)");
                                                        if (se.i.u()) {
                                                            str9 = str6;
                                                        } else {
                                                            str9 = str4;
                                                        }
                                                        str5 = str16;
                                                        file6.renameTo(new File(strO1111111, oz.x.q0(name211115, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                    } else {
                                                        str5 = str16;
                                                        if (cf.x.n().keyLanguage == 2) {
                                                            String strO1111112 = se.i.o();
                                                            String name211116 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name211116, "getName(...)");
                                                            if (se.i.u()) {
                                                                str8 = str6;
                                                            } else {
                                                                str8 = str4;
                                                            }
                                                            file6.renameTo(new File(strO1111112, oz.x.q0(name211116, "-zy", "-" + str8 + "-zy-table")));
                                                        } else {
                                                            name6 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                            if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                String strO1111113 = se.i.o();
                                                                String name211117 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name211117, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str7 = str6;
                                                                } else {
                                                                    str7 = str4;
                                                                }
                                                                file6.renameTo(new File(strO1111113, oz.x.q0(name211117, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str5 = str16;
                                                    if (cf.x.n().keyLanguage == 2) {
                                                        String strO1111114 = se.i.o();
                                                        String name211118 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name211118, "getName(...)");
                                                        if (se.i.u()) {
                                                            str8 = str6;
                                                        } else {
                                                            str8 = str4;
                                                        }
                                                        file6.renameTo(new File(strO1111114, oz.x.q0(name211118, "-zy", "-" + str8 + "-zy-table")));
                                                    } else {
                                                        name6 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                        if (oz.q.v0(name6, "-zy.zip", false)) {
                                                            String strO1111115 = se.i.o();
                                                            String name211119 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name211119, "getName(...)");
                                                            if (se.i.u()) {
                                                                str7 = str6;
                                                            } else {
                                                                str7 = str4;
                                                            }
                                                            file6.renameTo(new File(strO1111115, oz.x.q0(name211119, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            str5 = str16;
                                            str6 = str18;
                                            name5 = file6.getName();
                                            kotlin.jvm.internal.m.e(name5, "getName(...)");
                                            if (oz.x.k0(name5, ".png", false)) {
                                                file6.renameTo(new File(se.i.q(), file6.getName()));
                                            }
                                        }
                                        file4 = file2;
                                        file5 = file3;
                                        iVarA = iVar;
                                        str17 = str4;
                                        str18 = str6;
                                        str16 = str5;
                                    }
                                } else {
                                    name3 = file6.getName();
                                    kotlin.jvm.internal.m.e(name3, "getName(...)");
                                    if (oz.x.k0(name3, ".zip", false)) {
                                        int[] iArr6 = bq.r.f4959a;
                                        String name1119 = file6.getName();
                                        kotlin.jvm.internal.m.e(name1119, "getName(...)");
                                        String strQ5 = oz.x.q0(name1119, ".zip", BuildConfig.VERSION_NAME);
                                        patternCompile = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
                                        string = new BigDecimal(strQ5).toString();
                                        kotlin.jvm.internal.m.e(string, "toString(...)");
                                        if (!patternCompile.matcher(string).matches()) {
                                            new File(se.i.q(), ep.a.e("lesson_png_", file6.getName())).createNewFile();
                                            String strP9 = se.i.p();
                                            if (se.i.v()) {
                                                str12 = str18;
                                            } else {
                                                str12 = str4;
                                            }
                                            new File(strP9, defpackage.e.n("lesson_", str12, str16, file6.getName())).createNewFile();
                                            String strO126 = se.i.o();
                                            if (se.i.v()) {
                                                str13 = str18;
                                            } else {
                                                str13 = str4;
                                            }
                                            new File(strO126, defpackage.e.n("alpha_", str13, str16, file6.getName())).createNewFile();
                                            file6.delete();
                                        }
                                    }
                                    name4 = file6.getName();
                                    kotlin.jvm.internal.m.e(name4, "getName(...)");
                                    if (oz.x.k0(name4, ".zip", false)) {
                                        LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                                        if (ry.l.D(new Integer[]{0, 7}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                            name9 = file6.getName();
                                            kotlin.jvm.internal.m.e(name9, "getName(...)");
                                            if (oz.q.v0(name9, "-zy-", false)) {
                                                String strO127 = se.i.o();
                                                String name11110 = file6.getName();
                                                kotlin.jvm.internal.m.e(name11110, "getName(...)");
                                                if (se.i.u()) {
                                                    str11 = str18;
                                                    str6 = str11;
                                                } else {
                                                    str6 = str18;
                                                    str11 = str4;
                                                }
                                                file6.renameTo(new File(strO127, oz.x.q0(name11110, "-zy-", "-" + str11 + "-zy-lesson-")));
                                            } else {
                                                str6 = str18;
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name8 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                    if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                        String strO1111116 = se.i.o();
                                                        String name11111 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name11111, "getName(...)");
                                                        if (se.i.u()) {
                                                            str10 = str6;
                                                        } else {
                                                            str10 = str4;
                                                        }
                                                        file6.renameTo(new File(strO1111116, oz.x.q0(name11111, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                    }
                                                }
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name7 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                    if (oz.q.v0(name7, "vt-vt-", false)) {
                                                        String strO1111117 = se.i.o();
                                                        String name2111110 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name2111110, "getName(...)");
                                                        if (se.i.u()) {
                                                            str9 = str6;
                                                        } else {
                                                            str9 = str4;
                                                        }
                                                        str5 = str16;
                                                        file6.renameTo(new File(strO1111117, oz.x.q0(name2111110, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                    } else {
                                                        str5 = str16;
                                                        if (cf.x.n().keyLanguage == 2) {
                                                            String strO1111118 = se.i.o();
                                                            String name2111111 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name2111111, "getName(...)");
                                                            if (se.i.u()) {
                                                                str8 = str6;
                                                            } else {
                                                                str8 = str4;
                                                            }
                                                            file6.renameTo(new File(strO1111118, oz.x.q0(name2111111, "-zy", "-" + str8 + "-zy-table")));
                                                        } else {
                                                            name6 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                            if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                String strO1111119 = se.i.o();
                                                                String name2111112 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name2111112, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str7 = str6;
                                                                } else {
                                                                    str7 = str4;
                                                                }
                                                                file6.renameTo(new File(strO1111119, oz.x.q0(name2111112, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str5 = str16;
                                                    if (cf.x.n().keyLanguage == 2) {
                                                        String strO11111110 = se.i.o();
                                                        String name2111113 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name2111113, "getName(...)");
                                                        if (se.i.u()) {
                                                            str8 = str6;
                                                        } else {
                                                            str8 = str4;
                                                        }
                                                        file6.renameTo(new File(strO11111110, oz.x.q0(name2111113, "-zy", "-" + str8 + "-zy-table")));
                                                    } else {
                                                        name6 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                        if (oz.q.v0(name6, "-zy.zip", false)) {
                                                            String strO11111111 = se.i.o();
                                                            String name2111114 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name2111114, "getName(...)");
                                                            if (se.i.u()) {
                                                                str7 = str6;
                                                            } else {
                                                                str7 = str4;
                                                            }
                                                            file6.renameTo(new File(strO11111111, oz.x.q0(name2111114, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                        }
                                                    }
                                                }
                                            }
                                            file4 = file2;
                                            file5 = file3;
                                            iVarA = iVar;
                                            str17 = str4;
                                            str18 = str6;
                                        } else {
                                            str6 = str18;
                                            if (cf.x.n().keyLanguage == 7) {
                                                name8 = file6.getName();
                                                kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                    String strO11111112 = se.i.o();
                                                    String name11112 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name11112, "getName(...)");
                                                    if (se.i.u()) {
                                                        str10 = str6;
                                                    } else {
                                                        str10 = str4;
                                                    }
                                                    file6.renameTo(new File(strO11111112, oz.x.q0(name11112, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                    file4 = file2;
                                                    file5 = file3;
                                                    iVarA = iVar;
                                                    str17 = str4;
                                                    str18 = str6;
                                                }
                                            }
                                            if (cf.x.n().keyLanguage == 7) {
                                                name7 = file6.getName();
                                                kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                if (oz.q.v0(name7, "vt-vt-", false)) {
                                                    String strO11111113 = se.i.o();
                                                    String name2111115 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name2111115, "getName(...)");
                                                    if (se.i.u()) {
                                                        str9 = str6;
                                                    } else {
                                                        str9 = str4;
                                                    }
                                                    str5 = str16;
                                                    file6.renameTo(new File(strO11111113, oz.x.q0(name2111115, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                } else {
                                                    str5 = str16;
                                                    if (cf.x.n().keyLanguage == 2) {
                                                        String strO11111114 = se.i.o();
                                                        String name2111116 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name2111116, "getName(...)");
                                                        if (se.i.u()) {
                                                            str8 = str6;
                                                        } else {
                                                            str8 = str4;
                                                        }
                                                        file6.renameTo(new File(strO11111114, oz.x.q0(name2111116, "-zy", "-" + str8 + "-zy-table")));
                                                    } else {
                                                        name6 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                        if (oz.q.v0(name6, "-zy.zip", false)) {
                                                            String strO11111115 = se.i.o();
                                                            String name2111117 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name2111117, "getName(...)");
                                                            if (se.i.u()) {
                                                                str7 = str6;
                                                            } else {
                                                                str7 = str4;
                                                            }
                                                            file6.renameTo(new File(strO11111115, oz.x.q0(name2111117, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                        }
                                                    }
                                                }
                                            } else {
                                                str5 = str16;
                                                if (cf.x.n().keyLanguage == 2) {
                                                    String strO11111116 = se.i.o();
                                                    String name2111118 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name2111118, "getName(...)");
                                                    if (se.i.u()) {
                                                        str8 = str6;
                                                    } else {
                                                        str8 = str4;
                                                    }
                                                    file6.renameTo(new File(strO11111116, oz.x.q0(name2111118, "-zy", "-" + str8 + "-zy-table")));
                                                } else {
                                                    name6 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                    if (oz.q.v0(name6, "-zy.zip", false)) {
                                                        String strO11111117 = se.i.o();
                                                        String name2111119 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name2111119, "getName(...)");
                                                        if (se.i.u()) {
                                                            str7 = str6;
                                                        } else {
                                                            str7 = str4;
                                                        }
                                                        file6.renameTo(new File(strO11111117, oz.x.q0(name2111119, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        str5 = str16;
                                        str6 = str18;
                                        name5 = file6.getName();
                                        kotlin.jvm.internal.m.e(name5, "getName(...)");
                                        if (oz.x.k0(name5, ".png", false)) {
                                            file6.renameTo(new File(se.i.q(), file6.getName()));
                                        }
                                    }
                                    file4 = file2;
                                    file5 = file3;
                                    iVarA = iVar;
                                    str17 = str4;
                                    str18 = str6;
                                    str16 = str5;
                                }
                            }
                            file4 = file2;
                            file5 = file3;
                            iVarA = iVar;
                            str17 = str4;
                        } else {
                            str4 = str17;
                            name2 = file6.getName();
                            kotlin.jvm.internal.m.e(name2, "getName(...)");
                            if (oz.x.k0(name2, ".mp3", false)) {
                                name10 = file6.getName();
                                kotlin.jvm.internal.m.e(name10, "getName(...)");
                                if (oz.q.v0(name10, "-zy-", false)) {
                                    String strO22 = se.i.o();
                                    String name11113 = file6.getName();
                                    kotlin.jvm.internal.m.e(name11113, "getName(...)");
                                    if (se.i.u()) {
                                        str14 = str18;
                                    } else {
                                        str14 = str4;
                                    }
                                    file6.renameTo(new File(strO22, oz.x.q0(name11113, "-zy-", "-" + str14 + "-zy-")));
                                } else {
                                    name3 = file6.getName();
                                    kotlin.jvm.internal.m.e(name3, "getName(...)");
                                    if (oz.x.k0(name3, ".zip", false)) {
                                        int[] iArr7 = bq.r.f4959a;
                                        String name11114 = file6.getName();
                                        kotlin.jvm.internal.m.e(name11114, "getName(...)");
                                        String strQ6 = oz.x.q0(name11114, ".zip", BuildConfig.VERSION_NAME);
                                        patternCompile = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
                                        string = new BigDecimal(strQ6).toString();
                                        kotlin.jvm.internal.m.e(string, "toString(...)");
                                        if (!patternCompile.matcher(string).matches()) {
                                            new File(se.i.q(), ep.a.e("lesson_png_", file6.getName())).createNewFile();
                                            String strP10 = se.i.p();
                                            if (se.i.v()) {
                                                str12 = str18;
                                            } else {
                                                str12 = str4;
                                            }
                                            new File(strP10, defpackage.e.n("lesson_", str12, str16, file6.getName())).createNewFile();
                                            String strO128 = se.i.o();
                                            if (se.i.v()) {
                                                str13 = str18;
                                            } else {
                                                str13 = str4;
                                            }
                                            new File(strO128, defpackage.e.n("alpha_", str13, str16, file6.getName())).createNewFile();
                                            file6.delete();
                                        }
                                    }
                                    name4 = file6.getName();
                                    kotlin.jvm.internal.m.e(name4, "getName(...)");
                                    if (oz.x.k0(name4, ".zip", false)) {
                                        LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                                        if (ry.l.D(new Integer[]{0, 7}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                            name9 = file6.getName();
                                            kotlin.jvm.internal.m.e(name9, "getName(...)");
                                            if (oz.q.v0(name9, "-zy-", false)) {
                                                String strO129 = se.i.o();
                                                String name11115 = file6.getName();
                                                kotlin.jvm.internal.m.e(name11115, "getName(...)");
                                                if (se.i.u()) {
                                                    str11 = str18;
                                                    str6 = str11;
                                                } else {
                                                    str6 = str18;
                                                    str11 = str4;
                                                }
                                                file6.renameTo(new File(strO129, oz.x.q0(name11115, "-zy-", "-" + str11 + "-zy-lesson-")));
                                            } else {
                                                str6 = str18;
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name8 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                    if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                        String strO11111118 = se.i.o();
                                                        String name11116 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name11116, "getName(...)");
                                                        if (se.i.u()) {
                                                            str10 = str6;
                                                        } else {
                                                            str10 = str4;
                                                        }
                                                        file6.renameTo(new File(strO11111118, oz.x.q0(name11116, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                    }
                                                }
                                                if (cf.x.n().keyLanguage == 7) {
                                                    name7 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                    if (oz.q.v0(name7, "vt-vt-", false)) {
                                                        String strO11111119 = se.i.o();
                                                        String name21111110 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name21111110, "getName(...)");
                                                        if (se.i.u()) {
                                                            str9 = str6;
                                                        } else {
                                                            str9 = str4;
                                                        }
                                                        str5 = str16;
                                                        file6.renameTo(new File(strO11111119, oz.x.q0(name21111110, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                    } else {
                                                        str5 = str16;
                                                        if (cf.x.n().keyLanguage == 2) {
                                                            String strO111111110 = se.i.o();
                                                            String name21111111 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name21111111, "getName(...)");
                                                            if (se.i.u()) {
                                                                str8 = str6;
                                                            } else {
                                                                str8 = str4;
                                                            }
                                                            file6.renameTo(new File(strO111111110, oz.x.q0(name21111111, "-zy", "-" + str8 + "-zy-table")));
                                                        } else {
                                                            name6 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                            if (oz.q.v0(name6, "-zy.zip", false)) {
                                                                String strO111111111 = se.i.o();
                                                                String name21111112 = file6.getName();
                                                                kotlin.jvm.internal.m.e(name21111112, "getName(...)");
                                                                if (se.i.u()) {
                                                                    str7 = str6;
                                                                } else {
                                                                    str7 = str4;
                                                                }
                                                                file6.renameTo(new File(strO111111111, oz.x.q0(name21111112, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str5 = str16;
                                                    if (cf.x.n().keyLanguage == 2) {
                                                        String strO111111112 = se.i.o();
                                                        String name21111113 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name21111113, "getName(...)");
                                                        if (se.i.u()) {
                                                            str8 = str6;
                                                        } else {
                                                            str8 = str4;
                                                        }
                                                        file6.renameTo(new File(strO111111112, oz.x.q0(name21111113, "-zy", "-" + str8 + "-zy-table")));
                                                    } else {
                                                        name6 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                        if (oz.q.v0(name6, "-zy.zip", false)) {
                                                            String strO111111113 = se.i.o();
                                                            String name21111114 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name21111114, "getName(...)");
                                                            if (se.i.u()) {
                                                                str7 = str6;
                                                            } else {
                                                                str7 = str4;
                                                            }
                                                            file6.renameTo(new File(strO111111113, oz.x.q0(name21111114, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                        }
                                                    }
                                                }
                                            }
                                            file4 = file2;
                                            file5 = file3;
                                            iVarA = iVar;
                                            str17 = str4;
                                            str18 = str6;
                                        } else {
                                            str6 = str18;
                                            if (cf.x.n().keyLanguage == 7) {
                                                name8 = file6.getName();
                                                kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                    String strO111111114 = se.i.o();
                                                    String name11117 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name11117, "getName(...)");
                                                    if (se.i.u()) {
                                                        str10 = str6;
                                                    } else {
                                                        str10 = str4;
                                                    }
                                                    file6.renameTo(new File(strO111111114, oz.x.q0(name11117, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                    file4 = file2;
                                                    file5 = file3;
                                                    iVarA = iVar;
                                                    str17 = str4;
                                                    str18 = str6;
                                                }
                                            }
                                            if (cf.x.n().keyLanguage == 7) {
                                                name7 = file6.getName();
                                                kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                if (oz.q.v0(name7, "vt-vt-", false)) {
                                                    String strO111111115 = se.i.o();
                                                    String name21111115 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name21111115, "getName(...)");
                                                    if (se.i.u()) {
                                                        str9 = str6;
                                                    } else {
                                                        str9 = str4;
                                                    }
                                                    str5 = str16;
                                                    file6.renameTo(new File(strO111111115, oz.x.q0(name21111115, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                } else {
                                                    str5 = str16;
                                                    if (cf.x.n().keyLanguage == 2) {
                                                        String strO111111116 = se.i.o();
                                                        String name21111116 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name21111116, "getName(...)");
                                                        if (se.i.u()) {
                                                            str8 = str6;
                                                        } else {
                                                            str8 = str4;
                                                        }
                                                        file6.renameTo(new File(strO111111116, oz.x.q0(name21111116, "-zy", "-" + str8 + "-zy-table")));
                                                    } else {
                                                        name6 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                        if (oz.q.v0(name6, "-zy.zip", false)) {
                                                            String strO111111117 = se.i.o();
                                                            String name21111117 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name21111117, "getName(...)");
                                                            if (se.i.u()) {
                                                                str7 = str6;
                                                            } else {
                                                                str7 = str4;
                                                            }
                                                            file6.renameTo(new File(strO111111117, oz.x.q0(name21111117, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                        }
                                                    }
                                                }
                                            } else {
                                                str5 = str16;
                                                if (cf.x.n().keyLanguage == 2) {
                                                    String strO111111118 = se.i.o();
                                                    String name21111118 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name21111118, "getName(...)");
                                                    if (se.i.u()) {
                                                        str8 = str6;
                                                    } else {
                                                        str8 = str4;
                                                    }
                                                    file6.renameTo(new File(strO111111118, oz.x.q0(name21111118, "-zy", "-" + str8 + "-zy-table")));
                                                } else {
                                                    name6 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                    if (oz.q.v0(name6, "-zy.zip", false)) {
                                                        String strO111111119 = se.i.o();
                                                        String name21111119 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name21111119, "getName(...)");
                                                        if (se.i.u()) {
                                                            str7 = str6;
                                                        } else {
                                                            str7 = str4;
                                                        }
                                                        file6.renameTo(new File(strO111111119, oz.x.q0(name21111119, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        str5 = str16;
                                        str6 = str18;
                                        name5 = file6.getName();
                                        kotlin.jvm.internal.m.e(name5, "getName(...)");
                                        if (oz.x.k0(name5, ".png", false)) {
                                            file6.renameTo(new File(se.i.q(), file6.getName()));
                                        }
                                    }
                                    file4 = file2;
                                    file5 = file3;
                                    iVarA = iVar;
                                    str17 = str4;
                                    str18 = str6;
                                    str16 = str5;
                                }
                                file4 = file2;
                                file5 = file3;
                                iVarA = iVar;
                                str17 = str4;
                            } else {
                                name3 = file6.getName();
                                kotlin.jvm.internal.m.e(name3, "getName(...)");
                                if (oz.x.k0(name3, ".zip", false)) {
                                    int[] iArr8 = bq.r.f4959a;
                                    String name11118 = file6.getName();
                                    kotlin.jvm.internal.m.e(name11118, "getName(...)");
                                    String strQ7 = oz.x.q0(name11118, ".zip", BuildConfig.VERSION_NAME);
                                    patternCompile = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
                                    string = new BigDecimal(strQ7).toString();
                                    kotlin.jvm.internal.m.e(string, "toString(...)");
                                    if (!patternCompile.matcher(string).matches()) {
                                        new File(se.i.q(), ep.a.e("lesson_png_", file6.getName())).createNewFile();
                                        String strP11 = se.i.p();
                                        if (se.i.v()) {
                                            str12 = str18;
                                        } else {
                                            str12 = str4;
                                        }
                                        new File(strP11, defpackage.e.n("lesson_", str12, str16, file6.getName())).createNewFile();
                                        String strO1210 = se.i.o();
                                        if (se.i.v()) {
                                            str13 = str18;
                                        } else {
                                            str13 = str4;
                                        }
                                        new File(strO1210, defpackage.e.n("alpha_", str13, str16, file6.getName())).createNewFile();
                                        file6.delete();
                                        file4 = file2;
                                        file5 = file3;
                                        iVarA = iVar;
                                        str17 = str4;
                                    }
                                }
                                name4 = file6.getName();
                                kotlin.jvm.internal.m.e(name4, "getName(...)");
                                if (oz.x.k0(name4, ".zip", false)) {
                                    LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                                    if (ry.l.D(new Integer[]{0, 7}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                        name9 = file6.getName();
                                        kotlin.jvm.internal.m.e(name9, "getName(...)");
                                        if (oz.q.v0(name9, "-zy-", false)) {
                                            String strO1211 = se.i.o();
                                            String name11119 = file6.getName();
                                            kotlin.jvm.internal.m.e(name11119, "getName(...)");
                                            if (se.i.u()) {
                                                str11 = str18;
                                                str6 = str11;
                                            } else {
                                                str6 = str18;
                                                str11 = str4;
                                            }
                                            file6.renameTo(new File(strO1211, oz.x.q0(name11119, "-zy-", "-" + str11 + "-zy-lesson-")));
                                        } else {
                                            str6 = str18;
                                            if (cf.x.n().keyLanguage == 7) {
                                                name8 = file6.getName();
                                                kotlin.jvm.internal.m.e(name8, "getName(...)");
                                                if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                    String strO1111111110 = se.i.o();
                                                    String name111110 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name111110, "getName(...)");
                                                    if (se.i.u()) {
                                                        str10 = str6;
                                                    } else {
                                                        str10 = str4;
                                                    }
                                                    file6.renameTo(new File(strO1111111110, oz.x.q0(name111110, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                }
                                            }
                                            if (cf.x.n().keyLanguage == 7) {
                                                name7 = file6.getName();
                                                kotlin.jvm.internal.m.e(name7, "getName(...)");
                                                if (oz.q.v0(name7, "vt-vt-", false)) {
                                                    String strO1111111111 = se.i.o();
                                                    String name211111110 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name211111110, "getName(...)");
                                                    if (se.i.u()) {
                                                        str9 = str6;
                                                    } else {
                                                        str9 = str4;
                                                    }
                                                    str5 = str16;
                                                    file6.renameTo(new File(strO1111111111, oz.x.q0(name211111110, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                                } else {
                                                    str5 = str16;
                                                    if (cf.x.n().keyLanguage == 2) {
                                                        String strO1111111112 = se.i.o();
                                                        String name211111111 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name211111111, "getName(...)");
                                                        if (se.i.u()) {
                                                            str8 = str6;
                                                        } else {
                                                            str8 = str4;
                                                        }
                                                        file6.renameTo(new File(strO1111111112, oz.x.q0(name211111111, "-zy", "-" + str8 + "-zy-table")));
                                                    } else {
                                                        name6 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                        if (oz.q.v0(name6, "-zy.zip", false)) {
                                                            String strO1111111113 = se.i.o();
                                                            String name211111112 = file6.getName();
                                                            kotlin.jvm.internal.m.e(name211111112, "getName(...)");
                                                            if (se.i.u()) {
                                                                str7 = str6;
                                                            } else {
                                                                str7 = str4;
                                                            }
                                                            file6.renameTo(new File(strO1111111113, oz.x.q0(name211111112, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                        }
                                                    }
                                                }
                                            } else {
                                                str5 = str16;
                                                if (cf.x.n().keyLanguage == 2) {
                                                    String strO1111111114 = se.i.o();
                                                    String name211111113 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name211111113, "getName(...)");
                                                    if (se.i.u()) {
                                                        str8 = str6;
                                                    } else {
                                                        str8 = str4;
                                                    }
                                                    file6.renameTo(new File(strO1111111114, oz.x.q0(name211111113, "-zy", "-" + str8 + "-zy-table")));
                                                } else {
                                                    name6 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                    if (oz.q.v0(name6, "-zy.zip", false)) {
                                                        String strO1111111115 = se.i.o();
                                                        String name211111114 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name211111114, "getName(...)");
                                                        if (se.i.u()) {
                                                            str7 = str6;
                                                        } else {
                                                            str7 = str4;
                                                        }
                                                        file6.renameTo(new File(strO1111111115, oz.x.q0(name211111114, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                    }
                                                }
                                            }
                                        }
                                        file4 = file2;
                                        file5 = file3;
                                        iVarA = iVar;
                                        str17 = str4;
                                        str18 = str6;
                                    } else {
                                        str6 = str18;
                                        if (cf.x.n().keyLanguage == 7) {
                                            name8 = file6.getName();
                                            kotlin.jvm.internal.m.e(name8, "getName(...)");
                                            if (oz.q.v0(name8, "vt-vt--table-", false)) {
                                                String strO1111111116 = se.i.o();
                                                String name111111 = file6.getName();
                                                kotlin.jvm.internal.m.e(name111111, "getName(...)");
                                                if (se.i.u()) {
                                                    str10 = str6;
                                                } else {
                                                    str10 = str4;
                                                }
                                                file6.renameTo(new File(strO1111111116, oz.x.q0(name111111, "vt-vt--table-", "vt-" + str10 + "-zy-table-")));
                                                file4 = file2;
                                                file5 = file3;
                                                iVarA = iVar;
                                                str17 = str4;
                                                str18 = str6;
                                            }
                                        }
                                        if (cf.x.n().keyLanguage == 7) {
                                            name7 = file6.getName();
                                            kotlin.jvm.internal.m.e(name7, "getName(...)");
                                            if (oz.q.v0(name7, "vt-vt-", false)) {
                                                String strO1111111117 = se.i.o();
                                                String name211111115 = file6.getName();
                                                kotlin.jvm.internal.m.e(name211111115, "getName(...)");
                                                if (se.i.u()) {
                                                    str9 = str6;
                                                } else {
                                                    str9 = str4;
                                                }
                                                str5 = str16;
                                                file6.renameTo(new File(strO1111111117, oz.x.q0(name211111115, "vt-vt-", "vt-" + str9 + "-zy-lesson-")));
                                            } else {
                                                str5 = str16;
                                                if (cf.x.n().keyLanguage == 2) {
                                                    String strO1111111118 = se.i.o();
                                                    String name211111116 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name211111116, "getName(...)");
                                                    if (se.i.u()) {
                                                        str8 = str6;
                                                    } else {
                                                        str8 = str4;
                                                    }
                                                    file6.renameTo(new File(strO1111111118, oz.x.q0(name211111116, "-zy", "-" + str8 + "-zy-table")));
                                                } else {
                                                    name6 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                    if (oz.q.v0(name6, "-zy.zip", false)) {
                                                        String strO1111111119 = se.i.o();
                                                        String name211111117 = file6.getName();
                                                        kotlin.jvm.internal.m.e(name211111117, "getName(...)");
                                                        if (se.i.u()) {
                                                            str7 = str6;
                                                        } else {
                                                            str7 = str4;
                                                        }
                                                        file6.renameTo(new File(strO1111111119, oz.x.q0(name211111117, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                    }
                                                }
                                            }
                                        } else {
                                            str5 = str16;
                                            if (cf.x.n().keyLanguage == 2) {
                                                String strO11111111110 = se.i.o();
                                                String name211111118 = file6.getName();
                                                kotlin.jvm.internal.m.e(name211111118, "getName(...)");
                                                if (se.i.u()) {
                                                    str8 = str6;
                                                } else {
                                                    str8 = str4;
                                                }
                                                file6.renameTo(new File(strO11111111110, oz.x.q0(name211111118, "-zy", "-" + str8 + "-zy-table")));
                                            } else {
                                                name6 = file6.getName();
                                                kotlin.jvm.internal.m.e(name6, "getName(...)");
                                                if (oz.q.v0(name6, "-zy.zip", false)) {
                                                    String strO11111111111 = se.i.o();
                                                    String name211111119 = file6.getName();
                                                    kotlin.jvm.internal.m.e(name211111119, "getName(...)");
                                                    if (se.i.u()) {
                                                        str7 = str6;
                                                    } else {
                                                        str7 = str4;
                                                    }
                                                    file6.renameTo(new File(strO11111111111, oz.x.q0(name211111119, "-zy.zip", "-" + str7 + "-zy-table.zip")));
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    str5 = str16;
                                    str6 = str18;
                                    name5 = file6.getName();
                                    kotlin.jvm.internal.m.e(name5, "getName(...)");
                                    if (oz.x.k0(name5, ".png", false)) {
                                        file6.renameTo(new File(se.i.q(), file6.getName()));
                                    }
                                }
                                file4 = file2;
                                file5 = file3;
                                iVarA = iVar;
                                str17 = str4;
                                str18 = str6;
                                str16 = str5;
                            }
                        }
                    }
                    z11 = false;
                }
                file = file5;
                str = str16;
                str2 = str17;
                str3 = str18;
                file4.delete();
            }
        } else {
            file = file5;
            str = str16;
            str2 = str17;
            str3 = str18;
            file4.delete();
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles2 = file.listFiles();
            if (fileArrListFiles2 != null && fileArrListFiles2.length != 0) {
                e00.i iVarA2 = kotlin.jvm.internal.l.a(fileArrListFiles2);
                while (iVarA2.hasNext()) {
                    File file8 = (File) iVarA2.next();
                    file8.getAbsolutePath();
                    String name30 = file8.getName();
                    kotlin.jvm.internal.m.e(name30, "getName(...)");
                    if (oz.x.k0(name30, ".mp3", false)) {
                        String name31 = file8.getName();
                        kotlin.jvm.internal.m.e(name31, "getName(...)");
                        if (oz.q.v0(name31, "-s-", false)) {
                            String strR = se.i.r();
                            String name32 = file8.getName();
                            kotlin.jvm.internal.m.e(name32, "getName(...)");
                            file8.renameTo(new File(strR, oz.x.q0(name32, "-s-", "-" + (se.i.w() ? str3 : str2) + "-s-")));
                        }
                    }
                    String name33 = file8.getName();
                    kotlin.jvm.internal.m.e(name33, "getName(...)");
                    if (oz.x.k0(name33, ".zip", false)) {
                        String name34 = file8.getName();
                        kotlin.jvm.internal.m.e(name34, "getName(...)");
                        String str19 = (String) oz.q.W0(oz.x.q0(name34, ".zip", BuildConfig.VERSION_NAME), new String[]{"-"}, 0, 6).get(2);
                        new File(se.i.s(), ep.a.g("story_png_", str19, ".zip")).createNewFile();
                        new File(se.i.r(), ep.a.h("story_", se.i.w() ? str3 : str2, str, str19, ".zip")).createNewFile();
                        file8.delete();
                    } else {
                        String str20 = str;
                        String name35 = file8.getName();
                        kotlin.jvm.internal.m.e(name35, "getName(...)");
                        if (oz.x.k0(name35, ".png", false)) {
                            file8.renameTo(new File(se.i.s(), file8.getName()));
                        }
                        str = str20;
                    }
                }
                file.delete();
            }
        } else {
            file.delete();
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object objL;
        re.b bVarN;
        re.f0 f0Var;
        re.b bVarX;
        String string;
        boolean zV0;
        int i11 = 24;
        int i12 = 1;
        int i13 = 0;
        switch (this.f4577a) {
            case 0:
                xt.a aVarA = xt.b.a();
                String strE = xt.b.a().e();
                aVarA.getClass();
                xt.a.a(strE);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication);
                com.bumptech.glide.c.c(lingoSkillApplication).a();
                return Boolean.TRUE;
            case 1:
                int i14 = PicTestIndexActivity.R;
                return ij.c.b();
            case 2:
                int i15 = UpdateLessonActivity.W;
                ArrayList arrayList = new ArrayList();
                for (Lesson lesson : ij.c.a()) {
                    a5.f fVar = new a5.f(i11, (boolean) (null == true ? 1 : 0));
                    String lastRegex = lesson.getLastRegex();
                    kotlin.jvm.internal.m.e(lastRegex, "getLastRegex(...)");
                    for (qi.a aVar : fVar.k(lastRegex, false)) {
                        if (aVar.f47798a == 0 && aVar.f47800c == 3) {
                            qy.q qVar = fv.b.f28186a;
                            arrayList.add(new fv.a(8L, fv.b.i0(aVar.f47799b), fv.g.B(aVar.f47799b)));
                        }
                    }
                }
                return arrayList;
            case 3:
                int i16 = UpdateLessonActivity.W;
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication2);
                            ij.d.f34419e = new ij.d(lingoSkillApplication2);
                        }
                        break;
                    }
                }
                ij.d dVar = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar);
                Model_Sentence_010Dao model_Sentence_010Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_010Dao();
                kotlin.jvm.internal.m.e(model_Sentence_010Dao, xTCJ.kgU);
                List<Object> listLoadAll = model_Sentence_010Dao.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll, "loadAll(...)");
                Iterator<T> it = listLoadAll.iterator();
                while (it.hasNext()) {
                    Model_Sentence_010 model_Sentence_010 = (Model_Sentence_010) it.next();
                    try {
                        Model_Sentence_010 model_Sentence_010LoadFullObject = Model_Sentence_010.loadFullObject(model_Sentence_010.getSentenceId());
                        List<Sentence> optionList = model_Sentence_010LoadFullObject.getOptionList();
                        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : optionList) {
                            if (hashSet.add(Long.valueOf(((Sentence) obj).SentenceId))) {
                                arrayList2.add(obj);
                            }
                        }
                        if (arrayList2.size() != model_Sentence_010LoadFullObject.getOptionList().size()) {
                            int[] iArr = bq.r.f4959a;
                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                            cf.x.n();
                            model_Sentence_010.getSentenceId();
                            model_Sentence_010.getOptions();
                        }
                        objL = qy.b0.f48488a;
                    } catch (Throwable th2) {
                        objL = com.bumptech.glide.e.l(th2);
                    }
                    if (qy.o.a(objL) != null) {
                        int[] iArr2 = bq.r.f4959a;
                        LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                        cf.x.n();
                        model_Sentence_010.getSentenceId();
                        model_Sentence_010.getOptions();
                    }
                }
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication5);
                            ij.d.f34419e = new ij.d(lingoSkillApplication5);
                        }
                        break;
                    }
                }
                ij.d dVar2 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar2);
                Model_Sentence_020Dao model_Sentence_020Dao = ((DaoSession) dVar2.f34423d).getModel_Sentence_020Dao();
                kotlin.jvm.internal.m.e(model_Sentence_020Dao, "getModel_Sentence_020Dao(...)");
                List<Object> listLoadAll2 = model_Sentence_020Dao.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll2, "loadAll(...)");
                Iterator<T> it2 = listLoadAll2.iterator();
                while (it2.hasNext()) {
                    Model_Sentence_020.loadFullObject(((Model_Sentence_020) it2.next()).getSentenceId());
                }
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication6);
                            ij.d.f34419e = new ij.d(lingoSkillApplication6);
                        }
                        break;
                    }
                }
                ij.d dVar3 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar3);
                Model_Sentence_030Dao model_Sentence_030Dao = ((DaoSession) dVar3.f34423d).getModel_Sentence_030Dao();
                kotlin.jvm.internal.m.e(model_Sentence_030Dao, "getModel_Sentence_030Dao(...)");
                List<Object> listLoadAll3 = model_Sentence_030Dao.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll3, "loadAll(...)");
                Iterator<T> it3 = listLoadAll3.iterator();
                while (it3.hasNext()) {
                    Model_Sentence_030 model_Sentence_030 = (Model_Sentence_030) it3.next();
                    Model_Sentence_030 model_Sentence_030LoadFullObject = Model_Sentence_030.loadFullObject(model_Sentence_030.getSentenceId());
                    List<Word> optionList2 = model_Sentence_030LoadFullObject.getOptionList();
                    kotlin.jvm.internal.m.e(optionList2, "getOptionList(...)");
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : optionList2) {
                        if (hashSet2.add(Long.valueOf(((Word) obj2).getWordId()))) {
                            arrayList3.add(obj2);
                        }
                    }
                    if (arrayList3.size() != model_Sentence_030LoadFullObject.getOptionList().size()) {
                        int[] iArr3 = bq.r.f4959a;
                        LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                        cf.x.n();
                        model_Sentence_030.getSentenceId();
                        model_Sentence_030.getOptions();
                    } else if (arrayList3.isEmpty()) {
                        int[] iArr4 = bq.r.f4959a;
                        LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                        cf.x.n();
                        model_Sentence_030.getSentenceId();
                        model_Sentence_030.getOptions();
                    }
                }
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication9);
                            ij.d.f34419e = new ij.d(lingoSkillApplication9);
                        }
                        break;
                    }
                }
                ij.d dVar4 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar4);
                Model_Sentence_040Dao model_Sentence_040Dao = ((DaoSession) dVar4.f34423d).getModel_Sentence_040Dao();
                kotlin.jvm.internal.m.e(model_Sentence_040Dao, "getModel_Sentence_040Dao(...)");
                List<Object> listLoadAll4 = model_Sentence_040Dao.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll4, "loadAll(...)");
                Iterator<T> it4 = listLoadAll4.iterator();
                while (it4.hasNext()) {
                    Model_Sentence_040.loadFullObject(((Model_Sentence_040) it4.next()).getSentenceId());
                }
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication10);
                            ij.d.f34419e = new ij.d(lingoSkillApplication10);
                        }
                        break;
                    }
                }
                ij.d dVar5 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar5);
                Model_Sentence_050Dao model_Sentence_050Dao = ((DaoSession) dVar5.f34423d).getModel_Sentence_050Dao();
                kotlin.jvm.internal.m.e(model_Sentence_050Dao, "getModel_Sentence_050Dao(...)");
                List<Object> listLoadAll5 = model_Sentence_050Dao.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll5, "loadAll(...)");
                Iterator<T> it5 = listLoadAll5.iterator();
                while (it5.hasNext()) {
                    Model_Sentence_050 model_Sentence_050 = (Model_Sentence_050) it5.next();
                    String answer = Model_Sentence_050.loadFullObject(model_Sentence_050.getSentenceId()).getAnswer();
                    kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
                    if (answer.length() == 0) {
                        int[] iArr5 = bq.r.f4959a;
                        LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                        cf.x.n();
                        model_Sentence_050.getSentenceId();
                    }
                }
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication12);
                            ij.d.f34419e = new ij.d(lingoSkillApplication12);
                        }
                        break;
                    }
                }
                ij.d dVar6 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar6);
                Model_Sentence_060Dao model_Sentence_060Dao = ((DaoSession) dVar6.f34423d).getModel_Sentence_060Dao();
                kotlin.jvm.internal.m.e(model_Sentence_060Dao, "getModel_Sentence_060Dao(...)");
                List<Object> listLoadAll6 = model_Sentence_060Dao.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll6, "loadAll(...)");
                Iterator<T> it6 = listLoadAll6.iterator();
                while (it6.hasNext()) {
                    Model_Sentence_060.loadFullObject(((Model_Sentence_060) it6.next()).getSentenceId());
                }
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication13);
                            ij.d.f34419e = new ij.d(lingoSkillApplication13);
                        }
                        break;
                    }
                }
                ij.d dVar7 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar7);
                Model_Sentence_070Dao model_Sentence_070Dao = ((DaoSession) dVar7.f34423d).getModel_Sentence_070Dao();
                kotlin.jvm.internal.m.e(model_Sentence_070Dao, "getModel_Sentence_070Dao(...)");
                List<Object> listLoadAll7 = model_Sentence_070Dao.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll7, "loadAll(...)");
                Iterator<T> it7 = listLoadAll7.iterator();
                while (it7.hasNext()) {
                    Model_Sentence_070.loadFullObject(((Model_Sentence_070) it7.next()).getSentenceId());
                }
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication14 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication14);
                            ij.d.f34419e = new ij.d(lingoSkillApplication14);
                        }
                        break;
                    }
                }
                ij.d dVar8 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar8);
                Model_Sentence_080Dao model_Sentence_080Dao = ((DaoSession) dVar8.f34423d).getModel_Sentence_080Dao();
                kotlin.jvm.internal.m.e(model_Sentence_080Dao, "getModel_Sentence_080Dao(...)");
                List<Object> listLoadAll8 = model_Sentence_080Dao.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll8, "loadAll(...)");
                Iterator<T> it8 = listLoadAll8.iterator();
                while (it8.hasNext()) {
                    Model_Sentence_080.loadFullObject(((Model_Sentence_080) it8.next()).getSentenceId());
                }
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication15 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication15);
                            ij.d.f34419e = new ij.d(lingoSkillApplication15);
                        }
                        break;
                    }
                }
                ij.d dVar9 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar9);
                List<Object> listLoadAll9 = dVar9.r().loadAll();
                kotlin.jvm.internal.m.e(listLoadAll9, "loadAll(...)");
                Iterator<T> it9 = listLoadAll9.iterator();
                while (it9.hasNext()) {
                    Model_Sentence_100.loadFullObject(((Model_Sentence_100) it9.next()).getSentenceId());
                }
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication16 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication16);
                            ij.d.f34419e = new ij.d(lingoSkillApplication16);
                        }
                        break;
                    }
                }
                ij.d dVar10 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar10);
                Model_Word_010Dao model_Word_010Dao = ((DaoSession) dVar10.f34423d).getModel_Word_010Dao();
                kotlin.jvm.internal.m.e(model_Word_010Dao, "getModel_Word_010Dao(...)");
                List<Object> listLoadAll10 = model_Word_010Dao.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll10, "loadAll(...)");
                Iterator<T> it10 = listLoadAll10.iterator();
                while (it10.hasNext()) {
                    Model_Word_010 model_Word_010 = (Model_Word_010) it10.next();
                    Model_Word_010 model_Word_010LoadFullObject = Model_Word_010.loadFullObject(model_Word_010.getWordId());
                    List<Word> optionList3 = model_Word_010LoadFullObject.getOptionList();
                    kotlin.jvm.internal.m.e(optionList3, "getOptionList(...)");
                    HashSet hashSet3 = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : optionList3) {
                        if (hashSet3.add(Long.valueOf(((Word) obj3).getWordId()))) {
                            arrayList4.add(obj3);
                        }
                    }
                    if (arrayList4.size() != model_Word_010LoadFullObject.getOptionList().size()) {
                        int[] iArr6 = bq.r.f4959a;
                        LingoSkillApplication lingoSkillApplication17 = LingoSkillApplication.f21665b;
                        cf.x.n();
                        model_Word_010.getWordId();
                        model_Word_010.getImageOptions();
                    }
                }
                return qy.b0.f48488a;
            case 4:
                int i17 = UpdateLessonActivity.W;
                ArrayList arrayList5 = new ArrayList();
                for (Lesson lesson2 : ij.c.a()) {
                    a5.f fVar2 = new a5.f(i11, (boolean) (null == true ? 1 : 0));
                    String lastRegex2 = lesson2.getLastRegex();
                    kotlin.jvm.internal.m.e(lastRegex2, "getLastRegex(...)");
                    for (qi.a aVar2 : fVar2.k(lastRegex2, false)) {
                        if (aVar2.f47798a == 1 && aVar2.f47800c == 31) {
                            qy.q qVar2 = fv.b.f28186a;
                            arrayList5.add(new fv.a(8L, fv.b.J(aVar2.f47799b), fv.g.t(aVar2.f47799b)));
                        }
                    }
                }
                return arrayList5;
            case 5:
                LingoSkillApplication lingoSkillApplication18 = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == 0 && ue.f.y().f34443c.count() > 0) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator<Object> it11 = ue.f.y().f34443c.loadAll().iterator();
                    while (it11.hasNext()) {
                        ScFav scFav = (ScFav) it11.next();
                        ScFavNew scFavNew = new ScFavNew();
                        int[] iArr7 = bq.r.f4959a;
                        LingoSkillApplication lingoSkillApplication19 = LingoSkillApplication.f21665b;
                        scFavNew.setId(bq.m.r(cf.x.n().keyLanguage) + "_" + scFav.getId());
                        scFavNew.setIsFav(scFav.getIsFav());
                        scFavNew.setScore(scFav.getScore());
                        arrayList6.add(scFavNew);
                    }
                    ue.f.y().f34443c.deleteAll();
                    ue.f.y().f34450j.insertOrReplaceInTx(arrayList6);
                }
                return qy.b0.f48488a;
            case 6:
                if (gh.c.f29196a == null) {
                    synchronized (gh.c.class) {
                        if (gh.c.f29196a == null) {
                            gh.c.f29196a = new gh.c();
                        }
                        break;
                    }
                }
                kotlin.jvm.internal.m.c(gh.c.f29196a);
                ArrayList arrayListC = gh.c.c();
                ArrayList arrayList7 = new ArrayList();
                int iM = ((fr.o0) xt.b.c()).m();
                String strI = ((fr.o0) xt.b.c()).i();
                ArrayList arrayList8 = new ArrayList(ry.n.W(arrayListC, 10));
                int size = arrayListC.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj4 = arrayListC.get(i18);
                    i18++;
                    arrayList8.add(((PdWordFav) obj4).getId());
                }
                int i19 = 2;
                nz.t tVarW = nz.n.W(new cz.i(2, nz.n.R(nz.n.R(ry.m.g0(oz.q.W0(strI, new String[]{";"}, 0, 6)), new j9.a0(i12)), jh.q.f36380a), new jh.p(i19)), new j9.a0(i19));
                Iterator it12 = tVarW.f44348a.iterator();
                while (it12.hasNext()) {
                    long jLongValue = ((Number) tVarW.f44349b.invoke(it12.next())).longValue();
                    k10.g gVarQueryBuilder = PdLessonDbHelper.INSTANCE.pdWordDao().queryBuilder();
                    k10.h hVarB = PdWordDao.Properties.LessonId.b(Long.valueOf(jLongValue));
                    org.greenrobot.greendao.d dVar11 = PdWordDao.Properties.Lan;
                    int[] iArr8 = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication20 = LingoSkillApplication.f21665b;
                    gVarQueryBuilder.f(hVarB, dVar11.b(bq.m.k(cf.x.n().keyLanguage)));
                    List listD = gVarQueryBuilder.d();
                    ArrayList arrayListR = b7.e0.r("list(...)", listD);
                    for (Object obj5 : listD) {
                        int[] iArr9 = bq.r.f4959a;
                        LingoSkillApplication lingoSkillApplication21 = LingoSkillApplication.f21665b;
                        if (arrayList8.contains(bq.m.k(cf.x.n().keyLanguage) + "_" + ((PdWord) obj5).getFavId())) {
                            arrayListR.add(obj5);
                        }
                    }
                    arrayList7.addAll(arrayListR);
                }
                if (iM == 1 && arrayList7.size() > 1) {
                    ry.p.Z(arrayList7, new jh.p(i12));
                }
                Collections.reverse(arrayList7);
                HashSet hashSet4 = new HashSet();
                ArrayList arrayList9 = new ArrayList();
                int size2 = arrayList7.size();
                while (i13 < size2) {
                    Object obj6 = arrayList7.get(i13);
                    i13++;
                    if (hashSet4.add(((PdWord) obj6).getFavId())) {
                        arrayList9.add(obj6);
                    }
                }
                return ry.m.O0(ry.m.c1(arrayList9));
            case 7:
                return a();
            case 8:
                return ij.c.c(-1L);
            case 9:
                Context context = re.s.f49209i;
                if (context != null) {
                    return context.getCacheDir();
                }
                kotlin.jvm.internal.m.n("applicationContext");
                throw null;
            case 10:
                re.g0 g0Var = re.k.f49183f;
                re.f fVarT = re.f.f49141f.t();
                SharedPreferences sharedPreferences = (SharedPreferences) fVarT.f49144b.f44522b;
                if (sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") && (string = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        Date date = re.b.N;
                        bVarN = ns.o.n(jSONObject);
                    } catch (JSONException unused) {
                        bVarN = null;
                    }
                    break;
                } else {
                    bVarN = null;
                }
                if (bVarN != null) {
                    fVarT.c(bVarN, false);
                }
                re.k kVarN = g0Var.n();
                String string2 = ((SharedPreferences) ((n9.q) kVarN.f49186b).f43673b).getString("com.facebook.ProfileManager.CachedProfile", null);
                if (string2 != null) {
                    try {
                        f0Var = new re.f0(new JSONObject(string2));
                    } catch (JSONException unused2) {
                        f0Var = null;
                    }
                    break;
                } else {
                    f0Var = null;
                }
                if (f0Var != null) {
                    kVarN.a(f0Var, false);
                }
                Date date2 = re.b.N;
                if (ns.o.F() && ((re.f0) g0Var.n().f49187c) == null && (bVarX = ns.o.x()) != null) {
                    if (ns.o.F()) {
                        lf.j1.p(bVarX.f49119e, new re.e0(0));
                    } else {
                        g0Var.n().a(null, true);
                    }
                }
                Context contextA = re.s.a();
                String str = re.s.f49204d;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = se.m.f51605c;
                if (re.i0.c()) {
                    se.m mVar = new se.m(contextA, str);
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = se.m.b();
                    if (scheduledThreadPoolExecutorB == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    scheduledThreadPoolExecutorB.execute(new pb.b(5, contextA, mVar));
                }
                if (!qf.a.b(re.i0.class)) {
                    try {
                        Context contextA2 = re.s.a();
                        ApplicationInfo applicationInfo = contextA2.getPackageManager().getApplicationInfo(contextA2.getPackageName(), 128);
                        kotlin.jvm.internal.m.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                        Bundle bundle = applicationInfo.metaData;
                        if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                            se.m mVar2 = new se.m(contextA2, (String) null);
                            Bundle bundle2 = new Bundle();
                            if (!lf.j1.u()) {
                                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                            }
                            if (re.i0.c()) {
                                mVar2.d("fb_auto_applink", bundle2);
                            }
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused3) {
                    } catch (Throwable th3) {
                        qf.a.a(re.i0.class, th3);
                    }
                }
                Context applicationContext = re.s.a().getApplicationContext();
                kotlin.jvm.internal.m.e(applicationContext, "getApplicationContext().applicationContext");
                se.m mVar3 = new se.m(applicationContext, (String) null);
                if (!qf.a.b(mVar3)) {
                    try {
                        se.j.c(se.q.EXPLICIT);
                    } catch (Throwable th4) {
                        qf.a.a(mVar3, th4);
                    }
                    break;
                }
                return null;
            case 11:
                int i21 = AckCardActivity.U;
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication22 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication22);
                            ij.d.f34419e = new ij.d(lingoSkillApplication22);
                        }
                        break;
                    }
                }
                ij.d dVar12 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar12);
                AckDao ackDao = ((DaoSession) dVar12.f34423d).getAckDao();
                kotlin.jvm.internal.m.e(ackDao, "getAckDao(...)");
                List<Object> listLoadAll11 = ackDao.loadAll();
                kotlin.jvm.internal.m.e(listLoadAll11, "loadAll(...)");
                return listLoadAll11;
            default:
                int i22 = AckCardActivity.U;
                if (ij.a.f34417b == null) {
                    synchronized (ij.a.class) {
                        if (ij.a.f34417b == null) {
                            ij.a.f34417b = new ij.a();
                        }
                        break;
                    }
                }
                ij.a aVar3 = ij.a.f34417b;
                kotlin.jvm.internal.m.c(aVar3);
                k10.g gVarQueryBuilder2 = aVar3.f34418a.f34447g.queryBuilder();
                org.greenrobot.greendao.d dVar13 = AckFavDao.Properties.Id;
                int[] iArr10 = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication23 = LingoSkillApplication.f21665b;
                gVarQueryBuilder2.f(dVar13.e(bq.m.j(cf.x.n().keyLanguage).concat("_%")), AckFavDao.Properties.IsFav.b(1));
                gVarQueryBuilder2.e(" ASC", AckFavDao.Properties.Time);
                List listD2 = gVarQueryBuilder2.d();
                kotlin.jvm.internal.m.e(listD2, "list(...)");
                ArrayList arrayList10 = new ArrayList();
                for (Object obj7 : listD2) {
                    AckFav ackFav = (AckFav) obj7;
                    int[] iArr11 = bq.r.f4959a;
                    if (bq.m.H()) {
                        String id2 = ackFav.getId();
                        kotlin.jvm.internal.m.e(id2, "getId(...)");
                        zV0 = !oz.q.v0(id2, "up", false);
                    } else {
                        String id3 = ackFav.getId();
                        kotlin.jvm.internal.m.e(id3, "getId(...)");
                        zV0 = oz.q.v0(id3, "up", false);
                    }
                    if (zV0) {
                        arrayList10.add(obj7);
                    }
                }
                return arrayList10;
        }
    }
}
