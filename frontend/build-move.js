import fs from "fs";
import mv from "mv";

const srcDirPath = "dist";

const dstDirPath = "../src/main/resources/static";

fs.rmSync(dstDirPath, {recursive: true, force: true});

mv(srcDirPath, dstDirPath, {mkdirp: true}, function(err) {
        console.log(err || 'completed!');
    });