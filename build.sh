rm -rf out
mkdir out
mkdir out/images
cp images/* out/images
asciidoctor -r asciidoctor-diagram -D ./out ./*.adoc