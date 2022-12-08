import java.util.*;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Day7 {

    static String[] input = new String[]{"$ cd /", "$ ls", "dir fcqv", "dir fcv", "72939 hdpgfcwd", "236918 jlncjqh.csz", "dir jvwfwrg", "dir tzwpllhq", "dir vglf", "28586 wzljr.zvp", "$ cd fcqv", "$ ls", "dir fhg", "277152 qldfrhm.qnr", "269351 qsd", "dir thbb", "$ cd fhg", "$ ls", "dir jljrdvw", "$ cd jljrdvw", "$ ls", "101940 vsvgjg.tpn", "$ cd ..", "$ cd ..", "$ cd thbb", "$ ls", "144311 cchngzcc.lcd", "178246 fbsj.wtl", "48521 gfsqtssb.vtg", "284713 jwl.hll", "96717 wdqqqv.pcr", "$ cd ..", "$ cd ..", "$ cd fcv", "$ ls", "dir ffhwwg", "275505 fprcz.hrd", "179689 jwn", "69265 tfnws.drt", "38365 twvt.dbs", "dir vcqsrw", "247592 zldbq", "dir znzpm", "$ cd ffhwwg", "$ ls", "dir hlqf", "$ cd hlqf", "$ ls", "30443 vrdbrwp.dss", "$ cd ..", "$ cd ..", "$ cd vcqsrw", "$ ls", "dir bzlnsjmv", "dir rvbtnz", "224487 slr", "255340 vrdbrwp.dss", "$ cd bzlnsjmv", "$ ls", "272548 qwqlzvzv", "$ cd ..", "$ cd rvbtnz", "$ ls", "165670 jwl.lhn", "$ cd ..", "$ cd ..", "$ cd znzpm", "$ ls", "dir mjwnsw", "$ cd mjwnsw", "$ ls", "219638 bzcb", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd jvwfwrg", "$ ls", "dir ffhwwg", "42104 hmphb.qvq", "dir hzjpg", "dir jwl", "dir nmz", "243217 qldfrhm.rws", "dir tdjtv", "dir wdn", "$ cd ffhwwg", "$ ls", "179995 hcbf.dhw", "176263 lgssjp.mnl", "$ cd ..", "$ cd hzjpg", "$ ls", "241535 ddlcslcs.zjh", "dir ddrwfq", "dir mqwww", "29329 qwqlzvzv", "91380 vrdbrwp.dss", "dir wctwz", "210633 wdqqqv.pcr", "dir wlrmbtdg", "172051 zldbq", "$ cd ddrwfq", "$ ls", "11756 ffhwwg", "$ cd ..", "$ cd mqwww", "$ ls", "149750 wlfmbv.cgp", "$ cd ..", "$ cd wctwz", "$ ls", "277720 qldfrhm.bph", "$ cd ..", "$ cd wlrmbtdg", "$ ls", "14154 ffhwwg", "dir hgdjv", "dir qldfrhm", "48920 qwqlzvzv", "101228 wdqqqv.pcr", "159676 zldbq", "$ cd hgdjv", "$ ls", "dir hlw", "$ cd hlw", "$ ls", "229687 cdzwfzww.wcv", "$ cd ..", "$ cd ..", "$ cd qldfrhm", "$ ls", "254189 nfbp.gcg", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd jwl", "$ ls", "277778 drtw", "dir ghgf", "dir gqlmq", "163875 jwl.pmm", "dir mjm", "dir qgq", "$ cd ghgf", "$ ls", "181540 zsgjptrm.thf", "$ cd ..", "$ cd gqlmq", "$ ls", "dir ffhwwg", "283989 hzpwn", "dir jwl", "dir pqdqntr", "62581 vrdbrwp.dss", "$ cd ffhwwg", "$ ls", "242533 qwqlzvzv", "21991 wdqqqv.pcr", "$ cd ..", "$ cd jwl", "$ ls", "179926 jfgbmb.qsd", "dir zjv", "$ cd zjv", "$ ls", "102693 ffhwwg.hrt", "$ cd ..", "$ cd ..", "$ cd pqdqntr", "$ ls", "159376 nqwcsdmv", "$ cd ..", "$ cd ..", "$ cd mjm", "$ ls", "273410 hdbmpnfv", "8169 qwqlzvzv", "87728 tfgq.vbt", "221237 vrdbrwp.dss", "$ cd ..", "$ cd qgq", "$ ls", "dir dgq", "dir hlw", "164971 jvwfwrg", "dir jwl", "158534 qftjvcz.pfv", "251561 qzzpmh", "282035 wsz", "$ cd dgq", "$ ls", "dir ffhwwg", "237291 nfqzn", "70142 qfnrvmp.vbb", "55607 zldbq", "$ cd ffhwwg", "$ ls", "117790 sqhrdmd.thc", "186465 tfctr.scc", "236863 wdqqqv.pcr", "$ cd ..", "$ cd ..", "$ cd hlw", "$ ls", "244567 wrnplfgg.pcw", "$ cd ..", "$ cd jwl", "$ ls", "105997 lpsg.jjl", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd nmz", "$ ls", "51802 qwqlzvzv", "128617 zldbq", "$ cd ..", "$ cd tdjtv", "$ ls", "dir jvwfwrg", "dir mdmwf", "dir rlpbrq", "$ cd jvwfwrg", "$ ls", "35406 wdqqqv.pcr", "$ cd ..", "$ cd mdmwf", "$ ls", "dir ffhwwg", "15609 rdpwqw.pfv", "205721 zldbq", "$ cd ffhwwg", "$ ls", "117473 hdcv.cwj", "$ cd ..", "$ cd ..", "$ cd rlpbrq", "$ ls", "120058 dgddvmt.fnv", "194704 ffhwwg", "256467 qwqlzvzv", "$ cd ..", "$ cd ..", "$ cd wdn", "$ ls", "170094 bzqsnv", "dir gqmghw", "150252 gwgz.fnf", "243953 jfgbmb.qsd", "123382 qwqlzvzv", "96220 wpc.swm", "dir ztqbhjr", "$ cd gqmghw", "$ ls", "dir tlgbcrh", "$ cd tlgbcrh", "$ ls", "281457 ztjhcrwf.ljf", "$ cd ..", "$ cd ..", "$ cd ztqbhjr", "$ ls", "271212 jfgbmb.qsd", "dir nbhq", "dir vfmmj", "260079 vrdbrwp.dss", "$ cd nbhq", "$ ls", "179096 hlw.hrh", "150184 wdqqqv.pcr", "$ cd ..", "$ cd vfmmj", "$ ls", "57445 hlw.pfb", "40329 qldfrhm", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd tzwpllhq", "$ ls", "33596 cmwwd", "16963 hlw.jrw", "161107 hlw.npq", "dir jwv", "152431 nqf.jjg", "dir qldfrhm", "dir swmwvl", "dir wzpth", "$ cd jwv", "$ ls", "dir bgswd", "188795 hlw", "dir jvwfwrg", "dir jwl", "dir mbcb", "dir qldfrhm", "30173 qwqlzvzv", "193577 zldbq", "$ cd bgswd", "$ ls", "dir hdgt", "216966 ldbg.dzh", "$ cd hdgt", "$ ls", "70441 fnv.bpl", "$ cd ..", "$ cd ..", "$ cd jvwfwrg", "$ ls", "dir mctsws", "69374 qldfrhm", "$ cd mctsws", "$ ls", "257337 qsgvbj", "$ cd ..", "$ cd ..", "$ cd jwl", "$ ls", "161061 ffhwwg", "$ cd ..", "$ cd mbcb", "$ ls", "dir fbhhq", "dir rgjwh", "$ cd fbhhq", "$ ls", "dir vnn", "$ cd vnn", "$ ls", "55629 cthtjm.wbt", "$ cd ..", "$ cd ..", "$ cd rgjwh", "$ ls", "7826 wrhpmqd.fvw", "$ cd ..", "$ cd ..", "$ cd qldfrhm", "$ ls", "14471 hlw.lwh", "163165 jnpgzcmt", "10880 qwqlzvzv", "$ cd ..", "$ cd ..", "$ cd qldfrhm", "$ ls", "dir ffhwwg", "dir jwl", "15164 ldmm", "188544 pwg.zsf", "255566 qjlggt", "dir tbngqwb", "59898 zldbq", "$ cd ffhwwg", "$ ls", "218749 ffhwwg.ztr", "$ cd ..", "$ cd jwl", "$ ls", "40245 cbhtl.frv", "268818 fmwvvg", "161866 nqp", "dir nsvjcpc", "dir nwdvblg", "171528 qldfrhm", "dir qqmb", "282266 wdqqqv.pcr", "$ cd nsvjcpc", "$ ls", "43660 wtnhh.zgw", "$ cd ..", "$ cd nwdvblg", "$ ls", "dir cltj", "dir fds", "$ cd cltj", "$ ls", "86970 dlzsw.whj", "111805 qwqlzvzv", "247438 zldbq", "$ cd ..", "$ cd fds", "$ ls", "49560 fsrvhv.lhd", "234970 jvwfwrg.pfd", "133376 qgbmc", "$ cd ..", "$ cd ..", "$ cd qqmb", "$ ls", "139542 qzm.jjz", "$ cd ..", "$ cd ..", "$ cd tbngqwb", "$ ls", "dir jwl", "273706 vcfmt.jqv", "76731 wdqqqv.pcr", "$ cd jwl", "$ ls", "45969 ltvvm", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd swmwvl", "$ ls", "32187 dzn.rnz", "dir gsj", "83763 jfgbmb.qsd", "93113 vrdbrwp.dss", "$ cd gsj", "$ ls", "dir fpzj", "152202 wntpsp.tbf", "$ cd fpzj", "$ ls", "83665 btwqdhnf.qwz", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd wzpth", "$ ls", "dir snhss", "$ cd snhss", "$ ls", "dir hlw", "$ cd hlw", "$ ls", "15123 qwqlzvzv", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd vglf", "$ ls", "dir gdjmt", "dir hnnw", "dir htqzfcc", "dir nqf", "269558 qldfrhm", "116732 rqg.zbf", "dir tvmqzwmn", "72822 vrdbrwp.dss", "$ cd gdjmt", "$ ls", "214742 jfgbmb.qsd", "$ cd ..", "$ cd hnnw", "$ ls", "dir ffhwwg", "217384 jfgbmb.qsd", "153385 jvwfwrg", "dir jwl", "dir shdt", "143935 vrdbrwp.dss", "90319 zldbq", "101043 zqvwfhrz.rfz", "$ cd ffhwwg", "$ ls", "dir dsqwrdnq", "261158 jvwfwrg.plf", "$ cd dsqwrdnq", "$ ls", "129823 pngjr.rpg", "$ cd ..", "$ cd ..", "$ cd jwl", "$ ls", "dir bzq", "215828 hpqtdllh", "dir jjmndb", "dir pjzqjbd", "dir pmslv", "dir smfg", "dir wmjjwh", "$ cd bzq", "$ ls", "199534 jvwfwrg.tnt", "$ cd ..", "$ cd jjmndb", "$ ls", "dir cbfdqtc", "dir gnjlnz", "dir hlw", "201443 lgdvsvc.wvp", "dir lzlwstch", "175514 nlvh.rjc", "dir qldfrhm", "144450 qwqlzvzv", "dir ssh", "dir tbdhtqn", "150014 ttp.zqf", "240619 wdqqqv.pcr", "$ cd cbfdqtc", "$ ls", "39125 ffhwwg.fpg", "264178 jpnslr.qqt", "180897 wjmfvtvn", "$ cd ..", "$ cd gnjlnz", "$ ls", "217994 jwl.ddh", "$ cd ..", "$ cd hlw", "$ ls", "dir chgwjl", "dir dsz", "165192 ffhwwg.qfc", "40771 gzph.mvb", "46495 jvwfwrg", "122203 lhgfb.blq", "175167 qwqlzvzv", "dir ttr", "$ cd chgwjl", "$ ls", "284909 jwl.qqp", "$ cd ..", "$ cd dsz", "$ ls", "47411 bsshfjl.wbd", "$ cd ..", "$ cd ttr", "$ ls", "dir fgbgl", "dir qsflswrq", "5609 sfz", "250311 vrdbrwp.dss", "$ cd fgbgl", "$ ls", "203288 scclvct", "$ cd ..", "$ cd qsflswrq", "$ ls", "222611 ffhwwg", "143339 thrwtw.nsg", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd lzlwstch", "$ ls", "dir ffhwwg", "dir hwmzp", "dir jvwfwrg", "dir ndpbn", "dir qllzhd", "$ cd ffhwwg", "$ ls", "51165 hlw.hdn", "$ cd ..", "$ cd hwmzp", "$ ls", "54571 qwqlzvzv", "$ cd ..", "$ cd jvwfwrg", "$ ls", "130055 qldfrhm", "$ cd ..", "$ cd ndpbn", "$ ls", "160215 hptz.zms", "$ cd ..", "$ cd qllzhd", "$ ls", "41306 hwnllpw.vjp", "162845 vrdbrwp.dss", "$ cd ..", "$ cd ..", "$ cd qldfrhm", "$ ls", "dir bwcg", "dir ffhwwg", "$ cd bwcg", "$ ls", "181254 wpzpd", "$ cd ..", "$ cd ffhwwg", "$ ls", "240618 cdmlz.wsf", "dir ffhwwg", "201345 jfww", "128709 jwl.gwc", "284209 pswsrf.wwt", "dir qldfrhm", "$ cd ffhwwg", "$ ls", "13278 wcc.qmr", "165094 wdqqqv.pcr", "$ cd ..", "$ cd qldfrhm", "$ ls", "104797 ccgfmcnc.jrg", "273814 hlw.pnt", "182685 jvwfwrg.szl", "190595 stjhgqd", "dir stpvb", "105499 vbqw.vwc", "dir zldj", "$ cd stpvb", "$ ls", "221672 vrdbrwp.dss", "$ cd ..", "$ cd zldj", "$ ls", "dir jwl", "$ cd jwl", "$ ls", "130858 jhqhfrbp.nff", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd ssh", "$ ls", "65814 jfgbmb.qsd", "dir jvwfwrg", "70744 zqhftjbs.jwd", "$ cd jvwfwrg", "$ ls", "212356 jfgf.szv", "$ cd ..", "$ cd ..", "$ cd tbdhtqn", "$ ls", "37228 ffhwwg.vvc", "69069 nrtgtbmp.qlv", "dir rmrwm", "166294 zldbq", "$ cd rmrwm", "$ ls", "118846 qldfrhm.hns", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd pjzqjbd", "$ ls", "259092 cqlfdc.qdp", "89322 nmpvmdlp", "$ cd ..", "$ cd pmslv", "$ ls", "82637 jwl.lhz", "$ cd ..", "$ cd smfg", "$ ls", "dir gfbpcr", "dir sghtlzqv", "$ cd gfbpcr", "$ ls", "23958 hnpgr.htf", "$ cd ..", "$ cd sghtlzqv", "$ ls", "275943 jfgbmb.qsd", "149592 qwqlzvzv", "285215 sgptfc.msd", "179076 zldbq", "$ cd ..", "$ cd ..", "$ cd wmjjwh", "$ ls", "198333 jfgbmb.qsd", "59553 qwqlzvzv", "91883 wdqqqv.pcr", "7054 zldbq", "$ cd ..", "$ cd ..", "$ cd shdt", "$ ls", "27781 hlw.vcl", "255994 jpd", "dir mrgppm", "dir mwvgmjmb", "dir nsbrbcq", "263384 rbwbqf.qjc", "251640 tgr.rdc", "16959 zldbq", "$ cd mrgppm", "$ ls", "dir ghzhzzp", "dir jwl", "dir tgpm", "$ cd ghzhzzp", "$ ls", "dir bqplqq", "dir vtqgwsj", "$ cd bqplqq", "$ ls", "234131 lntldzhp", "$ cd ..", "$ cd vtqgwsj", "$ ls", "260109 qrzrfzr", "$ cd ..", "$ cd ..", "$ cd jwl", "$ ls", "112258 ffhwwg.wvp", "$ cd ..", "$ cd tgpm", "$ ls", "dir hlw", "167788 zldbq", "$ cd hlw", "$ ls", "70960 qwqlzvzv", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd mwvgmjmb", "$ ls", "142087 pvpw.wtv", "$ cd ..", "$ cd nsbrbcq", "$ ls", "dir hljjp", "$ cd hljjp", "$ ls", "125853 jfgbmb.qsd", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd htqzfcc", "$ ls", "dir cqs", "dir dsnpcnv", "dir ffhwwg", "90664 jfgbmb.qsd", "92316 lsjtfbvt", "dir mftm", "dir mmgn", "dir qqvzvw", "166400 qwqlzvzv", "dir vtf", "dir wrbwbdt", "$ cd cqs", "$ ls", "232548 nnv.wph", "35933 rwqj.crp", "$ cd ..", "$ cd dsnpcnv", "$ ls", "115805 ffhwwg.tvt", "$ cd ..", "$ cd ffhwwg", "$ ls", "dir qldfrhm", "dir wjj", "$ cd qldfrhm", "$ ls", "221567 qwqlzvzv", "dir rsztzjcm", "33248 vrdbrwp.dss", "114731 wdqqqv.pcr", "276521 zldbq", "$ cd rsztzjcm", "$ ls", "268313 frdpwjsh.wsh", "283644 jfgbmb.qsd", "dir jhdcdm", "84130 jvwfwrg.vsd", "31286 jwl.rth", "$ cd jhdcdm", "$ ls", "212461 qwqlzvzv", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd wjj", "$ ls", "89758 jvwfwrg.mmg", "163105 vrdbrwp.dss", "$ cd ..", "$ cd ..", "$ cd mftm", "$ ls", "278389 bbth.bht", "$ cd ..", "$ cd mmgn", "$ ls", "28122 zldbq", "$ cd ..", "$ cd qqvzvw", "$ ls", "dir mjw", "dir qldfrhm", "dir zbmpdwtc", "$ cd mjw", "$ ls", "dir cvn", "dir dlgzc", "10631 jfgbmb.qsd", "206351 qldfrhm.hgf", "136824 qwqlzvzv", "116870 qwzczrcf", "$ cd cvn", "$ ls", "146142 ggtd.jlp", "$ cd ..", "$ cd dlgzc", "$ ls", "130120 wpc", "$ cd ..", "$ cd ..", "$ cd qldfrhm", "$ ls", "260238 bpf.jbv", "270180 cwdnf", "dir czwwzj", "50884 jvwfwrg.fmq", "dir mjpzgbww", "252028 qtdzw.bmb", "dir rzqj", "$ cd czwwzj", "$ ls", "dir cpwwqrph", "19863 jfgbmb.qsd", "dir snl", "83915 vrdbrwp.dss", "$ cd cpwwqrph", "$ ls", "dir jvwfwrg", "$ cd jvwfwrg", "$ ls", "176717 jfgbmb.qsd", "$ cd ..", "$ cd ..", "$ cd snl", "$ ls", "dir btngcvt", "dir ffhwwg", "53428 gchwbc.jtf", "220232 vrdbrwp.dss", "$ cd btngcvt", "$ ls", "172859 jwl.smp", "dir tgcqmbrn", "$ cd tgcqmbrn", "$ ls", "149905 jvwfwrg", "$ cd ..", "$ cd ..", "$ cd ffhwwg", "$ ls", "145399 qldfrhm.hbg", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd mjpzgbww", "$ ls", "52355 bwzwfjtc.rmn", "5856 ffhwwg.tnh", "146211 scbdnlgl", "$ cd ..", "$ cd rzqj", "$ ls", "dir jmjszd", "134481 vgr", "187382 vrdbrwp.dss", "$ cd jmjszd", "$ ls", "81971 qldfrhm", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd zbmpdwtc", "$ ls", "193744 jvntrn", "231403 qwqlzvzv", "$ cd ..", "$ cd ..", "$ cd vtf", "$ ls", "2562 vzngcbq", "$ cd ..", "$ cd wrbwbdt", "$ ls", "dir brzwbmc", "29261 hlw", "$ cd brzwbmc", "$ ls", "dir ggh", "174287 jfgbmb.qsd", "dir jwl", "247329 mpdz", "dir thm", "83546 vrdbrwp.dss", "231269 wmwhhhmn.rms", "$ cd ggh", "$ ls", "dir cqrmsltg", "18724 mrlwwdv.ffb", "$ cd cqrmsltg", "$ ls", "dir ffhwwg", "dir jvwfwrg", "41263 pmrmh.zmn", "dir tcjr", "$ cd ffhwwg", "$ ls", "dir hlw", "$ cd hlw", "$ ls", "139875 ljnfchr.frr", "$ cd ..", "$ cd ..", "$ cd jvwfwrg", "$ ls", "141078 zldbq", "$ cd ..", "$ cd tcjr", "$ ls", "dir hnngpdc", "153685 jwl", "93502 nwlsf.dbq", "226658 qwqlzvzv", "$ cd hnngpdc", "$ ls", "243203 gchtc.sst", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd jwl", "$ ls", "62087 hfp.cfv", "$ cd ..", "$ cd thm", "$ ls", "228008 dfqgcd.frc", "167850 glblcw", "dir jvwfwrg", "$ cd jvwfwrg", "$ ls", "dir ffhwwg", "dir jgvf", "170488 qmc.vgf", "$ cd ffhwwg", "$ ls", "258985 jfgbmb.qsd", "$ cd ..", "$ cd jgvf", "$ ls", "150671 rdplqftl", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd ..", "$ cd nqf", "$ ls", "dir rglrpqd", "$ cd rglrpqd", "$ ls", "276785 nnbs.dhr", "224128 qwqlzvzv", "$ cd ..", "$ cd ..", "$ cd tvmqzwmn", "$ ls", "47655 jfgbmb.qsd", "233646 qwqlzvzv", "237245 rqfp", "185131 whntfvm.sfz"};

    public static void main(String[] args) {
        DirectoryEntry rootDirectory = new DirectoryEntry(null,"/");
        DirectoryEntry currentDirectory = rootDirectory;

        List<DirectoryEntry> allDirectories = new ArrayList<>();
        for (String line : input) {
            String[] linearr = line.split(" ");
            if ("$".equals(linearr[0])) {
                if ("cd".equals(linearr[1])) {
                    if ("/".equals(linearr[2])) {
                        currentDirectory = rootDirectory;
                    } else if ("..".equals(linearr[2])) {
                        currentDirectory = currentDirectory.getParent();
                    } else {
                        currentDirectory = currentDirectory.getDir(linearr[2]);
                    }
                }
            } else if ("dir".equals(linearr[0])) {
                DirectoryEntry de = new DirectoryEntry(currentDirectory, linearr[1]);
                currentDirectory.addFile(de);
                allDirectories.add(de);
            } else {
                currentDirectory.addFile(new FileEntry(linearr[1], Long.parseLong(linearr[0])));
            }
        }
        long total = rootDirectory.size();
        long spaceLeft = 70000000 - total;
        long spaceToRemove = 30000000 - spaceLeft;

        println(String.valueOf(total));
        println(String.valueOf( spaceLeft));
        println(String.valueOf( spaceToRemove));

        ArrayList<DirectoryEntry> acceptableDirs = new ArrayList<>();
        for (DirectoryEntry allDirectory : allDirectories) {
            if (allDirectory.size() >= spaceToRemove){
                acceptableDirs.add(allDirectory);
            }
        }

            long size = 0;
        for (DirectoryEntry acceptableDir : acceptableDirs) {
            if (size == 0){
                size = acceptableDir.size();
            } else if (size > acceptableDir.size()) {
                size = acceptableDir.size();
            }
        }

        println(String.valueOf(size));

    }

}

 class DirectoryEntry extends FileEntry {
    private final DirectoryEntry parent;
    private Map<String, FileEntry> files = new HashMap();

    public DirectoryEntry(DirectoryEntry parent, String name) {
        super(name, 0);
        this.parent = parent;
    }

    public Collection<FileEntry> getFiles() {
        return files.values();
    }

    public void addFile(FileEntry fe) {
        files.put(fe.getName(), fe);
    }

    public long size() {
        long count = 0;
        for (FileEntry fe : files.values()) {
            count += fe.size();
        }
        return count;
    }

    public DirectoryEntry getParent() {
        return parent;
    }

    public DirectoryEntry getDir(String s) {
        return (DirectoryEntry) files.get(s);
    }
}

 class FileEntry {
    private final String name;
    private final long size;

    public FileEntry(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public long size() {
        return size;
    }
}